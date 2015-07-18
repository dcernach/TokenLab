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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "weight",
        "cost",
        "description",
        "itemslot",
        "itempower"
})
@XmlRootElement(name = "item")
public class Item {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;

    @XmlAttribute(name = "useradded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useradded;

    @XmlAttribute(name = "quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantity;

    protected Weight weight;

    protected Cost cost;

    @XmlElement(required = true)
    protected String description;

    protected String itemslot;

    protected List<Itempower> itempower;


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
     * Gets the value of the useradded property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUseradded() {
        if (useradded == null) {
            return "yes";
        } else {
            return useradded;
        }
    }


    /**
     * Sets the value of the useradded property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUseradded(String value) {
        this.useradded = value;
    }


    /**
     * Gets the value of the quantity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQuantity() {
        if (quantity == null) {
            return "1";
        } else {
            return quantity;
        }
    }


    /**
     * Sets the value of the quantity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }


    /**
     * Gets the value of the weight property.
     *
     * @return possible object is
     * {@link Weight }
     */
    public Weight getWeight() {
        return weight;
    }


    /**
     * Sets the value of the weight property.
     *
     * @param value allowed object is
     *              {@link Weight }
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }


    /**
     * Gets the value of the cost property.
     *
     * @return possible object is
     * {@link Cost }
     */
    public Cost getCost() {
        return cost;
    }


    /**
     * Sets the value of the cost property.
     *
     * @param value allowed object is
     *              {@link Cost }
     */
    public void setCost(Cost value) {
        this.cost = value;
    }


    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * Gets the value of the itemslot property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getItemslot() {
        return itemslot;
    }


    /**
     * Sets the value of the itemslot property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemslot(String value) {
        this.itemslot = value;
    }


    /**
     * Gets the value of the itempower property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itempower property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItempower().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Itempower }
     */
    public List<Itempower> getItempower() {
        if (itempower == null) {
            itempower = new ArrayList<Itempower>();
        }
        return this.itempower;
    }

}
