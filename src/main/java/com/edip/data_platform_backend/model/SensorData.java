package com.edip.data_platform_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorName;
    private Double temperature;
    private Double vibration;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "machine_id", nullable = false)
    private Machine machine; // این همان Foreign Key است
}