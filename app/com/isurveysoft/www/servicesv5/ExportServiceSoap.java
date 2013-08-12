/**
 * ExportServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public interface ExportServiceSoap extends java.rmi.Remote {
    public com.isurveysoft.www.servicesv5.Survey exportSurvey(java.lang.String cp, java.lang.String sp) throws java.rmi.RemoteException;
    public com.isurveysoft.www.servicesv5.SurveyResult[] exportSurveyResults(java.lang.String cp, java.lang.String sp, java.lang.String fromDate, java.lang.String toDate, long fromResultId) throws java.rmi.RemoteException;
}
