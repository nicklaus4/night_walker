package com.travelport.service.air_v42_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:51:36.480-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v42_0", name = "AirLowFareSearchPortType")
@XmlSeeAlso({com.travelport.schema.common_v42_0.ObjectFactory.class, com.travelport.schema.air_v42_0.ObjectFactory.class, com.travelport.schema.rail_v42_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirLowFareSearchPortType {

    @WebResult(name = "LowFareSearchRsp", targetNamespace = "http://www.travelport.com/schema/air_v42_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    public com.travelport.schema.air_v42_0.LowFareSearchRsp service(
        @WebParam(partName = "parameters", name = "LowFareSearchReq", targetNamespace = "http://www.travelport.com/schema/air_v42_0")
        com.travelport.schema.air_v42_0.LowFareSearchReq parameters,
        @WebParam(partName = "sessionContext", name = "SessionContext", targetNamespace = "http://www.travelport.com/soa/common/security/SessionContext_v1", header = true)
        com.travelport.soa.common.security.sessioncontext_v1.SessionContext sessionContext
    ) throws AirFaultMessage;
}
