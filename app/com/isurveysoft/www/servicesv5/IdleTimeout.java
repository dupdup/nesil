/**
 * IdleTimeout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class IdleTimeout  implements java.io.Serializable {
    private short inactivitySeconds;

    private short warningSeconds;

    private boolean allowDeviceToOverrideInactivityTimeout;

    private boolean savePartialResponse;

    public IdleTimeout() {
    }

    public IdleTimeout(
           short inactivitySeconds,
           short warningSeconds,
           boolean allowDeviceToOverrideInactivityTimeout,
           boolean savePartialResponse) {
           this.inactivitySeconds = inactivitySeconds;
           this.warningSeconds = warningSeconds;
           this.allowDeviceToOverrideInactivityTimeout = allowDeviceToOverrideInactivityTimeout;
           this.savePartialResponse = savePartialResponse;
    }


    /**
     * Gets the inactivitySeconds value for this IdleTimeout.
     * 
     * @return inactivitySeconds
     */
    public short getInactivitySeconds() {
        return inactivitySeconds;
    }


    /**
     * Sets the inactivitySeconds value for this IdleTimeout.
     * 
     * @param inactivitySeconds
     */
    public void setInactivitySeconds(short inactivitySeconds) {
        this.inactivitySeconds = inactivitySeconds;
    }


    /**
     * Gets the warningSeconds value for this IdleTimeout.
     * 
     * @return warningSeconds
     */
    public short getWarningSeconds() {
        return warningSeconds;
    }


    /**
     * Sets the warningSeconds value for this IdleTimeout.
     * 
     * @param warningSeconds
     */
    public void setWarningSeconds(short warningSeconds) {
        this.warningSeconds = warningSeconds;
    }


    /**
     * Gets the allowDeviceToOverrideInactivityTimeout value for this IdleTimeout.
     * 
     * @return allowDeviceToOverrideInactivityTimeout
     */
    public boolean isAllowDeviceToOverrideInactivityTimeout() {
        return allowDeviceToOverrideInactivityTimeout;
    }


    /**
     * Sets the allowDeviceToOverrideInactivityTimeout value for this IdleTimeout.
     * 
     * @param allowDeviceToOverrideInactivityTimeout
     */
    public void setAllowDeviceToOverrideInactivityTimeout(boolean allowDeviceToOverrideInactivityTimeout) {
        this.allowDeviceToOverrideInactivityTimeout = allowDeviceToOverrideInactivityTimeout;
    }


    /**
     * Gets the savePartialResponse value for this IdleTimeout.
     * 
     * @return savePartialResponse
     */
    public boolean isSavePartialResponse() {
        return savePartialResponse;
    }


    /**
     * Sets the savePartialResponse value for this IdleTimeout.
     * 
     * @param savePartialResponse
     */
    public void setSavePartialResponse(boolean savePartialResponse) {
        this.savePartialResponse = savePartialResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdleTimeout)) return false;
        IdleTimeout other = (IdleTimeout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.inactivitySeconds == other.getInactivitySeconds() &&
            this.warningSeconds == other.getWarningSeconds() &&
            this.allowDeviceToOverrideInactivityTimeout == other.isAllowDeviceToOverrideInactivityTimeout() &&
            this.savePartialResponse == other.isSavePartialResponse();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getInactivitySeconds();
        _hashCode += getWarningSeconds();
        _hashCode += (isAllowDeviceToOverrideInactivityTimeout() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSavePartialResponse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdleTimeout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IdleTimeout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivitySeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "InactivitySeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "WarningSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDeviceToOverrideInactivityTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AllowDeviceToOverrideInactivityTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savePartialResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SavePartialResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
