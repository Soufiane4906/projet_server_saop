package org.soap;

import jakarta.xml.ws.Endpoint;
import org.soap.server.ServerSoap;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/students.wsdl";
        Endpoint.publish(url, new ServerSoap());
        System.out.println("Server is running on " + url);

    }
}