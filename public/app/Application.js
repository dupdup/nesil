Ext.require([
    'Ext.grid.*',
    'Ext.data.*',
    'Ext.util.*',
    'Ext.grid.plugin.BufferedRenderer'
]);
Ext.Loader.setConfig({
  enabled: true
});
Ext.application({
  appFolder : '/assets/app',
  models: [
    'NddError'
  ],
  stores: [
    'Snapshots',
    'Child',
    'SnapshotError',
    'Error'
  ],
  views: [
    'Viewport'
  ],
  autoCreateViewport: true,
  controllers: ['Runner'],
  name: 'MyApp'
});
