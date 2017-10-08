
package org.me.calculator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.calculator package. 
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

    private final static QName _Multiply_QNAME = new QName("http://calculator.me.org/", "multiply");
    private final static QName _Divide_QNAME = new QName("http://calculator.me.org/", "divide");
    private final static QName _DivideResponse_QNAME = new QName("http://calculator.me.org/", "divideResponse");
    private final static QName _SubtractionResponse_QNAME = new QName("http://calculator.me.org/", "subtractionResponse");
    private final static QName _Subtraction_QNAME = new QName("http://calculator.me.org/", "subtraction");
    private final static QName _AddResponse_QNAME = new QName("http://calculator.me.org/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://calculator.me.org/", "multiplyResponse");
    private final static QName _Add_QNAME = new QName("http://calculator.me.org/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link SubtractionResponse }
     * 
     */
    public SubtractionResponse createSubtractionResponse() {
        return new SubtractionResponse();
    }

    /**
     * Create an instance of {@link Subtraction }
     * 
     */
    public Subtraction createSubtraction() {
        return new Subtraction();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "subtractionResponse")
    public JAXBElement<SubtractionResponse> createSubtractionResponse(SubtractionResponse value) {
        return new JAXBElement<SubtractionResponse>(_SubtractionResponse_QNAME, SubtractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "subtraction")
    public JAXBElement<Subtraction> createSubtraction(Subtraction value) {
        return new JAXBElement<Subtraction>(_Subtraction_QNAME, Subtraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
