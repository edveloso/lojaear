package br.infnet.pagamento;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.MessageListener;



@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup",
                propertyValue = "java:/jms/queue/EmailQueue"),
        @ActivationConfigProperty(propertyName = "destinationType",
                propertyValue = "javax.jms.Queue")
})
public class PagamentoHandlerService implements MessageListener {
    
    @Override
    public void onMessage(javax.jms.Message message) {
    	
    	try {
			System.out.println(message.getBody(String.class));
//			throw new RuntimeException();
		} catch (JMSException e) {
			e.printStackTrace();
		}
    	
    }
}