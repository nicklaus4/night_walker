
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.rail_v38_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:33:14.902-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "RailService",
                      portName = "RailExchangeQuotePort",
                      targetNamespace = "http://www.travelport.com/service/rail_v38_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/rail_v38_0/Rail.wsdl",
                      endpointInterface = "com.travelport.service.rail_v38_0.RailExchangeQuotePortType")
                      
public class RailExchangeQuotePortImpl implements RailExchangeQuotePortType {

    private static final Logger LOG = Logger.getLogger(RailExchangeQuotePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.rail_v38_0.RailExchangeQuotePortType#service(com.travelport.schema.rail_v38_0.RailExchangeQuoteReq  parameters )*
     */
    public com.travelport.schema.rail_v38_0.RailExchangeQuoteRsp service(com.travelport.schema.rail_v38_0.RailExchangeQuoteReq parameters) throws RailFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.rail_v38_0.RailExchangeQuoteRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new RailFaultMessage("RailFaultMessage...");
    }

}
