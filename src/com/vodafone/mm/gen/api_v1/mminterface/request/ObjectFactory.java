
package com.vodafone.mm.gen.api_v1.mminterface.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vodafone.mm.gen.api_v1.mminterface.request package. 
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

    private final static QName _RequestMsg_QNAME = new QName("http://api-v1.gen.mm.vodafone.com/mminterface/request", "RequestMsg");
    private final static QName _ResponseMsg_QNAME = new QName("http://api-v1.gen.mm.vodafone.com/mminterface/request", "ResponseMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vodafone.mm.gen.api_v1.mminterface.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", name = "RequestMsg")
    public JAXBElement<String> createRequestMsg(String value) {
        return new JAXBElement<String>(_RequestMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", name = "ResponseMsg")
    public JAXBElement<String> createResponseMsg(String value) {
        return new JAXBElement<String>(_ResponseMsg_QNAME, String.class, null, value);
    }

}
