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
@XmlRootElement(name = "allsaves")
public class Allsaves {

    @XmlAttribute(name = "save", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String save;

    @XmlAttribute(name = "base", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String base;

    @XmlAttribute(name = "frommisc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frommisc;

    @XmlAttribute(name = "fromresist")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fromresist;

    @XmlElement(required = true)
    protected Situationalmodifiers situationalmodifiers;


    /**
     * Gets the value of the save property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSave() {
        return save;
    }


    /**
     * Sets the value of the save property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSave(String value) {
        this.save = value;
    }


    /**
     * Gets the value of the base property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBase() {
        return base;
    }


    /**
     * Sets the value of the base property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBase(String value) {
        this.base = value;
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
     * Gets the value of the fromresist property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromresist() {
        return fromresist;
    }


    /**
     * Sets the value of the fromresist property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromresist(String value) {
        this.fromresist = value;
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
