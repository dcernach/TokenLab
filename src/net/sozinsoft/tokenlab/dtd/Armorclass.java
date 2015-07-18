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
@XmlRootElement(name = "armorclass")
public class Armorclass {

    @XmlAttribute(name = "ac", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ac;

    @XmlAttribute(name = "flatfooted", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flatfooted;

    @XmlAttribute(name = "touch", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String touch;

    @XmlAttribute(name = "fromarmor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromarmor;

    @XmlAttribute(name = "fromdeflect")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromdeflect;

    @XmlAttribute(name = "fromdexterity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromdexterity;

    @XmlAttribute(name = "fromdodge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromdodge;

    @XmlAttribute(name = "frommisc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frommisc;

    @XmlAttribute(name = "fromnatural")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromnatural;

    @XmlAttribute(name = "fromshield")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromshield;

    @XmlAttribute(name = "fromsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromsize;

    @XmlAttribute(name = "fromwisdom")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromwisdom;

    @XmlElement(required = true)
    protected Situationalmodifiers situationalmodifiers;


    /**
     * Gets the value of the ac property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAc() {
        return ac;
    }


    /**
     * Sets the value of the ac property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAc(String value) {
        this.ac = value;
    }


    /**
     * Gets the value of the flatfooted property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlatfooted() {
        return flatfooted;
    }


    /**
     * Sets the value of the flatfooted property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlatfooted(String value) {
        this.flatfooted = value;
    }


    /**
     * Gets the value of the touch property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTouch() {
        return touch;
    }


    /**
     * Sets the value of the touch property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTouch(String value) {
        this.touch = value;
    }


    /**
     * Gets the value of the fromarmor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromarmor() {
        return fromarmor;
    }


    /**
     * Sets the value of the fromarmor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromarmor(String value) {
        this.fromarmor = value;
    }


    /**
     * Gets the value of the fromdeflect property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromdeflect() {
        return fromdeflect;
    }


    /**
     * Sets the value of the fromdeflect property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromdeflect(String value) {
        this.fromdeflect = value;
    }


    /**
     * Gets the value of the fromdexterity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromdexterity() {
        return fromdexterity;
    }


    /**
     * Sets the value of the fromdexterity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromdexterity(String value) {
        this.fromdexterity = value;
    }


    /**
     * Gets the value of the fromdodge property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromdodge() {
        return fromdodge;
    }


    /**
     * Sets the value of the fromdodge property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromdodge(String value) {
        this.fromdodge = value;
    }


    /**
     * Gets the value of the frommisc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFrommisc() {
        return frommisc;
    }


    /**
     * Sets the value of the frommisc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFrommisc(String value) {
        this.frommisc = value;
    }


    /**
     * Gets the value of the fromnatural property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromnatural() {
        return fromnatural;
    }


    /**
     * Sets the value of the fromnatural property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromnatural(String value) {
        this.fromnatural = value;
    }


    /**
     * Gets the value of the fromshield property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromshield() {
        return fromshield;
    }


    /**
     * Sets the value of the fromshield property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromshield(String value) {
        this.fromshield = value;
    }


    /**
     * Gets the value of the fromsize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromsize() {
        return fromsize;
    }


    /**
     * Sets the value of the fromsize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromsize(String value) {
        this.fromsize = value;
    }


    /**
     * Gets the value of the fromwisdom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromwisdom() {
        return fromwisdom;
    }


    /**
     * Sets the value of the fromwisdom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromwisdom(String value) {
        this.fromwisdom = value;
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
