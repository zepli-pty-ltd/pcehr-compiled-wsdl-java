
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="AssociationTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/>
 *         &lt;element name="SourceObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/>
 *         &lt;element name="TargetObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationQueryType", propOrder = {
    "associationTypeQuery",
    "sourceObjectQuery",
    "targetObjectQuery"
})
@XmlRootElement(name = "AssociationQuery")
public class AssociationQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AssociationTypeQuery")
    protected ClassificationNodeQuery associationTypeQuery;
    @XmlElement(name = "SourceObjectQuery")
    protected RegistryObjectQueryType sourceObjectQuery;
    @XmlElement(name = "TargetObjectQuery")
    protected RegistryObjectQueryType targetObjectQuery;

    /**
     * Gets the value of the associationTypeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getAssociationTypeQuery() {
        return associationTypeQuery;
    }

    /**
     * Sets the value of the associationTypeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setAssociationTypeQuery(ClassificationNodeQuery value) {
        this.associationTypeQuery = value;
    }

    /**
     * Gets the value of the sourceObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getSourceObjectQuery() {
        return sourceObjectQuery;
    }

    /**
     * Sets the value of the sourceObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setSourceObjectQuery(RegistryObjectQueryType value) {
        this.sourceObjectQuery = value;
    }

    /**
     * Gets the value of the targetObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getTargetObjectQuery() {
        return targetObjectQuery;
    }

    /**
     * Sets the value of the targetObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setTargetObjectQuery(RegistryObjectQueryType value) {
        this.targetObjectQuery = value;
    }

}
