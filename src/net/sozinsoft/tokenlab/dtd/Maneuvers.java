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
        "situationalmodifiers",
        "maneuvertype"
})
@XmlRootElement(name = "maneuvers")
public class Maneuvers {

    @XmlAttribute(name = "cmb", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cmb;

    @XmlAttribute(name = "cmd", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cmd;

    @XmlAttribute(name = "cmdflatfooted", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cmdflatfooted;

    @XmlElement(required = true)
    protected Situationalmodifiers situationalmodifiers;

    @XmlElement(required = true)
    protected List<Maneuvertype> maneuvertype;


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
     * Gets the value of the cmdflatfooted property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCmdflatfooted() {
        return cmdflatfooted;
    }


    /**
     * Sets the value of the cmdflatfooted property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCmdflatfooted(String value) {
        this.cmdflatfooted = value;
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


    /**
     * Gets the value of the maneuvertype property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maneuvertype property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManeuvertype().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Maneuvertype }
     */
    public List<Maneuvertype> getManeuvertype() {
        if (maneuvertype == null) {
            maneuvertype = new ArrayList<Maneuvertype>();
        }
        return this.maneuvertype;
    }

}
