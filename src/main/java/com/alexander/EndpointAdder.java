package com.alexander;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndpointAdder {
    @PayloadRoot(namespace = "http://alexander.com/services", localPart = "RequestAdder")
    @ResponsePayload
    public ResponseAdder adderHandler(@RequestPayload RequestAdder requestAdder) {
        ResponseAdder response = new ResponseAdder();
        response.setResult(requestAdder.getNumber1() + requestAdder.getNumber2());
        return response;
    }
}
