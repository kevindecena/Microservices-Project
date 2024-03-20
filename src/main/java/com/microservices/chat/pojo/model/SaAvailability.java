package com.microservices.chat.pojo.model;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
@Entity
@Table(name = "sa_availability", schema = "app_sna_chat")
@EntityListeners(AuditingEntityListener.class)
public class SaAvailability {

    @Id
    @GeneratedValue(generator = "sa_availability_gen", strategy = GenerationType.IDENTITY)
    @Column(name = "id-sa_availability")
    private Long id;

    @Column(name ="text_status")
    private String status;

    @Column(name ="username_Ldap")
    private String usernameLdap;

    @Column(name ="first_Name")
    private String firstName;

    @Column(name ="salesroom_Code")
    private String salesroomCode;

    @Column(name ="dtime_created")
    private LocalDateTime createdDate;

    @Column(name ="dtime_last_ping")
    private LocalDateTime lastPingDate;





}
