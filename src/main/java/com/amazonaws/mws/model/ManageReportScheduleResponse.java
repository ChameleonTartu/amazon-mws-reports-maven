
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
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}ManageReportScheduleResult"/>
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}ResponseMetadata"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>}
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "manageReportScheduleResult",
    "responseMetadata"
})
@XmlRootElement(name = "ManageReportScheduleResponse")
public class ManageReportScheduleResponse {

    @XmlElement(name = "ManageReportScheduleResult", required = true)
    protected ManageReportScheduleResult manageReportScheduleResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    /**
     * Default constructor
     * 
     */
    public ManageReportScheduleResponse() {
        super();
    }

    /**
     * Value constructor
     *
     * @param manageReportScheduleResult {@link ManageReportScheduleResult}
     * @param responseMetadata {@link ResponseMetadata}
     */
    public ManageReportScheduleResponse(final ManageReportScheduleResult manageReportScheduleResult, final ResponseMetadata responseMetadata) {
        this.manageReportScheduleResult = manageReportScheduleResult;
        this.responseMetadata = responseMetadata;
    }

    /**
     * Gets the value of the manageReportScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ManageReportScheduleResult }
     *     
     */
    public ManageReportScheduleResult getManageReportScheduleResult() {
        return manageReportScheduleResult;
    }

    /**
     * Sets the value of the manageReportScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageReportScheduleResult }
     *     
     */
    public void setManageReportScheduleResult(ManageReportScheduleResult value) {
        this.manageReportScheduleResult = value;
    }

    public boolean isSetManageReportScheduleResult() {
        return (this.manageReportScheduleResult!= null);
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

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetResponseMetadata() {
        return (this.responseMetadata!= null);
    }

    /**
     * Sets the value of the ManageReportScheduleResult property.
     * 
     * @param value {@link ManageReportScheduleResult}
     * @return
     *     this instance
     */
    public ManageReportScheduleResponse withManageReportScheduleResult(ManageReportScheduleResult value) {
        setManageReportScheduleResult(value);
        return this;
    }

    /**
     * Sets the value of the ResponseMetadata property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public ManageReportScheduleResponse withResponseMetadata(ResponseMetadata value) {
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
        xml.append("<ManageReportScheduleResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
        if (isSetManageReportScheduleResult()) {
            ManageReportScheduleResult  manageReportScheduleResult = getManageReportScheduleResult();
            xml.append("<ManageReportScheduleResult>");
            xml.append(manageReportScheduleResult.toXMLFragment());
            xml.append("</ManageReportScheduleResult>");
        } 
        if (isSetResponseMetadata()) {
            ResponseMetadata  responseMetadata = getResponseMetadata();
            xml.append("<ResponseMetadata>");
            xml.append(responseMetadata.toXMLFragment());
            xml.append("</ResponseMetadata>");
        } 
        xml.append("</ManageReportScheduleResponse>");
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
        json.append("{\"ManageReportScheduleResponse\" : {");
        json.append(quoteJSON("@xmlns"));
        json.append(" : ");
        json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
        boolean first = true;
        json.append(", ");
        if (isSetManageReportScheduleResult()) {
            if (!first) json.append(", ");
            json.append("\"ManageReportScheduleResult\" : {");
            ManageReportScheduleResult  manageReportScheduleResult = getManageReportScheduleResult();

            json.append(manageReportScheduleResult.toJSONFragment());
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
