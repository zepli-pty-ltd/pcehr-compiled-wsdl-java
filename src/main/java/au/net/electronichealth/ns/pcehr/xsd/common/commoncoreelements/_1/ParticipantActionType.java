
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for participantActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Create"/>
 *               &lt;enumeration value="Read"/>
 *               &lt;enumeration value="Update"/>
 *               &lt;enumeration value="Delete"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="operationPerformed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="IncorrectIdentity"/>
 *               &lt;enumeration value="MedicalInaccuracy"/>
 *               &lt;enumeration value="ElectToRemove"/>
 *               &lt;enumeration value="IHIStatusIsDeceased"/>
 *               &lt;enumeration value="NoLegallyAppointmentAuthorised"/>
 *               &lt;enumeration value="NoOwnershipOfPCEHR"/>
 *               &lt;enumeration value="IHINotActive"/>
 *               &lt;enumeration value="IHINotVerified"/>
 *               &lt;enumeration value="TermsAndConditionsWereNotAccepted"/>
 *               &lt;enumeration value="Death"/>
 *               &lt;enumeration value="WithdrawalFromParticipation"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="approvalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvalRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusPriorDeactivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participantActionType", propOrder = {
    "actionType",
    "operationPerformed",
    "reason",
    "approvalDateTime",
    "approvalRole",
    "approvalName",
    "statusPriorDeactivation"
})
public class ParticipantActionType {

    protected ParticipantActionType.ActionType actionType;
    protected String operationPerformed;
    protected ParticipantActionType.Reason reason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDateTime;
    protected String approvalRole;
    protected String approvalName;
    protected String statusPriorDeactivation;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantActionType.ActionType }
     *     
     */
    public ParticipantActionType.ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantActionType.ActionType }
     *     
     */
    public void setActionType(ParticipantActionType.ActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the operationPerformed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationPerformed() {
        return operationPerformed;
    }

    /**
     * Sets the value of the operationPerformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationPerformed(String value) {
        this.operationPerformed = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantActionType.Reason }
     *     
     */
    public ParticipantActionType.Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantActionType.Reason }
     *     
     */
    public void setReason(ParticipantActionType.Reason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the approvalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDateTime() {
        return approvalDateTime;
    }

    /**
     * Sets the value of the approvalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDateTime(XMLGregorianCalendar value) {
        this.approvalDateTime = value;
    }

    /**
     * Gets the value of the approvalRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalRole() {
        return approvalRole;
    }

    /**
     * Sets the value of the approvalRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalRole(String value) {
        this.approvalRole = value;
    }

    /**
     * Gets the value of the approvalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalName() {
        return approvalName;
    }

    /**
     * Sets the value of the approvalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalName(String value) {
        this.approvalName = value;
    }

    /**
     * Gets the value of the statusPriorDeactivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPriorDeactivation() {
        return statusPriorDeactivation;
    }

    /**
     * Sets the value of the statusPriorDeactivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPriorDeactivation(String value) {
        this.statusPriorDeactivation = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="Create"/>
     *     &lt;enumeration value="Read"/>
     *     &lt;enumeration value="Update"/>
     *     &lt;enumeration value="Delete"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ActionType {

        @XmlEnumValue("Create")
        CREATE("Create"),
        @XmlEnumValue("Read")
        READ("Read"),
        @XmlEnumValue("Update")
        UPDATE("Update"),
        @XmlEnumValue("Delete")
        DELETE("Delete");
        private final String value;

        ActionType(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static ParticipantActionType.ActionType fromValue(String v) {
            for (ParticipantActionType.ActionType c: ParticipantActionType.ActionType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="IncorrectIdentity"/>
     *     &lt;enumeration value="MedicalInaccuracy"/>
     *     &lt;enumeration value="ElectToRemove"/>
     *     &lt;enumeration value="IHIStatusIsDeceased"/>
     *     &lt;enumeration value="NoLegallyAppointmentAuthorised"/>
     *     &lt;enumeration value="NoOwnershipOfPCEHR"/>
     *     &lt;enumeration value="IHINotActive"/>
     *     &lt;enumeration value="IHINotVerified"/>
     *     &lt;enumeration value="TermsAndConditionsWereNotAccepted"/>
     *     &lt;enumeration value="Death"/>
     *     &lt;enumeration value="WithdrawalFromParticipation"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Reason {

        @XmlEnumValue("IncorrectIdentity")
        INCORRECT_IDENTITY("IncorrectIdentity"),
        @XmlEnumValue("MedicalInaccuracy")
        MEDICAL_INACCURACY("MedicalInaccuracy"),
        @XmlEnumValue("ElectToRemove")
        ELECT_TO_REMOVE("ElectToRemove"),
        @XmlEnumValue("IHIStatusIsDeceased")
        IHI_STATUS_IS_DECEASED("IHIStatusIsDeceased"),
        @XmlEnumValue("NoLegallyAppointmentAuthorised")
        NO_LEGALLY_APPOINTMENT_AUTHORISED("NoLegallyAppointmentAuthorised"),
        @XmlEnumValue("NoOwnershipOfPCEHR")
        NO_OWNERSHIP_OF_PCEHR("NoOwnershipOfPCEHR"),
        @XmlEnumValue("IHINotActive")
        IHI_NOT_ACTIVE("IHINotActive"),
        @XmlEnumValue("IHINotVerified")
        IHI_NOT_VERIFIED("IHINotVerified"),
        @XmlEnumValue("TermsAndConditionsWereNotAccepted")
        TERMS_AND_CONDITIONS_WERE_NOT_ACCEPTED("TermsAndConditionsWereNotAccepted"),
        @XmlEnumValue("Death")
        DEATH("Death"),
        @XmlEnumValue("WithdrawalFromParticipation")
        WITHDRAWAL_FROM_PARTICIPATION("WithdrawalFromParticipation");
        private final String value;

        Reason(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static ParticipantActionType.Reason fromValue(String v) {
            for (ParticipantActionType.Reason c: ParticipantActionType.Reason.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
