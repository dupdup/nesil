$(function () {
	$.ajax({url:"/",success:function(result){
	    var t=[];
	    $.each(result[4].answer, function(index, v) {
	      t.push({name:v.text,y:v.count})        
	      });
	for(var i=1; i<4; i++){
		var id="#container"+i;	
    $(id).highcharts({
        chart: {
//            plotBackgroundColor: null,
//            plotBorderWidth: null,
//            plotShadow: false,
            // Edit chart spacing
            spacingBottom: 1,
            spacingTop: 1,
            spacingLeft: 1,
            spacingRight: 1,
            marginRight:1,
    		marginLeft:1,
    		marginTop:1,
    		marginBottom:1,
    		width: 400,
    		height: 400

        },
        title: {
            text: 'Adana Büyükşehir Belediyesinin hizmetlerinden memnun olmanızın başlıca nedenleri nelerdir?'
        },
        tooltip: {
    	    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
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
            name: 'Browser share',
            data: t
        }]
    });
	}
	  }});
});
