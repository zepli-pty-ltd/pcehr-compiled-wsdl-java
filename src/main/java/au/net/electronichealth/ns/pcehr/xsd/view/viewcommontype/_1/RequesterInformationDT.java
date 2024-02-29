
package au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requesterInformationDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requesterInformationDT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeRequested" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerOrganisationIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="16"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="providerName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}nameTypeDT"/>
 *         &lt;element name="providerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requesterInformationDT", propOrder = {
    "testRequestId",
    "dateTimeRequested",
    "providerOrganisationName",
    "providerOrganisationIdentifier",
    "providerName",
    "providerIdentifier"
})
public class RequesterInformationDT {

    protected String testRequestId;
    @XmlElement(required = true)
    protected String dateTimeRequested;
    protected String providerOrganisationName;
    protected String providerOrganisationIdentifier;
    @XmlElement(required = true)
    protected NameTypeDT providerName;
    protected String providerIdentifier;

    /**
     * Gets the value of the testRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestRequestId() {
        return testRequestId;
    }

    /**
     * Sets the value of the testRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestRequestId(String value) {
        this.testRequestId = value;
    }

    /**
     * Gets the value of the dateTimeRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeRequested() {
        return dateTimeRequested;
    }

    /**
     * Sets the value of the dateTimeRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeRequested(String value) {
        this.dateTimeRequested = value;
    }

    /**
     * Gets the value of the providerOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOrganisationName() {
        return providerOrganisationName;
    }

    /**
     * Sets the value of the providerOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOrganisationName(String value) {
        this.providerOrganisationName = value;
    }

    /**
     * Gets the value of the providerOrganisationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOrganisationIdentifier() {
        return providerOrganisationIdentifier;
    }

    /**
     * Sets the value of the providerOrganisationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOrganisationIdentifier(String value) {
        this.providerOrganisationIdentifier = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeDT }
     *     
     */
    public NameTypeDT getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeDT }
     *     
     */
    public void setProviderName(NameTypeDT value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the providerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderIdentifier() {
        return providerIdentifier;
    }

    /**
     * Sets the value of the providerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderIdentifier(String value) {
        this.providerIdentifier = value;
    }

}
