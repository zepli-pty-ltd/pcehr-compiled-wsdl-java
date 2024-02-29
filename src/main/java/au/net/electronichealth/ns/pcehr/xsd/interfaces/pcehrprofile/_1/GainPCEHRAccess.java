
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.gov.nehta.schema.DateAdapter;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.NameType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.Sex;


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
 *         &lt;element name="PCEHRRecord">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="authorisationDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="accessType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="AccessCode"/>
 *                                   &lt;enumeration value="EmergencyAccess"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="accessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="individual" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
 *                             &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}sex"/>
 *                             &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "pcehrRecord"
})
@XmlRootElement(name = "gainPCEHRAccess")
public class GainPCEHRAccess {

    @XmlElement(name = "PCEHRRecord", required = true)
    protected GainPCEHRAccess.PCEHRRecord pcehrRecord;

    /**
     * Gets the value of the pcehrRecord property.
     * 
     * @return
     *     possible object is
     *     {@link GainPCEHRAccess.PCEHRRecord }
     *     
     */
    public GainPCEHRAccess.PCEHRRecord getPCEHRRecord() {
        return pcehrRecord;
    }

    /**
     * Sets the value of the pcehrRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link GainPCEHRAccess.PCEHRRecord }
     *     
     */
    public void setPCEHRRecord(GainPCEHRAccess.PCEHRRecord value) {
        this.pcehrRecord = value;
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
     *         &lt;element name="authorisationDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="accessType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="AccessCode"/>
     *                         &lt;enumeration value="EmergencyAccess"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="accessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="individual" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
     *                   &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}sex"/>
     *                   &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "authorisationDetails",
        "individual"
    })
    public static class PCEHRRecord {

        protected GainPCEHRAccess.PCEHRRecord.AuthorisationDetails authorisationDetails;
        protected GainPCEHRAccess.PCEHRRecord.Individual individual;

        /**
         * Gets the value of the authorisationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link GainPCEHRAccess.PCEHRRecord.AuthorisationDetails }
         *     
         */
        public GainPCEHRAccess.PCEHRRecord.AuthorisationDetails getAuthorisationDetails() {
            return authorisationDetails;
        }

        /**
         * Sets the value of the authorisationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link GainPCEHRAccess.PCEHRRecord.AuthorisationDetails }
         *     
         */
        public void setAuthorisationDetails(GainPCEHRAccess.PCEHRRecord.AuthorisationDetails value) {
            this.authorisationDetails = value;
        }

        /**
         * Gets the value of the individual property.
         * 
         * @return
         *     possible object is
         *     {@link GainPCEHRAccess.PCEHRRecord.Individual }
         *     
         */
        public GainPCEHRAccess.PCEHRRecord.Individual getIndividual() {
            return individual;
        }

        /**
         * Sets the value of the individual property.
         * 
         * @param value
         *     allowed object is
         *     {@link GainPCEHRAccess.PCEHRRecord.Individual }
         *     
         */
        public void setIndividual(GainPCEHRAccess.PCEHRRecord.Individual value) {
            this.individual = value;
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
         *         &lt;element name="accessType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="AccessCode"/>
         *               &lt;enumeration value="EmergencyAccess"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="accessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accessType",
            "accessCode"
        })
        public static class AuthorisationDetails {

            @XmlElement(required = true)
            protected GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType accessType;
            protected String accessCode;

            /**
             * Gets the value of the accessType property.
             * 
             * @return
             *     possible object is
             *     {@link GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType }
             *     
             */
            public GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType getAccessType() {
                return accessType;
            }

            /**
             * Sets the value of the accessType property.
             * 
             * @param value
             *     allowed object is
             *     {@link GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType }
             *     
             */
            public void setAccessType(GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType value) {
                this.accessType = value;
            }

            /**
             * Gets the value of the accessCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccessCode() {
                return accessCode;
            }

            /**
             * Sets the value of the accessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccessCode(String value) {
                this.accessCode = value;
            }


            /**
             * <p>Java class for null.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p>
             * <pre>
             * &lt;simpleType>
             *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *     &lt;enumeration value="AccessCode"/>
             *     &lt;enumeration value="EmergencyAccess"/>
             *   &lt;/restriction>
             * &lt;/simpleType>
             * </pre>
             * 
             */
            @XmlType(name = "")
            @XmlEnum
            public enum AccessType {

                @XmlEnumValue("AccessCode")
                ACCESS_CODE("AccessCode"),
                @XmlEnumValue("EmergencyAccess")
                EMERGENCY_ACCESS("EmergencyAccess");
                private final String value;

                AccessType(String v) {
                    value = v;
                }

                public String value() {
                    return value;
                }

                public static GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType fromValue(String v) {
                    for (GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType c: GainPCEHRAccess.PCEHRRecord.AuthorisationDetails.AccessType.values()) {
                        if (c.value.equals(v)) {
                            return c;
                        }
                    }
                    throw new IllegalArgumentException(v);
                }

            }

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
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
         *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}sex"/>
         *         &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameType"/>
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
            "medicareCardNumber",
            "medicareIRN",
            "dvaFileNumber",
            "militaryHealthNumber",
            "dateOfBirth",
            "sex",
            "name"
        })
        public static class Individual {

            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String medicareCardNumber;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            protected Integer medicareIRN;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String dvaFileNumber;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
            protected String militaryHealthNumber;
            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(DateAdapter.class)
            @XmlSchemaType(name = "date")
            protected Calendar dateOfBirth;
            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
            protected Sex sex;
            @XmlElement(required = true)
            protected NameType name;

            /**
             * Gets the value of the medicareCardNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicareCardNumber() {
                return medicareCardNumber;
            }

            /**
             * Sets the value of the medicareCardNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicareCardNumber(String value) {
                this.medicareCardNumber = value;
            }

            /**
             * Gets the value of the medicareIRN property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMedicareIRN() {
                return medicareIRN;
            }

            /**
             * Sets the value of the medicareIRN property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMedicareIRN(Integer value) {
                this.medicareIRN = value;
            }

            /**
             * Gets the value of the dvaFileNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDvaFileNumber() {
                return dvaFileNumber;
            }

            /**
             * Sets the value of the dvaFileNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDvaFileNumber(String value) {
                this.dvaFileNumber = value;
            }

            /**
             * Gets the value of the militaryHealthNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMilitaryHealthNumber() {
                return militaryHealthNumber;
            }

            /**
             * Sets the value of the militaryHealthNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMilitaryHealthNumber(String value) {
                this.militaryHealthNumber = value;
            }

            /**
             * Gets the value of the dateOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Calendar getDateOfBirth() {
                return dateOfBirth;
            }

            /**
             * Sets the value of the dateOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfBirth(Calendar value) {
                this.dateOfBirth = value;
            }

            /**
             * Gets the value of the sex property.
             * 
             * @return
             *     possible object is
             *     {@link Sex }
             *     
             */
            public Sex getSex() {
                return sex;
            }

            /**
             * Sets the value of the sex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Sex }
             *     
             */
            public void setSex(Sex value) {
                this.sex = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

        }

    }

}
