
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010}RetrieveErrorCodeType"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invocationId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveErrorType", propOrder = {
    "errorCode",
    "message",
    "invocationId"
})
public class RetrieveErrorType {

    @XmlElement(required = true)
    protected RetrieveErrorCodeType errorCode;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String invocationId;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveErrorCodeType }
     *     
     */
    public RetrieveErrorCodeType getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveErrorCodeType }
     *     
     */
    public void setErrorCode(RetrieveErrorCodeType value) {
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

    /**
     * Gets the value of the invocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationId() {
        return invocationId;
    }

    /**
     * Sets the value of the invocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationId(String value) {
        this.invocationId = value;
    }

}
