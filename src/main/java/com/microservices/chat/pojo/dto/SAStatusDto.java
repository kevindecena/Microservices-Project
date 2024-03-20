package com.microservices.chat.pojo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@JsonPropertyOrder({
        "status",
        "usernameLdap",
        "firstName",
        "lastName",
        "salesroomName",
        "mall",
        "city"
})
public class SAStatusDto {

    @JsonProperty("status")
    private String status;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("mall")
    private String mall;

    @JsonProperty("city")
    private String city;

    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;


}
