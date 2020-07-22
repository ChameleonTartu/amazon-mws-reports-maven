
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
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}RequestReportResult"/>
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}ResponseMetadata"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>}
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestReportResult",
    "responseMetadata"
})
@XmlRootElement(name = "RequestReportResponse")
public class RequestReportResponse {

    @XmlElement(name = "RequestReportResult", required = true)
    protected RequestReportResult requestReportResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    /**
     * Default constructor
     * 
     */
    public RequestReportResponse() {
        super();
    }

    /**
     * Value constructor
     *
     * @param requestReportResult {@link RequestReportResponse}
     * @param responseMetadata {@link ResponseMetadata}
     */
    public RequestReportResponse(final RequestReportResult requestReportResult, final ResponseMetadata responseMetadata) {
        this.requestReportResult = requestReportResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Gets the value of the requestReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReportResult }
     *     
     */
    public RequestReportResult getRequestReportResult() {
        return requestReportResult;
    }

    /**
     * Sets the value of the requestReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReportResult }
     *     
     */
    public void setRequestReportResult(RequestReportResult value) {
        this.requestReportResult = value;
    }

    public boolean isSetRequestReportResult() {
        return (this.requestReportResult!= null);
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
     * Sets the value of the RequestReportResult property.
     * 
     * @param value {@link RequestReportResult}
     * @return
     *     this instance
     */
    public RequestReportResponse withRequestReportResult(RequestReportResult value) {
        setRequestReportResult(value);
        return this;
    }

    /**
     * Sets the value of the ResponseMetadata property.
     * 
     * @param value {@link ResponseMetadata}
     * @return
     *     this instance
     */
    public RequestReportResponse withResponseMetadata(ResponseMetadata value) {
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

    /**
     *
     * @param responseHeaderMetadata {@link ResponseMetadata}
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) { 
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     *
     * @return {@link ResponseHeaderMetadata}
     */
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
        xml.append("<RequestReportResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
        if (isSetRequestReportResult()) {
            RequestReportResult  requestReportResult = getRequestReportResult();
            xml.append("<RequestReportResult>");
            xml.append(requestReportResult.toXMLFragment());
            xml.append("</RequestReportResult>");
        } 
        if (isSetResponseMetadata()) {
            ResponseMetadata  responseMetadata = getResponseMetadata();
            xml.append("<ResponseMetadata>");
            xml.append(responseMetadata.toXMLFragment());
            xml.append("</ResponseMetadata>");
        } 
        xml.append("</RequestReportResponse>");
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     *
     * @param string {@link String}
     * @return {@link String}
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
        json.append("{\"RequestReportResponse\" : {");
        json.append(quoteJSON("@xmlns"));
        json.append(" : ");
        json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
        boolean first = true;
        json.append(", ");
        if (isSetRequestReportResult()) {
            if (!first) json.append(", ");
            json.append("\"RequestReportResult\" : {");
            RequestReportResult  requestReportResult = getRequestReportResult();

            json.append(requestReportResult.toJSONFragment());
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
     *
     * @param string {@link String}
     * @return {@link String}
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
