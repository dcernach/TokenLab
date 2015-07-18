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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "spelllevel"
})
@XmlRootElement(name = "spellclass")
public class Spellclass {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "maxspelllevel", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxspelllevel;

    @XmlAttribute(name = "spells", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String spells;

    protected List<Spelllevel> spelllevel;


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
     * Gets the value of the maxspelllevel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxspelllevel() {
        return maxspelllevel;
    }


    /**
     * Sets the value of the maxspelllevel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxspelllevel(String value) {
        this.maxspelllevel = value;
    }


    /**
     * Gets the value of the spells property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpells() {
        return spells;
    }


    /**
     * Sets the value of the spells property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpells(String value) {
        this.spells = value;
    }


    /**
     * Gets the value of the spelllevel property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spelllevel property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpelllevel().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Spelllevel }
     */
    public List<Spelllevel> getSpelllevel() {
        if (spelllevel == null) {
            spelllevel = new ArrayList<Spelllevel>();
        }
        return this.spelllevel;
    }

}
