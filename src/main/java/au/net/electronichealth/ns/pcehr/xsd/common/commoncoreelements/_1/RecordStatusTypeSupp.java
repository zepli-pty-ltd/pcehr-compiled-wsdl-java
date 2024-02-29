
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordStatusTypeSupp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recordStatusTypeSupp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Verified"/>
 *     &lt;enumeration value="Unverified"/>
 *     &lt;enumeration value="Provisional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recordStatusTypeSupp")
@XmlEnum
public enum RecordStatusTypeSupp {

    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("Unverified")
    UNVERIFIED("Unverified"),
    @XmlEnumValue("Provisional")
    PROVISIONAL("Provisional");
    private final String value;

    RecordStatusTypeSupp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordStatusTypeSupp fromValue(String v) {
        for (RecordStatusTypeSupp c: RecordStatusTypeSupp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
