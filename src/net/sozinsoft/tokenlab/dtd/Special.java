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
        "description",
        "specsource"
})
@XmlRootElement(name = "special")
public class Special {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "shortname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortname;

    @XmlAttribute(name = "sourcetext")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourcetext;

    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;

    @XmlElement(required = true)
    protected String description;

    protected List<Specsource> specsource;


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
     * Gets the value of the shortname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getShortname() {
        return shortname;
    }


    /**
     * Sets the value of the shortname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShortname(String value) {
        this.shortname = value;
    }


    /**
     * Gets the value of the sourcetext property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourcetext() {
        return sourcetext;
    }


    /**
     * Sets the value of the sourcetext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourcetext(String value) {
        this.sourcetext = value;
    }


    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the specsource property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specsource property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecsource().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Specsource }
     */
    public List<Specsource> getSpecsource() {
        if (specsource == null) {
            specsource = new ArrayList<Specsource>();
        }
        return this.specsource;
    }

}
