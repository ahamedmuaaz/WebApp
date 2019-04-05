/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.ArrayList;
import java.util.Collections;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "WebService")
public class TestWebService {

    ArrayList<Double> samples = new ArrayList<Double>();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public String testConnection() {
        System.out.println("[Server]- Server is Connected");
        return "OK";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumBetween")
    public Double findMinimumBetween(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) {
        if (a.doubleValue() < b.doubleValue()) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addSample")
    public void addSample(@WebParam(name = "sample") Double sample) {
        samples.add(sample);
        // return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumAmongSamples")
    public Double findMinimumAmongSamples() {
        //TODO write your implementation code here:
        return Collections.min(samples);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumBetweenWithException")
    public Double findMinimumBetweenWithException(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) throws Exception {
        if (a == null) {
            throw new Exception();
        }
        if (b == null) {
            throw new Exception();
        }
        if (a.floatValue() < b.floatValue()) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumCoordinade")
    public Double findMinimumCoordinade(@WebParam(name = "point2d") Point2D point2d) {
        //TODO write your implementation code here:
        if (point2d.x.floatValue() < point2d.y.floatValue()) {
            return point2d.x;
        } else {
            return point2d.y;
        }
    }

}
