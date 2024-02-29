
package au.net.electronichealth.ns.pcehr.svc.getindividualdetailsview._2;

import jakarta.xml.ws.WebFault;
import au.net.electronichealth.ns.wsp.xsd.standarderror._2010.StandardError;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "standardError", targetNamespace = "http://ns.electronichealth.net.au/wsp/xsd/StandardError/2010")
public class StandardErrorMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private StandardError faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public StandardErrorMsg(String message, StandardError faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public StandardErrorMsg(String message, StandardError faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.net.electronichealth.ns.wsp.xsd.standarderror._2010.StandardError
     */
    public StandardError getFaultInfo() {
        return faultInfo;
    }

}
