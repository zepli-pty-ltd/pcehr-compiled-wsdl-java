
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getview._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "view"
})
@XmlRootElement(name = "getView")
public class GetView {

    @XmlElement(required = true)
    protected Object view;

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setView(Object value) {
        this.view = value;
    }

}
