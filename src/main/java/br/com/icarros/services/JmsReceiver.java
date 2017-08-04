package br.com.icarros.services;

import br.com.icarros.configs.JmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsReceiver {

    @Autowired
    JmsTemplate jmsTemplate;

    @JmsListener(destination = "teste_queue")
    public void receiverJMS(String json){
        System.out.println("recebendo = " + json);
    }

    public void sendMe(String teste){
        jmsTemplate.convertAndSend("teste_queue",teste);
    }


}
