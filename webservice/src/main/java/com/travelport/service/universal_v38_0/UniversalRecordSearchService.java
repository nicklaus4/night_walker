package com.travelport.service.universal_v38_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:38:38.443-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "UniversalRecordSearchService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v38_0") 
public class UniversalRecordSearchService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v38_0", "UniversalRecordSearchService");
    public final static QName UniversalRecordSearchServicePort = new QName("http://www.travelport.com/service/universal_v38_0", "UniversalRecordSearchServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UniversalRecordSearchService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UniversalRecordSearchService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UniversalRecordSearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UniversalRecordSearchService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UniversalRecordSearchService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UniversalRecordSearchService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UniversalRecordSearchService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UniversalRecordSearchServicePortType
     */
    @WebEndpoint(name = "UniversalRecordSearchServicePort")
    public UniversalRecordSearchServicePortType getUniversalRecordSearchServicePort() {
        return super.getPort(UniversalRecordSearchServicePort, UniversalRecordSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UniversalRecordSearchServicePortType
     */
    @WebEndpoint(name = "UniversalRecordSearchServicePort")
    public UniversalRecordSearchServicePortType getUniversalRecordSearchServicePort(WebServiceFeature... features) {
        return super.getPort(UniversalRecordSearchServicePort, UniversalRecordSearchServicePortType.class, features);
    }

}
