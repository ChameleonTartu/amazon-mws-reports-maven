
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
 * {@code <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ReportSchedule" type="{http://mws.amazonaws.com/doc/2009-01-01/}ReportSchedule" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>}
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "count",
    "reportSchedule"
})
@XmlRootElement(name = "ManageReportScheduleResult")
public class ManageReportScheduleResult {

    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "ReportSchedule", required = true)
    protected List<ReportSchedule> reportSchedule;

    /**
     * Default constructor
     * 
     */
    public ManageReportScheduleResult() {
        super();
    }

    /**
     * Value constructor
     *
     * @param count {@link int}
     * @param reportSchedule {@code List<ReportSchedule>}
     */
    public ManageReportScheduleResult(final int count, final List<ReportSchedule> reportSchedule) {
        this.count = count;
        this.reportSchedule = reportSchedule;
    }

    /**
     * Gets the value of the count property.
     *
     * @return {@link int}
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value {@link int}
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetCount() {
        return true;
    }

    /**
     * Gets the value of the reportSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     *
     * @return Objects of the following type(s) are allowed in the list
     * {@link ReportSchedule }
     */
    public List<ReportSchedule> getReportScheduleList() {
        if (reportSchedule == null) {
            reportSchedule = new ArrayList<ReportSchedule>();
        }
        return this.reportSchedule;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportScheduleList() {
        return ((this.reportSchedule!= null)&&(!this.reportSchedule.isEmpty()));
    }

    public void unsetReportScheduleList() {
        this.reportSchedule = null;
    }

    /**
     * Sets the value of the Count property.
     * 
     * @param value {@link int}
     * @return
     *     this instance
     */
    public ManageReportScheduleResult withCount(int value) {
        setCount(value);
        return this;
    }

    /**
     * Sets the value of the ReportSchedule property.
     * 
     * @param values {@link ReportSchedule[]}
     * @return
     *     this instance
     */
    public ManageReportScheduleResult withReportScheduleList(ReportSchedule... values) {
        for (ReportSchedule value: values) {
            getReportScheduleList().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the reportSchedule property.
     * 
     * @param reportSchedule
     *     allowed object is
     *     {@link ReportSchedule }
     *     
     */
    public void setReportScheduleList(List<ReportSchedule> reportSchedule) {
        this.reportSchedule = reportSchedule;
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
        if (isSetCount()) {
            xml.append("<Count>");
            xml.append(getCount() + "");
            xml.append("</Count>");
        }
        java.util.List<ReportSchedule> reportScheduleList = getReportScheduleList();
        for (ReportSchedule reportSchedule : reportScheduleList) {
            xml.append("<ReportSchedule>");
            xml.append(reportSchedule.toXMLFragment());
            xml.append("</ReportSchedule>");
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
        if (isSetCount()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Count"));
            json.append(" : ");
            json.append(quoteJSON(getCount() + ""));
            first = false;
        }
        if (isSetReportScheduleList()) {
            if (!first) json.append(", ");
            json.append("\"ReportSchedule\" : [");
            java.util.List<ReportSchedule> reportScheduleList = getReportScheduleList();
            for (ReportSchedule reportSchedule : reportScheduleList) {
                if (reportScheduleList.indexOf(reportSchedule) > 0) json.append(", ");
                json.append("{");
                json.append("");
                json.append(reportSchedule.toJSONFragment());
                json.append("}");
                first = false;
            }
            json.append("]");
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
