/**
 * ScreenOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class ScreenOption  implements java.io.Serializable {
    private java.lang.String screenOptionRefCode;

    private java.lang.String screenOptionValueText;

    public ScreenOption() {
    }

    public ScreenOption(
           java.lang.String screenOptionRefCode,
           java.lang.String screenOptionValueText) {
           this.screenOptionRefCode = screenOptionRefCode;
           this.screenOptionValueText = screenOptionValueText;
    }


    /**
     * Gets the screenOptionRefCode value for this ScreenOption.
     * 
     * @return screenOptionRefCode
     */
    public java.lang.String getScreenOptionRefCode() {
        return screenOptionRefCode;
    }


    /**
     * Sets the screenOptionRefCode value for this ScreenOption.
     * 
     * @param screenOptionRefCode
     */
    public void setScreenOptionRefCode(java.lang.String screenOptionRefCode) {
        this.screenOptionRefCode = screenOptionRefCode;
    }


    /**
     * Gets the screenOptionValueText value for this ScreenOption.
     * 
     * @return screenOptionValueText
     */
    public java.lang.String getScreenOptionValueText() {
        return screenOptionValueText;
    }


    /**
     * Sets the screenOptionValueText value for this ScreenOption.
     * 
     * @param screenOptionValueText
     */
    public void setScreenOptionValueText(java.lang.String screenOptionValueText) {
        this.screenOptionValueText = screenOptionValueText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScreenOption)) return false;
        ScreenOption other = (ScreenOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.screenOptionRefCode==null && other.getScreenOptionRefCode()==null) || 
             (this.screenOptionRefCode!=null &&
              this.screenOptionRefCode.equals(other.getScreenOptionRefCode()))) &&
            ((this.screenOptionValueText==null && other.getScreenOptionValueText()==null) || 
             (this.screenOptionValueText!=null &&
              this.screenOptionValueText.equals(other.getScreenOptionValueText())));
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
        if (getScreenOptionRefCode() != null) {
            _hashCode += getScreenOptionRefCode().hashCode();
        }
        if (getScreenOptionValueText() != null) {
            _hashCode += getScreenOptionValueText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScreenOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenOptionRefCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOptionRefCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenOptionValueText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOptionValueText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
