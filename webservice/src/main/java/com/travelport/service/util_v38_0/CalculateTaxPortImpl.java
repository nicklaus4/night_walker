
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.util_v38_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:39:24.292-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "CalculateTaxService",
                      portName = "CalculateTaxPort",
                      targetNamespace = "http://www.travelport.com/service/util_v38_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/wsdl/util_v38_0/Util.wsdl",
                      endpointInterface = "com.travelport.service.util_v38_0.CalculateTaxPortType")
                      
public class CalculateTaxPortImpl implements CalculateTaxPortType {

    private static final Logger LOG = Logger.getLogger(CalculateTaxPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.util_v38_0.CalculateTaxPortType#service(com.travelport.schema.util_v38_0.CalculateTaxReq  parameters )*
     */
    public com.travelport.schema.util_v38_0.CalculateTaxRsp service(com.travelport.schema.util_v38_0.CalculateTaxReq parameters) throws UtilFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.util_v38_0.CalculateTaxRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UtilFaultMessage("UtilFaultMessage...");
    }

}
