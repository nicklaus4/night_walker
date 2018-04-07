package com.travelport.service.util_v42_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T16:06:31.058-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "ReportingService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/wsdl/util_v42_0/Util.wsdl",
                  targetNamespace = "http://www.travelport.com/service/util_v42_0") 
public class ReportingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/util_v42_0", "ReportingService");
    public final static QName ReportRetrievePort = new QName("http://www.travelport.com/service/util_v42_0", "ReportRetrievePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/wsdl/util_v42_0/Util.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReportingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/wsdl/util_v42_0/Util.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReportingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReportingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ReportingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ReportingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ReportingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ReportRetrievePortType
     */
    @WebEndpoint(name = "ReportRetrievePort")
    public ReportRetrievePortType getReportRetrievePort() {
        return super.getPort(ReportRetrievePort, ReportRetrievePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportRetrievePortType
     */
    @WebEndpoint(name = "ReportRetrievePort")
    public ReportRetrievePortType getReportRetrievePort(WebServiceFeature... features) {
        return super.getPort(ReportRetrievePort, ReportRetrievePortType.class, features);
    }

}
