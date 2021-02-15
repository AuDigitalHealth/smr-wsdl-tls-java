
package au.net.electronichealth.ns.smr.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknownReceiverOrganisation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListErrorCodeType")
@XmlEnum
public enum ListErrorCodeType {

    @XmlEnumValue("unknownReceiverOrganisation")
    UNKNOWN_RECEIVER_ORGANISATION("unknownReceiverOrganisation");
    private final String value;

    ListErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListErrorCodeType fromValue(String v) {
        for (ListErrorCodeType c: ListErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
