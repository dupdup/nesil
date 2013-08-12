/**
 * ExportServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class ExportServiceSoapStub extends org.apache.axis.client.Stub implements com.isurveysoft.www.servicesv5.ExportServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExportSurvey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "cp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "sp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Survey"));
        oper.setReturnClass(com.isurveysoft.www.servicesv5.Survey.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ExportSurveyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExportSurveyResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "cp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "sp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "toDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "fromResultId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfSurveyResult"));
        oper.setReturnClass(com.isurveysoft.www.servicesv5.SurveyResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ExportSurveyResultsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public ExportServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ExportServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ExportServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answer");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Answer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfAnswer");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Answer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answer");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfQuestion");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Question[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Question");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Question");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfResult");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Result[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Result");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfScreen");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Screen[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screen");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screen");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfScreenOption");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.ScreenOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOption");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfSelectList");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SelectList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectList");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfSelectListItem");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SelectListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectListItem");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfSurveyOption");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SurveyOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOption");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ArrayOfSurveyResult");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SurveyResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyResult");
            qName2 = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IdleTimeout");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.IdleTimeout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Question");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Question.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Result");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screen");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Screen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOption");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.ScreenOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectList");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SelectList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectListItem");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SelectListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Survey");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.Survey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOption");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SurveyOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyResult");
            cachedSerQNames.add(qName);
            cls = com.isurveysoft.www.servicesv5.SurveyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.isurveysoft.www.servicesv5.Survey exportSurvey(java.lang.String cp, java.lang.String sp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.isurveysoft.com/servicesv5/ExportSurvey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ExportSurvey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cp, sp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.isurveysoft.www.servicesv5.Survey) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.isurveysoft.www.servicesv5.Survey) org.apache.axis.utils.JavaUtils.convert(_resp, com.isurveysoft.www.servicesv5.Survey.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.isurveysoft.www.servicesv5.SurveyResult[] exportSurveyResults(java.lang.String cp, java.lang.String sp, java.lang.String fromDate, java.lang.String toDate, long fromResultId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.isurveysoft.com/servicesv5/ExportSurveyResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ExportSurveyResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cp, sp, fromDate, toDate, new java.lang.Long(fromResultId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.isurveysoft.www.servicesv5.SurveyResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.isurveysoft.www.servicesv5.SurveyResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.isurveysoft.www.servicesv5.SurveyResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
