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
@XmlType(name = "")
@XmlRootElement(name = "encumbrance")
public class Encumbrance {

    @XmlAttribute(name = "carried", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String carried;

    @XmlAttribute(name = "encumstr", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String encumstr;

    @XmlAttribute(name = "heavy", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String heavy;

    @XmlAttribute(name = "level", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String level;

    @XmlAttribute(name = "light", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String light;

    @XmlAttribute(name = "medium", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String medium;


    /**
     * Gets the value of the carried property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCarried() {
        return carried;
    }


    /**
     * Sets the value of the carried property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCarried(String value) {
        this.carried = value;
    }


    /**
     * Gets the value of the encumstr property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEncumstr() {
        return encumstr;
    }


    /**
     * Sets the value of the encumstr property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEncumstr(String value) {
        this.encumstr = value;
    }


    /**
     * Gets the value of the heavy property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeavy() {
        return heavy;
    }


    /**
     * Sets the value of the heavy property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeavy(String value) {
        this.heavy = value;
    }


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
     * Gets the value of the light property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLight() {
        return light;
    }


    /**
     * Sets the value of the light property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLight(String value) {
        this.light = value;
    }


    /**
     * Gets the value of the medium property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedium() {
        return medium;
    }


    /**
     * Sets the value of the medium property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedium(String value) {
        this.medium = value;
    }

}
