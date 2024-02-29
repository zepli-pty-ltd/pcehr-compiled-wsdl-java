
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/>
 *         &lt;element name="participatingOrganisation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/>
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
@XmlType(name = "organisationType", propOrder = {
    "ihiNumber",
    "names",
    "organisationServices",
    "participatingOrganisations"
})
public class OrganisationType {

    @XmlElement(required = true)
    protected String ihiNumber;
    @XmlElement(name = "name", required = true)
    protected List<String> names;
    @XmlElement(name = "organisationService", required = true)
    protected List<OrganisationServiceType> organisationServices;
    @XmlElement(name = "participatingOrganisation")
    protected List<OrganisationType.ParticipatingOrganisation> participatingOrganisations;

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
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNames() {
        if (names == null) {
            names = new ArrayList<String>();
        }
        return this.names;
    }

    /**
     * Gets the value of the organisationServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceType }
     * 
     * 
     */
    public List<OrganisationServiceType> getOrganisationServices() {
        if (organisationServices == null) {
            organisationServices = new ArrayList<OrganisationServiceType>();
        }
        return this.organisationServices;
    }

    /**
     * Gets the value of the participatingOrganisations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingOrganisations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingOrganisations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationType.ParticipatingOrganisation }
     * 
     * 
     */
    public List<OrganisationType.ParticipatingOrganisation> getParticipatingOrganisations() {
        if (participatingOrganisations == null) {
            participatingOrganisations = new ArrayList<OrganisationType.ParticipatingOrganisation>();
        }
        return this.participatingOrganisations;
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
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/>
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
        "names",
        "organisationServices"
    })
    public static class ParticipatingOrganisation {

        @XmlElement(required = true)
        protected String ihiNumber;
        @XmlElement(name = "name", required = true)
        protected List<String> names;
        @XmlElement(name = "organisationService", required = true)
        protected List<OrganisationServiceType> organisationServices;

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
         * Gets the value of the names property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the names property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNames() {
            if (names == null) {
                names = new ArrayList<String>();
            }
            return this.names;
        }

        /**
         * Gets the value of the organisationServices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organisationServices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganisationServices().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganisationServiceType }
         * 
         * 
         */
        public List<OrganisationServiceType> getOrganisationServices() {
            if (organisationServices == null) {
                organisationServices = new ArrayList<OrganisationServiceType>();
            }
            return this.organisationServices;
        }

    }

}
