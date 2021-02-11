
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Self"/>
 *               &lt;enumeration value="General"/>
 *               &lt;enumeration value="Limited"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accessPermission" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Permit"/>
 *               &lt;enumeration value="Deny"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accessConditions" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OpenAccess"/>
 *               &lt;enumeration value="AccessRevoked"/>
 *               &lt;enumeration value="PACAccess"/>
 *               &lt;enumeration value="PACXAccess"/>
 *               &lt;enumeration value="EmergencyAccess"/>
 *               &lt;enumeration value="LocalConsentAccess"/>
 *               &lt;enumeration value="AuthorisedRepresentativeAccess"/>
 *               &lt;enumeration value="NominatedRepresentativeAccess"/>
 *               &lt;enumeration value="IncorrectCode"/>
 *               &lt;enumeration value="LocalConsentAccessDenied"/>
 *               &lt;enumeration value="AccessRevoked"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessConditionsType", propOrder = {
    "accessLevel",
    "accessPermission",
    "accessConditions"
})
public class AccessConditionsType {

    protected AccessConditionsType.AccessLevel accessLevel;
    protected AccessConditionsType.AccessPermission accessPermission;
    protected AccessConditionsType.AccessConditions accessConditions;

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessConditionsType.AccessLevel }
     *     
     */
    public AccessConditionsType.AccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessConditionsType.AccessLevel }
     *     
     */
    public void setAccessLevel(AccessConditionsType.AccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the accessPermission property.
     * 
     * @return
     *     possible object is
     *     {@link AccessConditionsType.AccessPermission }
     *     
     */
    public AccessConditionsType.AccessPermission getAccessPermission() {
        return accessPermission;
    }

    /**
     * Sets the value of the accessPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessConditionsType.AccessPermission }
     *     
     */
    public void setAccessPermission(AccessConditionsType.AccessPermission value) {
        this.accessPermission = value;
    }

    /**
     * Gets the value of the accessConditions property.
     * 
     * @return
     *     possible object is
     *     {@link AccessConditionsType.AccessConditions }
     *     
     */
    public AccessConditionsType.AccessConditions getAccessConditions() {
        return accessConditions;
    }

    /**
     * Sets the value of the accessConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessConditionsType.AccessConditions }
     *     
     */
    public void setAccessConditions(AccessConditionsType.AccessConditions value) {
        this.accessConditions = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="OpenAccess"/>
     *     &lt;enumeration value="AccessRevoked"/>
     *     &lt;enumeration value="PACAccess"/>
     *     &lt;enumeration value="PACXAccess"/>
     *     &lt;enumeration value="EmergencyAccess"/>
     *     &lt;enumeration value="LocalConsentAccess"/>
     *     &lt;enumeration value="AuthorisedRepresentativeAccess"/>
     *     &lt;enumeration value="NominatedRepresentativeAccess"/>
     *     &lt;enumeration value="IncorrectCode"/>
     *     &lt;enumeration value="LocalConsentAccessDenied"/>
     *     &lt;enumeration value="AccessRevoked"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessConditions {

        @XmlEnumValue("OpenAccess")
        OPEN_ACCESS("OpenAccess"),
        @XmlEnumValue("AccessRevoked")
        ACCESS_REVOKED("AccessRevoked"),
        @XmlEnumValue("PACAccess")
        PAC_ACCESS("PACAccess"),
        @XmlEnumValue("PACXAccess")
        PACX_ACCESS("PACXAccess"),
        @XmlEnumValue("EmergencyAccess")
        EMERGENCY_ACCESS("EmergencyAccess"),
        @XmlEnumValue("LocalConsentAccess")
        LOCAL_CONSENT_ACCESS("LocalConsentAccess"),
        @XmlEnumValue("AuthorisedRepresentativeAccess")
        AUTHORISED_REPRESENTATIVE_ACCESS("AuthorisedRepresentativeAccess"),
        @XmlEnumValue("NominatedRepresentativeAccess")
        NOMINATED_REPRESENTATIVE_ACCESS("NominatedRepresentativeAccess"),
        @XmlEnumValue("IncorrectCode")
        INCORRECT_CODE("IncorrectCode"),
        @XmlEnumValue("LocalConsentAccessDenied")
        LOCAL_CONSENT_ACCESS_DENIED("LocalConsentAccessDenied");
        private final String value;

        AccessConditions(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AccessConditionsType.AccessConditions fromValue(String v) {
            for (AccessConditionsType.AccessConditions c: AccessConditionsType.AccessConditions.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="Self"/>
     *     &lt;enumeration value="General"/>
     *     &lt;enumeration value="Limited"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessLevel {

        @XmlEnumValue("Self")
        SELF("Self"),
        @XmlEnumValue("General")
        GENERAL("General"),
        @XmlEnumValue("Limited")
        LIMITED("Limited");
        private final String value;

        AccessLevel(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AccessConditionsType.AccessLevel fromValue(String v) {
            for (AccessConditionsType.AccessLevel c: AccessConditionsType.AccessLevel.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="Permit"/>
     *     &lt;enumeration value="Deny"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessPermission {

        @XmlEnumValue("Permit")
        PERMIT("Permit"),
        @XmlEnumValue("Deny")
        DENY("Deny");
        private final String value;

        AccessPermission(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AccessConditionsType.AccessPermission fromValue(String v) {
            for (AccessConditionsType.AccessPermission c: AccessConditionsType.AccessPermission.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
