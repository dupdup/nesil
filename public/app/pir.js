$(function () {
	$.ajax({url:"/area",success:function(results){
		results.length
	}});
	$.ajax({url:"/results",success:function(results){
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
	    		height: 400
	
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
		}
	  }});
});

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
            pointFormat: 'Population in 2008: <b>{point.y:.1f} millions</b>',
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
 	var table = "grid";
 		var tblRow ="<table id=\""+table+"\" class=\"grid\" style=\"width:400px; height:400px; overflow: auto; display:block;\"> <thead> <tr> <th>Cevaplar</th> <th>Kisi Sayisi</th> <th>Yüzde%</th> </tr> ";
 		for(var i=0; i<t.length; i++){
 			tblRow = tblRow + "<tr style=\"width:400px; margin-left:0px; margin-right:0px; top:0px; bottom:0px\"><td class=\"td_grid\" style=\"text-align:left;\">"+t[i].name+"</td><td>"+t[i].y+"</td><td> %"+((t[i].y*100)/sum).toFixed()+"</td></tr>";
 		}
 		+"</thead> </table>";
 		
    $(id).html(tblRow);
}