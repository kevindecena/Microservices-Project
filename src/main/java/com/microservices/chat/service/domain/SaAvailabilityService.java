package com.microservices.chat.service.domain;

import com.microservices.chat.pojo.dto.SAStatusDto;
import com.microservices.chat.pojo.model.SaAvailability;

public interface SaAvailabilityService {

    SaAvailability saveStatus(SaAvailability saAvailability);

    SaAvailability saveStatus(String username, String status);

    SaAvailability saveStatus(String username, SAStatusDto saStatusDto);

    SaAvailability getSaAvailability(String usernamey);

    SaAvailability getSaAvailability(SaAvailability saAvailability);

}
