/**
 * SurveyResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.isurveysoft.www.servicesv5;

public class SurveyResult  implements java.io.Serializable {
    private com.isurveysoft.www.servicesv5.Result[] screenResults;

    private long resultId;

    private java.lang.String resultDeviceIdentifier;

    private java.lang.String resultDeviceName;

    private boolean isDemoSurvey;

    private long surveyId;

    private long surveyVersion;

    private java.lang.String surveyStartDate;

    private java.lang.String surveyEndDate;

    private double resultLocationAccuracy;

    private double resultLocationAltitude;

    private double resultLocationLatitude;

    private double resultLocationLongitude;

    private java.lang.String resultDeviceGuid;

    private long resultLocationStatus;

    private java.lang.Boolean isIncomplete;

    public SurveyResult() {
    }

    public SurveyResult(
           com.isurveysoft.www.servicesv5.Result[] screenResults,
           long resultId,
           java.lang.String resultDeviceIdentifier,
           java.lang.String resultDeviceName,
           boolean isDemoSurvey,
           long surveyId,
           long surveyVersion,
           java.lang.String surveyStartDate,
           java.lang.String surveyEndDate,
           double resultLocationAccuracy,
           double resultLocationAltitude,
           double resultLocationLatitude,
           double resultLocationLongitude,
           java.lang.String resultDeviceGuid,
           long resultLocationStatus,
           java.lang.Boolean isIncomplete) {
           this.screenResults = screenResults;
           this.resultId = resultId;
           this.resultDeviceIdentifier = resultDeviceIdentifier;
           this.resultDeviceName = resultDeviceName;
           this.isDemoSurvey = isDemoSurvey;
           this.surveyId = surveyId;
           this.surveyVersion = surveyVersion;
           this.surveyStartDate = surveyStartDate;
           this.surveyEndDate = surveyEndDate;
           this.resultLocationAccuracy = resultLocationAccuracy;
           this.resultLocationAltitude = resultLocationAltitude;
           this.resultLocationLatitude = resultLocationLatitude;
           this.resultLocationLongitude = resultLocationLongitude;
           this.resultDeviceGuid = resultDeviceGuid;
           this.resultLocationStatus = resultLocationStatus;
           this.isIncomplete = isIncomplete;
    }


    /**
     * Gets the screenResults value for this SurveyResult.
     * 
     * @return screenResults
     */
    public com.isurveysoft.www.servicesv5.Result[] getScreenResults() {
        return screenResults;
    }


    /**
     * Sets the screenResults value for this SurveyResult.
     * 
     * @param screenResults
     */
    public void setScreenResults(com.isurveysoft.www.servicesv5.Result[] screenResults) {
        this.screenResults = screenResults;
    }


    /**
     * Gets the resultId value for this SurveyResult.
     * 
     * @return resultId
     */
    public long getResultId() {
        return resultId;
    }


    /**
     * Sets the resultId value for this SurveyResult.
     * 
     * @param resultId
     */
    public void setResultId(long resultId) {
        this.resultId = resultId;
    }


    /**
     * Gets the resultDeviceIdentifier value for this SurveyResult.
     * 
     * @return resultDeviceIdentifier
     */
    public java.lang.String getResultDeviceIdentifier() {
        return resultDeviceIdentifier;
    }


    /**
     * Sets the resultDeviceIdentifier value for this SurveyResult.
     * 
     * @param resultDeviceIdentifier
     */
    public void setResultDeviceIdentifier(java.lang.String resultDeviceIdentifier) {
        this.resultDeviceIdentifier = resultDeviceIdentifier;
    }


    /**
     * Gets the resultDeviceName value for this SurveyResult.
     * 
     * @return resultDeviceName
     */
    public java.lang.String getResultDeviceName() {
        return resultDeviceName;
    }


    /**
     * Sets the resultDeviceName value for this SurveyResult.
     * 
     * @param resultDeviceName
     */
    public void setResultDeviceName(java.lang.String resultDeviceName) {
        this.resultDeviceName = resultDeviceName;
    }


    /**
     * Gets the isDemoSurvey value for this SurveyResult.
     * 
     * @return isDemoSurvey
     */
    public boolean isIsDemoSurvey() {
        return isDemoSurvey;
    }


    /**
     * Sets the isDemoSurvey value for this SurveyResult.
     * 
     * @param isDemoSurvey
     */
    public void setIsDemoSurvey(boolean isDemoSurvey) {
        this.isDemoSurvey = isDemoSurvey;
    }


    /**
     * Gets the surveyId value for this SurveyResult.
     * 
     * @return surveyId
     */
    public long getSurveyId() {
        return surveyId;
    }


    /**
     * Sets the surveyId value for this SurveyResult.
     * 
     * @param surveyId
     */
    public void setSurveyId(long surveyId) {
        this.surveyId = surveyId;
    }


    /**
     * Gets the surveyVersion value for this SurveyResult.
     * 
     * @return surveyVersion
     */
    public long getSurveyVersion() {
        return surveyVersion;
    }


    /**
     * Sets the surveyVersion value for this SurveyResult.
     * 
     * @param surveyVersion
     */
    public void setSurveyVersion(long surveyVersion) {
        this.surveyVersion = surveyVersion;
    }


    /**
     * Gets the surveyStartDate value for this SurveyResult.
     * 
     * @return surveyStartDate
     */
    public java.lang.String getSurveyStartDate() {
        return surveyStartDate;
    }


    /**
     * Sets the surveyStartDate value for this SurveyResult.
     * 
     * @param surveyStartDate
     */
    public void setSurveyStartDate(java.lang.String surveyStartDate) {
        this.surveyStartDate = surveyStartDate;
    }


    /**
     * Gets the surveyEndDate value for this SurveyResult.
     * 
     * @return surveyEndDate
     */
    public java.lang.String getSurveyEndDate() {
        return surveyEndDate;
    }


    /**
     * Sets the surveyEndDate value for this SurveyResult.
     * 
     * @param surveyEndDate
     */
    public void setSurveyEndDate(java.lang.String surveyEndDate) {
        this.surveyEndDate = surveyEndDate;
    }


    /**
     * Gets the resultLocationAccuracy value for this SurveyResult.
     * 
     * @return resultLocationAccuracy
     */
    public double getResultLocationAccuracy() {
        return resultLocationAccuracy;
    }


    /**
     * Sets the resultLocationAccuracy value for this SurveyResult.
     * 
     * @param resultLocationAccuracy
     */
    public void setResultLocationAccuracy(double resultLocationAccuracy) {
        this.resultLocationAccuracy = resultLocationAccuracy;
    }


    /**
     * Gets the resultLocationAltitude value for this SurveyResult.
     * 
     * @return resultLocationAltitude
     */
    public double getResultLocationAltitude() {
        return resultLocationAltitude;
    }


    /**
     * Sets the resultLocationAltitude value for this SurveyResult.
     * 
     * @param resultLocationAltitude
     */
    public void setResultLocationAltitude(double resultLocationAltitude) {
        this.resultLocationAltitude = resultLocationAltitude;
    }


    /**
     * Gets the resultLocationLatitude value for this SurveyResult.
     * 
     * @return resultLocationLatitude
     */
    public double getResultLocationLatitude() {
        return resultLocationLatitude;
    }


    /**
     * Sets the resultLocationLatitude value for this SurveyResult.
     * 
     * @param resultLocationLatitude
     */
    public void setResultLocationLatitude(double resultLocationLatitude) {
        this.resultLocationLatitude = resultLocationLatitude;
    }


    /**
     * Gets the resultLocationLongitude value for this SurveyResult.
     * 
     * @return resultLocationLongitude
     */
    public double getResultLocationLongitude() {
        return resultLocationLongitude;
    }


    /**
     * Sets the resultLocationLongitude value for this SurveyResult.
     * 
     * @param resultLocationLongitude
     */
    public void setResultLocationLongitude(double resultLocationLongitude) {
        this.resultLocationLongitude = resultLocationLongitude;
    }


    /**
     * Gets the resultDeviceGuid value for this SurveyResult.
     * 
     * @return resultDeviceGuid
     */
    public java.lang.String getResultDeviceGuid() {
        return resultDeviceGuid;
    }


    /**
     * Sets the resultDeviceGuid value for this SurveyResult.
     * 
     * @param resultDeviceGuid
     */
    public void setResultDeviceGuid(java.lang.String resultDeviceGuid) {
        this.resultDeviceGuid = resultDeviceGuid;
    }


    /**
     * Gets the resultLocationStatus value for this SurveyResult.
     * 
     * @return resultLocationStatus
     */
    public long getResultLocationStatus() {
        return resultLocationStatus;
    }


    /**
     * Sets the resultLocationStatus value for this SurveyResult.
     * 
     * @param resultLocationStatus
     */
    public void setResultLocationStatus(long resultLocationStatus) {
        this.resultLocationStatus = resultLocationStatus;
    }


    /**
     * Gets the isIncomplete value for this SurveyResult.
     * 
     * @return isIncomplete
     */
    public java.lang.Boolean getIsIncomplete() {
        return isIncomplete;
    }


    /**
     * Sets the isIncomplete value for this SurveyResult.
     * 
     * @param isIncomplete
     */
    public void setIsIncomplete(java.lang.Boolean isIncomplete) {
        this.isIncomplete = isIncomplete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyResult)) return false;
        SurveyResult other = (SurveyResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.screenResults==null && other.getScreenResults()==null) || 
             (this.screenResults!=null &&
              java.util.Arrays.equals(this.screenResults, other.getScreenResults()))) &&
            this.resultId == other.getResultId() &&
            ((this.resultDeviceIdentifier==null && other.getResultDeviceIdentifier()==null) || 
             (this.resultDeviceIdentifier!=null &&
              this.resultDeviceIdentifier.equals(other.getResultDeviceIdentifier()))) &&
            ((this.resultDeviceName==null && other.getResultDeviceName()==null) || 
             (this.resultDeviceName!=null &&
              this.resultDeviceName.equals(other.getResultDeviceName()))) &&
            this.isDemoSurvey == other.isIsDemoSurvey() &&
            this.surveyId == other.getSurveyId() &&
            this.surveyVersion == other.getSurveyVersion() &&
            ((this.surveyStartDate==null && other.getSurveyStartDate()==null) || 
             (this.surveyStartDate!=null &&
              this.surveyStartDate.equals(other.getSurveyStartDate()))) &&
            ((this.surveyEndDate==null && other.getSurveyEndDate()==null) || 
             (this.surveyEndDate!=null &&
              this.surveyEndDate.equals(other.getSurveyEndDate()))) &&
            this.resultLocationAccuracy == other.getResultLocationAccuracy() &&
            this.resultLocationAltitude == other.getResultLocationAltitude() &&
            this.resultLocationLatitude == other.getResultLocationLatitude() &&
            this.resultLocationLongitude == other.getResultLocationLongitude() &&
            ((this.resultDeviceGuid==null && other.getResultDeviceGuid()==null) || 
             (this.resultDeviceGuid!=null &&
              this.resultDeviceGuid.equals(other.getResultDeviceGuid()))) &&
            this.resultLocationStatus == other.getResultLocationStatus() &&
            ((this.isIncomplete==null && other.getIsIncomplete()==null) || 
             (this.isIncomplete!=null &&
              this.isIncomplete.equals(other.getIsIncomplete())));
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
        if (getScreenResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScreenResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScreenResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getResultId()).hashCode();
        if (getResultDeviceIdentifier() != null) {
            _hashCode += getResultDeviceIdentifier().hashCode();
        }
        if (getResultDeviceName() != null) {
            _hashCode += getResultDeviceName().hashCode();
        }
        _hashCode += (isIsDemoSurvey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getSurveyId()).hashCode();
        _hashCode += new Long(getSurveyVersion()).hashCode();
        if (getSurveyStartDate() != null) {
            _hashCode += getSurveyStartDate().hashCode();
        }
        if (getSurveyEndDate() != null) {
            _hashCode += getSurveyEndDate().hashCode();
        }
        _hashCode += new Double(getResultLocationAccuracy()).hashCode();
        _hashCode += new Double(getResultLocationAltitude()).hashCode();
        _hashCode += new Double(getResultLocationLatitude()).hashCode();
        _hashCode += new Double(getResultLocationLongitude()).hashCode();
        if (getResultDeviceGuid() != null) {
            _hashCode += getResultDeviceGuid().hashCode();
        }
        _hashCode += new Long(getResultLocationStatus()).hashCode();
        if (getIsIncomplete() != null) {
            _hashCode += getIsIncomplete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurveyResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenResults");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ScreenResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "Result"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDeviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultDeviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDeviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultDeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDemoSurvey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IsDemoSurvey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "SurveyEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLocationAccuracy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultLocationAccuracy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLocationAltitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultLocationAltitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLocationLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultLocationLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLocationLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultLocationLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDeviceGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultDeviceGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLocationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "ResultLocationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIncomplete");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.isurveysoft.com/servicesv5/", "IsIncomplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
