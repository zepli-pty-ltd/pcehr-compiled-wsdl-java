
package au.net.electronichealth.ns.pcehr.xsd.interfaces.registerpcehr._2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ContactDetailsType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;


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
 *         &lt;element name="representative" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/>
 *                   &lt;element name="demographics" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                   &lt;element name="demographics">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assertions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="evidenceOfIdentity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="IdentityVerificationMethod1"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod2"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod3"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod4"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod5"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod6"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod7"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod8"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod9"/>
 *                                             &lt;enumeration value="IdentityVerificationMethod10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="indigenousStatus">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="signedConsentForm" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="documentConsent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="document" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="MBS"/>
 *                                             &lt;enumeration value="ACIR"/>
 *                                             &lt;enumeration value="AODR"/>
 *                                             &lt;enumeration value="PBSPastAssimilation"/>
 *                                             &lt;enumeration value="MBSPastAssimilation"/>
 *                                             &lt;enumeration value="PBS"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="status">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="ConsentGiven"/>
 *                                             &lt;enumeration value="ConsentNotGiven"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ivcCorrespondence">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="channel">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="email"/>
 *                                   &lt;enumeration value="sms"/>
 *                                   &lt;enumeration value="response"/>
 *                                   &lt;enumeration value="mail"/>
 *                                   &lt;enumeration value="none"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="acceptedTermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="representativeDeclaration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "representative",
    "individual",
    "assertions"
})
@XmlRootElement(name = "registerPCEHR")
public class RegisterPCEHR {

    protected RegisterPCEHR.Representative representative;
    protected RegisterPCEHR.Individual individual;
    @XmlElement(required = true)
    protected RegisterPCEHR.Assertions assertions;

