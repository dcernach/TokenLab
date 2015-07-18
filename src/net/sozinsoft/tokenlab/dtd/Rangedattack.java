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
@XmlRootElement(name = "rangedattack")
public class Rangedattack {

    @XmlAttribute(name = "attack", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attack;

    @XmlAttribute(name = "flurryattack")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flurryattack;

    @XmlAttribute(name = "rangeinctext", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rangeinctext;

    @XmlAttribute(name = "rangeincvalue", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rangeincvalue;


    /**
     * Gets the value of the attack property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttack() {
        return attack;
    }


    /**
     * Sets the value of the attack property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttack(String value) {
        this.attack = value;
    }


    /**
     * Gets the value of the flurryattack property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlurryattack() {
        return flurryattack;
    }


    /**
     * Sets the value of the flurryattack property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlurryattack(String value) {
        this.flurryattack = value;
    }


    /**
     * Gets the value of the rangeinctext property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRangeinctext() {
        return rangeinctext;
    }


    /**
     * Sets the value of the rangeinctext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRangeinctext(String value) {
        this.rangeinctext = value;
    }


    /**
     * Gets the value of the rangeincvalue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRangeincvalue() {
        return rangeincvalue;
    }


    /**
     * Sets the value of the rangeincvalue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRangeincvalue(String value) {
        this.rangeincvalue = value;
    }

}
