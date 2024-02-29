
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtrinsicObjectQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtrinsicObjectQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="ContentVersionInfoFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrinsicObjectQueryType", propOrder = {
    "contentVersionInfoFilter"
})
@XmlRootElement(name = "ExtrinsicObjectQuery")
public class ExtrinsicObjectQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ContentVersionInfoFilter")
    protected FilterType contentVersionInfoFilter;

    /**
     * Gets the value of the contentVersionInfoFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getContentVersionInfoFilter() {
        return contentVersionInfoFilter;
    }

    /**
     * Sets the value of the contentVersionInfoFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setContentVersionInfoFilter(FilterType value) {
        this.contentVersionInfoFilter = value;
    }

}
