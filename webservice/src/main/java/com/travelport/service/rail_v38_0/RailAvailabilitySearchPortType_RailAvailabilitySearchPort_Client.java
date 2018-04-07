
package com.travelport.service.rail_v38_0;

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
 * 2016-09-13T11:33:14.825-06:00
 * Generated source version: 3.1.5
 * 
 */
public final class RailAvailabilitySearchPortType_RailAvailabilitySearchPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/rail_v38_0", "RailService");

    private RailAvailabilitySearchPortType_RailAvailabilitySearchPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RailService.WSDL_LOCATION;
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
      
        RailService ss = new RailService(wsdlURL, SERVICE_NAME);
        RailAvailabilitySearchPortType port = ss.getRailAvailabilitySearchPort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.rail_v38_0.RailAvailabilitySearchReq _service_parameters = null;
        try {
            com.travelport.schema.rail_v38_0.RailAvailabilitySearchRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (RailFaultMessage e) { 
            System.out.println("Expected exception: RailFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
