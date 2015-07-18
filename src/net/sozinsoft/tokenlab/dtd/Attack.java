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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "special"
})
@XmlRootElement(name = "attack")
public class Attack {

    @XmlAttribute(name = "attackbonus", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attackbonus;

    @XmlAttribute(name = "baseattack", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseattack;

    @XmlAttribute(name = "meleeattack", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String meleeattack;

    @XmlAttribute(name = "rangedattack", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rangedattack;

    protected List<Special> special;


    /**
     * Gets the value of the attackbonus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttackbonus() {
        return attackbonus;
    }


    /**
     * Sets the value of the attackbonus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttackbonus(String value) {
        this.attackbonus = value;
    }


    /**
     * Gets the value of the baseattack property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBaseattack() {
        return baseattack;
    }


    /**
     * Sets the value of the baseattack property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBaseattack(String value) {
        this.baseattack = value;
    }


    /**
     * Gets the value of the meleeattack property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMeleeattack() {
        return meleeattack;
    }


    /**
     * Sets the value of the meleeattack property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMeleeattack(String value) {
        this.meleeattack = value;
    }


    /**
     * Gets the value of the rangedattack property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRangedattack() {
        return rangedattack;
    }


    /**
     * Sets the value of the rangedattack property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRangedattack(String value) {
        this.rangedattack = value;
    }


    /**
     * Gets the value of the special property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the special property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecial().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Special }
     */
    public List<Special> getSpecial() {
        if (special == null) {
            special = new ArrayList<Special>();
        }
        return this.special;
    }

}
