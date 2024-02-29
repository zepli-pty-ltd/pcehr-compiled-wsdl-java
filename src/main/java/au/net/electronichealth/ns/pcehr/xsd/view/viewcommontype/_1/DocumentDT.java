
package au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentDT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="documentTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentTypeCode" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
 *         &lt;element name="documentAuthorPersonName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}nameTypeDT"/>
 *         &lt;element name="documentAuthorPersonIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentAuthorRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentAuthorOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentAuthorOrganisationIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="16"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="clinicalSynopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentDT", propOrder = {
    "effectiveDateTime",
    "documentLink",
    "documentTypeName",
    "documentTypeCode",
    "documentAuthorPersonName",
    "documentAuthorPersonIdentifier",
    "documentAuthorRole",
    "documentAuthorOrganisationName",
    "documentAuthorOrganisationIdentifier",
    "clinicalSynopsis"
})
public class DocumentDT {

    @XmlElement(required = true)
    protected String effectiveDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentLink;
    @XmlElement(required = true)
    protected String documentTypeName;
    @XmlElement(required = true)
    protected CodedType documentTypeCode;
    @XmlElement(required = true)
    protected NameTypeDT documentAuthorPersonName;
    @XmlElement(required = true)
    protected String documentAuthorPersonIdentifier;
    @XmlElement(required = true)
    protected String documentAuthorRole;
    @XmlElement(required = true)
    protected String documentAuthorOrganisationName;
    @XmlElement(required = true)
    protected String documentAuthorOrganisationIdentifier;
    protected String clinicalSynopsis;

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDateTime(String value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the documentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLink() {
        return documentLink;
    }

    /**
     * Sets the value of the documentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLink(String value) {
        this.documentLink = value;
    }

    /**
     * Gets the value of the documentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeName() {
        return documentTypeName;
    }

    /**
     * Sets the value of the documentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeName(String value) {
        this.documentTypeName = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodedType }
     *     
     */
    public CodedType getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedType }
     *     
     */
    public void setDocumentTypeCode(CodedType value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the documentAuthorPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeDT }
     *     
     */
    public NameTypeDT getDocumentAuthorPersonName() {
        return documentAuthorPersonName;
    }

    /**
     * Sets the value of the documentAuthorPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeDT }
     *     
     */
    public void setDocumentAuthorPersonName(NameTypeDT value) {
        this.documentAuthorPersonName = value;
    }

    /**
     * Gets the value of the documentAuthorPersonIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentAuthorPersonIdentifier() {
        return documentAuthorPersonIdentifier;
    }

    /**
     * Sets the value of the documentAuthorPersonIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentAuthorPersonIdentifier(String value) {
        this.documentAuthorPersonIdentifier = value;
    }

    /**
     * Gets the value of the documentAuthorRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentAuthorRole() {
        return documentAuthorRole;
    }

    /**
     * Sets the value of the documentAuthorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentAuthorRole(String value) {
        this.documentAuthorRole = value;
    }

    /**
     * Gets the value of the documentAuthorOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentAuthorOrganisationName() {
        return documentAuthorOrganisationName;
    }

    /**
     * Sets the value of the documentAuthorOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentAuthorOrganisationName(String value) {
        this.documentAuthorOrganisationName = value;
    }

    /**
     * Gets the value of the documentAuthorOrganisationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentAuthorOrganisationIdentifier() {
        return documentAuthorOrganisationIdentifier;
    }

    /**
     * Sets the value of the documentAuthorOrganisationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentAuthorOrganisationIdentifier(String value) {
        this.documentAuthorOrganisationIdentifier = value;
    }

    /**
     * Gets the value of the clinicalSynopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalSynopsis() {
        return clinicalSynopsis;
    }

    /**
     * Sets the value of the clinicalSynopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalSynopsis(String value) {
        this.clinicalSynopsis = value;
    }

}
