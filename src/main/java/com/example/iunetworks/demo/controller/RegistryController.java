package com.example.iunetworks.demo.controller;

import com.example.iunetworks.demo.model.ViolationDTO;
import com.example.iunetworks.demo.service.registryService.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@RestController
@RequestMapping("/api/registry")
public class RegistryController {

    private final RegistryService registryService;

    @Autowired
    public RegistryController(RegistryService registryService){
        this.registryService = registryService;
    }

    @GetMapping("/get/{carNumber}/{certificateNUmber}")
    public List<ViolationDTO> get(@PathVariable String carNumber, @PathVariable String certificateNUmber){
        List<ViolationDTO> violationDTOList = registryService.getAllByCarNumberAndCertificateNumber(carNumber,certificateNUmber);
        return violationDTOList;
    }
}
