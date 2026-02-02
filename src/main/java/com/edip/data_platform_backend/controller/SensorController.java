package com.edip.data_platform_backend.controller;

import com.edip.data_platform_backend.model.SensorData;
import com.edip.data_platform_backend.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors") // آدرس اصلی ورودی ما
public class SensorController {

    @Autowired
    private SensorService sensorService;

    // ۱. دریافت تمام داده‌ها (برای نمایش در جدول)
    @GetMapping
    public List<SensorData> getAllData() {
        return sensorService.getAllSensorData();
    }

    // ۲. ذخیره کردن داده جدید (مثلاً از طرف سنسور)
    @PostMapping
    public SensorData createData(@RequestBody SensorData data) {
        return sensorService.saveSensorData(data);
    }
}