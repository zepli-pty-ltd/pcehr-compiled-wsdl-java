
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streetSuffixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="streetSuffixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "streetSuffixType")
@XmlEnum
public enum StreetSuffixType {


    /**
     * Central
     * 
     */
    CN,

    /**
     * East
     * 
     */
    E,

    /**
     * Extension
     * 
     */
    EX,

    /**
     * Lower
     * 
     */
    LR,

    /**
     * North
     * 
     */
    N,

    /**
     * North East
     * 
     */
    NE,

    /**
     * North West
     * 
     */
    NW,

    /**
     * South
     * 
     */
    S,

    /**
     * South East
     * 
     */
    SE,

    /**
     * South West
     * 
     */
    SW,

    /**
     * Upper
     * 
     */
    UP,

    /**
     * West
     * 
     */
    W;

    public String value() {
        return name();
    }

    public static StreetSuffixType fromValue(String v) {
        return valueOf(v);
    }

}
