package com.alexander;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"number1", "number2"})
@XmlRootElement(name = "RequestAdder")
public class RequestAdder {

    @XmlElement(required = true)
    protected float number1;
    @XmlElement(required = true)
    protected float number2;

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

}
