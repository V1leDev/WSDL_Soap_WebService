# Introduction

This project shows how to host a simple web service (adding to numbers) using a WSDL file and SOAP. This project uses
the Spring Boot framework.

# Execution

To start the web service, execute the following command in a terminal:<br>
``mvn spring-boot:run``

# Send requests
To send requests to this web service, following example can be used as a template:
```xml
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <RequestAdder xmlns="http://alexander.com/services">
            <number1>500</number1>
            <number2>21.5</number2>
        </RequestAdder>
    </soap:Body>
</soap:Envelope>
```
The request must be a POST request to http://localhost:8080/adder.
