
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameSuffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nameSuffix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BEM"/>
 *     &lt;enumeration value="COMDC"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="DCMG"/>
 *     &lt;enumeration value="DCB"/>
 *     &lt;enumeration value="DBE"/>
 *     &lt;enumeration value="DCVO"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="DFM"/>
 *     &lt;enumeration value="DSC"/>
 *     &lt;enumeration value="DSM"/>
 *     &lt;enumeration value="VIII"/>
 *     &lt;enumeration value="ESQ"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="JNR"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="KB"/>
 *     &lt;enumeration value="KCMG"/>
 *     &lt;enumeration value="KCB"/>
 *     &lt;enumeration value="KBE"/>
 *     &lt;enumeration value="KCVO"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="KT"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="OAM"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MHA"/>
 *     &lt;enumeration value="MHR"/>
 *     &lt;enumeration value="MLA"/>
 *     &lt;enumeration value="MLC"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="MBE"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="IX"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="OBE"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="QC"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="SNR"/>
 *     &lt;enumeration value="VII"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="VC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nameSuffix")
@XmlEnum
public enum NameSuffix {

    BM,
    BEM,
    COMDC,
    CH,
    AC,
    CV,
    DCMG,
    DCB,
    DBE,
    DCVO,
    AD,
    DFM,
    DSC,
    DSM,
    VIII,
    ESQ,
    V,
    I,
    IV,
    GC,
    JNR,
    JP,
    KB,
    KCMG,
    KCB,
    KBE,
    KCVO,
    KG,
    AK,
    KT,
    MD,
    OAM,
    MP,
    MHA,
    MHR,
    MLA,
    MLC,
    AM,
    MBE,
    MC,
    IX,
    OC,
    AO,
    OBE,
    OM,
    QC,
    II,
    SNR,
    VII,
    VI,
    SC,
    X,
    III,
    VC;

    public String value() {
        return name();
    }

    public static NameSuffix fromValue(String v) {
        return valueOf(v);
    }

}
