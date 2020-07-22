
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
 * {@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}GetFeedSubmissionListByNextTokenResult"/>
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}ResponseMetadata"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFeedSubmissionListByNextTokenResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetFeedSubmissionListByNextTokenResponse")
public class GetFeedSubmissionListByNextTokenResponse {

    @XmlElement(name = "GetFeedSubmissionListByNextTokenResult", required = true)
    protected GetFeedSubmissionListByNextTokenResult getFeedSubmissionListByNextTokenResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    /**
     * Default constructor
     * 
     */
    public GetFeedSubmissionListByNextTokenResponse() {
        super();
    }

    /**
     * Value constructor
     *
     * @param getFeedSubmissionListByNextTokenResult {@link GetFeedSubmissionListByNextTokenResult}
     * @param responseMetadata {@link ResponseMetadata}
     */
    public GetFeedSubmissionListByNextTokenResponse(final GetFeedSubmissionListByNextTokenResult getFeedSubmissionListByNextTokenResult, final ResponseMetadata responseMetadata) {
        this.getFeedSubmissionListByNextTokenResult = getFeedSubmissionListByNextTokenResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Gets the value of the getFeedSubmissionListByNextTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeedSubmissionListByNextTokenResult }
     *     
     */
    public GetFeedSubmissionListByNextTokenResult getGetFeedSubmissionListByNextTokenResult() {
        return getFeedSubmissionListByNextTokenResult;
    }

    /**
     * Sets the value of the getFeedSubmissionListByNextTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeedSubmissionListByNextTokenResult }
     *     
     */
    public void setGetFeedSubmissionListByNextTokenResult(GetFeedSubmissionListByNextTokenResult value) {
        this.getFeedSubmissionListByNextTokenResult = value;
    }

    public boolean isSetGetFeedSubmissionListByNextTokenResult() {
        return (this.getFeedSubmissionListByNextTokenResult!= null);
    }

    /**
     * Gets the value of the responseMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetadata }
     *     
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetadata }
     *     
     */
    public void setResponseMetadata(ResponseMetadata value) {
        this.responseMetadata = value;
    }

    public boolean isSetResponseMetadata() {
        return (this.responseMetadata!= null);
    }

    /**
     * Sets the value of the GetFeedSubmissionListByNextTokenResult property.
     * 
     * @param value {@link GetFeedSubmissionListByNextTokenResult}
     * @return
     *     this instance
     */
    public GetFeedSubmissionListByNextTokenResponse withGetFeedSubmissionListByNextTokenResult(GetFeedSubmissionListByNextTokenResult value) {
        setGetFeedSubmissionListByNextTokenResult(value);
        return this;
    }

    /**
     * Sets the value of the ResponseMetadata property.
     * 
     * @param value {@link ResponseMetadata}
     * @return
     *     this instance
     */
    public GetFeedSubmissionListByNextTokenResponse withResponseMetadata(ResponseMetadata value) {
        setResponseMetadata(value);
        return this;
    }
    
    @javax.xml.bind.annotation.XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;


    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetResponseHeaderMetadata() { 
        return this.responseHeaderMetadata != null;
    }  


    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) { 
        this.responseHeaderMetadata = responseHeaderMetadata;
    } 


    public ResponseHeaderMetadata getResponseHeaderMetadata() {  
        return responseHeaderMetadata;
    }

    /**
     * 
     * XML string representation of this object
     * 
     * @return XML String
     */
    public String toXML() {
        StringBuffer xml = new StringBuffer();
        xml.append("<GetFeedSubmissionListByNextTokenResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
        if (isSetGetFeedSubmissionListByNextTokenResult()) {
            GetFeedSubmissionListByNextTokenResult  getFeedSubmissionListByNextTokenResult = getGetFeedSubmissionListByNextTokenResult();
            xml.append("<GetFeedSubmissionListByNextTokenResult>");
            xml.append(getFeedSubmissionListByNextTokenResult.toXMLFragment());
            xml.append("</GetFeedSubmissionListByNextTokenResult>");
        } 
        if (isSetResponseMetadata()) {
            ResponseMetadata  responseMetadata = getResponseMetadata();
            xml.append("<ResponseMetadata>");
            xml.append(responseMetadata.toXMLFragment());
            xml.append("</ResponseMetadata>");
        } 
        xml.append("</GetFeedSubmissionListByNextTokenResponse>");
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("<");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
     * 
     * JSON string representation of this object
     * 
     * @return JSON String
     */
    public String toJSON() {
        StringBuffer json = new StringBuffer();
        json.append("{\"GetFeedSubmissionListByNextTokenResponse\" : {");
        json.append(quoteJSON("@xmlns"));
        json.append(" : ");
        json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
        boolean first = true;
        json.append(", ");
        if (isSetGetFeedSubmissionListByNextTokenResult()) {
            if (!first) json.append(", ");
            json.append("\"GetFeedSubmissionListByNextTokenResult\" : {");
            GetFeedSubmissionListByNextTokenResult  getFeedSubmissionListByNextTokenResult = getGetFeedSubmissionListByNextTokenResult();

            json.append(getFeedSubmissionListByNextTokenResult.toJSONFragment());
            json.append("}");
            first = false;
        } 
        if (isSetResponseMetadata()) {
            if (!first) json.append(", ");
            json.append("\"ResponseMetadata\" : {");
            ResponseMetadata  responseMetadata = getResponseMetadata();

            json.append(responseMetadata.toJSONFragment());
            json.append("}");
            first = false;
        } 
        json.append("}");
        json.append("}");
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
