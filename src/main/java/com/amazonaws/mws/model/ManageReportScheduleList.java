
package com.amazonaws.mws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageReportScheduleList complex type.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * {@code <complexType name="ManageReportScheduleList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReportSchedule" type="{http://mws.amazonaws.com/doc/2009-01-01/}ReportSchedule" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>}
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageReportScheduleList", propOrder = {
    "reportSchedule"
})
public class ManageReportScheduleList {

    @XmlElement(name = "ReportSchedule", required = true)
    protected List<ReportSchedule> reportSchedule;

    /**
     * Default constructor
     * 
     */
    public ManageReportScheduleList() {
        super();
    }

    /**
     * Value constructor
     * @param reportSchedule {@code List<ReportSchedule>}
     */
    public ManageReportScheduleList(final List<ReportSchedule> reportSchedule) {
        this.reportSchedule = reportSchedule;
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
    public List<ReportSchedule> getReportSchedule() {
        if (reportSchedule == null) {
            reportSchedule = new ArrayList<ReportSchedule>();
        }
        return this.reportSchedule;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetReportSchedule() {
        return ((this.reportSchedule!= null)&&(!this.reportSchedule.isEmpty()));
    }

    public void unsetReportSchedule() {
        this.reportSchedule = null;
    }

    /**
     * Sets the value of the ReportSchedule property.
     * 
     * @param values {@link ReportSchedule[]}
     * @return
     *     this instance
     */
    public ManageReportScheduleList withReportSchedule(ReportSchedule... values) {
        for (ReportSchedule value: values) {
            getReportSchedule().add(value);
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
    public void setReportSchedule(List<ReportSchedule> reportSchedule) {
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
        java.util.List<ReportSchedule> reportScheduleList = getReportSchedule();
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
        if (isSetReportSchedule()) {
            if (!first) json.append(", ");
            json.append("\"ReportSchedule\" : [");
            java.util.List<ReportSchedule> reportScheduleList = getReportSchedule();
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
