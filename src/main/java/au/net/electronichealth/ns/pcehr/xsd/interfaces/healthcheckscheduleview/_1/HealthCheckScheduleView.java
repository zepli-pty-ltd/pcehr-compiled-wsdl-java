
package au.net.electronichealth.ns.pcehr.xsd.interfaces.healthcheckscheduleview._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for healthCheckScheduleView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthCheckScheduleView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jurisdiction">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NSW"/>
 *               &lt;enumeration value="QLD"/>
 *               &lt;enumeration value="ACT"/>
 *               &lt;enumeration value="NT"/>
 *               &lt;enumeration value="VIC"/>
 *               &lt;enumeration value="WA"/>
 *               &lt;enumeration value="TAS"/>
 *               &lt;enumeration value="SA"/>
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
@XmlType(name = "healthCheckScheduleView", propOrder = {
    "versionNumber",
    "jurisdiction"
})
@XmlRootElement(name = "healthCheckScheduleView")
public class HealthCheckScheduleView {

    @XmlElement(required = true)
    protected String versionNumber;
    @XmlElement(required = true)
    protected String jurisdiction;

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
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

}
