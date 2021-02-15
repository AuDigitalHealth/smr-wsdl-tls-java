
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="list" type="{http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010}MessageListType"/>
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
    "list"
})
@XmlRootElement(name = "listResponse")
public class ListResponse {

    @XmlElement(required = true)
    protected MessageListType list;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link MessageListType }
     *     
     */
    public MessageListType getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageListType }
     *     
     */
    public void setList(MessageListType value) {
        this.list = value;
    }

}
