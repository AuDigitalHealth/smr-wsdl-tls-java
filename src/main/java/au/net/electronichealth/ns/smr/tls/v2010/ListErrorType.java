
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010}ListErrorCodeType"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListErrorType", propOrder = {
    "errorCode",
    "message"
})
public class ListErrorType {

    @XmlElement(required = true)
    protected ListErrorCodeType errorCode;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ListErrorCodeType }
     *     
     */
    public ListErrorCodeType getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListErrorCodeType }
     *     
     */
    public void setErrorCode(ListErrorCodeType value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
