
package au.net.electronichealth.ns.smr.tls.v2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalNumberAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retrievalRecord" type="{http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010}RetrievalRecordEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageListType", propOrder = {
    "totalNumberAvailable",
    "retrievalRecord"
})
public class MessageListType {

    protected int totalNumberAvailable;
    protected List<RetrievalRecordEntryType> retrievalRecord;

    /**
     * Gets the value of the totalNumberAvailable property.
     * 
     */
    public int getTotalNumberAvailable() {
        return totalNumberAvailable;
    }

    /**
     * Sets the value of the totalNumberAvailable property.
     * 
     */
    public void setTotalNumberAvailable(int value) {
        this.totalNumberAvailable = value;
    }

    /**
     * Gets the value of the retrievalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrievalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrievalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievalRecordEntryType }
     * 
     * 
     */
    public List<RetrievalRecordEntryType> getRetrievalRecord() {
        if (retrievalRecord == null) {
            retrievalRecord = new ArrayList<RetrievalRecordEntryType>();
        }
        return this.retrievalRecord;
    }

}
