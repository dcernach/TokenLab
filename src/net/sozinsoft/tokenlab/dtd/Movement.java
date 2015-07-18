//
// This file was net.sozinsoft.tokenlab.dtd by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.17 at 11:31:03 PM BRT 
//


package net.sozinsoft.tokenlab.dtd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "speed",
        "basespeed",
        "special"
})
@XmlRootElement(name = "movement")
public class Movement {

    @XmlElement(required = true)
    protected Speed speed;

    @XmlElement(required = true)
    protected Basespeed basespeed;

    protected List<Special> special;


    /**
     * Gets the value of the speed property.
     *
     * @return possible object is
     * {@link Speed }
     */
    public Speed getSpeed() {
        return speed;
    }


    /**
     * Sets the value of the speed property.
     *
     * @param value allowed object is
     *              {@link Speed }
     */
    public void setSpeed(Speed value) {
        this.speed = value;
    }


    /**
     * Gets the value of the basespeed property.
     *
     * @return possible object is
     * {@link Basespeed }
     */
    public Basespeed getBasespeed() {
        return basespeed;
    }


    /**
     * Sets the value of the basespeed property.
     *
     * @param value allowed object is
     *              {@link Basespeed }
     */
    public void setBasespeed(Basespeed value) {
        this.basespeed = value;
    }


    /**
     * Gets the value of the special property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the special property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecial().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Special }
     */
    public List<Special> getSpecial() {
        if (special == null) {
            special = new ArrayList<Special>();
        }
        return this.special;
    }

}
