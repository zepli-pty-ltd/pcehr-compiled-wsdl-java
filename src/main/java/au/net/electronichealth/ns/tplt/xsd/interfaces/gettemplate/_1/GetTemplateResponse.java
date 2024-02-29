
package au.net.electronichealth.ns.tplt.xsd.interfaces.gettemplate._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateMetadataType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateUsageMetadataType;


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
 *         &lt;element name="responseStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/>
 *         &lt;element name="template" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType"/>
 *                   &lt;element name="usageMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateUsageMetadataType" minOccurs="0"/>
 *                   &lt;element name="package">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="persistInCacheExpiry" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "responseStatus",
    "template",
    "persistInCacheExpiry"
})
@XmlRootElement(name = "getTemplateResponse")
public class GetTemplateResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    protected GetTemplateResponse.Template template;
    protected XMLGregorianCalendar persistInCacheExpiry;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link GetTemplateResponse.Template }
     *     
     */
    public GetTemplateResponse.Template getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTemplateResponse.Template }
     *     
     */
    public void setTemplate(GetTemplateResponse.Template value) {
        this.template = value;
    }

    /**
     * Gets the value of the persistInCacheExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersistInCacheExpiry() {
        return persistInCacheExpiry;
    }

    /**
     * Sets the value of the persistInCacheExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersistInCacheExpiry(XMLGregorianCalendar value) {
        this.persistInCacheExpiry = value;
    }


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
     *         &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType"/>
     *         &lt;element name="usageMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateUsageMetadataType" minOccurs="0"/>
     *         &lt;element name="package">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "templateMetadata",
        "usageMetadata",
        "_package"
    })
    public static class Template {

        @XmlElement(required = true)
        protected TemplateMetadataType templateMetadata;
        protected TemplateUsageMetadataType usageMetadata;
        @XmlElement(name = "package", required = true)
        protected byte[] _package;

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

        /**
         * Gets the value of the usageMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateUsageMetadataType }
         *     
         */
        public TemplateUsageMetadataType getUsageMetadata() {
            return usageMetadata;
        }

        /**
         * Sets the value of the usageMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateUsageMetadataType }
         *     
         */
        public void setUsageMetadata(TemplateUsageMetadataType value) {
            this.usageMetadata = value;
        }

        /**
         * Gets the value of the package property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getPackage() {
            return _package;
        }

        /**
         * Sets the value of the package property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setPackage(byte[] value) {
            this._package = value;
        }

    }

}
