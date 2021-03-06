
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * {@code <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ReportRequestIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList" minOccurs="0"/>
 *         <element name="ReportTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/>
 *         <element name="ReportProcessingStatusList" type="{http://mws.amazonaws.com/doc/2009-01-01/}StatusList" minOccurs="0"/>
 *         <element name="MaxCount" type="{http://mws.amazonaws.com/doc/2009-01-01/}Count" minOccurs="0"/>
 *         <element name="RequestedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="RequestedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>}
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketplace",
    "merchant",
    "reportRequestIdList",
    "reportTypeList",
    "reportProcessingStatusList",
    "maxCount",
    "requestedFromDate",
    "requestedToDate",
    "mwsAuthToken"
})
@XmlRootElement(name = "GetReportRequestListRequest")
public class GetReportRequestListRequest {
    
    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "ReportRequestIdList")
    protected IdList reportRequestIdList;
    @XmlElement(name = "ReportTypeList")
    protected TypeList reportTypeList;
    @XmlElement(name = "ReportProcessingStatusList")
    protected StatusList reportProcessingStatusList;
    @XmlElement(name = "MaxCount")
    protected Integer maxCount;
    @XmlElement(name = "RequestedFromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedFromDate;
    @XmlElement(name = "RequestedToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedToDate;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;

    /**
     * Default constructor
     *
     */
    public GetReportRequestListRequest() {
        super();
    }

    /**
     * Value constructor
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param reportRequestIdList {@link IdList}
     * @param reportTypeList {@link TypeList}
     * @param reportProcessingStatusList {@link StatusList}
     * @param maxCount {@link Integer}
     * @param requestedFromDate {@link XMLGregorianCalendar}
     * @param requestedToDate {@link XMLGregorianCalendar}
     */
    public GetReportRequestListRequest(final String marketplace, 
    		final String merchant, 
    		final IdList reportRequestIdList, 
    		final TypeList reportTypeList, 
    		final StatusList reportProcessingStatusList, 
    		final Integer maxCount, 
    		final XMLGregorianCalendar requestedFromDate, 
    		final XMLGregorianCalendar requestedToDate) {
        this(marketplace, merchant, reportRequestIdList, reportTypeList, reportProcessingStatusList, maxCount,
                requestedFromDate, requestedToDate, null);
    }

    /**
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param reportRequestIdList {@link IdList}
     * @param reportTypeList {@link TypeList}
     * @param reportProcessingStatusList {@link StatusList}
     * @param maxCount {@link Integer}
     * @param requestedFromDate {@link XMLGregorianCalendar}
     * @param requestedToDate {@link XMLGregorianCalendar}
     * @param mwsAuthToken {@link String}
     */
    public GetReportRequestListRequest(final String marketplace, 
    		final String merchant, 
    		final IdList reportRequestIdList, 
    		final TypeList reportTypeList, 
    		final StatusList reportProcessingStatusList, 
    		final Integer maxCount, 
    		final XMLGregorianCalendar requestedFromDate, 
    		final XMLGregorianCalendar requestedToDate,
    		final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.reportRequestIdList = reportRequestIdList;
        this.reportTypeList = reportTypeList;
        this.reportProcessingStatusList = reportProcessingStatusList;
        this.maxCount = maxCount;
        this.requestedFromDate = requestedFromDate;
        this.requestedToDate = requestedToDate;
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }
    
    /**
     * Gets the value of the marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Sets the value of the marketplace property.
     * 
     * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
     * in here for backwards compatibility.
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    /**
     * @deprecated  See {@link #setMarketplace(String)}
     *
     * @return {@link boolean}
     */
    public boolean isSetMarketplace() {
        return (this.marketplace!= null);
    }
    
    /**
     * Sets the value of the Marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }
    
    /**
     * Gets the value of the reportRequestIdList property.
     * 
     * @return
     *     possible object is
     *     {@link IdList }
     *     
     */
    public IdList getReportRequestIdList() {
        return reportRequestIdList;
    }

    /**
     * Sets the value of the reportRequestIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdList }
     *     
     */
    public void setReportRequestIdList(IdList value) {
        this.reportRequestIdList = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportRequestIdList() {
        return (this.reportRequestIdList!= null);
    }

    /**
     * Gets the value of the reportTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link TypeList }
     *     
     */
    public TypeList getReportTypeList() {
        return reportTypeList;
    }

    /**
     * Sets the value of the reportTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeList }
     *     
     */
    public void setReportTypeList(TypeList value) {
        this.reportTypeList = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportTypeList() {
        return (this.reportTypeList!= null);
    }

    /**
     * Gets the value of the reportProcessingStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link StatusList }
     *     
     */
    public StatusList getReportProcessingStatusList() {
        return reportProcessingStatusList;
    }

    /**
     * Sets the value of the reportProcessingStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusList }
     *     
     */
    public void setReportProcessingStatusList(StatusList value) {
        this.reportProcessingStatusList = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportProcessingStatusList() {
        return (this.reportProcessingStatusList!= null);
    }

    /**
     * Gets the value of the maxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCount(Integer value) {
        this.maxCount = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetMaxCount() {
        return (this.maxCount!= null);
    }

    /**
     * Gets the value of the requestedFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedFromDate() {
        return requestedFromDate;
    }

    /**
     * Sets the value of the requestedFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedFromDate(XMLGregorianCalendar value) {
        this.requestedFromDate = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetRequestedFromDate() {
        return (this.requestedFromDate!= null);
    }

    /**
     * Gets the value of the requestedToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedToDate() {
        return requestedToDate;
    }

    /**
     * Sets the value of the requestedToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedToDate(XMLGregorianCalendar value) {
        this.requestedToDate = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetRequestedToDate() {
        return (this.requestedToDate!= null);
    }
    
    /**
     * Gets the value of the mwsAuthToken property.
     * 
     * @return possible object is
     *     {@link String}
     */
    public String getMWSAuthToken() {
    	return mwsAuthToken;
    }
    
    /**
     * Sets the value of the mwsAuthToken property
     * @param authTokenValue
     * 		allowed object is 
     * 		{@link String}
     */
    public void setMWSAuthToken(String authTokenValue) {
    	this.mwsAuthToken = authTokenValue;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetMWSAuthToken() {
    	return (this.mwsAuthToken!=null);
    }

    /**
     * Sets the value of the Merchant property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }
    
    /**
     * Sets the value of the MWSAuthToken property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the ReportRequestIdList property.
     * 
     * @param value {@link IdList}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withReportRequestIdList(IdList value) {
        setReportRequestIdList(value);
        return this;
    }

    /**
     * Sets the value of the ReportTypeList property.
     * 
     * @param value {@link TypeList}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withReportTypeList(TypeList value) {
        setReportTypeList(value);
        return this;
    }

    /**
     * Sets the value of the ReportProcessingStatusList property.
     * 
     * @param value {@link StatusList}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withReportProcessingStatusList(StatusList value) {
        setReportProcessingStatusList(value);
        return this;
    }

    /**
     * Sets the value of the MaxCount property.
     * 
     * @param value {@link Integer}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withMaxCount(Integer value) {
        setMaxCount(value);
        return this;
    }

    /**
     * Sets the value of the RequestedFromDate property.
     * 
     * @param value {@link XMLGregorianCalendar}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withRequestedFromDate(XMLGregorianCalendar value) {
        setRequestedFromDate(value);
        return this;
    }

    /**
     * Sets the value of the RequestedToDate property.
     * 
     * @param value {@link XMLGregorianCalendar}
     * @return
     *     this instance
     */
    public GetReportRequestListRequest withRequestedToDate(XMLGregorianCalendar value) {
        setRequestedToDate(value);
        return this;
    }

    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetMarketplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Marketplace"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplace()));
            first = false;
        }
        if (isSetMerchant()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Merchant"));
            json.append(" : ");
            json.append(quoteJSON(getMerchant()));
            first = false;
        }
        if (isSetReportRequestIdList()) {
            if (!first) json.append(", ");
            json.append("\"ReportRequestIdList\" : {");
            IdList  reportRequestIdList = getReportRequestIdList();
            json.append(reportRequestIdList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetReportTypeList()) {
            if (!first) json.append(", ");
            json.append("\"ReportTypeList\" : {");
            TypeList  reportTypeList = getReportTypeList();


            json.append(reportTypeList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetReportProcessingStatusList()) {
            if (!first) json.append(", ");
            json.append("\"ReportProcessingStatusList\" : {");
            StatusList  reportProcessingStatusList = getReportProcessingStatusList();


            json.append(reportProcessingStatusList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetMaxCount()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MaxCount"));
            json.append(" : ");
            json.append(quoteJSON(getMaxCount() + ""));
            first = false;
        }
        if (isSetRequestedFromDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("RequestedFromDate"));
            json.append(" : ");
            json.append(quoteJSON(getRequestedFromDate() + ""));
            first = false;
        }
        if (isSetRequestedToDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("RequestedToDate"));
            json.append(" : ");
            json.append(quoteJSON(getRequestedToDate() + ""));
            first = false;
        }
        if (isSetMWSAuthToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MWSAuthToken"));
            json.append(" : ");
            json.append(quoteJSON(getMWSAuthToken()));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
