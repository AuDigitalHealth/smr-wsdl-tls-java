
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receiverOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="allAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "receiverOrganisation",
    "allAvailable",
    "limit"
})
@XmlRootElement(name = "list")
public class List {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String receiverOrganisation;
    protected boolean allAvailable;
    protected int limit;

    /**
     * Gets the value of the receiverOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverOrganisation() {
        return receiverOrganisation;
    }

    /**
     * Sets the value of the receiverOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverOrganisation(String value) {
        this.receiverOrganisation = value;
    }

    /**
     * Gets the value of the allAvailable property.
     * 
     */
    public boolean isAllAvailable() {
        return allAvailable;
    }

    /**
     * Sets the value of the allAvailable property.
     * 
     */
    public void setAllAvailable(boolean value) {
        this.allAvailable = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
