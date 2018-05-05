package com.example.iunetworks.demo.service.registryService;

import com.example.iunetworks.demo.model.ViolationDTO;
import com.example.iunetworks.demo.repository.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Service
public class RegistryServiceImpl implements RegistryService {

    private final RegistryRepository registryRepository;

    @Autowired
    public RegistryServiceImpl(RegistryRepository registryRepository){
        this.registryRepository = registryRepository;
    }

    @Override
    public List<ViolationDTO> getAllByCarNumberAndCertificateNumber(String carNum, String cerNumber){
        return registryRepository.findByCarNumberAndCertificateNumber(carNum,cerNumber);
    }


}
