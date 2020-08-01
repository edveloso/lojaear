
package ws.jboss.org.alibanet.ecommerce.catalogo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.jboss.org.alibanet.ecommerce.catalogo package. 
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

    private final static QName _Listar_QNAME = new QName("http://org.jboss.ws/alibanet/ecommerce/catalogo", "listar");
    private final static QName _Salvar_QNAME = new QName("http://org.jboss.ws/alibanet/ecommerce/catalogo", "salvar");
    private final static QName _ListarResponse_QNAME = new QName("http://org.jboss.ws/alibanet/ecommerce/catalogo", "listarResponse");
    private final static QName _SalvarResponse_QNAME = new QName("http://org.jboss.ws/alibanet/ecommerce/catalogo", "salvarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.jboss.org.alibanet.ecommerce.catalogo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link EntregaResponse }
     * 
     */
    public EntregaResponse createEntregaResponse() {
        return new EntregaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.jboss.ws/alibanet/ecommerce/catalogo", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.jboss.ws/alibanet/ecommerce/catalogo", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.jboss.ws/alibanet/ecommerce/catalogo", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.jboss.ws/alibanet/ecommerce/catalogo", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

}
