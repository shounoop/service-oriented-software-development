
package com.htc.test.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.htc.test.ws package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _Hello_QNAME = new QName("http://ws.test.htc.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.test.htc.com/", "helloResponse");
    private final static QName _PayThroughCreditCard_QNAME = new QName("http://ws.test.htc.com/", "payThroughCreditCard");
    private final static QName _PayThroughCreditCardResponse_QNAME = new QName("http://ws.test.htc.com/", "payThroughCreditCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.htc.test.ws
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link PayThroughCreditCard }
     * 
     */
    public PayThroughCreditCard createPayThroughCreditCard() {
        return new PayThroughCreditCard();
    }

    /**
     * Create an instance of {@link PayThroughCreditCardResponse }
     * 
     */
    public PayThroughCreditCardResponse createPayThroughCreditCardResponse() {
        return new PayThroughCreditCardResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "hello")
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
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayThroughCreditCard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayThroughCreditCard }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "payThroughCreditCard")
    public JAXBElement<PayThroughCreditCard> createPayThroughCreditCard(PayThroughCreditCard value) {
        return new JAXBElement<PayThroughCreditCard>(_PayThroughCreditCard_QNAME, PayThroughCreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayThroughCreditCardResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayThroughCreditCardResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "payThroughCreditCardResponse")
    public JAXBElement<PayThroughCreditCardResponse> createPayThroughCreditCardResponse(PayThroughCreditCardResponse value) {
        return new JAXBElement<PayThroughCreditCardResponse>(_PayThroughCreditCardResponse_QNAME, PayThroughCreditCardResponse.class, null, value);
    }

}
