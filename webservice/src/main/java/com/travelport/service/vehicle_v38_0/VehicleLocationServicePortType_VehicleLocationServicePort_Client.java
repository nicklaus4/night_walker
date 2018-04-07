
package com.travelport.service.vehicle_v38_0;

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
 * 2016-09-13T11:40:17.350-06:00
 * Generated source version: 3.1.5
 * 
 */
public final class VehicleLocationServicePortType_VehicleLocationServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/vehicle_v38_0", "VehicleService");

    private VehicleLocationServicePortType_VehicleLocationServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = VehicleService.WSDL_LOCATION;
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
      
        VehicleService ss = new VehicleService(wsdlURL, SERVICE_NAME);
        VehicleLocationServicePortType port = ss.getVehicleLocationServicePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.vehicle_v38_0.VehicleLocationReq _service_parameters = null;
        try {
            com.travelport.schema.vehicle_v38_0.VehicleLocationRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (VehicleFaultMessage e) { 
            System.out.println("Expected exception: VehicleFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
