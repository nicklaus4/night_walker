
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.universal_v38_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:38:38.197-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "SavedTripDeleteService",
                      portName = "SavedTripDeleteServicePort",
                      targetNamespace = "http://www.travelport.com/service/universal_v38_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/universal_v38_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v38_0.SavedTripDeleteServicePortType")
                      
public class SavedTripDeleteServicePortImpl implements SavedTripDeleteServicePortType {

    private static final Logger LOG = Logger.getLogger(SavedTripDeleteServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v38_0.SavedTripDeleteServicePortType#service(com.travelport.schema.universal_v38_0.SavedTripDeleteReq  parameters ,)com.travelport.schema.universal_v38_0.SupportedVersions  supportedVersions )*
     */
    public com.travelport.schema.universal_v38_0.SavedTripDeleteRsp service(com.travelport.schema.universal_v38_0.SavedTripDeleteReq parameters,com.travelport.schema.universal_v38_0.SupportedVersions supportedVersions) throws UniversalRecordFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        System.out.println(supportedVersions);
        try {
            com.travelport.schema.universal_v38_0.SavedTripDeleteRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UniversalRecordFaultMessage("UniversalRecordFaultMessage...");
    }

}
