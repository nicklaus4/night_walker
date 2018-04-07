
package com.travelport.service.hotel_v38_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:32:12.171-06:00
 * Generated source version: 3.1.5
 * 
 */
public final class RetrieveHotelSearchAvailabilityServicePortType_RetrieveHotelSearchAvailabilityServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/hotel_v38_0", "HotelService");

    private RetrieveHotelSearchAvailabilityServicePortType_RetrieveHotelSearchAvailabilityServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HotelService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HotelService ss = new HotelService(wsdlURL, SERVICE_NAME);
        RetrieveHotelSearchAvailabilityServicePortType port = ss.getRetrieveHotelSearchAvailabilityServicePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.hotel_v38_0.RetrieveHotelSearchAvailabilityReq _service_parameters = null;
        try {
            com.travelport.schema.hotel_v38_0.RetrieveHotelSearchAvailabilityRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (HotelFaultMessage e) { 
            System.out.println("Expected exception: HotelFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
