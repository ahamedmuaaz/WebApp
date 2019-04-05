
package webclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://Server/", "helloResponse");
    private final static QName _AddSampleResponse_QNAME = new QName("http://Server/", "addSampleResponse");
    private final static QName _FindMinimumBetweenResponse_QNAME = new QName("http://Server/", "findMinimumBetweenResponse");
    private final static QName _TestConnection_QNAME = new QName("http://Server/", "testConnection");
    private final static QName _AddSample_QNAME = new QName("http://Server/", "addSample");
    private final static QName _TestConnectionResponse_QNAME = new QName("http://Server/", "testConnectionResponse");
    private final static QName _FindMinimumBetween_QNAME = new QName("http://Server/", "findMinimumBetween");
    private final static QName _Hello_QNAME = new QName("http://Server/", "hello");
    private final static QName _FindMinimumAmongSamplesResponse_QNAME = new QName("http://Server/", "findMinimumAmongSamplesResponse");
    private final static QName _FindMinimumAmongSamples_QNAME = new QName("http://Server/", "findMinimumAmongSamples");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddSample }
     * 
     */
    public AddSample createAddSample() {
        return new AddSample();
    }

    /**
     * Create an instance of {@link AddSampleResponse }
     * 
     */
    public AddSampleResponse createAddSampleResponse() {
        return new AddSampleResponse();
    }

    /**
     * Create an instance of {@link FindMinimumBetweenResponse }
     * 
     */
    public FindMinimumBetweenResponse createFindMinimumBetweenResponse() {
        return new FindMinimumBetweenResponse();
    }

    /**
     * Create an instance of {@link TestConnection }
     * 
     */
    public TestConnection createTestConnection() {
        return new TestConnection();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link FindMinimumAmongSamples }
     * 
     */
    public FindMinimumAmongSamples createFindMinimumAmongSamples() {
        return new FindMinimumAmongSamples();
    }

    /**
     * Create an instance of {@link FindMinimumAmongSamplesResponse }
     * 
     */
    public FindMinimumAmongSamplesResponse createFindMinimumAmongSamplesResponse() {
        return new FindMinimumAmongSamplesResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link FindMinimumBetween }
     * 
     */
    public FindMinimumBetween createFindMinimumBetween() {
        return new FindMinimumBetween();
    }

    /**
     * Create an instance of {@link TestConnectionResponse }
     * 
     */
    public TestConnectionResponse createTestConnectionResponse() {
        return new TestConnectionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSampleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "addSampleResponse")
    public JAXBElement<AddSampleResponse> createAddSampleResponse(AddSampleResponse value) {
        return new JAXBElement<AddSampleResponse>(_AddSampleResponse_QNAME, AddSampleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMinimumBetweenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "findMinimumBetweenResponse")
    public JAXBElement<FindMinimumBetweenResponse> createFindMinimumBetweenResponse(FindMinimumBetweenResponse value) {
        return new JAXBElement<FindMinimumBetweenResponse>(_FindMinimumBetweenResponse_QNAME, FindMinimumBetweenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "testConnection")
    public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
        return new JAXBElement<TestConnection>(_TestConnection_QNAME, TestConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSample }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "addSample")
    public JAXBElement<AddSample> createAddSample(AddSample value) {
        return new JAXBElement<AddSample>(_AddSample_QNAME, AddSample.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "testConnectionResponse")
    public JAXBElement<TestConnectionResponse> createTestConnectionResponse(TestConnectionResponse value) {
        return new JAXBElement<TestConnectionResponse>(_TestConnectionResponse_QNAME, TestConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMinimumBetween }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "findMinimumBetween")
    public JAXBElement<FindMinimumBetween> createFindMinimumBetween(FindMinimumBetween value) {
        return new JAXBElement<FindMinimumBetween>(_FindMinimumBetween_QNAME, FindMinimumBetween.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMinimumAmongSamplesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "findMinimumAmongSamplesResponse")
    public JAXBElement<FindMinimumAmongSamplesResponse> createFindMinimumAmongSamplesResponse(FindMinimumAmongSamplesResponse value) {
        return new JAXBElement<FindMinimumAmongSamplesResponse>(_FindMinimumAmongSamplesResponse_QNAME, FindMinimumAmongSamplesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMinimumAmongSamples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "findMinimumAmongSamples")
    public JAXBElement<FindMinimumAmongSamples> createFindMinimumAmongSamples(FindMinimumAmongSamples value) {
        return new JAXBElement<FindMinimumAmongSamples>(_FindMinimumAmongSamples_QNAME, FindMinimumAmongSamples.class, null, value);
    }

}
