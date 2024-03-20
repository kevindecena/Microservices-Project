package com.microservices.chat.pojo.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("chat")
public class ChatProperties {

    private int pairingInterval;
    private long saLookupTime;
    private int pairingWaitingTime;
    private String jsonFileName;
    private boolean pairingEnabled;
}
