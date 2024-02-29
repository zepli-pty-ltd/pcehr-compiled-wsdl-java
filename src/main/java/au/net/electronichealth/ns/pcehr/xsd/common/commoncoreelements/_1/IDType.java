
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="IHI"/>
 *     &lt;enumeration value="MCA"/>
 *     &lt;enumeration value="DVA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IDType")
@XmlEnum
public enum IDType {

    IHI,
    MCA,
    DVA;

    public String value() {
        return name();
    }

    public static IDType fromValue(String v) {
        return valueOf(v);
    }

}
