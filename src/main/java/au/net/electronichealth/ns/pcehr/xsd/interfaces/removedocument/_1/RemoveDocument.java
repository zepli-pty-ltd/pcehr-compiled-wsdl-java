
package au.net.electronichealth.ns.pcehr.xsd.interfaces.removedocument._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="documentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonForRemoval">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Withdrawn"/>
 *               &lt;enumeration value="ElectToRemove"/>
 *               &lt;enumeration value="IncorrectIdentity"/>
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
    "documentID",
    "reasonForRemoval"
})
@XmlRootElement(name = "removeDocument")
public class RemoveDocument {

    @XmlElement(required = true)
    protected String documentID;
    @XmlElement(required = true)
    protected RemoveDocument.DocumentRemovalReason reasonForRemoval;

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the reasonForRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveDocument.DocumentRemovalReason }
     *     
     */
    public RemoveDocument.DocumentRemovalReason getReasonForRemoval() {
        return reasonForRemoval;
    }

    /**
     * Sets the value of the reasonForRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveDocument.DocumentRemovalReason }
     *     
     */
    public void setReasonForRemoval(RemoveDocument.DocumentRemovalReason value) {
        this.reasonForRemoval = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="Withdrawn"/>
     *     &lt;enumeration value="ElectToRemove"/>
     *     &lt;enumeration value="IncorrectIdentity"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum DocumentRemovalReason {

        @XmlEnumValue("Withdrawn")
        WITHDRAWN("Withdrawn"),
        @XmlEnumValue("ElectToRemove")
        ELECT_TO_REMOVE("ElectToRemove"),
        @XmlEnumValue("IncorrectIdentity")
        INCORRECT_IDENTITY("IncorrectIdentity");
        private final String value;

        DocumentRemovalReason(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static RemoveDocument.DocumentRemovalReason fromValue(String v) {
            for (RemoveDocument.DocumentRemovalReason c: RemoveDocument.DocumentRemovalReason.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
