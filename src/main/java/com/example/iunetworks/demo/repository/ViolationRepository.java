package com.example.iunetworks.demo.repository;

import com.example.iunetworks.demo.model.Violation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Repository
public interface ViolationRepository extends PagingAndSortingRepository<Violation, Integer> {

    @Query(value = "SELECT violations.violation_info FROM violations WHERE violation_token =?1 AND violation_id = ?2", nativeQuery = true)
    public String findByViolationTokenAndId(String token, Integer id);

}
