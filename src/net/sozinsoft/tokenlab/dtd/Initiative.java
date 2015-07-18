//
// This file was net.sozinsoft.tokenlab.dtd by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.17 at 11:31:03 PM BRT 
//


package net.sozinsoft.tokenlab.dtd;

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
        "situationalmodifiers"
})
@XmlRootElement(name = "initiative")
public class Initiative {

    @XmlAttribute(name = "total", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String total;

    @XmlAttribute(name = "attrtext", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attrtext;

    @XmlAttribute(name = "misctext", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String misctext;

    @XmlAttribute(name = "attrname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attrname;

    @XmlElement(required = true)
    protected Situationalmodifiers situationalmodifiers;


    /**
     * Gets the value of the total property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTotal() {
        return total;
    }


    /**
     * Sets the value of the total property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTotal(String value) {
        this.total = value;
    }


    /**
     * Gets the value of the attrtext property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttrtext() {
        return attrtext;
    }


    /**
     * Sets the value of the attrtext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttrtext(String value) {
        this.attrtext = value;
    }


    /**
     * Gets the value of the misctext property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMisctext() {
        return misctext;
    }


    /**
     * Sets the value of the misctext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMisctext(String value) {
        this.misctext = value;
    }


    /**
     * Gets the value of the attrname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttrname() {
        return attrname;
    }


    /**
     * Sets the value of the attrname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttrname(String value) {
        this.attrname = value;
    }


    /**
     * Gets the value of the situationalmodifiers property.
     *
     * @return possible object is
     * {@link Situationalmodifiers }
     */
    public Situationalmodifiers getSituationalmodifiers() {
        return situationalmodifiers;
    }


    /**
     * Sets the value of the situationalmodifiers property.
     *
     * @param value allowed object is
     *              {@link Situationalmodifiers }
     */
    public void setSituationalmodifiers(Situationalmodifiers value) {
        this.situationalmodifiers = value;
    }

}
