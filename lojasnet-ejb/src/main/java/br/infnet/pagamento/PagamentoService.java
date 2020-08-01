package br.infnet.pagamento;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.Message;

@Stateless
public class PagamentoService implements Serializable {
	
	
	@Inject
	private JMSContext context;
	
	
	@Resource(mappedName = "java:/jms/queue/EmailQueue")
	private Destination queue;
	
	public void enviar() {
			Message msg = null;
		//		Message msg = new TextMe;
		context.createProducer().send(queue, "detino" );
		
	}
	

}
