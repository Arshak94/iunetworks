package com.example.iunetworks.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Date 5/5/18
 * Developer: Arshak Tovmasyan
 */

@JsonAutoDetect
public class ViolationDTO {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String personName;

    @JsonProperty
    private String address;

    @JsonProperty
    private String certificateNumber;

    @JsonProperty
    private String carNumber;

    @JsonProperty
    private String carModel;

    @JsonProperty
    private Date violationDate;

    @JsonProperty
    private double violationPrice;

    @JsonProperty
    private String violationToken;

    @JsonProperty
    private Integer violationId;

    public ViolationDTO(Integer id, String personName, String address, String certificateNumber, String carNumber,
                        String carModel, Date violationDate, double violationPrice, String violationToken, Integer violationId) {
        this.id = id;
        this.personName = personName;
        this.address = address;
        this.certificateNumber = certificateNumber;
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.violationDate = violationDate;
        this.violationPrice = violationPrice;
        this.violationToken = violationToken;
        this.violationId = violationId;
    }
}
