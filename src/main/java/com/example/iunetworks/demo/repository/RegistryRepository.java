package com.example.iunetworks.demo.repository;

import com.example.iunetworks.demo.model.Registry;
import com.example.iunetworks.demo.model.ViolationDTO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Repository
public interface RegistryRepository extends PagingAndSortingRepository<Registry, Integer> {

    public List<ViolationDTO> findByCarNumberAndCertificateNumber(String carNumber, String cerNumber);
}
