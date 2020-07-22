
package com.amazonaws.mws.model;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://mws.amazonaws.com/doc/2009-01-01/}Error" maxOccurs="unbounded"/>
 *         <element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "error",
    "requestId"
})
@XmlRootElement(name = "ErrorResponse")
public class ErrorResponse {

    @XmlElement(name = "Error", required = true)
    protected List<Error> error;
    @XmlElement(name = "RequestID", required = true)
    protected String requestId;

    /**
     * Default constructor
     * 
     */
    public ErrorResponse() {
        super();
    }

    /**
     * Value constructor
     *
     * @param error {@code List<Error>}
     * @param requestId {@link String}
     */
    public ErrorResponse(final List<Error> error, final String requestId) {
        this.error = error;
        this.requestId = requestId;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * @return {@code List<Error>}
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

    public boolean isSetError() {
        return ((this.error!= null)&&(!this.error.isEmpty()));
    }

    public void unsetError() {
        this.error = null;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    public boolean isSetRequestId() {
        return (this.requestId!= null);
    }

    /**
     * Sets the value of the Error property.
     * 
     * @param values {@link String}
     * @return
     *     this instance
     */
    public ErrorResponse withError(Error... values) {
        for (Error value: values) {
            getError().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the RequestId property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public ErrorResponse withRequestId(String value) {
        setRequestId(value);
        return this;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param error
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(List<Error> error) {
        this.error = error;
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
        xml.append("<ErrorResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
        java.util.List<Error> errorList = getError();
        for (Error error : errorList) {
            xml.append("<Error>");
            xml.append(error.toXMLFragment());
            xml.append("</Error>");
        }
        if (isSetRequestId()) {
            xml.append("<RequestID>");
            xml.append(escapeXML(getRequestId()));
            xml.append("</RequestID>");
        }
        xml.append("</ErrorResponse>");
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
        json.append("{\"ErrorResponse\" : {");
        json.append(quoteJSON("@xmlns"));
        json.append(" : ");
        json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
        boolean first = true;
        json.append(", ");
        if (isSetError()) {
            if (!first) json.append(", ");
            json.append("\"Error\" : [");
            java.util.List<Error> errorList = getError();
            for (Error error : errorList) {
                if (errorList.indexOf(error) > 0) json.append(", ");
                json.append("{");
                json.append("");
                json.append(error.toJSONFragment());
                json.append("}");
                first = false;
            }
            json.append("]");
        }
        if (isSetRequestId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("RequestID"));
            json.append(" : ");
            json.append(quoteJSON(getRequestId()));
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
