
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PCEHRExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accessCodeRequired" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="WithCode"/>
 *               &lt;enumeration value="WithoutCode"/>
 *               &lt;enumeration value="AccessGranted"/>
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
@XmlType(name = "", propOrder = {
    "pcehrExists",
    "accessCodeRequired"
})
@XmlRootElement(name = "doesPCEHRExistResponse")
public class DoesPCEHRExistResponse {

    @XmlElement(name = "PCEHRExists")
    protected boolean pcehrExists;
    protected DoesPCEHRExistResponse.AccessCodeRequired accessCodeRequired;

    /**
     * Gets the value of the pcehrExists property.
     * 
     */
    public boolean isPCEHRExists() {
        return pcehrExists;
    }

    /**
     * Sets the value of the pcehrExists property.
     * 
     */
    public void setPCEHRExists(boolean value) {
        this.pcehrExists = value;
    }

    /**
     * Gets the value of the accessCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link DoesPCEHRExistResponse.AccessCodeRequired }
     *     
     */
    public DoesPCEHRExistResponse.AccessCodeRequired getAccessCodeRequired() {
        return accessCodeRequired;
    }

    /**
     * Sets the value of the accessCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoesPCEHRExistResponse.AccessCodeRequired }
     *     
     */
    public void setAccessCodeRequired(DoesPCEHRExistResponse.AccessCodeRequired value) {
        this.accessCodeRequired = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="WithCode"/>
     *     &lt;enumeration value="WithoutCode"/>
     *     &lt;enumeration value="AccessGranted"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessCodeRequired {

        @XmlEnumValue("WithCode")
        WITH_CODE("WithCode"),
        @XmlEnumValue("WithoutCode")
        WITHOUT_CODE("WithoutCode"),
        @XmlEnumValue("AccessGranted")
        ACCESS_GRANTED("AccessGranted");
        private final String value;

        AccessCodeRequired(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static DoesPCEHRExistResponse.AccessCodeRequired fromValue(String v) {
            for (DoesPCEHRExistResponse.AccessCodeRequired c: DoesPCEHRExistResponse.AccessCodeRequired.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
