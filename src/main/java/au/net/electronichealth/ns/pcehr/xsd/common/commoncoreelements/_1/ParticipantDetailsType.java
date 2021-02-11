
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for participantDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessingHPIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accessingHPIOName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="participatingHPIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="participatingHPIOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayRole" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "participantDetailsType", propOrder = {
    "providerID",
    "providerName",
    "accessingHPIO",
    "accessingHPIOName",
    "participatingHPIO",
    "participatingHPIOName",
    "userID",
    "userName",
    "displayRole"
})
public class ParticipantDetailsType {

    protected String providerID;
    protected String providerName;
    protected String accessingHPIO;
    protected String accessingHPIOName;
    protected String participatingHPIO;
    protected String participatingHPIOName;
    protected String userID;
    protected String userName;
    protected String displayRole;

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the accessingHPIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessingHPIO() {
        return accessingHPIO;
    }

    /**
     * Sets the value of the accessingHPIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessingHPIO(String value) {
        this.accessingHPIO = value;
    }

    /**
     * Gets the value of the accessingHPIOName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessingHPIOName() {
        return accessingHPIOName;
    }

    /**
     * Sets the value of the accessingHPIOName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessingHPIOName(String value) {
        this.accessingHPIOName = value;
    }

    /**
     * Gets the value of the participatingHPIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipatingHPIO() {
        return participatingHPIO;
    }

    /**
     * Sets the value of the participatingHPIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipatingHPIO(String value) {
        this.participatingHPIO = value;
    }

    /**
     * Gets the value of the participatingHPIOName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipatingHPIOName() {
        return participatingHPIOName;
    }

    /**
     * Sets the value of the participatingHPIOName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipatingHPIOName(String value) {
        this.participatingHPIOName = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the displayRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayRole() {
        return displayRole;
    }

    /**
     * Sets the value of the displayRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayRole(String value) {
        this.displayRole = value;
    }

}
