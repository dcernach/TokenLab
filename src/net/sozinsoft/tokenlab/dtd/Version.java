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
@XmlRootElement(name = "version")
public class Version {

    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;

    @XmlAttribute(name = "build")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String build;

    @XmlAttribute(name = "primary")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String primary;

    @XmlAttribute(name = "secondary")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String secondary;

    @XmlAttribute(name = "tertiary")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tertiary;


    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersion() {
        return version;
    }


    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * Gets the value of the build property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBuild() {
        return build;
    }


    /**
     * Sets the value of the build property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBuild(String value) {
        this.build = value;
    }


    /**
     * Gets the value of the primary property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrimary() {
        return primary;
    }


    /**
     * Sets the value of the primary property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrimary(String value) {
        this.primary = value;
    }


    /**
     * Gets the value of the secondary property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSecondary() {
        return secondary;
    }


    /**
     * Sets the value of the secondary property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSecondary(String value) {
        this.secondary = value;
    }


    /**
     * Gets the value of the tertiary property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTertiary() {
        return tertiary;
    }


    /**
     * Sets the value of the tertiary property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTertiary(String value) {
        this.tertiary = value;
    }

}
