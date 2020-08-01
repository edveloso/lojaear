package br.infnet;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;

@Stateless
public class PagamentoService {

	@Inject
	private JMSContext context;
	
	@Resource(
			mappedName = "java:/jms/queue/EmailQueue"
			)
	private Destination queue;
	
	public void enviar(String mensagem) {
		context.createProducer().send(queue, mensagem);
	}
	
}
