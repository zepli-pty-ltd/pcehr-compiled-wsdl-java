
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="OperatorQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryQueryType", propOrder = {
    "operatorQuery"
})
@XmlRootElement(name = "RegistryQuery")
public class RegistryQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "OperatorQuery")
    protected OrganizationQuery operatorQuery;

    /**
     * Gets the value of the operatorQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQuery }
     *     
     */
    public OrganizationQuery getOperatorQuery() {
        return operatorQuery;
    }

    /**
     * Sets the value of the operatorQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQuery }
     *     
     */
    public void setOperatorQuery(OrganizationQuery value) {
        this.operatorQuery = value;
    }

}
