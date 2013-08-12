/**
 * Screen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class Screen  implements java.io.Serializable {
    private long screenId;

    private java.lang.String screenCustomIdentifier;

    private int questionNumber;

    private java.lang.Long screenIdNext;

    private boolean showLabels;

    private boolean selectableImages;

    private java.lang.String screenText;

    private java.lang.String screenInstruction;

    private java.lang.Long themeClassId;

    private com.isurveysoft.www.servicesv5.ScreenOption[] screenOptions;

    private com.isurveysoft.www.servicesv5.Answer[] answers;

    private com.isurveysoft.www.servicesv5.Question[] questions;

    private java.lang.String type;  // attribute

    private boolean nextScreenIsLinked;  // attribute

    public Screen() {
    }

    public Screen(
           long screenId,
           java.lang.String screenCustomIdentifier,
           int questionNumber,
           java.lang.Long screenIdNext,
           boolean showLabels,
           boolean selectableImages,
           java.lang.String screenText,
           java.lang.String screenInstruction,
           java.lang.Long themeClassId,
           com.isurveysoft.www.servicesv5.ScreenOption[] screenOptions,
           com.isurveysoft.www.servicesv5.Answer[] answers,
           com.isurveysoft.www.servicesv5.Question[] questions,
           java.lang.String type,
           boolean nextScreenIsLinked) {
           this.screenId = screenId;
           this.screenCustomIdentifier = screenCustomIdentifier;
           this.questionNumber = questionNumber;
           this.screenIdNext = screenIdNext;
           this.showLabels = showLabels;
           this.selectableImages = selectableImages;
           this.screenText = screenText;
           this.screenInstruction = screenInstruction;
           this.themeClassId = themeClassId;
           this.screenOptions = screenOptions;
           this.answers = answers;
           this.questions = questions;
           this.type = type;
           this.nextScreenIsLinked = nextScreenIsLinked;
    }


    /**
     * Gets the screenId value for this Screen.
     * 
     * @return screenId
     */
    public long getScreenId() {
        return screenId;
    }


    /**
     * Sets the screenId value for this Screen.
     * 
     * @param screenId
     */
    public void setScreenId(long screenId) {
        this.screenId = screenId;
    }


    /**
     * Gets the screenCustomIdentifier value for this Screen.
     * 
     * @return screenCustomIdentifier
     */
    public java.lang.String getScreenCustomIdentifier() {
        return screenCustomIdentifier;
    }


    /**
     * Sets the screenCustomIdentifier value for this Screen.
     * 
     * @param screenCustomIdentifier
     */
    public void setScreenCustomIdentifier(java.lang.String screenCustomIdentifier) {
        this.screenCustomIdentifier = screenCustomIdentifier;
    }


    /**
     * Gets the questionNumber value for this Screen.
     * 
     * @return questionNumber
     */
    public int getQuestionNumber() {
        return questionNumber;
    }


    /**
     * Sets the questionNumber value for this Screen.
     * 
     * @param questionNumber
     */
    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }


    /**
     * Gets the screenIdNext value for this Screen.
     * 
     * @return screenIdNext
     */
    public java.lang.Long getScreenIdNext() {
        return screenIdNext;
    }


    /**
     * Sets the screenIdNext value for this Screen.
     * 
     * @param screenIdNext
     */
    public void setScreenIdNext(java.lang.Long screenIdNext) {
        this.screenIdNext = screenIdNext;
    }


    /**
     * Gets the showLabels value for this Screen.
     * 
     * @return showLabels
     */
    public boolean isShowLabels() {
        return showLabels;
    }


    /**
     * Sets the showLabels value for this Screen.
     * 
     * @param showLabels
     */
    public void setShowLabels(boolean showLabels) {
        this.showLabels = showLabels;
    }


    /**
     * Gets the selectableImages value for this Screen.
     * 
     * @return selectableImages
     */
    public boolean isSelectableImages() {
        return selectableImages;
    }


    /**
     * Sets the selectableImages value for this Screen.
     * 
     * @param selectableImages
     */
    public void setSelectableImages(boolean selectableImages) {
        this.selectableImages = selectableImages;
    }


    /**
     * Gets the screenText value for this Screen.
     * 
     * @return screenText
     */
    public java.lang.String getScreenText() {
        return screenText;
    }


    /**
     * Sets the screenText value for this Screen.
     * 
     * @param screenText
     */
    public void setScreenText(java.lang.String screenText) {
        this.screenText = screenText;
    }


    /**
     * Gets the screenInstruction value for this Screen.
     * 
     * @return screenInstruction
     */
    public java.lang.String getScreenInstruction() {
        return screenInstruction;
    }


    /**
     * Sets the screenInstruction value for this Screen.
     * 
     * @param screenInstruction
     */
    public void setScreenInstruction(java.lang.String screenInstruction) {
        this.screenInstruction = screenInstruction;
    }


    /**
     * Gets the themeClassId value for this Screen.
     * 
     * @return themeClassId
     */
    public java.lang.Long getThemeClassId() {
        return themeClassId;
    }


    /**
     * Sets the themeClassId value for this Screen.
     * 
     * @param themeClassId
     */
    public void setThemeClassId(java.lang.Long themeClassId) {
        this.themeClassId = themeClassId;
    }


    /**
     * Gets the screenOptions value for this Screen.
     * 
     * @return screenOptions
     */
    public com.isurveysoft.www.servicesv5.ScreenOption[] getScreenOptions() {
        return screenOptions;
    }


    /**
     * Sets the screenOptions value for this Screen.
     * 
     * @param screenOptions
     */
    public void setScreenOptions(com.isurveysoft.www.servicesv5.ScreenOption[] screenOptions) {
        this.screenOptions = screenOptions;
    }


    /**
     * Gets the answers value for this Screen.
     * 
     * @return answers
     */
    public com.isurveysoft.www.servicesv5.Answer[] getAnswers() {
        return answers;
    }


    /**
     * Sets the answers value for this Screen.
     * 
     * @param answers
     */
    public void setAnswers(com.isurveysoft.www.servicesv5.Answer[] answers) {
        this.answers = answers;
    }


    /**
     * Gets the questions value for this Screen.
     * 
     * @return questions
     */
    public com.isurveysoft.www.servicesv5.Question[] getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this Screen.
     * 
     * @param questions
     */
    public void setQuestions(com.isurveysoft.www.servicesv5.Question[] questions) {
        this.questions = questions;
    }


    /**
     * Gets the type value for this Screen.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Screen.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the nextScreenIsLinked value for this Screen.
     * 
     * @return nextScreenIsLinked
     */
    public boolean isNextScreenIsLinked() {
        return nextScreenIsLinked;
    }


    /**
     * Sets the nextScreenIsLinked value for this Screen.
     * 
     * @param nextScreenIsLinked
     */
    public void setNextScreenIsLinked(boolean nextScreenIsLinked) {
        this.nextScreenIsLinked = nextScreenIsLinked;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Screen)) return false;
        Screen other = (Screen) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.screenId == other.getScreenId() &&
            ((this.screenCustomIdentifier==null && other.getScreenCustomIdentifier()==null) || 
             (this.screenCustomIdentifier!=null &&
              this.screenCustomIdentifier.equals(other.getScreenCustomIdentifier()))) &&
            this.questionNumber == other.getQuestionNumber() &&
            ((this.screenIdNext==null && other.getScreenIdNext()==null) || 
             (this.screenIdNext!=null &&
              this.screenIdNext.equals(other.getScreenIdNext()))) &&
            this.showLabels == other.isShowLabels() &&
            this.selectableImages == other.isSelectableImages() &&
            ((this.screenText==null && other.getScreenText()==null) || 
             (this.screenText!=null &&
              this.screenText.equals(other.getScreenText()))) &&
            ((this.screenInstruction==null && other.getScreenInstruction()==null) || 
             (this.screenInstruction!=null &&
              this.screenInstruction.equals(other.getScreenInstruction()))) &&
            ((this.themeClassId==null && other.getThemeClassId()==null) || 
             (this.themeClassId!=null &&
              this.themeClassId.equals(other.getThemeClassId()))) &&
            ((this.screenOptions==null && other.getScreenOptions()==null) || 
             (this.screenOptions!=null &&
              java.util.Arrays.equals(this.screenOptions, other.getScreenOptions()))) &&
            ((this.answers==null && other.getAnswers()==null) || 
             (this.answers!=null &&
              java.util.Arrays.equals(this.answers, other.getAnswers()))) &&
            ((this.questions==null && other.getQuestions()==null) || 
             (this.questions!=null &&
              java.util.Arrays.equals(this.questions, other.getQuestions()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.nextScreenIsLinked == other.isNextScreenIsLinked();
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
        if (getScreenCustomIdentifier() != null) {
            _hashCode += getScreenCustomIdentifier().hashCode();
        }
        _hashCode += getQuestionNumber();
        if (getScreenIdNext() != null) {
            _hashCode += getScreenIdNext().hashCode();
        }
        _hashCode += (isShowLabels() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSelectableImages() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getScreenText() != null) {
            _hashCode += getScreenText().hashCode();
        }
        if (getScreenInstruction() != null) {
            _hashCode += getScreenInstruction().hashCode();
        }
        if (getThemeClassId() != null) {
            _hashCode += getThemeClassId().hashCode();
        }
        if (getScreenOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScreenOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScreenOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isNextScreenIsLinked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Screen.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screen"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nextScreenIsLinked");
        attrField.setXmlName(new javax.xml.namespace.QName("", "nextScreenIsLinked"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("questionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "QuestionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenIdNext");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenIdNext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ShowLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectableImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectableImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenInstruction"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Answer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Questions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Question"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Question"));
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
