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
@XmlRootElement(name = "pathfindersociety")
public class Pathfindersociety {

    @XmlAttribute(name = "playernum", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String playernum;

    @XmlAttribute(name = "characternum", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String characternum;


    /**
     * Gets the value of the playernum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlayernum() {
        return playernum;
    }


    /**
     * Sets the value of the playernum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlayernum(String value) {
        this.playernum = value;
    }


    /**
     * Gets the value of the characternum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCharacternum() {
        return characternum;
    }


    /**
     * Sets the value of the characternum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCharacternum(String value) {
        this.characternum = value;
    }

}
