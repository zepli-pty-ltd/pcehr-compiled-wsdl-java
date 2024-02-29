
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressTypeSupp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressTypeSupp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unstructuredAddress" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="australianAddressLine" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="postcode" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postcodeType"/>
 *                   &lt;element name="suburb" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}suburbType"/>
 *                   &lt;element name="state" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}stateType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="australianStreetAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}australianStreetAddressType" minOccurs="0"/>
 *         &lt;element name="australianPostalAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}australianPostalAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressTypeSupp", propOrder = {
    "unstructuredAddress",
    "australianStreetAddress",
    "australianPostalAddress"
})
public class AddressTypeSupp {

    protected AddressTypeSupp.UnstructuredAddress unstructuredAddress;
    protected AustralianStreetAddressType australianStreetAddress;
    protected AustralianPostalAddressType australianPostalAddress;

    /**
     * Gets the value of the unstructuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeSupp.UnstructuredAddress }
     *     
     */
    public AddressTypeSupp.UnstructuredAddress getUnstructuredAddress() {
        return unstructuredAddress;
    }

    /**
     * Sets the value of the unstructuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeSupp.UnstructuredAddress }
     *     
     */
    public void setUnstructuredAddress(AddressTypeSupp.UnstructuredAddress value) {
        this.unstructuredAddress = value;
    }

    /**
     * Gets the value of the australianStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianStreetAddressType }
     *     
     */
    public AustralianStreetAddressType getAustralianStreetAddress() {
        return australianStreetAddress;
    }

    /**
     * Sets the value of the australianStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianStreetAddressType }
     *     
     */
    public void setAustralianStreetAddress(AustralianStreetAddressType value) {
        this.australianStreetAddress = value;
    }

    /**
     * Gets the value of the australianPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianPostalAddressType }
     *     
     */
    public AustralianPostalAddressType getAustralianPostalAddress() {
        return australianPostalAddress;
    }

    /**
     * Sets the value of the australianPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianPostalAddressType }
     *     
     */
    public void setAustralianPostalAddress(AustralianPostalAddressType value) {
        this.australianPostalAddress = value;
    }


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
     *         &lt;element name="australianAddressLine" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="postcode" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postcodeType"/>
     *         &lt;element name="suburb" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}suburbType"/>
     *         &lt;element name="state" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}stateType"/>
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
        "australianAddressLine",
        "postcode",
        "suburb",
        "state"
    })
    public static class UnstructuredAddress {

        protected String australianAddressLine;
        @XmlElement(required = true)
        protected String postcode;
        @XmlElement(required = true)
        protected String suburb;
        @XmlElement(required = true)
        protected StateType state;

        /**
         * Gets the value of the australianAddressLine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAustralianAddressLine() {
            return australianAddressLine;
        }

        /**
         * Sets the value of the australianAddressLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAustralianAddressLine(String value) {
            this.australianAddressLine = value;
        }

        /**
         * Gets the value of the postcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcode() {
            return postcode;
        }

        /**
         * Sets the value of the postcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcode(String value) {
            this.postcode = value;
        }

        /**
         * Gets the value of the suburb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuburb() {
            return suburb;
        }

        /**
         * Sets the value of the suburb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuburb(String value) {
            this.suburb = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link StateType }
         *     
         */
        public StateType getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link StateType }
         *     
         */
        public void setState(StateType value) {
            this.state = value;
        }

    }

}
