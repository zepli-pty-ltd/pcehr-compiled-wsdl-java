
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdhocQueryQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdhocQueryQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="QueryExpressionBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}QueryExpressionBranchType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocQueryQueryType", propOrder = {
    "queryExpressionBranch"
})
@XmlRootElement(name = "AdhocQueryQuery")
public class AdhocQueryQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "QueryExpressionBranch")
    protected QueryExpressionBranchType queryExpressionBranch;

    /**
     * Gets the value of the queryExpressionBranch property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionBranchType }
     *     
     */
    public QueryExpressionBranchType getQueryExpressionBranch() {
        return queryExpressionBranch;
    }

    /**
     * Sets the value of the queryExpressionBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionBranchType }
     *     
     */
    public void setQueryExpressionBranch(QueryExpressionBranchType value) {
        this.queryExpressionBranch = value;
    }

}
