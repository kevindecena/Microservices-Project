package com.microservices.chat.service.edge;

import com.microservices.chat.pojo.dto.SAStatusDto;

public interface V1SaAvailabilityService {

    SAStatusDto saveStatus(String username, SAStatusDto saStatusDto);

    SAStatusDto saveStatus(String username, SAStatusDto saStatusDto);

    SAStatusDto getStatus(String username);

    PageResponse<SAStatusDto> getSaStatuses(
            String employeeCodeDsm, String status, Integer page
    )


}
