package com.example.iunetworks.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Entity
@Table(name = "violations")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Violation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "violation_id")
    private Integer id;

    @Column(name = "violation_token")
    private String violationToken;

    @Column(name = "violation_date")
    private Date violationDate;

    @Column(name = "violation_price")
    private double violationPrice;

    @Column(name = "violation_info")
    private String violationInfo;

    @ManyToOne
    @JoinColumn(name = "registry_id")
    @JsonIgnore
    private Registry registry;
}
