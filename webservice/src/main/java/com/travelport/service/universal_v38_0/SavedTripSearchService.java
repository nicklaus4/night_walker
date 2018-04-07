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
 * 2016-09-13T11:38:38.435-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "SavedTripSearchService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v38_0") 
public class SavedTripSearchService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v38_0", "SavedTripSearchService");
    public final static QName SavedTripSearchServicePort = new QName("http://www.travelport.com/service/universal_v38_0", "SavedTripSearchServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SavedTripSearchService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SavedTripSearchService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SavedTripSearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SavedTripSearchService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SavedTripSearchService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SavedTripSearchService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SavedTripSearchService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SavedTripSearchServicePortType
     */
    @WebEndpoint(name = "SavedTripSearchServicePort")
    public SavedTripSearchServicePortType getSavedTripSearchServicePort() {
        return super.getPort(SavedTripSearchServicePort, SavedTripSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SavedTripSearchServicePortType
     */
    @WebEndpoint(name = "SavedTripSearchServicePort")
    public SavedTripSearchServicePortType getSavedTripSearchServicePort(WebServiceFeature... features) {
        return super.getPort(SavedTripSearchServicePort, SavedTripSearchServicePortType.class, features);
    }

}
