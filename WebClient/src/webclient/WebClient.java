/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webclient;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class WebClient {

    /**
     * @param args the command line arguments
     */
    public  static void main(String[] args) {
        WebClient client = new WebClient();
        client.executeTest();
    }

    public void executeTest() {
        System.out.println("[Client]-Executing Test ,Started");

        if (testConnection().equals("OK")) {
            System.out.println("[Client]-server is connected,test continues...");
        } else {
            System.out.println("[Client]-Server is not connected,test failed");
        }
        System.out.println("[Client]-Test Find Mimumum Between Method");
        if (findMinimumBetween(25.0, 30.0) == 25) {
            System.out.println("[Client]-Find Mimimum , Correct results");
        } else {
            System.out.println("[Client]-Find Mimimum, Wrong results");
        }
        System.out.println("[client]-Add 10.0,7.0,25.0,3.0 following through add sample method");
        addSample(10.0);
        addSample(7.0);
        addSample(25.0);
        addSample(3.0);
        System.out.println("[Client]-Test find min among samples");
        if (findMinimumAmongSamples() == 3.0) {
            System.out.println("Find Min Among samples ,correct Results");
        } else {
            System.out.println("Find Min Among samples ,Wrong Results");
        }
        System.out.println("[client]- Test min between with exception with both filled values");

        try {
            if (findMinimumBetweenWithException(2.5, 5.0) == 2.5) {
                System.out.println("[client]-findMinnimumBetweenWithException , Correct Results");
            }
        } catch (Exception_Exception ex) {
             System.out.println("[client]-findMinnimumBetweenWithException , You shoud see this exception");
        }
        
         System.out.println("[client]- Test min between with exception with a as null value");

        try {
            if (findMinimumBetweenWithException(null, 5.0) == 2.5) {
                System.out.println("[client]-findMinnimumBetweenWithException , Correct Results");
            }
        } catch (Exception_Exception ex) {
             System.out.println("[client]-findMinnimumBetweenWithException , You shoud see this exception!!!");
        }
        
          System.out.println("[client]- Test min between with exception with b as null value");

        try {
            if (findMinimumBetweenWithException(2.5,null) == 2.5) {
                System.out.println("[client]-findMinnimumBetweenWithException , Correct Results");
            }
        } catch (Exception_Exception ex) {
             System.out.println("[client]-findMinnimumBetweenWithException , You shoud see this exception!!!");
        }
        
        
          System.out.println("[client]- Test min between with exception with a,b as null value");

        try {
            if (findMinimumBetweenWithException(null,null) == 2.5) {
                System.out.println("[client]-findMinnimumBetweenWithException , Correct Results");
            }
        } catch (Exception_Exception ex) {
             System.out.println("[client]-findMinnimumBetweenWithException , You shoud see this exception!!!");
        }
        System.out.println("[Client]- Testing findMinimumcoordinate with 2.5 & 3.5");
        
        Point2D m=new Point2D();
        
        
        
        
         System.out.println("[Client]-Executing Test ,Completed!");
    }

    private static String testConnection() {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

    private static Double findMinimumBetween(java.lang.Double a, java.lang.Double b) {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetween(a, b);
    }

    private static void addSample(java.lang.Double sample) {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        port.addSample(sample);
    }

    private static Double findMinimumAmongSamples() {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumAmongSamples();
    }

    private static Double findMinimumBetweenWithException(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetweenWithException(a, b);
    }

    private static Double findMinimumCoordinade(webclient.Point2D point2D) {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumCoordinade(point2D);
    }
    

}
