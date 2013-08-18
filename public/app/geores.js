$(function() { 
		console.log(23);
		$('#map_canvas').gmap({'zoom': 4, 'disableDefaultUI':true}).bind('init', function(evt, map) { 
			var bounds = map.getBounds();
			var southWest = bounds.getSouthWest();
			var northEast = bounds.getNorthEast();
			var lngSpan = northEast.lng() - southWest.lng();
			var latSpan = northEast.lat() - southWest.lat();
			for ( var i = 0; i < 1000; i++ ) {
				$(this).gmap('addMarker', { 'position': new google.maps.LatLng(southWest.lat() + latSpan * Math.random(), southWest.lng() + lngSpan * Math.random()) } ).click(function() {
					$('#map_canvas').gmap('openInfoWindow', { content : 'Hello world!' }, this);
				});
			}
			$(this).gmap('set', 'MarkerClusterer', new MarkerClusterer(map, $(this).gmap('get', 'markers')));
		});

});