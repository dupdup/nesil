        var jq = jQuery.noConflict()
             jq(function() { 
				demo.add(function() {
					jq('#geores').gmap({'zoom': 2, 'disableDefaultUI':true}).bind('init', function(evt, map) { 
						var bounds = map.getBounds();
						var southWest = bounds.getSouthWest();
						var northEast = bounds.getNorthEast();
						var lngSpan = northEast.lng() - southWest.lng();
						var latSpan = northEast.lat() - southWest.lat();
						for ( var i = 0; i < 1000; i++ ) {
							jq(this).gmap('addMarker', { 'position': new google.maps.LatLng(southWest.lat() + latSpan * Math.random(), southWest.lng() + lngSpan * Math.random()) } ).click(function() {
								jq('#geores').gmap('openInfoWindow', { content : 'Hello world!' }, this);
							});
						}
						jq(this).gmap('set', 'MarkerClusterer', new MarkerClusterer(map, jq(this).gmap('get', 'markers')));
					});
				}).load();
});