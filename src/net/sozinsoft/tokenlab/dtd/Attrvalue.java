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
@XmlRootElement(name = "attrvalue")
public class Attrvalue {

    @XmlAttribute(name = "text", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String text;

    @XmlAttribute(name = "base", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String base;

    @XmlAttribute(name = "modified", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;


    /**
     * Gets the value of the text property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getText() {
        return text;
    }


    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setText(String value) {
        this.text = value;
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
     * Gets the value of the modified property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getModified() {
        return modified;
    }


    /**
     * Sets the value of the modified property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setModified(String value) {
        this.modified = value;
    }

}
