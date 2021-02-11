
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getrepresentativelist._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.AddressTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.NameTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;


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
 *         &lt;element name="PCEHRRecord" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="representativeList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="representative" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="Authorised Representative"/>
 *                                             &lt;enumeration value="Legally Appointed Authorised Representative"/>
 *                                             &lt;enumeration value="Parent"/>
 *                                             &lt;enumeration value="Guardian"/>
 *                                             &lt;enumeration value="Nominated Representative"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/>
 *                                       &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/>
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
    "responseStatus",
    "pcehrRecord"
})
@XmlRootElement(name = "getRepresentativeListResponse")
public class GetRepresentativeListResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "PCEHRRecord")
    protected GetRepresentativeListResponse.PCEHRRecord pcehrRecord;

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
     * Gets the value of the pcehrRecord property.
     * 
     * @return
     *     possible object is
     *     {@link GetRepresentativeListResponse.PCEHRRecord }
     *     
     */
    public GetRepresentativeListResponse.PCEHRRecord getPCEHRRecord() {
        return pcehrRecord;
    }

    /**
     * Sets the value of the pcehrRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRepresentativeListResponse.PCEHRRecord }
     *     
     */
    public void setPCEHRRecord(GetRepresentativeListResponse.PCEHRRecord value) {
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
     *         &lt;element name="representativeList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="representative" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="type">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="Authorised Representative"/>
     *                                   &lt;enumeration value="Legally Appointed Authorised Representative"/>
     *                                   &lt;enumeration value="Parent"/>
     *                                   &lt;enumeration value="Guardian"/>
     *                                   &lt;enumeration value="Nominated Representative"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/>
     *                             &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/>
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
        "representativeList"
    })
    public static class PCEHRRecord {

        @XmlElement(required = true)
        protected GetRepresentativeListResponse.PCEHRRecord.RepresentativeList representativeList;

        /**
         * Gets the value of the representativeList property.
         * 
         * @return
         *     possible object is
         *     {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList }
         *     
         */
        public GetRepresentativeListResponse.PCEHRRecord.RepresentativeList getRepresentativeList() {
            return representativeList;
        }

        /**
         * Sets the value of the representativeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList }
         *     
         */
        public void setRepresentativeList(GetRepresentativeListResponse.PCEHRRecord.RepresentativeList value) {
            this.representativeList = value;
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
         *         &lt;element name="representative" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="type">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="Authorised Representative"/>
         *                         &lt;enumeration value="Legally Appointed Authorised Representative"/>
         *                         &lt;enumeration value="Parent"/>
         *                         &lt;enumeration value="Guardian"/>
         *                         &lt;enumeration value="Nominated Representative"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/>
         *                   &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/>
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
            "representatives"
        })
        public static class RepresentativeList {

            @XmlElement(name = "representative", required = true)
            protected List<GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative> representatives;

            /**
             * Gets the value of the representatives property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the representatives property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRepresentatives().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative }
             * 
             * 
             */
            public List<GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative> getRepresentatives() {
                if (representatives == null) {
                    representatives = new ArrayList<GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative>();
                }
                return this.representatives;
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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="type">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="Authorised Representative"/>
             *               &lt;enumeration value="Legally Appointed Authorised Representative"/>
             *               &lt;enumeration value="Parent"/>
             *               &lt;enumeration value="Guardian"/>
             *               &lt;enumeration value="Nominated Representative"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/>
             *         &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/>
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
                "id",
                "type",
                "name",
                "address"
            })
            public static class Representative {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected NameTypeSupp name;
                protected AddressTypeSupp address;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

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
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameTypeSupp }
                 *     
                 */
                public NameTypeSupp getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameTypeSupp }
                 *     
                 */
                public void setName(NameTypeSupp value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressTypeSupp }
                 *     
                 */
                public AddressTypeSupp getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressTypeSupp }
                 *     
                 */
                public void setAddress(AddressTypeSupp value) {
                    this.address = value;
                }

            }

        }

    }

}
