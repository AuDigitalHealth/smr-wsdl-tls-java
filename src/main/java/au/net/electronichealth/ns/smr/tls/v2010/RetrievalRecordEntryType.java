
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.smd.types.sealedmessage.V2010.MessageMetadataType;


/**
 * <p>Java class for RetrievalRecordEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrievalRecordEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="metadata" type="{http://ns.electronichealth.net.au/smd/xsd/SealedMessage/2010}MessageMetadataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalRecordEntryType", propOrder = {
    "messageSize",
    "metadata"
})
public class RetrievalRecordEntryType {

    protected int messageSize;
    @XmlElement(required = true)
    protected MessageMetadataType metadata;

    /**
     * Gets the value of the messageSize property.
     * 
     */
    public int getMessageSize() {
        return messageSize;
    }

    /**
     * Sets the value of the messageSize property.
     * 
     */
    public void setMessageSize(int value) {
        this.messageSize = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MessageMetadataType }
     *     
     */
    public MessageMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMetadataType }
     *     
     */
    public void setMetadata(MessageMetadataType value) {
        this.metadata = value;
    }

}
