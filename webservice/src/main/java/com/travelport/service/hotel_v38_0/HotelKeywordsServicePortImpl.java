
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.hotel_v38_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:32:12.255-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelService",
                      portName = "HotelKeywordsServicePort",
                      targetNamespace = "http://www.travelport.com/service/hotel_v38_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/hotel_v38_0/Hotel.wsdl",
                      endpointInterface = "com.travelport.service.hotel_v38_0.HotelKeywordsServicePortType")
                      
public class HotelKeywordsServicePortImpl implements HotelKeywordsServicePortType {

    private static final Logger LOG = Logger.getLogger(HotelKeywordsServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.hotel_v38_0.HotelKeywordsServicePortType#service(com.travelport.schema.hotel_v38_0.HotelKeywordReq  parameters )*
     */
    public com.travelport.schema.hotel_v38_0.HotelKeywordRsp service(com.travelport.schema.hotel_v38_0.HotelKeywordReq parameters) throws HotelFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.hotel_v38_0.HotelKeywordRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new HotelFaultMessage("HotelFaultMessage...");
    }

}
