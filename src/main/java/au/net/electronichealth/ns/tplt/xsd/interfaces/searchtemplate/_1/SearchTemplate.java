
package au.net.electronichealth.ns.tplt.xsd.interfaces.searchtemplate._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateMetadataType;


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
 *         &lt;element name="templateID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType" minOccurs="0"/>
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
    "templateID",
    "templateMetadata"
})
@XmlRootElement(name = "searchTemplate")
public class SearchTemplate {

    protected String templateID;
    protected TemplateMetadataType templateMetadata;

    /**
     * Gets the value of the templateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Gets the value of the templateMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateMetadataType }
     *     
     */
    public TemplateMetadataType getTemplateMetadata() {
        return templateMetadata;
    }

    /**
     * Sets the value of the templateMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateMetadataType }
     *     
     */
    public void setTemplateMetadata(TemplateMetadataType value) {
        this.templateMetadata = value;
    }

}
