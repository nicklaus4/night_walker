
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v38_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:40:17.513-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleRetrieveServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v38_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/vehicle_v38_0/Vehicle.wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v38_0.VehicleRetrieveServicePortType")
                      
public class VehicleRetrieveServicePortImpl implements VehicleRetrieveServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleRetrieveServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v38_0.VehicleRetrieveServicePortType#service(com.travelport.schema.vehicle_v38_0.VehicleRetrieveReq  parameters )*
     */
    public com.travelport.schema.vehicle_v38_0.VehicleRetrieveRsp service(com.travelport.schema.vehicle_v38_0.VehicleRetrieveReq parameters) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.vehicle_v38_0.VehicleRetrieveRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}
