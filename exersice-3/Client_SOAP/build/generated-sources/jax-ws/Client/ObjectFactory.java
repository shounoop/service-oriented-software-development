
package Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Client package. 
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

    private final static QName _CheckProduct_QNAME = new QName("http://Server/", "check_Product");
    private final static QName _CheckProductResponse_QNAME = new QName("http://Server/", "check_ProductResponse");
    private final static QName _Hello_QNAME = new QName("http://Server/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Server/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckProduct }
     * 
     */
    public CheckProduct createCheckProduct() {
        return new CheckProduct();
    }

    /**
     * Create an instance of {@link CheckProductResponse }
     * 
     */
    public CheckProductResponse createCheckProductResponse() {
        return new CheckProductResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://Server/", name = "check_Product")
    public JAXBElement<CheckProduct> createCheckProduct(CheckProduct value) {
        return new JAXBElement<CheckProduct>(_CheckProduct_QNAME, CheckProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Server/", name = "check_ProductResponse")
    public JAXBElement<CheckProductResponse> createCheckProductResponse(CheckProductResponse value) {
        return new JAXBElement<CheckProductResponse>(_CheckProductResponse_QNAME, CheckProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://Server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
