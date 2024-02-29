
package au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for informationAvailableDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informationAvailableDT">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType">
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="flavor">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="other"/>
 *             &lt;enumeration value="problem"/>
 *             &lt;enumeration value="procedure"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informationAvailableDT")
public class InformationAvailableDT
    extends CodedType
{

    @XmlAttribute(name = "value", required = true)
    protected boolean value;
    @XmlAttribute(name = "flavor")
    protected String flavor;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the flavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the value of the flavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavor(String value) {
        this.flavor = value;
    }

}
