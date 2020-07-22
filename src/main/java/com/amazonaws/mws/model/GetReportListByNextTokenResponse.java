
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
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}GetReportListByNextTokenResult"/>
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
    "getReportListByNextTokenResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetReportListByNextTokenResponse")
public class GetReportListByNextTokenResponse {

    @XmlElement(name = "GetReportListByNextTokenResult", required = true)
    protected GetReportListByNextTokenResult getReportListByNextTokenResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    /**
     * Default constructor
     * 
     */
    public GetReportListByNextTokenResponse() {
        super();
    }

    /**
     * Value constructor
     *
     * @param getReportListByNextTokenResult {@link GetReportListByNextTokenResult}
     * @param responseMetadata {@link ResponseMetadata}
     */
    public GetReportListByNextTokenResponse(final GetReportListByNextTokenResult getReportListByNextTokenResult, final ResponseMetadata responseMetadata) {
        this.getReportListByNextTokenResult = getReportListByNextTokenResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Gets the value of the getReportListByNextTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetReportListByNextTokenResult }
     *     
     */
    public GetReportListByNextTokenResult getGetReportListByNextTokenResult() {
        return getReportListByNextTokenResult;
    }

    /**
     * Sets the value of the getReportListByNextTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReportListByNextTokenResult }
     *     
     */
    public void setGetReportListByNextTokenResult(GetReportListByNextTokenResult value) {
        this.getReportListByNextTokenResult = value;
    }

    public boolean isSetGetReportListByNextTokenResult() {
        return (this.getReportListByNextTokenResult!= null);
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
     * Sets the value of the GetReportListByNextTokenResult property.
     * 
     * @param value {@link GetReportListByNextTokenResult}
     * @return
     *     this instance
     */
    public GetReportListByNextTokenResponse withGetReportListByNextTokenResult(GetReportListByNextTokenResult value) {
        setGetReportListByNextTokenResult(value);
        return this;
    }

    /**
     * Sets the value of the ResponseMetadata property.
     * 
     * @param value {@link ResponseMetadata}
     * @return
     *     this instance
     */
    public GetReportListByNextTokenResponse withResponseMetadata(ResponseMetadata value) {
        setResponseMetadata(value);
        return this;
    }
    
    @javax.xml.bind.annotation.XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;


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
        xml.append("<GetReportListByNextTokenResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
        if (isSetGetReportListByNextTokenResult()) {
            GetReportListByNextTokenResult  getReportListByNextTokenResult = getGetReportListByNextTokenResult();
            xml.append("<GetReportListByNextTokenResult>");
            xml.append(getReportListByNextTokenResult.toXMLFragment());
            xml.append("</GetReportListByNextTokenResult>");
        } 
        if (isSetResponseMetadata()) {
            ResponseMetadata  responseMetadata = getResponseMetadata();
            xml.append("<ResponseMetadata>");
            xml.append(responseMetadata.toXMLFragment());
            xml.append("</ResponseMetadata>");
        } 
        xml.append("</GetReportListByNextTokenResponse>");
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
        json.append("{\"GetReportListByNextTokenResponse\" : {");
        json.append(quoteJSON("@xmlns"));
        json.append(" : ");
        json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
        boolean first = true;
        json.append(", ");
        if (isSetGetReportListByNextTokenResult()) {
            if (!first) json.append(", ");
            json.append("\"GetReportListByNextTokenResult\" : {");
            GetReportListByNextTokenResult  getReportListByNextTokenResult = getGetReportListByNextTokenResult();

            json.append(getReportListByNextTokenResult.toJSONFragment());
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
