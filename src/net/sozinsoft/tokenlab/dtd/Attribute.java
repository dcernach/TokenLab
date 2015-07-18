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
        "attrvalue",
        "attrbonus",
        "situationalmodifiers"
})
@XmlRootElement(name = "attribute")
public class Attribute {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlElement(required = true)
    protected Attrvalue attrvalue;

    @XmlElement(required = true)
    protected Attrbonus attrbonus;

    @XmlElement(required = true)
    protected Situationalmodifiers situationalmodifiers;


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
     * Gets the value of the attrvalue property.
     *
     * @return possible object is
     * {@link Attrvalue }
     */
    public Attrvalue getAttrvalue() {
        return attrvalue;
    }


    /**
     * Sets the value of the attrvalue property.
     *
     * @param value allowed object is
     *              {@link Attrvalue }
     */
    public void setAttrvalue(Attrvalue value) {
        this.attrvalue = value;
    }


    /**
     * Gets the value of the attrbonus property.
     *
     * @return possible object is
     * {@link Attrbonus }
     */
    public Attrbonus getAttrbonus() {
        return attrbonus;
    }


    /**
     * Sets the value of the attrbonus property.
     *
     * @param value allowed object is
     *              {@link Attrbonus }
     */
    public void setAttrbonus(Attrbonus value) {
        this.attrbonus = value;
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
