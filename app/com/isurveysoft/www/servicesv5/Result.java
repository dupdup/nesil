/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class Result  implements java.io.Serializable {
    private long screenId;

    private java.lang.Long questionId;

    private java.lang.Long answerId;

    private java.lang.String resultAnswer;

    private java.lang.String responseDate;

    private java.lang.String contentType;

    private java.lang.String screenCustomIdentifier;

    private java.lang.String questionCustomIdentifier;

    private java.lang.String answerCustomIdentifier;

    public Result() {
    }

    public Result(
           long screenId,
           java.lang.Long questionId,
           java.lang.Long answerId,
           java.lang.String resultAnswer,
           java.lang.String responseDate,
           java.lang.String contentType,
           java.lang.String screenCustomIdentifier,
           java.lang.String questionCustomIdentifier,
           java.lang.String answerCustomIdentifier) {
           this.screenId = screenId;
           this.questionId = questionId;
           this.answerId = answerId;
           this.resultAnswer = resultAnswer;
           this.responseDate = responseDate;
           this.contentType = contentType;
           this.screenCustomIdentifier = screenCustomIdentifier;
           this.questionCustomIdentifier = questionCustomIdentifier;
           this.answerCustomIdentifier = answerCustomIdentifier;
    }


    /**
     * Gets the screenId value for this Result.
     * 
     * @return screenId
     */
    public long getScreenId() {
        return screenId;
    }


    /**
     * Sets the screenId value for this Result.
     * 
     * @param screenId
     */
    public void setScreenId(long screenId) {
        this.screenId = screenId;
    }


    /**
     * Gets the questionId value for this Result.
     * 
     * @return questionId
     */
    public java.lang.Long getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this Result.
     * 
     * @param questionId
     */
    public void setQuestionId(java.lang.Long questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the answerId value for this Result.
     * 
     * @return answerId
     */
    public java.lang.Long getAnswerId() {
        return answerId;
    }


    /**
     * Sets the answerId value for this Result.
     * 
     * @param answerId
     */
    public void setAnswerId(java.lang.Long answerId) {
        this.answerId = answerId;
    }


    /**
     * Gets the resultAnswer value for this Result.
     * 
     * @return resultAnswer
     */
    public java.lang.String getResultAnswer() {
        return resultAnswer;
    }


    /**
     * Sets the resultAnswer value for this Result.
     * 
     * @param resultAnswer
     */
    public void setResultAnswer(java.lang.String resultAnswer) {
        this.resultAnswer = resultAnswer;
    }


    /**
     * Gets the responseDate value for this Result.
     * 
     * @return responseDate
     */
    public java.lang.String getResponseDate() {
        return responseDate;
    }


    /**
     * Sets the responseDate value for this Result.
     * 
     * @param responseDate
     */
    public void setResponseDate(java.lang.String responseDate) {
        this.responseDate = responseDate;
    }


    /**
     * Gets the contentType value for this Result.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Result.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the screenCustomIdentifier value for this Result.
     * 
     * @return screenCustomIdentifier
     */
    public java.lang.String getScreenCustomIdentifier() {
        return screenCustomIdentifier;
    }


    /**
     * Sets the screenCustomIdentifier value for this Result.
     * 
     * @param screenCustomIdentifier
     */
    public void setScreenCustomIdentifier(java.lang.String screenCustomIdentifier) {
        this.screenCustomIdentifier = screenCustomIdentifier;
    }


    /**
     * Gets the questionCustomIdentifier value for this Result.
     * 
     * @return questionCustomIdentifier
     */
    public java.lang.String getQuestionCustomIdentifier() {
        return questionCustomIdentifier;
    }


    /**
     * Sets the questionCustomIdentifier value for this Result.
     * 
     * @param questionCustomIdentifier
     */
    public void setQuestionCustomIdentifier(java.lang.String questionCustomIdentifier) {
        this.questionCustomIdentifier = questionCustomIdentifier;
    }


    /**
     * Gets the answerCustomIdentifier value for this Result.
     * 
     * @return answerCustomIdentifier
     */
    public java.lang.String getAnswerCustomIdentifier() {
        return answerCustomIdentifier;
    }


    /**
     * Sets the answerCustomIdentifier value for this Result.
     * 
     * @param answerCustomIdentifier
     */
    public void setAnswerCustomIdentifier(java.lang.String answerCustomIdentifier) {
        this.answerCustomIdentifier = answerCustomIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.screenId == other.getScreenId() &&
            ((this.questionId==null && other.getQuestionId()==null) || 
             (this.questionId!=null &&
              this.questionId.equals(other.getQuestionId()))) &&
            ((this.answerId==null && other.getAnswerId()==null) || 
             (this.answerId!=null &&
              this.answerId.equals(other.getAnswerId()))) &&
            ((this.resultAnswer==null && other.getResultAnswer()==null) || 
             (this.resultAnswer!=null &&
              this.resultAnswer.equals(other.getResultAnswer()))) &&
            ((this.responseDate==null && other.getResponseDate()==null) || 
             (this.responseDate!=null &&
              this.responseDate.equals(other.getResponseDate()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.screenCustomIdentifier==null && other.getScreenCustomIdentifier()==null) || 
             (this.screenCustomIdentifier!=null &&
              this.screenCustomIdentifier.equals(other.getScreenCustomIdentifier()))) &&
            ((this.questionCustomIdentifier==null && other.getQuestionCustomIdentifier()==null) || 
             (this.questionCustomIdentifier!=null &&
              this.questionCustomIdentifier.equals(other.getQuestionCustomIdentifier()))) &&
            ((this.answerCustomIdentifier==null && other.getAnswerCustomIdentifier()==null) || 
             (this.answerCustomIdentifier!=null &&
              this.answerCustomIdentifier.equals(other.getAnswerCustomIdentifier())));
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
        _hashCode += new Long(getScreenId()).hashCode();
        if (getQuestionId() != null) {
            _hashCode += getQuestionId().hashCode();
        }
        if (getAnswerId() != null) {
            _hashCode += getAnswerId().hashCode();
        }
        if (getResultAnswer() != null) {
            _hashCode += getResultAnswer().hashCode();
        }
        if (getResponseDate() != null) {
            _hashCode += getResponseDate().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getScreenCustomIdentifier() != null) {
            _hashCode += getScreenCustomIdentifier().hashCode();
        }
        if (getQuestionCustomIdentifier() != null) {
            _hashCode += getQuestionCustomIdentifier().hashCode();
        }
        if (getAnswerCustomIdentifier() != null) {
            _hashCode += getAnswerCustomIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "QuestionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResponseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenCustomIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenCustomIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("answerCustomIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "AnswerCustomIdentifier"));
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
