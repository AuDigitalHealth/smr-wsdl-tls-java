
package au.net.electronichealth.ns.smr.tls.v2010;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="invocationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "invocationId"
})
@XmlRootElement(name = "retrieve")
public class Retrieve {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String receiverOrganisation;
    protected List<String> invocationId;

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
     * Gets the value of the invocationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invocationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvocationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvocationId() {
        if (invocationId == null) {
            invocationId = new ArrayList<String>();
        }
        return this.invocationId;
    }

}
