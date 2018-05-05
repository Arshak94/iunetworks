package com.example.iunetworks.demo.service.violationService;

import com.example.iunetworks.demo.repository.ViolationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Service
public class ViolationServiceImpl implements ViolationService {

    private  final ViolationRepository violationRepository;

    @Autowired
    public ViolationServiceImpl(ViolationRepository violationRepository){
        this.violationRepository = violationRepository;
    }

    @Override
    public String getByTokenAndId(String token, Integer id){
        if (violationRepository.findByViolationTokenAndId(token, id)==null){
            throw new NoSuchElementException("violation does not exist");
        }
        return violationRepository.findByViolationTokenAndId(token, id);
    }
}