    /**
     * Gets the value of the representative property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterPCEHR.Representative }
     *     
     */
    public RegisterPCEHR.Representative getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterPCEHR.Representative }
     *     
     */
    public void setRepresentative(RegisterPCEHR.Representative value) {
        this.representative = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterPCEHR.Individual }
     *     
     */
    public RegisterPCEHR.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterPCEHR.Individual }
     *     
     */
    public void setIndividual(RegisterPCEHR.Individual value) {
        this.individual = value;
    }

    /**
     * Gets the value of the assertions property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterPCEHR.Assertions }
     *     
     */
    public RegisterPCEHR.Assertions getAssertions() {
        return assertions;
    }

    /**
     * Sets the value of the assertions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterPCEHR.Assertions }
     *     
     */
    public void setAssertions(RegisterPCEHR.Assertions value) {
        this.assertions = value;
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
     *         &lt;element name="identity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="evidenceOfIdentity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="IdentityVerificationMethod1"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod2"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod3"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod4"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod5"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod6"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod7"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod8"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod9"/>
     *                                   &lt;enumeration value="IdentityVerificationMethod10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="indigenousStatus">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="signedConsentForm" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="documentConsent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="document" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MBS"/>
     *                                   &lt;enumeration value="ACIR"/>
     *                                   &lt;enumeration value="AODR"/>
     *                                   &lt;enumeration value="PBSPastAssimilation"/>
     *                                   &lt;enumeration value="MBSPastAssimilation"/>
     *                                   &lt;enumeration value="PBS"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="status">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="ConsentGiven"/>
     *                                   &lt;enumeration value="ConsentNotGiven"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *         &lt;element name="ivcCorrespondence">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="channel">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="email"/>
     *                         &lt;enumeration value="sms"/>
     *                         &lt;enumeration value="response"/>
     *                         &lt;enumeration value="mail"/>
     *                         &lt;enumeration value="none"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="acceptedTermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="representativeDeclaration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "identity",
        "documentConsent",
        "ivcCorrespondence",
        "acceptedTermsAndConditions",
        "representativeDeclaration"
    })
    public static class Assertions {

        @XmlElement(required = true)
        protected RegisterPCEHR.Assertions.Identity identity;
        protected RegisterPCEHR.Assertions.DocumentConsent documentConsent;
        @XmlElement(required = true)
        protected RegisterPCEHR.Assertions.IvcCorrespondence ivcCorrespondence;
        protected boolean acceptedTermsAndConditions;
        protected Boolean representativeDeclaration;

        /**
         * Gets the value of the identity property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterPCEHR.Assertions.Identity }
         *     
         */
        public RegisterPCEHR.Assertions.Identity getIdentity() {
            return identity;
        }

        /**
         * Sets the value of the identity property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterPCEHR.Assertions.Identity }
         *     
         */
        public void setIdentity(RegisterPCEHR.Assertions.Identity value) {
            this.identity = value;
        }

        /**
         * Gets the value of the documentConsent property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterPCEHR.Assertions.DocumentConsent }
         *     
         */
        public RegisterPCEHR.Assertions.DocumentConsent getDocumentConsent() {
            return documentConsent;
        }

        /**
         * Sets the value of the documentConsent property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterPCEHR.Assertions.DocumentConsent }
         *     
         */
        public void setDocumentConsent(RegisterPCEHR.Assertions.DocumentConsent value) {
            this.documentConsent = value;
        }

        /**
         * Gets the value of the ivcCorrespondence property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterPCEHR.Assertions.IvcCorrespondence }
         *     
         */
        public RegisterPCEHR.Assertions.IvcCorrespondence getIvcCorrespondence() {
            return ivcCorrespondence;
        }

        /**
         * Sets the value of the ivcCorrespondence property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterPCEHR.Assertions.IvcCorrespondence }
         *     
         */
        public void setIvcCorrespondence(RegisterPCEHR.Assertions.IvcCorrespondence value) {
            this.ivcCorrespondence = value;
        }

        /**
         * Gets the value of the acceptedTermsAndConditions property.
         * 
         */
        public boolean isAcceptedTermsAndConditions() {
            return acceptedTermsAndConditions;
        }

        /**
         * Sets the value of the acceptedTermsAndConditions property.
         * 
         */
        public void setAcceptedTermsAndConditions(boolean value) {
            this.acceptedTermsAndConditions = value;
        }

        /**
         * Gets the value of the representativeDeclaration property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRepresentativeDeclaration() {
            return representativeDeclaration;
        }

        /**
         * Sets the value of the representativeDeclaration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRepresentativeDeclaration(Boolean value) {
            this.representativeDeclaration = value;
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
         *         &lt;element name="document" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="MBS"/>
         *                         &lt;enumeration value="ACIR"/>
         *                         &lt;enumeration value="AODR"/>
         *                         &lt;enumeration value="PBSPastAssimilation"/>
         *                         &lt;enumeration value="MBSPastAssimilation"/>
         *                         &lt;enumeration value="PBS"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="status">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="ConsentGiven"/>
         *                         &lt;enumeration value="ConsentNotGiven"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
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
            "documents"
        })
        public static class DocumentConsent {

            @XmlElement(name = "document", required = true)
            protected List<RegisterPCEHR.Assertions.DocumentConsent.Document> documents;

            /**
             * Gets the value of the documents property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the documents property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocuments().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RegisterPCEHR.Assertions.DocumentConsent.Document }
             * 
             * 
             */
            public List<RegisterPCEHR.Assertions.DocumentConsent.Document> getDocuments() {
                if (documents == null) {
                    documents = new ArrayList<RegisterPCEHR.Assertions.DocumentConsent.Document>();
                }
                return this.documents;
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
             *         &lt;element name="type">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="MBS"/>
             *               &lt;enumeration value="ACIR"/>
             *               &lt;enumeration value="AODR"/>
             *               &lt;enumeration value="PBSPastAssimilation"/>
             *               &lt;enumeration value="MBSPastAssimilation"/>
             *               &lt;enumeration value="PBS"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="status">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="ConsentGiven"/>
             *               &lt;enumeration value="ConsentNotGiven"/>
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
                "type",
                "status"
            })
            public static class Document {

                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected String status;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
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
         *         &lt;element name="evidenceOfIdentity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="IdentityVerificationMethod1"/>
         *                         &lt;enumeration value="IdentityVerificationMethod2"/>
         *                         &lt;enumeration value="IdentityVerificationMethod3"/>
         *                         &lt;enumeration value="IdentityVerificationMethod4"/>
         *                         &lt;enumeration value="IdentityVerificationMethod5"/>
         *                         &lt;enumeration value="IdentityVerificationMethod6"/>
         *                         &lt;enumeration value="IdentityVerificationMethod7"/>
         *                         &lt;enumeration value="IdentityVerificationMethod8"/>
         *                         &lt;enumeration value="IdentityVerificationMethod9"/>
         *                         &lt;enumeration value="IdentityVerificationMethod10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="indigenousStatus">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="signedConsentForm" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
            "evidenceOfIdentity",
            "indigenousStatus",
            "signedConsentForm"
        })
        public static class Identity {

            @XmlElement(required = true)
            protected RegisterPCEHR.Assertions.Identity.EvidenceOfIdentity evidenceOfIdentity;
            @XmlElement(required = true)
            protected String indigenousStatus;
            protected byte[] signedConsentForm;

            /**
             * Gets the value of the evidenceOfIdentity property.
             * 
             * @return
             *     possible object is
             *     {@link RegisterPCEHR.Assertions.Identity.EvidenceOfIdentity }
             *     
             */
            public RegisterPCEHR.Assertions.Identity.EvidenceOfIdentity getEvidenceOfIdentity() {
                return evidenceOfIdentity;
            }

            /**
             * Sets the value of the evidenceOfIdentity property.
             * 
             * @param value
             *     allowed object is
             *     {@link RegisterPCEHR.Assertions.Identity.EvidenceOfIdentity }
             *     
             */
            public void setEvidenceOfIdentity(RegisterPCEHR.Assertions.Identity.EvidenceOfIdentity value) {
                this.evidenceOfIdentity = value;
            }

            /**
             * Gets the value of the indigenousStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndigenousStatus() {
                return indigenousStatus;
            }

            /**
             * Sets the value of the indigenousStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndigenousStatus(String value) {
                this.indigenousStatus = value;
            }

            /**
             * Gets the value of the signedConsentForm property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getSignedConsentForm() {
                return signedConsentForm;
            }

            /**
             * Sets the value of the signedConsentForm property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setSignedConsentForm(byte[] value) {
                this.signedConsentForm = value;
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
             *         &lt;element name="type">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="IdentityVerificationMethod1"/>
             *               &lt;enumeration value="IdentityVerificationMethod2"/>
             *               &lt;enumeration value="IdentityVerificationMethod3"/>
             *               &lt;enumeration value="IdentityVerificationMethod4"/>
             *               &lt;enumeration value="IdentityVerificationMethod5"/>
             *               &lt;enumeration value="IdentityVerificationMethod6"/>
             *               &lt;enumeration value="IdentityVerificationMethod7"/>
             *               &lt;enumeration value="IdentityVerificationMethod8"/>
             *               &lt;enumeration value="IdentityVerificationMethod9"/>
             *               &lt;enumeration value="IdentityVerificationMethod10"/>
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
                "type"
            })
            public static class EvidenceOfIdentity {

                @XmlElement(required = true)
                protected String type;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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
         *         &lt;element name="channel">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="email"/>
         *               &lt;enumeration value="sms"/>
         *               &lt;enumeration value="response"/>
         *               &lt;enumeration value="mail"/>
         *               &lt;enumeration value="none"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/>
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
            "channel",
            "contactDetails"
        })
        public static class IvcCorrespondence {

            @XmlElement(required = true)
            protected String channel;
            protected ContactDetailsType contactDetails;

            /**
             * Gets the value of the channel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChannel() {
                return channel;
            }

            /**
             * Sets the value of the channel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChannel(String value) {
                this.channel = value;
            }

            /**
             * Gets the value of the contactDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ContactDetailsType }
             *     
             */
            public ContactDetailsType getContactDetails() {
                return contactDetails;
            }

            /**
             * Sets the value of the contactDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactDetailsType }
             *     
             */
            public void setContactDetails(ContactDetailsType value) {
                this.contactDetails = value;
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
     *         &lt;element name="demographics">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "demographics"
    })
    public static class Individual {

        @XmlElement(required = true)
        protected RegisterPCEHR.Individual.Demographics demographics;

        /**
         * Gets the value of the demographics property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterPCEHR.Individual.Demographics }
         *     
         */
        public RegisterPCEHR.Individual.Demographics getDemographics() {
            return demographics;
        }

        /**
         * Sets the value of the demographics property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterPCEHR.Individual.Demographics }
         *     
         */
        public void setDemographics(RegisterPCEHR.Individual.Demographics value) {
            this.demographics = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
         *       &lt;sequence>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
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
            "militaryHealthNumber"
        })
        public static class Demographics
            extends IndividualTypeSupp
        {

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
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/>
     *         &lt;element name="demographics" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "ihiNumber",
        "demographics"
    })
    public static class Representative {

        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        protected String ihiNumber;
        protected RegisterPCEHR.Representative.Demographics demographics;

        /**
         * Gets the value of the ihiNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIhiNumber() {
            return ihiNumber;
        }

        /**
         * Sets the value of the ihiNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIhiNumber(String value) {
            this.ihiNumber = value;
        }

        /**
         * Gets the value of the demographics property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterPCEHR.Representative.Demographics }
         *     
         */
        public RegisterPCEHR.Representative.Demographics getDemographics() {
            return demographics;
        }

        /**
         * Sets the value of the demographics property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterPCEHR.Representative.Demographics }
         *     
         */
        public void setDemographics(RegisterPCEHR.Representative.Demographics value) {
            this.demographics = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
         *       &lt;sequence>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/>
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
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
            "militaryHealthNumber"
        })
        public static class Demographics
            extends IndividualTypeSupp
        {

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

        }

    }

}
