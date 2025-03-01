
package au.net.electronichealth.ns.pcehr.svc.removedocument._1;

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
@WebServiceClient(name = "removeDocumentService", targetNamespace = "http://ns.electronichealth.net.au/pcehr/svc/RemoveDocument/1.1", wsdlLocation = "wsdl/B2B_RemoveDocument.wsdl")
public class RemoveDocumentService
    extends Service
{

    private final static URL REMOVEDOCUMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException REMOVEDOCUMENTSERVICE_EXCEPTION;
    private final static QName REMOVEDOCUMENTSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/svc/RemoveDocument/1.1", "removeDocumentService");

    static {
        REMOVEDOCUMENTSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.pcehr.svc.removedocument._1.RemoveDocumentService.class.getResource("wsdl/B2B_RemoveDocument.wsdl");
        WebServiceException e = null;
        if (REMOVEDOCUMENTSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'wsdl/B2B_RemoveDocument.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        REMOVEDOCUMENTSERVICE_EXCEPTION = e;
    }

    public RemoveDocumentService() {
        super(__getWsdlLocation(), REMOVEDOCUMENTSERVICE_QNAME);
    }

    public RemoveDocumentService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REMOVEDOCUMENTSERVICE_QNAME, features);
    }

    public RemoveDocumentService(URL wsdlLocation) {
        super(wsdlLocation, REMOVEDOCUMENTSERVICE_QNAME);
    }

    public RemoveDocumentService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REMOVEDOCUMENTSERVICE_QNAME, features);
    }

    public RemoveDocumentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemoveDocumentService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RemoveDocumentPortType
     */
    @WebEndpoint(name = "removeDocumentSOAP12Port")
    public RemoveDocumentPortType getRemoveDocumentSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/pcehr/svc/RemoveDocument/1.1", "removeDocumentSOAP12Port"), RemoveDocumentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RemoveDocumentPortType
     */
    @WebEndpoint(name = "removeDocumentSOAP12Port")
    public RemoveDocumentPortType getRemoveDocumentSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/pcehr/svc/RemoveDocument/1.1", "removeDocumentSOAP12Port"), RemoveDocumentPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REMOVEDOCUMENTSERVICE_EXCEPTION!= null) {
            throw REMOVEDOCUMENTSERVICE_EXCEPTION;
        }
        return REMOVEDOCUMENTSERVICE_WSDL_LOCATION;
    }

}
