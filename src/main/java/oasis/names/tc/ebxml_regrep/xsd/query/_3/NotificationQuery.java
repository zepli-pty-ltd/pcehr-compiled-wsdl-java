
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationQueryType", propOrder = {
    "registryObjectQuery"
})
@XmlRootElement(name = "NotificationQuery")
public class NotificationQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "RegistryObjectQuery")
    protected RegistryObjectQueryType registryObjectQuery;

    /**
     * Gets the value of the registryObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getRegistryObjectQuery() {
        return registryObjectQuery;
    }

    /**
     * Sets the value of the registryObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setRegistryObjectQuery(RegistryObjectQueryType value) {
        this.registryObjectQuery = value;
    }

}
