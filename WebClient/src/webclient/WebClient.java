/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webclient;

/**
 *
 * @author hp
 */
public class WebClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebClient client = new WebClient();
        client.executeTest();
    }

    public static void executeTest() {
        System.out.println("[Client]-Executing Test ,Started");

        if (testConnection().equals("OK")) {
            System.out.println("[Client]-server is connected,test continues...");
        } else {
            System.out.println("[Client]-Server is not connected,test failed");
        }

        System.out.println("[Client]-Executing Test ,Completed!");
    }

    private static String testConnection() {
        webclient.WebService service = new webclient.WebService();
        webclient.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

}
