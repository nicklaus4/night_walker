
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v42_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:56:34.092-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleUpsellSearchServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v42_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/wsdl/vehicle_v42_0/Vehicle.wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v42_0.VehicleUpsellSearchServicePortType")
                      
public class VehicleUpsellSearchServicePortImpl implements VehicleUpsellSearchServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleUpsellSearchServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v42_0.VehicleUpsellSearchServicePortType#service(com.travelport.schema.vehicle_v42_0.VehicleUpsellSearchAvailabilityReq  parameters )*
     */
    public com.travelport.schema.vehicle_v42_0.VehicleUpsellSearchAvailabilityRsp service(com.travelport.schema.vehicle_v42_0.VehicleUpsellSearchAvailabilityReq parameters) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.vehicle_v42_0.VehicleUpsellSearchAvailabilityRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}
