
package com.amazonaws.mws.model;

import java.io.OutputStream;

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
 * {@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FeedSubmissionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketplace",
    "merchant",
    "feedSubmissionId",
    "feedSubmissionResultOutputStream",
    "mwsAuthToken"
})
@XmlRootElement(name = "GetFeedSubmissionResultRequest")
public class GetFeedSubmissionResultRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "FeedSubmissionId", required = true)
    protected String feedSubmissionId;
    @XmlElement(name = "FeedSubmissionResultOutputStream")
    protected OutputStream feedSubmissionResultOutputStream;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;
    /**
     * Default constructor
     * 
     */
    public GetFeedSubmissionResultRequest() {
        super();
    }

    /**
     * Value constructor
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param feedSubmissionId {@link String}
     */
    public GetFeedSubmissionResultRequest(final String marketplace, final String merchant, final String feedSubmissionId) {
        this(marketplace, merchant, feedSubmissionId, null);
    }

    /**
     *
     * @param marketplace {@link String}
     * @param merchant {@link String}
     * @param feedSubmissionId {@link String}
     * @param mwsAuthToken {@link String}
     */
    public GetFeedSubmissionResultRequest(final String marketplace, 
            final String merchant, 
            final String feedSubmissionId,
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.feedSubmissionId = feedSubmissionId;
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

    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }

    /**
     * Gets the value of the feedSubmissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedSubmissionId() {
        return feedSubmissionId;
    }

    /**
     * Sets the value of the feedSubmissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedSubmissionId(String value) {
        this.feedSubmissionId = value;
    }

    public boolean isSetFeedSubmissionId() {
        return (this.feedSubmissionId!= null);
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
     *
     * @return {@link OutputStream}
     */
    public OutputStream getFeedSubmissionResultOutputStream( ) {
        return this.feedSubmissionResultOutputStream;
    }

    /**
     *
     * @param feedSubmissionResultOutputStream {@link OutputStream}
     */
    public void setFeedSubmissionResultOutputStream( OutputStream feedSubmissionResultOutputStream ) {
        this.feedSubmissionResultOutputStream = feedSubmissionResultOutputStream;
    }

    /**
     * Sets the value of the Marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetFeedSubmissionResultRequest withMarketplace(String value) {
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
    public GetFeedSubmissionResultRequest withMerchant(String value) {
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
    public GetFeedSubmissionResultRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the FeedSubmissionId property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetFeedSubmissionResultRequest withFeedSubmissionId(String value) {
        setFeedSubmissionId(value);
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
        if (isSetFeedSubmissionId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedSubmissionId"));
            json.append(" : ");
            json.append(quoteJSON(getFeedSubmissionId()));
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
