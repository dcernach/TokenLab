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
@XmlRootElement(name = "maneuvertype")
public class Maneuvertype {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "bonus", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bonus;

    @XmlAttribute(name = "cmb", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cmb;

    @XmlAttribute(name = "cmd", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cmd;

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
     * Gets the value of the bonus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBonus() {
        return bonus;
    }


    /**
     * Sets the value of the bonus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBonus(String value) {
        this.bonus = value;
    }


    /**
     * Gets the value of the cmb property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCmb() {
        return cmb;
    }


    /**
     * Sets the value of the cmb property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCmb(String value) {
        this.cmb = value;
    }


    /**
     * Gets the value of the cmd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCmd() {
        return cmd;
    }


    /**
     * Sets the value of the cmd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCmd(String value) {
        this.cmd = value;
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
