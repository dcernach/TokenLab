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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "heropoints")
public class Heropoints {

    @XmlAttribute(name = "enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String enabled;

    @XmlAttribute(name = "total", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String total;


    /**
     * Gets the value of the enabled property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnabled() {
        if (enabled == null) {
            return "yes";
        } else {
            return enabled;
        }
    }


    /**
     * Sets the value of the enabled property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }


    /**
     * Gets the value of the total property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTotal() {
        return total;
    }


    /**
     * Sets the value of the total property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTotal(String value) {
        this.total = value;
    }

}
