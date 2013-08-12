package com.isurveysoft.www.servicesv5;

public class ExportServiceSoapProxy implements com.isurveysoft.www.servicesv5.ExportServiceSoap {
  private String _endpoint = null;
  private com.isurveysoft.www.servicesv5.ExportServiceSoap exportServiceSoap = null;
  
  public ExportServiceSoapProxy() {
    _initExportServiceSoapProxy();
  }
  
  public ExportServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initExportServiceSoapProxy();
  }
  
  private void _initExportServiceSoapProxy() {
    try {
      exportServiceSoap = (new com.isurveysoft.www.servicesv5.ExportServiceLocator()).getExportServiceSoap();
      if (exportServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exportServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exportServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exportServiceSoap != null)
      ((javax.xml.rpc.Stub)exportServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.isurveysoft.www.servicesv5.ExportServiceSoap getExportServiceSoap() {
    if (exportServiceSoap == null)
      _initExportServiceSoapProxy();
    return exportServiceSoap;
  }
  
  public com.isurveysoft.www.servicesv5.Survey exportSurvey(java.lang.String cp, java.lang.String sp) throws java.rmi.RemoteException{
    if (exportServiceSoap == null)
      _initExportServiceSoapProxy();
    return exportServiceSoap.exportSurvey(cp, sp);
  }
  
  public com.isurveysoft.www.servicesv5.SurveyResult[] exportSurveyResults(java.lang.String cp, java.lang.String sp, java.lang.String fromDate, java.lang.String toDate, long fromResultId) throws java.rmi.RemoteException{
    if (exportServiceSoap == null)
      _initExportServiceSoapProxy();
    return exportServiceSoap.exportSurveyResults(cp, sp, fromDate, toDate, fromResultId);
  }
  
  
}