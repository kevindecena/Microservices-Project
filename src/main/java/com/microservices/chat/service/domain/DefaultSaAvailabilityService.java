package com.microservices.chat.service.domain;

import com.microservices.chat.pojo.model.SaAvailability;
import com.microservices.chat.pojo.property.ChatProperties;
import com.microservices.chat.repository.SaAvailabilityRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//sample domain service class, used primarily with repositories, properties, and other external service needs

@RequiredArgsConstructor
@Service
@Slf4j
public class DefaultSaAvailabilityService implements SaAvailabilityService{
    private final SaAvailabilityRepository saAvailabilityRepository;

    private final ChatProperties chatProperties;

    @Override
    public SaAvailability saveStatus(SaAvailability saAvailability){
        return saAvailabilityRepository.save(saAvailability);
    }

    @Override
    public SaAvailability saveStatus(String username){
        SaAvailability saAvailability = saAvailabilityRepository.findByUsernameLdapEquals(username)
                .orElse(SaAvailability.builder().usernameLdap(username).build());

        return saAvailability;
    }


}
