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
        "programinfo",
        "version"
})
@XmlRootElement(name = "program")
public class Program {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "url", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String url;

    @XmlElement(required = true)
    protected String programinfo;

    @XmlElement(required = true)
    protected Version version;


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
     * Gets the value of the url property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrl() {
        return url;
    }


    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrl(String value) {
        this.url = value;
    }


    /**
     * Gets the value of the programinfo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrograminfo() {
        return programinfo;
    }


    /**
     * Sets the value of the programinfo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrograminfo(String value) {
        this.programinfo = value;
    }


    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     * {@link Version }
     */
    public Version getVersion() {
        return version;
    }


    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link Version }
     */
    public void setVersion(Version value) {
        this.version = value;
    }

}
