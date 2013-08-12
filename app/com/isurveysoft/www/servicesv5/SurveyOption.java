/**
 * SurveyOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class SurveyOption  implements java.io.Serializable {
    private java.lang.String surveyOptionRefCode;

    private java.lang.String surveyOptionValueText;

    public SurveyOption() {
    }

    public SurveyOption(
           java.lang.String surveyOptionRefCode,
           java.lang.String surveyOptionValueText) {
           this.surveyOptionRefCode = surveyOptionRefCode;
           this.surveyOptionValueText = surveyOptionValueText;
    }


    /**
     * Gets the surveyOptionRefCode value for this SurveyOption.
     * 
     * @return surveyOptionRefCode
     */
    public java.lang.String getSurveyOptionRefCode() {
        return surveyOptionRefCode;
    }


    /**
     * Sets the surveyOptionRefCode value for this SurveyOption.
     * 
     * @param surveyOptionRefCode
     */
    public void setSurveyOptionRefCode(java.lang.String surveyOptionRefCode) {
        this.surveyOptionRefCode = surveyOptionRefCode;
    }


    /**
     * Gets the surveyOptionValueText value for this SurveyOption.
     * 
     * @return surveyOptionValueText
     */
    public java.lang.String getSurveyOptionValueText() {
        return surveyOptionValueText;
    }


    /**
     * Sets the surveyOptionValueText value for this SurveyOption.
     * 
     * @param surveyOptionValueText
     */
    public void setSurveyOptionValueText(java.lang.String surveyOptionValueText) {
        this.surveyOptionValueText = surveyOptionValueText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyOption)) return false;
        SurveyOption other = (SurveyOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surveyOptionRefCode==null && other.getSurveyOptionRefCode()==null) || 
             (this.surveyOptionRefCode!=null &&
              this.surveyOptionRefCode.equals(other.getSurveyOptionRefCode()))) &&
            ((this.surveyOptionValueText==null && other.getSurveyOptionValueText()==null) || 
             (this.surveyOptionValueText!=null &&
              this.surveyOptionValueText.equals(other.getSurveyOptionValueText())));
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
        if (getSurveyOptionRefCode() != null) {
            _hashCode += getSurveyOptionRefCode().hashCode();
        }
        if (getSurveyOptionValueText() != null) {
            _hashCode += getSurveyOptionValueText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurveyOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyOptionRefCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOptionRefCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyOptionValueText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOptionValueText"));
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
