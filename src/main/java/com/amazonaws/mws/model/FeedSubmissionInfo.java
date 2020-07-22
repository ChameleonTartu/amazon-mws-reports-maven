
package com.amazonaws.mws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FeedSubmissionInfo complex type.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * {@code
 * <complexType name="FeedSubmissionInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FeedSubmissionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FeedType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SubmittedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FeedProcessingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StartedProcessingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="CompletedProcessingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedSubmissionInfo", propOrder = {
    "feedSubmissionId",
    "feedType",
    "submittedDate",
    "feedProcessingStatus",
    "startedProcessingDate",
    "completedProcessingDate"
})
public class FeedSubmissionInfo {

    @XmlElement(name = "FeedSubmissionId", required = true)
    protected String feedSubmissionId;
    @XmlElement(name = "FeedType", required = true)
    protected String feedType;
    @XmlElement(name = "SubmittedDate", required = true)
    protected String submittedDate;
    @XmlElement(name = "FeedProcessingStatus", required = true)
    protected String feedProcessingStatus;
    @XmlElement(name = "StartedProcessingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedProcessingDate;
    @XmlElement(name = "CompletedProcessingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedProcessingDate;

    /**
     * Default constructor
     * 
     */
    public FeedSubmissionInfo() {
        super();
    }

    /**
     * Value constructor
     *
     * @param feedSubmissionId {@link String}
     * @param feedType {@link String}
     * @param submittedDate {@link String}
     * @param feedProcessingStatus {@link String}
     * @param startedProcessingDate {@link XMLGregorianCalendar}
     * @param completedProcessingDate {@link XMLGregorianCalendar}
     */
    public FeedSubmissionInfo(final String feedSubmissionId, final String feedType, final String submittedDate, final String feedProcessingStatus, final XMLGregorianCalendar startedProcessingDate, final XMLGregorianCalendar completedProcessingDate) {
        this.feedSubmissionId = feedSubmissionId;
        this.feedType = feedType;
        this.submittedDate = submittedDate;
        this.feedProcessingStatus = feedProcessingStatus;
        this.startedProcessingDate = startedProcessingDate;
        this.completedProcessingDate = completedProcessingDate;
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
     * Gets the value of the feedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * Sets the value of the feedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    public boolean isSetFeedType() {
        return (this.feedType!= null);
    }

    /**
     * Gets the value of the submittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedDate() {
        return submittedDate;
    }

    /**
     * Sets the value of the submittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedDate(String value) {
        this.submittedDate = value;
    }

    public boolean isSetSubmittedDate() {
        return (this.submittedDate!= null);
    }

    /**
     * Gets the value of the feedProcessingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedProcessingStatus() {
        return feedProcessingStatus;
    }

    /**
     * Sets the value of the feedProcessingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedProcessingStatus(String value) {
        this.feedProcessingStatus = value;
    }

    public boolean isSetFeedProcessingStatus() {
        return (this.feedProcessingStatus!= null);
    }

    /**
     * Gets the value of the startedProcessingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartedProcessingDate() {
        return startedProcessingDate;
    }

    /**
     * Sets the value of the startedProcessingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartedProcessingDate(XMLGregorianCalendar value) {
        this.startedProcessingDate = value;
    }

    public boolean isSetStartedProcessingDate() {
        return (this.startedProcessingDate!= null);
    }

    /**
     * Gets the value of the completedProcessingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedProcessingDate() {
        return completedProcessingDate;
    }

    /**
     * Sets the value of the completedProcessingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedProcessingDate(XMLGregorianCalendar value) {
        this.completedProcessingDate = value;
    }

    public boolean isSetCompletedProcessingDate() {
        return (this.completedProcessingDate!= null);
    }

    /**
     * Sets the value of the FeedSubmissionId property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public FeedSubmissionInfo withFeedSubmissionId(String value) {
        setFeedSubmissionId(value);
        return this;
    }

    /**
     * Sets the value of the FeedType property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public FeedSubmissionInfo withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedDate property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public FeedSubmissionInfo withSubmittedDate(String value) {
        setSubmittedDate(value);
        return this;
    }

    /**
     * Sets the value of the FeedProcessingStatus property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public FeedSubmissionInfo withFeedProcessingStatus(String value) {
        setFeedProcessingStatus(value);
        return this;
    }

    /**
     * Sets the value of the StartedProcessingDate property.
     * 
     * @param value {@link XMLGregorianCalendar}
     * @return
     *     this instance
     */
    public FeedSubmissionInfo withStartedProcessingDate(XMLGregorianCalendar value) {
        setStartedProcessingDate(value);
        return this;
    }

    /**
     * Sets the value of the CompletedProcessingDate property.
     * 
     * @param value {@link XMLGregorianCalendar}
     * @return
     *     this instance
     */
    public FeedSubmissionInfo withCompletedProcessingDate(XMLGregorianCalendar value) {
        setCompletedProcessingDate(value);
        return this;
    }
    

    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetFeedSubmissionId()) {
            xml.append("<FeedSubmissionId>");
            xml.append(escapeXML(getFeedSubmissionId()));
            xml.append("</FeedSubmissionId>");
        }
        if (isSetFeedType()) {
            xml.append("<FeedType>");
            xml.append(escapeXML(getFeedType()));
            xml.append("</FeedType>");
        }
        if (isSetSubmittedDate()) {
            xml.append("<SubmittedDate>");
            xml.append(escapeXML(getSubmittedDate()));
            xml.append("</SubmittedDate>");
        }
        if (isSetFeedProcessingStatus()) {
            xml.append("<FeedProcessingStatus>");
            xml.append(escapeXML(getFeedProcessingStatus()));
            xml.append("</FeedProcessingStatus>");
        }
        if (isSetStartedProcessingDate()) {
            xml.append("<StartedProcessingDate>");
            xml.append(getStartedProcessingDate() + "");
            xml.append("</StartedProcessingDate>");
        }
        if (isSetCompletedProcessingDate()) {
            xml.append("<CompletedProcessingDate>");
            xml.append(getCompletedProcessingDate() + "");
            xml.append("</CompletedProcessingDate>");
        }
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
        if (isSetFeedSubmissionId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedSubmissionId"));
            json.append(" : ");
            json.append(quoteJSON(getFeedSubmissionId()));
            first = false;
        }
        if (isSetFeedType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedType"));
            json.append(" : ");
            json.append(quoteJSON(getFeedType()));
            first = false;
        }
        if (isSetSubmittedDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedDate()));
            first = false;
        }
        if (isSetFeedProcessingStatus()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedProcessingStatus"));
            json.append(" : ");
            json.append(quoteJSON(getFeedProcessingStatus()));
            first = false;
        }
        if (isSetStartedProcessingDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("StartedProcessingDate"));
            json.append(" : ");
            json.append(quoteJSON(getStartedProcessingDate() + ""));
            first = false;
        }
        if (isSetCompletedProcessingDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("CompletedProcessingDate"));
            json.append(" : ");
            json.append(quoteJSON(getCompletedProcessingDate() + ""));
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
