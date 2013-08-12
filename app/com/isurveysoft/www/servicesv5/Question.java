/**
 * Question.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class Question  implements java.io.Serializable {
    private long questionId;

    private java.lang.String questionCustomIdentifier;

    private long questionOrder;

    private java.lang.String questionText;

    public Question() {
    }

    public Question(
           long questionId,
           java.lang.String questionCustomIdentifier,
           long questionOrder,
           java.lang.String questionText) {
           this.questionId = questionId;
           this.questionCustomIdentifier = questionCustomIdentifier;
           this.questionOrder = questionOrder;
           this.questionText = questionText;
    }


    /**
     * Gets the questionId value for this Question.
     * 
     * @return questionId
     */
    public long getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this Question.
     * 
     * @param questionId
     */
    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the questionCustomIdentifier value for this Question.
     * 
     * @return questionCustomIdentifier
     */
    public java.lang.String getQuestionCustomIdentifier() {
        return questionCustomIdentifier;
    }


    /**
     * Sets the questionCustomIdentifier value for this Question.
     * 
     * @param questionCustomIdentifier
     */
    public void setQuestionCustomIdentifier(java.lang.String questionCustomIdentifier) {
        this.questionCustomIdentifier = questionCustomIdentifier;
    }


    /**
     * Gets the questionOrder value for this Question.
     * 
     * @return questionOrder
     */
    public long getQuestionOrder() {
        return questionOrder;
    }


    /**
     * Sets the questionOrder value for this Question.
     * 
     * @param questionOrder
     */
    public void setQuestionOrder(long questionOrder) {
        this.questionOrder = questionOrder;
    }


    /**
     * Gets the questionText value for this Question.
     * 
     * @return questionText
     */
    public java.lang.String getQuestionText() {
        return questionText;
    }


    /**
     * Sets the questionText value for this Question.
     * 
     * @param questionText
     */
    public void setQuestionText(java.lang.String questionText) {
        this.questionText = questionText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Question)) return false;
        Question other = (Question) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.questionId == other.getQuestionId() &&
            ((this.questionCustomIdentifier==null && other.getQuestionCustomIdentifier()==null) || 
             (this.questionCustomIdentifier!=null &&
              this.questionCustomIdentifier.equals(other.getQuestionCustomIdentifier()))) &&
            this.questionOrder == other.getQuestionOrder() &&
            ((this.questionText==null && other.getQuestionText()==null) || 
             (this.questionText!=null &&
              this.questionText.equals(other.getQuestionText())));
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
        _hashCode += new Long(getQuestionId()).hashCode();
        if (getQuestionCustomIdentifier() != null) {
            _hashCode += getQuestionCustomIdentifier().hashCode();
        }
        _hashCode += new Long(getQuestionOrder()).hashCode();
        if (getQuestionText() != null) {
            _hashCode += getQuestionText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Question.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Question"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "QuestionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionCustomIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "QuestionCustomIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "QuestionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "QuestionText"));
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
