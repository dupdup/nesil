/**
 * ExportServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class ExportServiceLocator extends org.apache.axis.client.Service implements com.isurveysoft.www.servicesv5.ExportService {

    public ExportServiceLocator() {
    }


    public ExportServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExportServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExportServiceSoap
    private java.lang.String ExportServiceSoap_address = "https://www.isurveysoft.com/servicesv5/exportservice.asmx";

    public java.lang.String getExportServiceSoapAddress() {
        return ExportServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExportServiceSoapWSDDServiceName = "ExportServiceSoap";

    public java.lang.String getExportServiceSoapWSDDServiceName() {
        return ExportServiceSoapWSDDServiceName;
    }

    public void setExportServiceSoapWSDDServiceName(java.lang.String name) {
        ExportServiceSoapWSDDServiceName = name;
    }

    public com.isurveysoft.www.servicesv5.ExportServiceSoap getExportServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExportServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExportServiceSoap(endpoint);
    }

    public com.isurveysoft.www.servicesv5.ExportServiceSoap getExportServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.isurveysoft.www.servicesv5.ExportServiceSoapStub _stub = new com.isurveysoft.www.servicesv5.ExportServiceSoapStub(portAddress, this);
            _stub.setPortName(getExportServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExportServiceSoapEndpointAddress(java.lang.String address) {
        ExportServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.isurveysoft.www.servicesv5.ExportServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.isurveysoft.www.servicesv5.ExportServiceSoapStub _stub = new com.isurveysoft.www.servicesv5.ExportServiceSoapStub(new java.net.URL(ExportServiceSoap_address), this);
                _stub.setPortName(getExportServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExportServiceSoap".equals(inputPortName)) {
            return getExportServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ExportService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ExportServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExportServiceSoap".equals(portName)) {
            setExportServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
