package com.microservices.chat.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.stream.Stream;

@RequiredArgsConstructor
@Getter
public enum Status {
    ONLINE("Online"),
    PAIRING("Pairing"),
    BUSY("Busy"),
    OFFLINE("Offline");


    final String code;


    public static Status fromCode(String code) {
        return Stream.of(values())
                .filter(type -> type.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }



}
