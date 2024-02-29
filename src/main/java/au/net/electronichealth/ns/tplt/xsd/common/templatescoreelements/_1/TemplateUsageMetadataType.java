
package au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for templateUsageMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="templateUsageMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PCEHRAcceptedStartDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PCEHRAcceptedEndDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="containsPCEHRAtomicData" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *               &lt;whiteSpace value="collapse"/>
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
@XmlType(name = "templateUsageMetadataType", propOrder = {
    "pcehrAcceptedStartDate",
    "pcehrAcceptedEndDate",
    "containsPCEHRAtomicData"
})
public class TemplateUsageMetadataType {

    @XmlElement(name = "PCEHRAcceptedStartDate", required = true)
    protected XMLGregorianCalendar pcehrAcceptedStartDate;
    @XmlElement(name = "PCEHRAcceptedEndDate")
    protected XMLGregorianCalendar pcehrAcceptedEndDate;
    protected Boolean containsPCEHRAtomicData;

    /**
     * Gets the value of the pcehrAcceptedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCEHRAcceptedStartDate() {
        return pcehrAcceptedStartDate;
    }

    /**
     * Sets the value of the pcehrAcceptedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCEHRAcceptedStartDate(XMLGregorianCalendar value) {
        this.pcehrAcceptedStartDate = value;
    }

    /**
     * Gets the value of the pcehrAcceptedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCEHRAcceptedEndDate() {
        return pcehrAcceptedEndDate;
    }

    /**
     * Sets the value of the pcehrAcceptedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCEHRAcceptedEndDate(XMLGregorianCalendar value) {
        this.pcehrAcceptedEndDate = value;
    }

    /**
     * Gets the value of the containsPCEHRAtomicData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsPCEHRAtomicData() {
        return containsPCEHRAtomicData;
    }

    /**
     * Sets the value of the containsPCEHRAtomicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsPCEHRAtomicData(Boolean value) {
        this.containsPCEHRAtomicData = value;
    }

}
