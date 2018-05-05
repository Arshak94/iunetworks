package com.example.iunetworks.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Entity
@Table(name = "registry")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SqlResultSetMapping(name = "ViolationDTOMapping", classes = {@ConstructorResult(targetClass = ViolationDTO.class, columns = {
        @ColumnResult(name = "id"),
        @ColumnResult(name = "cert_num"),
        @ColumnResult(name = "car_num"),
        @ColumnResult(name = "car_model"),
        @ColumnResult(name = "address"),
        @ColumnResult(name = "persion_name"),
        @ColumnResult(name = "violation_date", type = Date.class),
        @ColumnResult(name = "violation_price", type = Double.class),
        @ColumnResult(name = "violation_token"),
        @ColumnResult(name = "violation_id")


})})
@NamedNativeQuery(name = "Registry.findByCarNumberAndCertificateNumber", query = "SELECT registry.id, registry.cert_num, registry.car_num, registry.car_model, registry.address,registry.persion_name, violations.violation_date, violations.violation_price, violations.violation_token, violations.violation_id FROM registry, violations WHERE registry.id = violations.registry_id AND registry.car_num = ?1 AND registry.cert_num = ?2",resultClass = ViolationDTO.class, resultSetMapping = "ViolationDTOMapping")
public class Registry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "car_num")
    private String carNumber;

    @Column(name = "cert_num")
    private String certificateNumber;

    @Column(name = "persion_name")
    private String personName;

    @Column(name = "address")
    private String address;

    @Column(name = "car_model")
    private String carModel;

    @OneToMany(mappedBy = "registry", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Violation> violations;

}