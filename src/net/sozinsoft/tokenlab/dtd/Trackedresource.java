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
@XmlRootElement(name = "trackedresource")
public class Trackedresource {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "text", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String text;

    @XmlAttribute(name = "used", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String used;

    @XmlAttribute(name = "left", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String left;

    @XmlAttribute(name = "min", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String min;

    @XmlAttribute(name = "max", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String max;


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
     * Gets the value of the used property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsed() {
        return used;
    }


    /**
     * Sets the value of the used property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsed(String value) {
        this.used = value;
    }


    /**
     * Gets the value of the left property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeft() {
        return left;
    }


    /**
     * Sets the value of the left property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeft(String value) {
        this.left = value;
    }


    /**
     * Gets the value of the min property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMin() {
        return min;
    }


    /**
     * Sets the value of the min property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMin(String value) {
        this.min = value;
    }


    /**
     * Gets the value of the max property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMax() {
        return max;
    }


    /**
     * Sets the value of the max property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMax(String value) {
        this.max = value;
    }

}
