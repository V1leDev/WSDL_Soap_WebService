package com.alexander;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"result"})
@XmlRootElement(name = "ResponseAdder")
public class ResponseAdder {

    @XmlElement(required = true)
    protected float result;

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }


}
