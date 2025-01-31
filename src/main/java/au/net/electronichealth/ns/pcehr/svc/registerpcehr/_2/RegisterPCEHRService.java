
package au.net.electronichealth.ns.pcehr.svc.registerpcehr._2;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "registerPCEHRService", targetNamespace = "http://ns.electronichealth.net.au/pcehr/svc/RegisterPCEHR/2.0", wsdlLocation = "wsdl/B2B_RegisterPCEHR.wsdl")
public class RegisterPCEHRService
    extends Service
{

    private final static URL REGISTERPCEHRSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGISTERPCEHRSERVICE_EXCEPTION;
    private final static QName REGISTERPCEHRSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/svc/RegisterPCEHR/2.0", "registerPCEHRService");

    static {
        REGISTERPCEHRSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.pcehr.svc.registerpcehr._2.RegisterPCEHRService.class.getResource("wsdl/B2B_RegisterPCEHR.wsdl");
        WebServiceException e = null;
        if (REGISTERPCEHRSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'wsdl/B2B_RegisterPCEHR.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        REGISTERPCEHRSERVICE_EXCEPTION = e;
    }

    public RegisterPCEHRService() {
        super(__getWsdlLocation(), REGISTERPCEHRSERVICE_QNAME);
    }

    public RegisterPCEHRService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTERPCEHRSERVICE_QNAME, features);
    }

    public RegisterPCEHRService(URL wsdlLocation) {
        super(wsdlLocation, REGISTERPCEHRSERVICE_QNAME);
    }

    public RegisterPCEHRService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTERPCEHRSERVICE_QNAME, features);
    }

    public RegisterPCEHRService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegisterPCEHRService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegisterPCEHRPortType
     */
    @WebEndpoint(name = "registerPCEHRSOAP12Port")
    public RegisterPCEHRPortType getRegisterPCEHRSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/pcehr/svc/RegisterPCEHR/2.0", "registerPCEHRSOAP12Port"), RegisterPCEHRPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegisterPCEHRPortType
     */
    @WebEndpoint(name = "registerPCEHRSOAP12Port")
    public RegisterPCEHRPortType getRegisterPCEHRSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/pcehr/svc/RegisterPCEHR/2.0", "registerPCEHRSOAP12Port"), RegisterPCEHRPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTERPCEHRSERVICE_EXCEPTION!= null) {
            throw REGISTERPCEHRSERVICE_EXCEPTION;
        }
        return REGISTERPCEHRSERVICE_WSDL_LOCATION;
    }

}
