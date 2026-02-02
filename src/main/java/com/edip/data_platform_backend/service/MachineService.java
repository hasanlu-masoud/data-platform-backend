package com.edip.data_platform_backend.service;

import com.edip.data_platform_backend.model.Machine;
import com.edip.data_platform_backend.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MachineService {
    @Autowired
    private MachineRepository machineRepository;

    public Machine saveMachine(Machine machine) {
        return machineRepository.save(machine);
    }

    public List<Machine> getAllMachines() {
        return machineRepository.findAll();
    }
}