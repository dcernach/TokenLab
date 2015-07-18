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
@XmlRootElement(name = "image")
public class Image {

    @XmlAttribute(name = "filename", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String filename;


    /**
     * Gets the value of the filename property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFilename() {
        return filename;
    }


    /**
     * Sets the value of the filename property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFilename(String value) {
        this.filename = value;
    }

}
