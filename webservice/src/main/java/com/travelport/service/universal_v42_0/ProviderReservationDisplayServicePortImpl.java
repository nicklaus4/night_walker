
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.universal_v42_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:56:04.905-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "ProviderReservationDisplayService",
                      portName = "ProviderReservationDisplayServicePort",
                      targetNamespace = "http://www.travelport.com/service/universal_v42_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/wsdl/universal_v42_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v42_0.ProviderReservationDisplayServicePortType")
                      
public class ProviderReservationDisplayServicePortImpl implements ProviderReservationDisplayServicePortType {

    private static final Logger LOG = Logger.getLogger(ProviderReservationDisplayServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v42_0.ProviderReservationDisplayServicePortType#service(com.travelport.schema.universal_v42_0.ProviderReservationDisplayDetailsReq  parameters )*
     */
    public com.travelport.schema.universal_v42_0.ProviderReservationDisplayDetailsRsp service(com.travelport.schema.universal_v42_0.ProviderReservationDisplayDetailsReq parameters) throws UniversalRecordFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.universal_v42_0.ProviderReservationDisplayDetailsRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UniversalRecordFaultMessage("UniversalRecordFaultMessage...");
    }

}
