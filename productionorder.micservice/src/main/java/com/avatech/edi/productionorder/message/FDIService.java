
package com.avatech.edi.productionorder.message;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FDIService", targetNamespace = "http://fanuc.com.cn/", wsdlLocation = "http://192.168.15.118/BFM.WebService/FDIService.asmx?wsdl")
public class FDIService
    extends Service
{

    private final static URL FDISERVICE_WSDL_LOCATION;
    private final static WebServiceException FDISERVICE_EXCEPTION;
    private final static QName FDISERVICE_QNAME = new QName("http://fanuc.com.cn/", "FDIService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.21.196/WebServiceForSAP/FDIService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FDISERVICE_WSDL_LOCATION = url;
        FDISERVICE_EXCEPTION = e;
    }

    public FDIService() {
        super(__getWsdlLocation(), FDISERVICE_QNAME);
    }

    public FDIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FDISERVICE_QNAME, features);
    }

    public FDIService(URL wsdlLocation) {
        super(wsdlLocation, FDISERVICE_QNAME);
    }

    public FDIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FDISERVICE_QNAME, features);
    }

    public FDIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FDIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FDIServiceSoap
     */
    @WebEndpoint(name = "FDIServiceSoap")
    public FDIServiceSoap getFDIServiceSoap() {
        return super.getPort(new QName("http://fanuc.com.cn/", "FDIServiceSoap"), FDIServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FDIServiceSoap
     */
    @WebEndpoint(name = "FDIServiceSoap")
    public FDIServiceSoap getFDIServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://fanuc.com.cn/", "FDIServiceSoap"), FDIServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns FDIServiceSoap
     */
    @WebEndpoint(name = "FDIServiceSoap12")
    public FDIServiceSoap getFDIServiceSoap12() {
        return super.getPort(new QName("http://fanuc.com.cn/", "FDIServiceSoap12"), FDIServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FDIServiceSoap
     */
    @WebEndpoint(name = "FDIServiceSoap12")
    public FDIServiceSoap getFDIServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://fanuc.com.cn/", "FDIServiceSoap12"), FDIServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FDISERVICE_EXCEPTION!= null) {
            throw FDISERVICE_EXCEPTION;
        }
        return FDISERVICE_WSDL_LOCATION;
    }

}
