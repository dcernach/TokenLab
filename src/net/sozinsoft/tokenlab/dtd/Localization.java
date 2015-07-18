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
@XmlRootElement(name = "localization")
public class Localization {

    @XmlAttribute(name = "language", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String language;

    @XmlAttribute(name = "units", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String units;


    /**
     * Gets the value of the language property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguage() {
        return language;
    }


    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }


    /**
     * Gets the value of the units property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnits() {
        return units;
    }


    /**
     * Sets the value of the units property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
