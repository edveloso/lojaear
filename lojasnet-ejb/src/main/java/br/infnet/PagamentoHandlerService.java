package br.infnet;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(
		activationConfig = {
				@ActivationConfigProperty(
						propertyName = "destinationLookup",
						propertyValue = "java:/jms/queue/EmailQueue"
						),
				@ActivationConfigProperty(
						propertyName = "destinationType",
						propertyValue = "javax.jms.Queue"
						)
		}		
		)
public class PagamentoHandlerService implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println(message.getBody(String.class));
			//TODO enviar para a cielo
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	
	
}
