package com.edip.data_platform_backend.service;

import com.edip.data_platform_backend.model.SensorData;
import com.edip.data_platform_backend.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    // منطق ۱: ذخیره کردن داده جدید سنسور
    public SensorData saveSensorData(SensorData data) {
        // اینجا می‌توانی منطق اضافه کنی، مثلاً:
        if (data.getTemperature() > 100) {
            System.out.println("هشدار: دمای ماشین خیلی بالاست!");
        }
        return sensorRepository.save(data);
    }

    // منطق ۲: گرفتن تمام داده‌ها برای نمایش
    public List<SensorData> getAllSensorData() {
        return sensorRepository.findAll();
    }
}