package com.example.iunetworks.demo.service.registryService;

import com.example.iunetworks.demo.model.ViolationDTO;

import java.util.List;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
public interface RegistryService {

    public List<ViolationDTO> getAllByCarNumberAndCertificateNumber(String carNum, String cerNumber);

}
