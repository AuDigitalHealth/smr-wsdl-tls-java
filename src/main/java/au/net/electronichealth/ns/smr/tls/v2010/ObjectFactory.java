
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.smr.tls.v2010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListError_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010", "listError");
    private final static QName _RetrieveError_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010", "retrieveError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.smr.tls.v2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveErrorType }
     * 
     */
    public RetrieveErrorType createRetrieveErrorType() {
        return new RetrieveErrorType();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link MessageListType }
     * 
     */
    public MessageListType createMessageListType() {
        return new MessageListType();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link ListErrorType }
     * 
     */
    public ListErrorType createListErrorType() {
        return new ListErrorType();
    }

    /**
     * Create an instance of {@link RetrievalRecordEntryType }
     * 
     */
    public RetrievalRecordEntryType createRetrievalRecordEntryType() {
        return new RetrievalRecordEntryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010", name = "listError")
    public JAXBElement<ListErrorType> createListError(ListErrorType value) {
        return new JAXBElement<ListErrorType>(_ListError_QNAME, ListErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/smd/svc/SealedMessageRetrieval/2010", name = "retrieveError")
    public JAXBElement<RetrieveErrorType> createRetrieveError(RetrieveErrorType value) {
        return new JAXBElement<RetrieveErrorType>(_RetrieveError_QNAME, RetrieveErrorType.class, null, value);
    }

}
