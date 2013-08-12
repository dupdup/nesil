Ext.define('MyApp.view.Viewport', {
	extend: 'Ext.container.Viewport',
	layout: {
		align: 'stretch',
		type: 'vbox'
	},
	requires: [
	           'MyApp.view.Child',
	           'MyApp.view.NddError',
	           'MyApp.view.SnapshotError',
	           'MyApp.view.Snapshots',
	           'MyApp.view.RefNo'
	           ],
	           initComponent: function() {
	        	   var me = this;
	        	   Ext.applyIf(me, {
	        		   items: [
	        		           {	
	        		        	   xtype: 'refno'
	        		           }
	        		           ]
	        	   });

	        	   me.callParent(arguments);
	           }

});