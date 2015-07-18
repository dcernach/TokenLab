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
@XmlRootElement(name = "race")
public class Race {

    @XmlAttribute(name = "racetext", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String racetext;

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "ethnicity", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ethnicity;


    /**
     * Gets the value of the racetext property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRacetext() {
        return racetext;
    }


    /**
     * Sets the value of the racetext property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRacetext(String value) {
        this.racetext = value;
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
     * Gets the value of the ethnicity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the value of the ethnicity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEthnicity(String value) {
        this.ethnicity = value;
    }

}
