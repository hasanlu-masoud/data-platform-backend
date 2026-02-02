package com.edip.data_platform_backend.controller;

import com.edip.data_platform_backend.model.Machine;
import com.edip.data_platform_backend.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/machines")
public class MachineController {
    @Autowired
    private MachineService machineService;

    @GetMapping
    public List<Machine> getMachines() {
        return machineService.getAllMachines();
    }

    @PostMapping
    public Machine addMachine(@RequestBody Machine machine) {
        return machineService.saveMachine(machine);
    }
}