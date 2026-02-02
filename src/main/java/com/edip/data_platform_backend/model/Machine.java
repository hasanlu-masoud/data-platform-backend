package com.edip.data_platform_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Entity
@Data
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String location;
    private String status; // مثل: ACTIVE, MAINTENANCE, STOPPED
}