
package au.net.electronichealth.ns.pcehr.xsd.interfaces.observationview._1;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.gov.nehta.schema.DateAdapter;


/**
 * <p>Java class for observationView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="observationView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="observationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="HEADCIRCUMFERENCE"/>
 *               &lt;enumeration value="HEIGHT"/>
 *               &lt;enumeration value="WEIGHT"/>
 *               &lt;enumeration value="BMI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="documentSource">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PERSONAL"/>
 *               &lt;enumeration value="PROVIDER"/>
 *               &lt;enumeration value="ALL"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="referenceData">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CDC"/>
 *               &lt;enumeration value="WHO"/>
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
@XmlType(name = "observationView", propOrder = {
    "versionNumber",
    "fromDate",
    "toDate",
    "observationType",
    "documentSource",
    "referenceData"
})
@XmlRootElement(name = "observationView")
public class ObservationView {

    @XmlElement(required = true)
    protected String versionNumber;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar fromDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar toDate;
    @XmlElement(required = true)
    protected String observationType;
    @XmlElement(required = true)
    protected String documentSource;
    @XmlElement(required = true)
    protected String referenceData;

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(Calendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(Calendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the observationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationType() {
        return observationType;
    }

    /**
     * Sets the value of the observationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationType(String value) {
        this.observationType = value;
    }

    /**
     * Gets the value of the documentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSource() {
        return documentSource;
    }

    /**
     * Sets the value of the documentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSource(String value) {
        this.documentSource = value;
    }

    /**
     * Gets the value of the referenceData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData() {
        return referenceData;
    }

    /**
     * Sets the value of the referenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData(String value) {
        this.referenceData = value;
    }

}
