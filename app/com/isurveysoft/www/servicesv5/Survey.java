/**
 * Survey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class Survey  implements java.io.Serializable {
    private long surveyId;

    private java.lang.String surveyName;

    private java.lang.Long screenIdFirst;

    private long surveyThemeId;

    private boolean surveyTestMode;

    private long surveyVersion;

    private boolean surveyIsPurchased;

    private boolean isDemoSurvey;

    private com.isurveysoft.www.servicesv5.IdleTimeout idleTimeout;

    private com.isurveysoft.www.servicesv5.Screen[] screens;

    private com.isurveysoft.www.servicesv5.SurveyOption[] surveyOptions;

    private com.isurveysoft.www.servicesv5.SelectList[] selectLists;

    public Survey() {
    }

    public Survey(
           long surveyId,
           java.lang.String surveyName,
           java.lang.Long screenIdFirst,
           long surveyThemeId,
           boolean surveyTestMode,
           long surveyVersion,
           boolean surveyIsPurchased,
           boolean isDemoSurvey,
           com.isurveysoft.www.servicesv5.IdleTimeout idleTimeout,
           com.isurveysoft.www.servicesv5.Screen[] screens,
           com.isurveysoft.www.servicesv5.SurveyOption[] surveyOptions,
           com.isurveysoft.www.servicesv5.SelectList[] selectLists) {
           this.surveyId = surveyId;
           this.surveyName = surveyName;
           this.screenIdFirst = screenIdFirst;
           this.surveyThemeId = surveyThemeId;
           this.surveyTestMode = surveyTestMode;
           this.surveyVersion = surveyVersion;
           this.surveyIsPurchased = surveyIsPurchased;
           this.isDemoSurvey = isDemoSurvey;
           this.idleTimeout = idleTimeout;
           this.screens = screens;
           this.surveyOptions = surveyOptions;
           this.selectLists = selectLists;
    }


    /**
     * Gets the surveyId value for this Survey.
     * 
     * @return surveyId
     */
    public long getSurveyId() {
        return surveyId;
    }


    /**
     * Sets the surveyId value for this Survey.
     * 
     * @param surveyId
     */
    public void setSurveyId(long surveyId) {
        this.surveyId = surveyId;
    }


    /**
     * Gets the surveyName value for this Survey.
     * 
     * @return surveyName
     */
    public java.lang.String getSurveyName() {
        return surveyName;
    }


    /**
     * Sets the surveyName value for this Survey.
     * 
     * @param surveyName
     */
    public void setSurveyName(java.lang.String surveyName) {
        this.surveyName = surveyName;
    }


    /**
     * Gets the screenIdFirst value for this Survey.
     * 
     * @return screenIdFirst
     */
    public java.lang.Long getScreenIdFirst() {
        return screenIdFirst;
    }


    /**
     * Sets the screenIdFirst value for this Survey.
     * 
     * @param screenIdFirst
     */
    public void setScreenIdFirst(java.lang.Long screenIdFirst) {
        this.screenIdFirst = screenIdFirst;
    }


    /**
     * Gets the surveyThemeId value for this Survey.
     * 
     * @return surveyThemeId
     */
    public long getSurveyThemeId() {
        return surveyThemeId;
    }


    /**
     * Sets the surveyThemeId value for this Survey.
     * 
     * @param surveyThemeId
     */
    public void setSurveyThemeId(long surveyThemeId) {
        this.surveyThemeId = surveyThemeId;
    }


    /**
     * Gets the surveyTestMode value for this Survey.
     * 
     * @return surveyTestMode
     */
    public boolean isSurveyTestMode() {
        return surveyTestMode;
    }


    /**
     * Sets the surveyTestMode value for this Survey.
     * 
     * @param surveyTestMode
     */
    public void setSurveyTestMode(boolean surveyTestMode) {
        this.surveyTestMode = surveyTestMode;
    }


    /**
     * Gets the surveyVersion value for this Survey.
     * 
     * @return surveyVersion
     */
    public long getSurveyVersion() {
        return surveyVersion;
    }


    /**
     * Sets the surveyVersion value for this Survey.
     * 
     * @param surveyVersion
     */
    public void setSurveyVersion(long surveyVersion) {
        this.surveyVersion = surveyVersion;
    }


    /**
     * Gets the surveyIsPurchased value for this Survey.
     * 
     * @return surveyIsPurchased
     */
    public boolean isSurveyIsPurchased() {
        return surveyIsPurchased;
    }


    /**
     * Sets the surveyIsPurchased value for this Survey.
     * 
     * @param surveyIsPurchased
     */
    public void setSurveyIsPurchased(boolean surveyIsPurchased) {
        this.surveyIsPurchased = surveyIsPurchased;
    }


    /**
     * Gets the isDemoSurvey value for this Survey.
     * 
     * @return isDemoSurvey
     */
    public boolean isIsDemoSurvey() {
        return isDemoSurvey;
    }


    /**
     * Sets the isDemoSurvey value for this Survey.
     * 
     * @param isDemoSurvey
     */
    public void setIsDemoSurvey(boolean isDemoSurvey) {
        this.isDemoSurvey = isDemoSurvey;
    }


    /**
     * Gets the idleTimeout value for this Survey.
     * 
     * @return idleTimeout
     */
    public com.isurveysoft.www.servicesv5.IdleTimeout getIdleTimeout() {
        return idleTimeout;
    }


    /**
     * Sets the idleTimeout value for this Survey.
     * 
     * @param idleTimeout
     */
    public void setIdleTimeout(com.isurveysoft.www.servicesv5.IdleTimeout idleTimeout) {
        this.idleTimeout = idleTimeout;
    }


    /**
     * Gets the screens value for this Survey.
     * 
     * @return screens
     */
    public com.isurveysoft.www.servicesv5.Screen[] getScreens() {
        return screens;
    }


    /**
     * Sets the screens value for this Survey.
     * 
     * @param screens
     */
    public void setScreens(com.isurveysoft.www.servicesv5.Screen[] screens) {
        this.screens = screens;
    }


    /**
     * Gets the surveyOptions value for this Survey.
     * 
     * @return surveyOptions
     */
    public com.isurveysoft.www.servicesv5.SurveyOption[] getSurveyOptions() {
        return surveyOptions;
    }


    /**
     * Sets the surveyOptions value for this Survey.
     * 
     * @param surveyOptions
     */
    public void setSurveyOptions(com.isurveysoft.www.servicesv5.SurveyOption[] surveyOptions) {
        this.surveyOptions = surveyOptions;
    }


    /**
     * Gets the selectLists value for this Survey.
     * 
     * @return selectLists
     */
    public com.isurveysoft.www.servicesv5.SelectList[] getSelectLists() {
        return selectLists;
    }


    /**
     * Sets the selectLists value for this Survey.
     * 
     * @param selectLists
     */
    public void setSelectLists(com.isurveysoft.www.servicesv5.SelectList[] selectLists) {
        this.selectLists = selectLists;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Survey)) return false;
        Survey other = (Survey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.surveyId == other.getSurveyId() &&
            ((this.surveyName==null && other.getSurveyName()==null) || 
             (this.surveyName!=null &&
              this.surveyName.equals(other.getSurveyName()))) &&
            ((this.screenIdFirst==null && other.getScreenIdFirst()==null) || 
             (this.screenIdFirst!=null &&
              this.screenIdFirst.equals(other.getScreenIdFirst()))) &&
            this.surveyThemeId == other.getSurveyThemeId() &&
            this.surveyTestMode == other.isSurveyTestMode() &&
            this.surveyVersion == other.getSurveyVersion() &&
            this.surveyIsPurchased == other.isSurveyIsPurchased() &&
            this.isDemoSurvey == other.isIsDemoSurvey() &&
            ((this.idleTimeout==null && other.getIdleTimeout()==null) || 
             (this.idleTimeout!=null &&
              this.idleTimeout.equals(other.getIdleTimeout()))) &&
            ((this.screens==null && other.getScreens()==null) || 
             (this.screens!=null &&
              java.util.Arrays.equals(this.screens, other.getScreens()))) &&
            ((this.surveyOptions==null && other.getSurveyOptions()==null) || 
             (this.surveyOptions!=null &&
              java.util.Arrays.equals(this.surveyOptions, other.getSurveyOptions()))) &&
            ((this.selectLists==null && other.getSelectLists()==null) || 
             (this.selectLists!=null &&
              java.util.Arrays.equals(this.selectLists, other.getSelectLists())));
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
        _hashCode += new Long(getSurveyId()).hashCode();
        if (getSurveyName() != null) {
            _hashCode += getSurveyName().hashCode();
        }
        if (getScreenIdFirst() != null) {
            _hashCode += getScreenIdFirst().hashCode();
        }
        _hashCode += new Long(getSurveyThemeId()).hashCode();
        _hashCode += (isSurveyTestMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getSurveyVersion()).hashCode();
        _hashCode += (isSurveyIsPurchased() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDemoSurvey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdleTimeout() != null) {
            _hashCode += getIdleTimeout().hashCode();
        }
        if (getScreens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScreens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScreens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurveyOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurveyOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurveyOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelectLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelectLists(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Survey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Survey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenIdFirst");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenIdFirst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyThemeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyThemeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyTestMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyTestMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyIsPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyIsPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDemoSurvey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IsDemoSurvey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IdleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IdleTimeout"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screens");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screens"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screen"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Screen"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectLists");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SelectList"));
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
