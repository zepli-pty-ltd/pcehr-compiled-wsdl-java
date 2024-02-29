
package au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerInformationDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerInformationDT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="healthcareProviderOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="healthcareProviderOrganisationIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="16"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="healthcareProviderName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}nameTypeDT"/>
 *         &lt;element name="healthcareProviderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="healthcareProviderRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerInformationDT", propOrder = {
    "healthcareProviderOrganisationName",
    "healthcareProviderOrganisationIdentifier",
    "healthcareProviderName",
    "healthcareProviderIdentifier",
    "healthcareProviderRole"
})
public class ProviderInformationDT {

    @XmlElement(required = true)
    protected String healthcareProviderOrganisationName;
    @XmlElement(required = true)
    protected String healthcareProviderOrganisationIdentifier;
    @XmlElement(required = true)
    protected NameTypeDT healthcareProviderName;
    protected String healthcareProviderIdentifier;
    protected String healthcareProviderRole;

    /**
     * Gets the value of the healthcareProviderOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProviderOrganisationName() {
        return healthcareProviderOrganisationName;
    }

    /**
     * Sets the value of the healthcareProviderOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProviderOrganisationName(String value) {
        this.healthcareProviderOrganisationName = value;
    }

    /**
     * Gets the value of the healthcareProviderOrganisationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProviderOrganisationIdentifier() {
        return healthcareProviderOrganisationIdentifier;
    }

    /**
     * Sets the value of the healthcareProviderOrganisationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProviderOrganisationIdentifier(String value) {
        this.healthcareProviderOrganisationIdentifier = value;
    }

    /**
     * Gets the value of the healthcareProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeDT }
     *     
     */
    public NameTypeDT getHealthcareProviderName() {
        return healthcareProviderName;
    }

    /**
     * Sets the value of the healthcareProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeDT }
     *     
     */
    public void setHealthcareProviderName(NameTypeDT value) {
        this.healthcareProviderName = value;
    }

    /**
     * Gets the value of the healthcareProviderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProviderIdentifier() {
        return healthcareProviderIdentifier;
    }

    /**
     * Sets the value of the healthcareProviderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProviderIdentifier(String value) {
        this.healthcareProviderIdentifier = value;
    }

    /**
     * Gets the value of the healthcareProviderRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthcareProviderRole() {
        return healthcareProviderRole;
    }

    /**
     * Sets the value of the healthcareProviderRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthcareProviderRole(String value) {
        this.healthcareProviderRole = value;
    }

}
