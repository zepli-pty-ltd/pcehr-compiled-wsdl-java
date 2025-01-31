
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificationLinkQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificationLinkQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="UsageDescriptionBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}InternationalStringBranchType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceBindingQuery" minOccurs="0"/>
 *         &lt;element name="SpecificationObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationLinkQueryType", propOrder = {
    "usageDescriptionBranch",
    "serviceBindingQuery",
    "specificationObjectQuery"
})
@XmlRootElement(name = "SpecificationLinkQuery")
public class SpecificationLinkQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "UsageDescriptionBranch")
    protected InternationalStringBranchType usageDescriptionBranch;
    @XmlElement(name = "ServiceBindingQuery")
    protected ServiceBindingQuery serviceBindingQuery;
    @XmlElement(name = "SpecificationObjectQuery")
    protected RegistryObjectQueryType specificationObjectQuery;

    /**
     * Gets the value of the usageDescriptionBranch property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public InternationalStringBranchType getUsageDescriptionBranch() {
        return usageDescriptionBranch;
    }

    /**
     * Sets the value of the usageDescriptionBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public void setUsageDescriptionBranch(InternationalStringBranchType value) {
        this.usageDescriptionBranch = value;
    }

    /**
     * Gets the value of the serviceBindingQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBindingQuery }
     *     
     */
    public ServiceBindingQuery getServiceBindingQuery() {
        return serviceBindingQuery;
    }

    /**
     * Sets the value of the serviceBindingQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBindingQuery }
     *     
     */
    public void setServiceBindingQuery(ServiceBindingQuery value) {
        this.serviceBindingQuery = value;
    }

    /**
     * Gets the value of the specificationObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getSpecificationObjectQuery() {
        return specificationObjectQuery;
    }

    /**
     * Sets the value of the specificationObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setSpecificationObjectQuery(RegistryObjectQueryType value) {
        this.specificationObjectQuery = value;
    }

}
