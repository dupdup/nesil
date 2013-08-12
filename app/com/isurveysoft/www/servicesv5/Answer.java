/**
 * Answer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class Answer  implements java.io.Serializable {
    private long answerId;

    private java.lang.String answerCustomIdentifier;

    private long answerOrder;

    private java.lang.String answerText;

    private java.lang.String answerImageUrl;

    private java.lang.Long themeClassId;

    public Answer() {
    }

    public Answer(
           long answerId,
           java.lang.String answerCustomIdentifier,
           long answerOrder,
           java.lang.String answerText,
           java.lang.String answerImageUrl,
           java.lang.Long themeClassId) {
           this.answerId = answerId;
           this.answerCustomIdentifier = answerCustomIdentifier;
           this.answerOrder = answerOrder;
           this.answerText = answerText;
           this.answerImageUrl = answerImageUrl;
           this.themeClassId = themeClassId;
    }


    /**
     * Gets the answerId value for this Answer.
     * 
     * @return answerId
     */
    public long getAnswerId() {
        return answerId;
    }


    /**
     * Sets the answerId value for this Answer.
     * 
     * @param answerId
     */
    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }


    /**
     * Gets the answerCustomIdentifier value for this Answer.
     * 
     * @return answerCustomIdentifier
     */
    public java.lang.String getAnswerCustomIdentifier() {
        return answerCustomIdentifier;
    }


    /**
     * Sets the answerCustomIdentifier value for this Answer.
     * 
     * @param answerCustomIdentifier
     */
    public void setAnswerCustomIdentifier(java.lang.String answerCustomIdentifier) {
        this.answerCustomIdentifier = answerCustomIdentifier;
    }


    /**
     * Gets the answerOrder value for this Answer.
     * 
     * @return answerOrder
     */
    public long getAnswerOrder() {
        return answerOrder;
    }


    /**
     * Sets the answerOrder value for this Answer.
     * 
     * @param answerOrder
     */
    public void setAnswerOrder(long answerOrder) {
        this.answerOrder = answerOrder;
    }


    /**
     * Gets the answerText value for this Answer.
     * 
     * @return answerText
     */
    public java.lang.String getAnswerText() {
        return answerText;
    }


    /**
     * Sets the answerText value for this Answer.
     * 
     * @param answerText
     */
    public void setAnswerText(java.lang.String answerText) {
        this.answerText = answerText;
    }


    /**
     * Gets the answerImageUrl value for this Answer.
     * 
     * @return answerImageUrl
     */
    public java.lang.String getAnswerImageUrl() {
        return answerImageUrl;
    }


    /**
     * Sets the answerImageUrl value for this Answer.
     * 
     * @param answerImageUrl
     */
    public void setAnswerImageUrl(java.lang.String answerImageUrl) {
        this.answerImageUrl = answerImageUrl;
    }


    /**
     * Gets the themeClassId value for this Answer.
     * 
     * @return themeClassId
     */
    public java.lang.Long getThemeClassId() {
        return themeClassId;
    }


    /**
     * Sets the themeClassId value for this Answer.
     * 
     * @param themeClassId
     */
    public void setThemeClassId(java.lang.Long themeClassId) {
        this.themeClassId = themeClassId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Answer)) return false;
        Answer other = (Answer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.answerId == other.getAnswerId() &&
            ((this.answerCustomIdentifier==null && other.getAnswerCustomIdentifier()==null) || 
             (this.answerCustomIdentifier!=null &&
              this.answerCustomIdentifier.equals(other.getAnswerCustomIdentifier()))) &&
            this.answerOrder == other.getAnswerOrder() &&
            ((this.answerText==null && other.getAnswerText()==null) || 
             (this.answerText!=null &&
              this.answerText.equals(other.getAnswerText()))) &&
            ((this.answerImageUrl==null && other.getAnswerImageUrl()==null) || 
             (this.answerImageUrl!=null &&
              this.answerImageUrl.equals(other.getAnswerImageUrl()))) &&
            ((this.themeClassId==null && other.getThemeClassId()==null) || 
             (this.themeClassId!=null &&
              this.themeClassId.equals(other.getThemeClassId())));
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
        _hashCode += new Long(getAnswerId()).hashCode();
        if (getAnswerCustomIdentifier() != null) {
            _hashCode += getAnswerCustomIdentifier().hashCode();
        }
        _hashCode += new Long(getAnswerOrder()).hashCode();
        if (getAnswerText() != null) {
            _hashCode += getAnswerText().hashCode();
        }
        if (getAnswerImageUrl() != null) {
            _hashCode += getAnswerImageUrl().hashCode();
        }
        if (getThemeClassId() != null) {
            _hashCode += getThemeClassId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Answer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerCustomIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerCustomIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeClassId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ThemeClassId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
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
