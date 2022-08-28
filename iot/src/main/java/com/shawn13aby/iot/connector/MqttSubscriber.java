package com.shawn13aby.iot.connector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.mqtt.inbound.Mqttv5PahoMessageDrivenChannelAdapter;
import org.springframework.stereotype.Component;

/**
 * @author Shawn Fu (shawn13aby@gmail.com)
 * created on 2022/2/22
 */
@Slf4j
@Component
public class MqttSubscriber {
//    @Value("${mqtt.host}")
//    private String host;
//    @Value("${mqtt.username}")
//    private String username;
//    @Value("${mqtt.password}")
//    private String password;


    public void subscribe(String topic, Integer qos) {

    }

//    @Bean
//    public IntegrationFlow mqttInFlow() {
//        Mqttv5PahoMessageDrivenChannelAdapter messageProducer =
//                new Mqttv5PahoMessageDrivenChannelAdapter(MQTT_URL, "mqttv5SIin", "siTest");
//        messageProducer.setPayloadType(String.class);
//        messageProducer.setMessageConverter(mqttStringToBytesConverter());
//        messageProducer.setManualAcks(true);
//
//        return IntegrationFlows.from(messageProducer)
//                .channel(c -> c.queue("fromMqttChannel"))
//                .get();
//    }

}
