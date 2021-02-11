
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getindividualdetailsview._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ContactDetailsType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ContactPersonTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.RecordStatusType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.StatusType;


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
 *         &lt;element name="responseStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/>
 *         &lt;element name="individual" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dateAccuracyIndicatorType" minOccurs="0"/>
 *                   &lt;element name="ihiRecordStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}recordStatusType" minOccurs="0"/>
 *                   &lt;element name="ihiStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}statusType" minOccurs="0"/>
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
 *                   &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/>
 *                   &lt;element name="contactPersons" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contactPerson" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactPersonTypeSupp" maxOccurs="unbounded"/>
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
    "responseStatus",
    "individual"
})
@XmlRootElement(name = "getIndividualDetailsViewResponse")
public class GetIndividualDetailsViewResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    protected GetIndividualDetailsViewResponse.Individual individual;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link GetIndividualDetailsViewResponse.Individual }
     *     
     */
    public GetIndividualDetailsViewResponse.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIndividualDetailsViewResponse.Individual }
     *     
     */
    public void setIndividual(GetIndividualDetailsViewResponse.Individual value) {
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
     *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp">
     *       &lt;sequence>
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dateAccuracyIndicatorType" minOccurs="0"/>
     *         &lt;element name="ihiRecordStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}recordStatusType" minOccurs="0"/>
     *         &lt;element name="ihiStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}statusType" minOccurs="0"/>
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
     *         &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/>
     *         &lt;element name="contactPersons" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contactPerson" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactPersonTypeSupp" maxOccurs="unbounded"/>
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
        "dateAccuracyIndicatorType",
        "ihiRecordStatus",
        "ihiStatus",
        "ihiNumber",
        "contactDetails",
        "contactPersons",
        "indigenousStatus"
    })
    public static class Individual
        extends IndividualTypeSupp
    {

        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        protected DateAccuracyIndicatorType dateAccuracyIndicatorType;
        protected RecordStatusType ihiRecordStatus;
        protected StatusType ihiStatus;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
        protected String ihiNumber;
        protected ContactDetailsType contactDetails;
        protected GetIndividualDetailsViewResponse.Individual.ContactPersons contactPersons;
        @XmlElement(required = true)
        protected String indigenousStatus;

        /**
         * Gets the value of the dateAccuracyIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link DateAccuracyIndicatorType }
         *     
         */
        public DateAccuracyIndicatorType getDateAccuracyIndicatorType() {
            return dateAccuracyIndicatorType;
        }

        /**
         * Sets the value of the dateAccuracyIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAccuracyIndicatorType }
         *     
         */
        public void setDateAccuracyIndicatorType(DateAccuracyIndicatorType value) {
            this.dateAccuracyIndicatorType = value;
        }

        /**
         * Gets the value of the ihiRecordStatus property.
         * 
         * @return
         *     possible object is
         *     {@link RecordStatusType }
         *     
         */
        public RecordStatusType getIhiRecordStatus() {
            return ihiRecordStatus;
        }

        /**
         * Sets the value of the ihiRecordStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecordStatusType }
         *     
         */
        public void setIhiRecordStatus(RecordStatusType value) {
            this.ihiRecordStatus = value;
        }

        /**
         * Gets the value of the ihiStatus property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getIhiStatus() {
            return ihiStatus;
        }

        /**
         * Sets the value of the ihiStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setIhiStatus(StatusType value) {
            this.ihiStatus = value;
        }

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

        /**
         * Gets the value of the contactPersons property.
         * 
         * @return
         *     possible object is
         *     {@link GetIndividualDetailsViewResponse.Individual.ContactPersons }
         *     
         */
        public GetIndividualDetailsViewResponse.Individual.ContactPersons getContactPersons() {
            return contactPersons;
        }

        /**
         * Sets the value of the contactPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetIndividualDetailsViewResponse.Individual.ContactPersons }
         *     
         */
        public void setContactPersons(GetIndividualDetailsViewResponse.Individual.ContactPersons value) {
            this.contactPersons = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="contactPerson" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactPersonTypeSupp" maxOccurs="unbounded"/>
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
            "contactPersons"
        })
        public static class ContactPersons {

            @XmlElement(name = "contactPerson", required = true)
            protected List<ContactPersonTypeSupp> contactPersons;

            /**
             * Gets the value of the contactPersons property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contactPersons property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContactPersons().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactPersonTypeSupp }
             * 
             * 
             */
            public List<ContactPersonTypeSupp> getContactPersons() {
                if (contactPersons == null) {
                    contactPersons = new ArrayList<ContactPersonTypeSupp>();
                }
                return this.contactPersons;
            }

        }

    }

}
