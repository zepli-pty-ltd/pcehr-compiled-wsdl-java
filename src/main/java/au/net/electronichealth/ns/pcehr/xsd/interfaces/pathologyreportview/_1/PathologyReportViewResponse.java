
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pathologyreportview._1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.gov.nehta.schema.DateAdapter;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.CodedType;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.PathologyReportInformationDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.ProviderInformationDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.RequesterInformationDT;


/**
 * <p>Java class for pathologyReportViewResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pathologyReportViewResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewMetadata">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="individualProfile">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
 *                             &lt;element name="individual" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="viewParameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dateFromFilter" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dateToFilter" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pathologyReport" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dateAvailableToConsumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="reportInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}pathologyReportInformationDT"/>
 *                   &lt;element name="clinicalDocumentAuthor" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/>
 *                   &lt;element name="reportingPathologistInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/>
 *                   &lt;element name="testRequesterInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}requesterInformationDT"/>
 *                   &lt;element name="pathologyTestResult" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="specimenCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pathologyDiscipline" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
 *                             &lt;element name="testResultName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
 *                             &lt;element name="overallTestResultStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "pathologyReportViewResponse", propOrder = {
    "viewMetadata",
    "pathologyReports"
})
@XmlRootElement(name = "pathologyReportViewResponse")
public class PathologyReportViewResponse {

    @XmlElement(required = true)
    protected PathologyReportViewResponse.ViewMetadata viewMetadata;
    @XmlElement(name = "pathologyReport")
    protected List<PathologyReportViewResponse.PathologyReport> pathologyReports;

    /**
     * Gets the value of the viewMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link PathologyReportViewResponse.ViewMetadata }
     *     
     */
    public PathologyReportViewResponse.ViewMetadata getViewMetadata() {
        return viewMetadata;
    }

    /**
     * Sets the value of the viewMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathologyReportViewResponse.ViewMetadata }
     *     
     */
    public void setViewMetadata(PathologyReportViewResponse.ViewMetadata value) {
        this.viewMetadata = value;
    }

    /**
     * Gets the value of the pathologyReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathologyReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathologyReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PathologyReportViewResponse.PathologyReport }
     * 
     * 
     */
    public List<PathologyReportViewResponse.PathologyReport> getPathologyReports() {
        if (pathologyReports == null) {
            pathologyReports = new ArrayList<PathologyReportViewResponse.PathologyReport>();
        }
        return this.pathologyReports;
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
     *         &lt;element name="dateAvailableToConsumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="reportInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}pathologyReportInformationDT"/>
     *         &lt;element name="clinicalDocumentAuthor" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/>
     *         &lt;element name="reportingPathologistInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/>
     *         &lt;element name="testRequesterInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}requesterInformationDT"/>
     *         &lt;element name="pathologyTestResult" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="specimenCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pathologyDiscipline" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
     *                   &lt;element name="testResultName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
     *                   &lt;element name="overallTestResultStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
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
        "dateAvailableToConsumer",
        "reportInformation",
        "clinicalDocumentAuthor",
        "reportingPathologistInformation",
        "testRequesterInformation",
        "pathologyTestResults"
    })
    public static class PathologyReport {

        @XmlElement(required = true)
        protected String dateAvailableToConsumer;
        @XmlElement(required = true)
        protected PathologyReportInformationDT reportInformation;
        @XmlElement(required = true)
        protected ProviderInformationDT clinicalDocumentAuthor;
        @XmlElement(required = true)
        protected ProviderInformationDT reportingPathologistInformation;
        @XmlElement(required = true)
        protected RequesterInformationDT testRequesterInformation;
        @XmlElement(name = "pathologyTestResult", required = true)
        protected List<PathologyReportViewResponse.PathologyReport.PathologyTestResult> pathologyTestResults;

        /**
         * Gets the value of the dateAvailableToConsumer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateAvailableToConsumer() {
            return dateAvailableToConsumer;
        }

        /**
         * Sets the value of the dateAvailableToConsumer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateAvailableToConsumer(String value) {
            this.dateAvailableToConsumer = value;
        }

        /**
         * Gets the value of the reportInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PathologyReportInformationDT }
         *     
         */
        public PathologyReportInformationDT getReportInformation() {
            return reportInformation;
        }

        /**
         * Sets the value of the reportInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PathologyReportInformationDT }
         *     
         */
        public void setReportInformation(PathologyReportInformationDT value) {
            this.reportInformation = value;
        }

        /**
         * Gets the value of the clinicalDocumentAuthor property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderInformationDT }
         *     
         */
        public ProviderInformationDT getClinicalDocumentAuthor() {
            return clinicalDocumentAuthor;
        }

        /**
         * Sets the value of the clinicalDocumentAuthor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderInformationDT }
         *     
         */
        public void setClinicalDocumentAuthor(ProviderInformationDT value) {
            this.clinicalDocumentAuthor = value;
        }

        /**
         * Gets the value of the reportingPathologistInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderInformationDT }
         *     
         */
        public ProviderInformationDT getReportingPathologistInformation() {
            return reportingPathologistInformation;
        }

        /**
         * Sets the value of the reportingPathologistInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderInformationDT }
         *     
         */
        public void setReportingPathologistInformation(ProviderInformationDT value) {
            this.reportingPathologistInformation = value;
        }

        /**
         * Gets the value of the testRequesterInformation property.
         * 
         * @return
         *     possible object is
         *     {@link RequesterInformationDT }
         *     
         */
        public RequesterInformationDT getTestRequesterInformation() {
            return testRequesterInformation;
        }

        /**
         * Sets the value of the testRequesterInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequesterInformationDT }
         *     
         */
        public void setTestRequesterInformation(RequesterInformationDT value) {
            this.testRequesterInformation = value;
        }

        /**
         * Gets the value of the pathologyTestResults property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pathologyTestResults property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPathologyTestResults().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PathologyReportViewResponse.PathologyReport.PathologyTestResult }
         * 
         * 
         */
        public List<PathologyReportViewResponse.PathologyReport.PathologyTestResult> getPathologyTestResults() {
            if (pathologyTestResults == null) {
                pathologyTestResults = new ArrayList<PathologyReportViewResponse.PathologyReport.PathologyTestResult>();
            }
            return this.pathologyTestResults;
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
         *         &lt;element name="specimenCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pathologyDiscipline" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
         *         &lt;element name="testResultName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
         *         &lt;element name="overallTestResultStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/>
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
            "specimenCollectionDate",
            "pathologyDiscipline",
            "testResultName",
            "overallTestResultStatus"
        })
        public static class PathologyTestResult {

            @XmlElement(required = true)
            protected String specimenCollectionDate;
            @XmlElement(required = true)
            protected CodedType pathologyDiscipline;
            @XmlElement(required = true)
            protected CodedType testResultName;
            @XmlElement(required = true)
            protected CodedType overallTestResultStatus;

            /**
             * Gets the value of the specimenCollectionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecimenCollectionDate() {
                return specimenCollectionDate;
            }

            /**
             * Sets the value of the specimenCollectionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecimenCollectionDate(String value) {
                this.specimenCollectionDate = value;
            }

            /**
             * Gets the value of the pathologyDiscipline property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getPathologyDiscipline() {
                return pathologyDiscipline;
            }

            /**
             * Sets the value of the pathologyDiscipline property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setPathologyDiscipline(CodedType value) {
                this.pathologyDiscipline = value;
            }

            /**
             * Gets the value of the testResultName property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getTestResultName() {
                return testResultName;
            }

            /**
             * Sets the value of the testResultName property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setTestResultName(CodedType value) {
                this.testResultName = value;
            }

            /**
             * Gets the value of the overallTestResultStatus property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getOverallTestResultStatus() {
                return overallTestResultStatus;
            }

            /**
             * Sets the value of the overallTestResultStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setOverallTestResultStatus(CodedType value) {
                this.overallTestResultStatus = value;
            }

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
     *         &lt;element name="individualProfile">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
     *                   &lt;element name="individual" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="viewParameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dateFromFilter" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dateToFilter" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "individualProfile",
        "viewParameters",
        "informationAvailable"
    })
    public static class ViewMetadata {

        @XmlElement(required = true)
        protected PathologyReportViewResponse.ViewMetadata.IndividualProfile individualProfile;
        @XmlElement(required = true)
        protected PathologyReportViewResponse.ViewMetadata.ViewParameters viewParameters;
        protected boolean informationAvailable;

        /**
         * Gets the value of the individualProfile property.
         * 
         * @return
         *     possible object is
         *     {@link PathologyReportViewResponse.ViewMetadata.IndividualProfile }
         *     
         */
        public PathologyReportViewResponse.ViewMetadata.IndividualProfile getIndividualProfile() {
            return individualProfile;
        }

        /**
         * Sets the value of the individualProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link PathologyReportViewResponse.ViewMetadata.IndividualProfile }
         *     
         */
        public void setIndividualProfile(PathologyReportViewResponse.ViewMetadata.IndividualProfile value) {
            this.individualProfile = value;
        }

        /**
         * Gets the value of the viewParameters property.
         * 
         * @return
         *     possible object is
         *     {@link PathologyReportViewResponse.ViewMetadata.ViewParameters }
         *     
         */
        public PathologyReportViewResponse.ViewMetadata.ViewParameters getViewParameters() {
            return viewParameters;
        }

        /**
         * Sets the value of the viewParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link PathologyReportViewResponse.ViewMetadata.ViewParameters }
         *     
         */
        public void setViewParameters(PathologyReportViewResponse.ViewMetadata.ViewParameters value) {
            this.viewParameters = value;
        }

        /**
         * Gets the value of the informationAvailable property.
         * 
         */
        public boolean isInformationAvailable() {
            return informationAvailable;
        }

        /**
         * Sets the value of the informationAvailable property.
         * 
         */
        public void setInformationAvailable(boolean value) {
            this.informationAvailable = value;
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
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/>
         *         &lt;element name="individual" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"/>
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
            "ihiNumber",
            "individual"
        })
        public static class IndividualProfile {

            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
            protected String ihiNumber;
            @XmlElement(required = true)
            protected IndividualTypeSupp individual;

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
             * Gets the value of the individual property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualTypeSupp }
             *     
             */
            public IndividualTypeSupp getIndividual() {
                return individual;
            }

            /**
             * Sets the value of the individual property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualTypeSupp }
             *     
             */
            public void setIndividual(IndividualTypeSupp value) {
                this.individual = value;
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
         *         &lt;element name="dateFromFilter" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dateToFilter" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "dateFromFilter",
            "dateToFilter",
            "viewVersionNumber"
        })
        public static class ViewParameters {

            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(DateAdapter.class)
            @XmlSchemaType(name = "date")
            protected Calendar dateFromFilter;
            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(DateAdapter.class)
            @XmlSchemaType(name = "date")
            protected Calendar dateToFilter;
            @XmlElement(required = true)
            protected String viewVersionNumber;

            /**
             * Gets the value of the dateFromFilter property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Calendar getDateFromFilter() {
                return dateFromFilter;
            }

            /**
             * Sets the value of the dateFromFilter property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateFromFilter(Calendar value) {
                this.dateFromFilter = value;
            }

            /**
             * Gets the value of the dateToFilter property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Calendar getDateToFilter() {
                return dateToFilter;
            }

            /**
             * Sets the value of the dateToFilter property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateToFilter(Calendar value) {
                this.dateToFilter = value;
            }

            /**
             * Gets the value of the viewVersionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewVersionNumber() {
                return viewVersionNumber;
            }

            /**
             * Sets the value of the viewVersionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewVersionNumber(String value) {
                this.viewVersionNumber = value;
            }

        }

    }

}
