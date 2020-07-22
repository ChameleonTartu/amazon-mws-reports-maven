
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         <element name="ReportIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList"/>
 *         <element name="Acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "reportIdList",
    "acknowledged",
    "mwsAuthToken"
})
@XmlRootElement(name = "UpdateReportAcknowledgementsRequest")
public class UpdateReportAcknowledgementsRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "ReportIdList", required = true)
    protected IdList reportIdList;
    @XmlElement(name = "Acknowledged")
    protected Boolean acknowledged;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;
    /**
     * Default constructor
     * 
     */
    public UpdateReportAcknowledgementsRequest() {
        super();
    }

    /**
     * Value constructor
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param reportIdList {@link IdList}
     * @param acknowledged {@link Boolean}
     */
    public UpdateReportAcknowledgementsRequest(final String marketplace, final String merchant, final IdList reportIdList, final Boolean acknowledged) {
        this(marketplace, merchant, reportIdList, acknowledged, null);
    }

    /**
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param reportIdList {@link IdList}
     * @param acknowledged {@link Boolean}
     * @param mwsAuthToken {@link String}
     */
    public UpdateReportAcknowledgementsRequest(final String marketplace, 
            final String merchant, 
            final IdList reportIdList,
            final Boolean acknowledged, 
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.reportIdList = reportIdList;
        this.acknowledged = acknowledged;
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
     * Gets the value of the reportIdList property.
     * 
     * @return
     *     possible object is
     *     {@link IdList }
     *     
     */
    public IdList getReportIdList() {
        return reportIdList;
    }

    /**
     * Sets the value of the reportIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdList }
     *     
     */
    public void setReportIdList(IdList value) {
        this.reportIdList = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportIdList() {
        return (this.reportIdList!= null);
    }

    /**
     * Gets the value of the acknowledged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcknowledged() {
        return acknowledged;
    }

    /**
     * Sets the value of the acknowledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcknowledged(Boolean value) {
        this.acknowledged = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetAcknowledged() {
        return (this.acknowledged!= null);
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
     * @param authTokenValue allowed object is {@link String}
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
     * Sets the value of the Marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value {@link String}
     * @return
     *     this instance
     */
    public UpdateReportAcknowledgementsRequest withMarketplace(String value) {
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
    public UpdateReportAcknowledgementsRequest withMerchant(String value) {
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
    public UpdateReportAcknowledgementsRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the ReportIdList property.
     * 
     * @param value {@link IdList}
     * @return
     *     this instance
     */
    public UpdateReportAcknowledgementsRequest withReportIdList(IdList value) {
        setReportIdList(value);
        return this;
    }

    /**
     * Sets the value of the Acknowledged property.
     * 
     * @param value {@link Boolean}
     * @return
     *     this instance
     */
    public UpdateReportAcknowledgementsRequest withAcknowledged(Boolean value) {
        setAcknowledged(value);
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
        if (isSetReportIdList()) {
            if (!first) json.append(", ");
            json.append("\"ReportIdList\" : {");
            IdList  reportIdList = getReportIdList();


            json.append(reportIdList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetAcknowledged()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Acknowledged"));
            json.append(" : ");
            json.append(quoteJSON(isAcknowledged() + ""));
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
