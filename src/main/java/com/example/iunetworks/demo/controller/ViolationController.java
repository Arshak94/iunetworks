package com.example.iunetworks.demo.controller;

import com.example.iunetworks.demo.binding.ViolationBinding;
import com.example.iunetworks.demo.model.Violation;
import com.example.iunetworks.demo.service.violationService.ViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@RestController
@RequestMapping("/api/violation")
public class ViolationController {

    private final ViolationService violationService;

    @Autowired
    public ViolationController(ViolationService violationService){
        this.violationService = violationService;
    }

    @GetMapping("/get/{token}/{id}")
    public String getByToken(@PathVariable String token, @PathVariable Integer id){
       return violationService.getByTokenAndId(token, id);
    }
}
