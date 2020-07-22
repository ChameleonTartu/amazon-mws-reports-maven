
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
 *         <element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Schedule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "reportType",
    "schedule",
    "scheduleDate",
    "mwsAuthToken"
})
@XmlRootElement(name = "ManageReportScheduleRequest")
public class ManageReportScheduleRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "ReportType", required = true)
    protected String reportType;
    @XmlElement(name = "Schedule", required = true)
    protected String schedule;
    @XmlElement(name = "ScheduleDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;

    /**
     * Default constructor
     * 
     */
    public ManageReportScheduleRequest() {
        super();
    }

    /**
     * Value constructor
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param reportType {@link String}
     * @param schedule {@link String}
     * @param scheduleDate {@link XMLGregorianCalendar}
     */
    public ManageReportScheduleRequest(final String marketplace, final String merchant, final String reportType, final String schedule, final XMLGregorianCalendar scheduleDate) {
       this(marketplace, merchant, reportType, schedule, scheduleDate, null);
    }

    /**
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param reportType {@link String}
     * @param schedule {@link String}
     * @param scheduleDate {@link XMLGregorianCalendar}
     * @param mwsAuthToken {@link String}
     */
    public ManageReportScheduleRequest(final String marketplace, 
            final String merchant, 
            final String reportType,
            final String schedule, 
            final XMLGregorianCalendar scheduleDate, 
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.reportType = reportType;
        this.schedule = schedule;
        this.scheduleDate = scheduleDate;
        this.mwsAuthToken = mwsAuthToken;
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
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportType() {
        return (this.reportType!= null);
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetSchedule() {
        return (this.schedule!= null);
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetScheduleDate() {
        return (this.scheduleDate!= null);
    }

    /**
     * Sets the value of the Marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value {@link String}
     * @return
     *     this instance
     */
    public ManageReportScheduleRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public ManageReportScheduleRequest withMerchant(String value) {
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
    public ManageReportScheduleRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the ReportType property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public ManageReportScheduleRequest withReportType(String value) {
        setReportType(value);
        return this;
    }

    /**
     * Sets the value of the Schedule property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public ManageReportScheduleRequest withSchedule(String value) {
        setSchedule(value);
        return this;
    }

    /**
     * Sets the value of the ScheduleDate property.
     *
     * @param value {@link XMLGregorianCalendar}
     * @return
     *     this instance
     */
    public ManageReportScheduleRequest withScheduleDate(XMLGregorianCalendar value) {
        setScheduleDate(value);
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
        if (isSetReportType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportType"));
            json.append(" : ");
            json.append(quoteJSON(getReportType()));
            first = false;
        }
        if (isSetSchedule()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Schedule"));
            json.append(" : ");
            json.append(quoteJSON(getSchedule()));
            first = false;
        }
        if (isSetScheduleDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ScheduleDate"));
            json.append(" : ");
            json.append(quoteJSON(getScheduleDate() + ""));
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
