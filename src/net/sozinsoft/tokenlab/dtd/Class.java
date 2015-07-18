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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "arcanespellfailure"
})
@XmlRootElement(name = "class")
public class Class {

    @XmlAttribute(name = "level", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String level;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "spells")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String spells;

    @XmlAttribute(name = "casterlevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String casterlevel;

    @XmlAttribute(name = "concentrationcheck")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String concentrationcheck;

    @XmlAttribute(name = "overcomespellresistance")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overcomespellresistance;

    @XmlAttribute(name = "basespelldc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String basespelldc;

    @XmlAttribute(name = "castersource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String castersource;

    protected Arcanespellfailure arcanespellfailure;


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
     * Gets the value of the spells property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpells() {
        return spells;
    }


    /**
     * Sets the value of the spells property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpells(String value) {
        this.spells = value;
    }


    /**
     * Gets the value of the casterlevel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCasterlevel() {
        return casterlevel;
    }


    /**
     * Sets the value of the casterlevel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCasterlevel(String value) {
        this.casterlevel = value;
    }


    /**
     * Gets the value of the concentrationcheck property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getConcentrationcheck() {
        return concentrationcheck;
    }


    /**
     * Sets the value of the concentrationcheck property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConcentrationcheck(String value) {
        this.concentrationcheck = value;
    }


    /**
     * Gets the value of the overcomespellresistance property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOvercomespellresistance() {
        return overcomespellresistance;
    }


    /**
     * Sets the value of the overcomespellresistance property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOvercomespellresistance(String value) {
        this.overcomespellresistance = value;
    }


    /**
     * Gets the value of the basespelldc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBasespelldc() {
        return basespelldc;
    }


    /**
     * Sets the value of the basespelldc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBasespelldc(String value) {
        this.basespelldc = value;
    }


    /**
     * Gets the value of the castersource property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCastersource() {
        return castersource;
    }


    /**
     * Sets the value of the castersource property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCastersource(String value) {
        this.castersource = value;
    }


    /**
     * Gets the value of the arcanespellfailure property.
     *
     * @return possible object is
     * {@link Arcanespellfailure }
     */
    public Arcanespellfailure getArcanespellfailure() {
        return arcanespellfailure;
    }


    /**
     * Sets the value of the arcanespellfailure property.
     *
     * @param value allowed object is
     *              {@link Arcanespellfailure }
     */
    public void setArcanespellfailure(Arcanespellfailure value) {
        this.arcanespellfailure = value;
    }

}
