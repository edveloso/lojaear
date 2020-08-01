
package ws.jboss.org.alibanet.ecommerce.catalogo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salvar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salvar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://org.jboss.ws/alibanet/ecommerce/catalogo}entregaResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salvar", propOrder = {
    "arg0"
})
public class Salvar {

    protected EntregaResponse arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaResponse }
     *     
     */
    public EntregaResponse getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaResponse }
     *     
     */
    public void setArg0(EntregaResponse value) {
        this.arg0 = value;
    }

}
