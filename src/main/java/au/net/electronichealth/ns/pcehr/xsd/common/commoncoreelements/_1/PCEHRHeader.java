
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

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
 *         &lt;element name="User">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="HPII"/>
 *                         &lt;enumeration value="PortalUserIdentifier"/>
 *                         &lt;enumeration value="LocalSystemIdentifier"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="useRoleForAudit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/>
 *         &lt;element name="productType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clientSystemType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CIS"/>
 *               &lt;enumeration value="CSP"/>
 *               &lt;enumeration value="CRP"/>
 *               &lt;enumeration value="HI"/>
 *               &lt;enumeration value="Medicare"/>
 *               &lt;enumeration value="CPP"/>
 *               &lt;enumeration value="CCP"/>
 *               &lt;enumeration value="Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accessingOrganisation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="alternateOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "user",
    "ihiNumber",
    "productType",
    "clientSystemType",
    "accessingOrganisation"
})
@XmlRootElement(name = "PCEHRHeader")
public class PCEHRHeader {

    @XmlElement(name = "User", required = true)
    protected PCEHRHeader.User user;
    protected String ihiNumber;
    @XmlElement(required = true)
    protected PCEHRHeader.ProductType productType;
    @XmlElement(required = true)
    protected PCEHRHeader.ClientSystemType clientSystemType;
    protected PCEHRHeader.AccessingOrganisation accessingOrganisation;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.User }
     *     
     */
    public PCEHRHeader.User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.User }
     *     
     */
    public void setUser(PCEHRHeader.User value) {
        this.user = value;
    }

    /**
     * Gets the value of the ihiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhiNumber() {
        return ihiNumber;
    }

    /**
     * Sets the value of the ihiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhiNumber(String value) {
        this.ihiNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.ProductType }
     *     
     */
    public PCEHRHeader.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.ProductType }
     *     
     */
    public void setProductType(PCEHRHeader.ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the clientSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.ClientSystemType }
     *     
     */
    public PCEHRHeader.ClientSystemType getClientSystemType() {
        return clientSystemType;
    }

    /**
     * Sets the value of the clientSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.ClientSystemType }
     *     
     */
    public void setClientSystemType(PCEHRHeader.ClientSystemType value) {
        this.clientSystemType = value;
    }

    /**
     * Gets the value of the accessingOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.AccessingOrganisation }
     *     
     */
    public PCEHRHeader.AccessingOrganisation getAccessingOrganisation() {
        return accessingOrganisation;
    }

    /**
     * Sets the value of the accessingOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.AccessingOrganisation }
     *     
     */
    public void setAccessingOrganisation(PCEHRHeader.AccessingOrganisation value) {
        this.accessingOrganisation = value;
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
     *         &lt;element name="organisationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="alternateOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "organisationID",
        "organisationName",
        "alternateOrganisationName"
    })
    public static class AccessingOrganisation {

        @XmlElement(required = true)
        protected String organisationID;
        @XmlElement(required = true)
        protected String organisationName;
        protected String alternateOrganisationName;

        /**
         * Gets the value of the organisationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganisationID() {
            return organisationID;
        }

        /**
         * Sets the value of the organisationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganisationID(String value) {
            this.organisationID = value;
        }

        /**
         * Gets the value of the organisationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganisationName() {
            return organisationName;
        }

        /**
         * Sets the value of the organisationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganisationName(String value) {
            this.organisationName = value;
        }

        /**
         * Gets the value of the alternateOrganisationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternateOrganisationName() {
            return alternateOrganisationName;
        }

        /**
         * Sets the value of the alternateOrganisationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternateOrganisationName(String value) {
            this.alternateOrganisationName = value;
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
     *     &lt;enumeration value="CIS"/>
     *     &lt;enumeration value="CSP"/>
     *     &lt;enumeration value="CRP"/>
     *     &lt;enumeration value="HI"/>
     *     &lt;enumeration value="Medicare"/>
     *     &lt;enumeration value="CPP"/>
     *     &lt;enumeration value="CCP"/>
     *     &lt;enumeration value="Other"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ClientSystemType {

        CIS("CIS"),
        CSP("CSP"),
        CRP("CRP"),
        HI("HI"),
        @XmlEnumValue("Medicare")
        MEDICARE("Medicare"),
        CPP("CPP"),
        CCP("CCP"),
        @XmlEnumValue("Other")
        OTHER("Other");
        private final String value;

        ClientSystemType(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static PCEHRHeader.ClientSystemType fromValue(String v) {
            for (PCEHRHeader.ClientSystemType c: PCEHRHeader.ClientSystemType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

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
     *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "vendor",
        "productName",
        "productVersion",
        "platform"
    })
    public static class ProductType {

        @XmlElement(required = true)
        protected String vendor;
        @XmlElement(required = true)
        protected String productName;
        @XmlElement(required = true)
        protected String productVersion;
        @XmlElement(required = true)
        protected String platform;

        /**
         * Gets the value of the vendor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Sets the value of the vendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

        /**
         * Gets the value of the productName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Sets the value of the productName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Gets the value of the productVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductVersion() {
            return productVersion;
        }

        /**
         * Sets the value of the productVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductVersion(String value) {
            this.productVersion = value;
        }

        /**
         * Gets the value of the platform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatform() {
            return platform;
        }

        /**
         * Sets the value of the platform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatform(String value) {
            this.platform = value;
        }

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
     *         &lt;element name="IDType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="HPII"/>
     *               &lt;enumeration value="PortalUserIdentifier"/>
     *               &lt;enumeration value="LocalSystemIdentifier"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="useRoleForAudit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "idType",
        "id",
        "role",
        "userName",
        "useRoleForAudit"
    })
    public static class User {

        @XmlElement(name = "IDType", required = true)
        protected PCEHRHeader.User.IDType idType;
        @XmlElement(name = "ID", required = true)
        protected String id;
        protected String role;
        @XmlElement(required = true)
        protected String userName;
        protected boolean useRoleForAudit;

        /**
         * Gets the value of the idType property.
         * 
         * @return
         *     possible object is
         *     {@link PCEHRHeader.User.IDType }
         *     
         */
        public PCEHRHeader.User.IDType getIDType() {
            return idType;
        }

        /**
         * Sets the value of the idType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PCEHRHeader.User.IDType }
         *     
         */
        public void setIDType(PCEHRHeader.User.IDType value) {
            this.idType = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
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
         * Gets the value of the useRoleForAudit property.
         * 
         */
        public boolean isUseRoleForAudit() {
            return useRoleForAudit;
        }

        /**
         * Sets the value of the useRoleForAudit property.
         * 
         */
        public void setUseRoleForAudit(boolean value) {
            this.useRoleForAudit = value;
        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="HPII"/>
         *     &lt;enumeration value="PortalUserIdentifier"/>
         *     &lt;enumeration value="LocalSystemIdentifier"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum IDType {

            HPII("HPII"),
            @XmlEnumValue("PortalUserIdentifier")
            PORTAL_USER_IDENTIFIER("PortalUserIdentifier"),
            @XmlEnumValue("LocalSystemIdentifier")
            LOCAL_SYSTEM_IDENTIFIER("LocalSystemIdentifier");
            private final String value;

            IDType(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static PCEHRHeader.User.IDType fromValue(String v) {
                for (PCEHRHeader.User.IDType c: PCEHRHeader.User.IDType.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }

    }

}
