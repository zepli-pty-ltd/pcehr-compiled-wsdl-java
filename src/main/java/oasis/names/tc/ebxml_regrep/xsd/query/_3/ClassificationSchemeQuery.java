
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationSchemeQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSchemeQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="ChildrenQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NodeTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeQueryType", propOrder = {
    "childrenQueries",
    "nodeTypeQuery"
})
@XmlRootElement(name = "ClassificationSchemeQuery")
public class ClassificationSchemeQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ChildrenQuery")
    protected List<ClassificationNodeQuery> childrenQueries;
    @XmlElement(name = "NodeTypeQuery")
    protected ClassificationNodeQuery nodeTypeQuery;

    /**
     * Gets the value of the childrenQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationNodeQuery }
     * 
     * 
     */
    public List<ClassificationNodeQuery> getChildrenQueries() {
        if (childrenQueries == null) {
            childrenQueries = new ArrayList<ClassificationNodeQuery>();
        }
        return this.childrenQueries;
    }

    /**
     * Gets the value of the nodeTypeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getNodeTypeQuery() {
        return nodeTypeQuery;
    }

    /**
     * Sets the value of the nodeTypeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setNodeTypeQuery(ClassificationNodeQuery value) {
        this.nodeTypeQuery = value;
    }

}
