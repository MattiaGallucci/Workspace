
package sanremo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SanremoEJBService", targetNamespace = "http://sanremo/", wsdlLocation = "http://localhost:8080/SanremoEJBService/SanremoEJB?wsdl")
public class SanremoEJBService
    extends Service
{

    private final static URL SANREMOEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SANREMOEJBSERVICE_EXCEPTION;
    private final static QName SANREMOEJBSERVICE_QNAME = new QName("http://sanremo/", "SanremoEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SanremoEJBService/SanremoEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SANREMOEJBSERVICE_WSDL_LOCATION = url;
        SANREMOEJBSERVICE_EXCEPTION = e;
    }

    public SanremoEJBService() {
        super(__getWsdlLocation(), SANREMOEJBSERVICE_QNAME);
    }

    public SanremoEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SANREMOEJBSERVICE_QNAME, features);
    }

    public SanremoEJBService(URL wsdlLocation) {
        super(wsdlLocation, SANREMOEJBSERVICE_QNAME);
    }

    public SanremoEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SANREMOEJBSERVICE_QNAME, features);
    }

    public SanremoEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SanremoEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SanremoEJB
     */
    @WebEndpoint(name = "SanremoEJBPort")
    public SanremoEJB getSanremoEJBPort() {
        return super.getPort(new QName("http://sanremo/", "SanremoEJBPort"), SanremoEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SanremoEJB
     */
    @WebEndpoint(name = "SanremoEJBPort")
    public SanremoEJB getSanremoEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sanremo/", "SanremoEJBPort"), SanremoEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SANREMOEJBSERVICE_EXCEPTION!= null) {
            throw SANREMOEJBSERVICE_EXCEPTION;
        }
        return SANREMOEJBSERVICE_WSDL_LOCATION;
    }

}