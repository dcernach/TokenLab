//
// This file was net.sozinsoft.tokenlab.dtd by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.17 at 11:31:03 PM BRT 
//


package net.sozinsoft.tokenlab.dtd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "clazz"
})
@XmlRootElement(name = "classes")
public class Classes {

    @XmlAttribute(name = "level", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String level;

    @XmlAttribute(name = "summary", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String summary;

    @XmlAttribute(name = "summaryabbr", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String summaryabbr;

    @XmlElement(name = "class")
    protected List<Class> clazz;


    /**
     * Gets the value of the level property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLevel() {
        return level;
    }


    /**
     * Sets the value of the level property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLevel(String value) {
        this.level = value;
    }


    /**
     * Gets the value of the summary property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSummary() {
        return summary;
    }


    /**
     * Sets the value of the summary property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSummary(String value) {
        this.summary = value;
    }


    /**
     * Gets the value of the summaryabbr property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSummaryabbr() {
        return summaryabbr;
    }


    /**
     * Sets the value of the summaryabbr property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSummaryabbr(String value) {
        this.summaryabbr = value;
    }


    /**
     * Gets the value of the clazz property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     */
    public List<Class> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<Class>();
        }
        return this.clazz;
    }

}
