
package webclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWebService", targetNamespace = "http://Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWebService {


    /**
     * 
     * @param point2D
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMinimumCoordinade", targetNamespace = "http://Server/", className = "webclient.FindMinimumCoordinade")
    @ResponseWrapper(localName = "findMinimumCoordinadeResponse", targetNamespace = "http://Server/", className = "webclient.FindMinimumCoordinadeResponse")
    @Action(input = "http://Server/TestWebService/findMinimumCoordinadeRequest", output = "http://Server/TestWebService/findMinimumCoordinadeResponse")
    public Double findMinimumCoordinade(
        @WebParam(name = "point2d", targetNamespace = "")
        Point2D point2D);

    /**
     * 
     * @param sample
     */
    @WebMethod
    @RequestWrapper(localName = "addSample", targetNamespace = "http://Server/", className = "webclient.AddSample")
    @ResponseWrapper(localName = "addSampleResponse", targetNamespace = "http://Server/", className = "webclient.AddSampleResponse")
    @Action(input = "http://Server/TestWebService/addSampleRequest", output = "http://Server/TestWebService/addSampleResponse")
    public void addSample(
        @WebParam(name = "sample", targetNamespace = "")
        Double sample);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testConnection", targetNamespace = "http://Server/", className = "webclient.TestConnection")
    @ResponseWrapper(localName = "testConnectionResponse", targetNamespace = "http://Server/", className = "webclient.TestConnectionResponse")
    @Action(input = "http://Server/TestWebService/testConnectionRequest", output = "http://Server/TestWebService/testConnectionResponse")
    public String testConnection();

    /**
     * 
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMinimumAmongSamples", targetNamespace = "http://Server/", className = "webclient.FindMinimumAmongSamples")
    @ResponseWrapper(localName = "findMinimumAmongSamplesResponse", targetNamespace = "http://Server/", className = "webclient.FindMinimumAmongSamplesResponse")
    @Action(input = "http://Server/TestWebService/findMinimumAmongSamplesRequest", output = "http://Server/TestWebService/findMinimumAmongSamplesResponse")
    public Double findMinimumAmongSamples();

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMinimumBetweenWithException", targetNamespace = "http://Server/", className = "webclient.FindMinimumBetweenWithException")
    @ResponseWrapper(localName = "findMinimumBetweenWithExceptionResponse", targetNamespace = "http://Server/", className = "webclient.FindMinimumBetweenWithExceptionResponse")
    @Action(input = "http://Server/TestWebService/findMinimumBetweenWithExceptionRequest", output = "http://Server/TestWebService/findMinimumBetweenWithExceptionResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Server/TestWebService/findMinimumBetweenWithException/Fault/Exception")
    })
    public Double findMinimumBetweenWithException(
        @WebParam(name = "a", targetNamespace = "")
        Double a,
        @WebParam(name = "b", targetNamespace = "")
        Double b)
        throws Exception_Exception
    ;

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMinimumBetween", targetNamespace = "http://Server/", className = "webclient.FindMinimumBetween")
    @ResponseWrapper(localName = "findMinimumBetweenResponse", targetNamespace = "http://Server/", className = "webclient.FindMinimumBetweenResponse")
    @Action(input = "http://Server/TestWebService/findMinimumBetweenRequest", output = "http://Server/TestWebService/findMinimumBetweenResponse")
    public Double findMinimumBetween(
        @WebParam(name = "a", targetNamespace = "")
        Double a,
        @WebParam(name = "b", targetNamespace = "")
        Double b);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Server/", className = "webclient.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Server/", className = "webclient.HelloResponse")
    @Action(input = "http://Server/TestWebService/helloRequest", output = "http://Server/TestWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
