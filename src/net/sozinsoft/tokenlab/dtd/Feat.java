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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "description",
        "featcategory"
})
@XmlRootElement(name = "feat")
public class Feat {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "categorytext")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String categorytext;

    @XmlAttribute(name = "profgroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String profgroup;

    @XmlAttribute(name = "useradded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useradded;

    @XmlElement(required = true)
    protected String description;

    protected List<Featcategory> featcategory;


    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Gets the value of the categorytext property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategorytext() {
        return categorytext;
    }


    /**
     * Sets the value of the categorytext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategorytext(String value) {
        this.categorytext = value;
    }


    /**
     * Gets the value of the profgroup property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfgroup() {
        if (profgroup == null) {
            return "no";
        } else {
            return profgroup;
        }
    }


    /**
     * Sets the value of the profgroup property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfgroup(String value) {
        this.profgroup = value;
    }


    /**
     * Gets the value of the useradded property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUseradded() {
        if (useradded == null) {
            return "yes";
        } else {
            return useradded;
        }
    }


    /**
     * Sets the value of the useradded property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUseradded(String value) {
        this.useradded = value;
    }


    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * Gets the value of the featcategory property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featcategory property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatcategory().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Featcategory }
     */
    public List<Featcategory> getFeatcategory() {
        if (featcategory == null) {
            featcategory = new ArrayList<Featcategory>();
        }
        return this.featcategory;
    }

}
