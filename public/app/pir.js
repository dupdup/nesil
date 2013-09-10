$(function () {
	init();
	$('#login').hide();
	$('#header-photo').show();
	$('#wrap').show();
});

function init(){

var we = {url:"/results/",
		beforeSend: function() {
		    $('#container').html("<img src='/assets/images/loading.gif' />");
		  },
		success:function(results){
		chartCount = results.length;
		$("#container").html(""); 
		var divList = "";

		for(var i=0; i<chartCount; i++){ 
			var tblRow ="<div id=\"container"+i+"\" class=\"page-chart\" style=\"margin: 0 auto; float: left\"></div>"
			divList += tblRow; 
			$("#container").html(divList);
		}
		for(var j=0 ; j<chartCount; j++){
			var id="#container"+j;	
			var t=[];
			$.each(results[j].answer, function(index, v) {
				if(index == 1)
					t.push({name:v.text,y:v.count,sliced:true})
				else
					t.push({name:v.text,y:v.count})        
			});

			if(results[j].type == 2){
				if(results[j].answer.length >7){
					createGrid(id, results[j]);
				}else{createBar(id, results[j]);}
			}
			else{
				$(id).highcharts({
					chart: {
						lineWidth:1,
						spacingBottom: 1,
						spacingTop: 1,
						spacingLeft: 1,
						spacingRight: 1,
						marginRight:1,
						marginLeft:1,
						marginTop:5,
						marginBottom:1,
						width: 400,
						height: 400,
						borderRadius:15
					},
					title: {
						text: results[j].text
					},
					tooltip: {
						formatter: function() {
							return this.point.name+'<br\>'+this.series.name +': <b>'+ this.y +'</b>';
						}
					},
					plotOptions: {
						pie: {
							allowPointSelect: true,
							cursor: 'pointer',
							dataLabels: {
								enabled: true,
								color: '#000000',
								connectorColor: '#000000',
								format: '<b>{point.name}</b>: {point.percentage:.1f} %'
							}
						}
					},
					series: [{
						type: 'pie',
						name: 'Cevap Sayısı',
						data: t
					}]
				});
			}
			$("#container"+j).append("<div><button screenid=\""+results[j].screenId+"\" id=\"popup"+j+"\">MAP</button></div>");
			$("#popup"+j).colorbox({html:'<div id="map_canvas" style="width: 800px; height:600px;"></div>',onOpen:function(){loadMap($(this).attr("screenid"));},onClosed:clearMap});
		}
	}};
we.url="/results/0/0";
$.ajax(we);
$("#towncombo").select2({width:200, placeholder:"ilçe",triggerChange:true,allowClear:true})
	.on('change',function(x){
		if(x.added){
			we.url="/results/"+x.added.id+"/0";
			$.ajax(we);
			$.ajax({url:"/area/"+x.added.id,success:function(resx){
				$('#districtcombo').html("<option></option>");
				$.each(resx, function(i,n){
					var x =$('<option>').val(n.code).text(n.text);
					x.appendTo('#districtcombo');
				});
			}});
		}else{
			we.url="/results/0/0";
			$.ajax(we);
			$('#districtcombo').html("<option></option>");
			$("#districtcombo").select2("val","");
		}
});
$("#districtcombo").select2({width:200, placeholder:"köy/mahalle/belde"
	,triggerChange:true,allowClear:true}).on('change',function(x){
		if(x.added){
			we.url="/results/"+we.url.split("/")[2]+"/"+x.added.id;
			$.ajax(we);
		}else{
			we.url="/results/"+we.url.split("/")[2]+"/0";
			$.ajax(we);
		}
	});
$.ajax({url:"/area",async:false,success:function(res){
	$.each(res, function(i,n){
		var x =$('<option>').val(n.code).text(n.text);
		x.appendTo('#towncombo');
	});
	if(res.length==1){
		$("#towncombo").select2('val',res[0].code);
	}
}});
}
function clearMap(){
mgr.clearMarkers();
mapg=0;
mgr=0;
$('#map_canvas').remove();
}
var mgr;
var mapg;
function loadMap(screenid){
	$.ajax({url:"/georesults/"+screenid,success:function(res){
			$('#map_canvas').gmap({zoom: 10,center:res[1].lat+","+res[1].lng})
			.bind('init', function(evt, map) {
				mapg = map;
				addMarkers(res);
				});
	}});
}
function shuffleArray(array) {
    for (var i = array.length - 1; i > 0; i--) {
        var j = Math.floor(Math.random() * (i + 1));
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    return array;
}
function addMarkers(rt){
	var clrs =['aqua','blue','crimson','blueviolet','yellow','GreenYellow','Magenta','Azure']
	var ra = [];
	mgr = new MarkerManager(mapg);
	var markers1=[];
	var markers2=[];
	var markers3=[];
	var markers4=[];
	rt = shuffleArray(rt);
	$.each(rt,function(i,r){
		var ri = $.inArray(r.answer.code, ra);
		if(ri<0){
			ri = ra.push(r.answer.code)-1;
		}
		if(i==0){
			$("#map_canvas").gmap('option','center',new google.maps.LatLng(r.lat, r.lng));
		}
		var goldStar = {
				path: google.maps.SymbolPath.CIRCLE,
				fillOpacity: 1.8,
				scale: 5,
//				strokeWeight: 10,
				fillColor:clrs[ri%clrs.length],
				strokeColor:clrs[ri%clrs.length]
		};
		var marker = new google.maps.Marker({position: new google.maps.LatLng(r.lat,r.lng),icon:goldStar,title:r.answer.text})
		if(i<800)
			markers1.push(marker);
		else if(i<2000)
			markers2.push(marker);
		else if(i<15000)
			markers4.push(marker);
	});
	google.maps.event.addListener(mgr, 'loaded', function(){
		console.log("markers added");
		mgr.addMarkers(markers1,5);
		mgr.addMarkers(markers2,11);
		mgr.addMarkers(markers4,15);
		mgr.refresh();
	});
}

function createBar(id, result){
	var t=[];
	var c=[];
	$.each(result.answer, function(index, v) {
		t.push(v.count)
		c.push(v.text)
	});
	$(id).highcharts({
		chart: {
			type: 'column',
			width: 400,
			height: 400
		},
		title: {
			text: result.text
		},
		xAxis: {
			categories: c,
			labels: {
				rotation: -45,
				align: 'right',
				style: {
					fontSize: '13px',
					fontFamily: 'Verdana, sans-serif'
				}
			}
		},
		yAxis: {
			min: 0,
			title: {
				text: 'Kisi Sayisi'
			}
		},
		legend: {
			enabled: false
		},
		tooltip: {
			pointFormat: 'Kişi Sayısı: <b>{point.y} </b>',
		},
		series: [{
			name: 'Population',
			data: t,
			dataLabels: {
				enabled: true,
				rotation: -90,
				color: '#FFFFFF',
				align: 'right',
				x: 4,
				y: 10,
				style: {
					fontSize: '13px',
					fontFamily: 'Verdana, sans-serif',
					textShadow: '0 0 3px black'
				}
			}
		}]
	});
}

function createGrid(id, result){
	var t=[];
	$.each(result.answer, function(index, v) {
		t.push({name:v.text,y:v.count})    
	});
	t = t.sort(function(obj1, obj2) {
		// Ascending: first age less than the previous
		return obj2.y - obj1.y;
	});

	sum = 0;
	for (var i = 0; i < t.length; ++i) {
		sum += t[i].y;
	}
	$(id).html(""); 
	var tblRow ="<table id=\"grid\" class=\"grid\" style=\"width:400px; height:380px; color:#000000; overflow: auto; display:block;\"> <thead> <tr> <th>"+result.text+"</th> <th>Kisi Sayisi</th> <th>Yüzde%</th> </tr> ";
	for(var i=0; i<t.length; i++){
		tblRow = tblRow + "<tr style=\"width:400px; margin-left:0px; margin-right:0px; top:0px; bottom:0px\"><td class=\"td_grid\" style=\"text-align:left;\">"+t[i].name+"</td><td>"+t[i].y+"</td><td> %"+((t[i].y*100)/sum).toFixed()+"</td></tr>";
	}
	+"</thead> </table>";

	$(id).html(tblRow);
}
