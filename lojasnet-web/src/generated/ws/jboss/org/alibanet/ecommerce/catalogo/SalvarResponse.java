
package ws.jboss.org.alibanet.ecommerce.catalogo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salvarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salvarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://org.jboss.ws/alibanet/ecommerce/catalogo}entregaResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salvarResponse", propOrder = {
    "_return"
})
public class SalvarResponse {

    @XmlElement(name = "return")
    protected EntregaResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaResponse }
     *     
     */
    public EntregaResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaResponse }
     *     
     */
    public void setReturn(EntregaResponse value) {
        this._return = value;
    }

}
