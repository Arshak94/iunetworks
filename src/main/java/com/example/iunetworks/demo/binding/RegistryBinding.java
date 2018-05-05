package com.example.iunetworks.demo.binding;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Date 5/4/18
 * Developer: Arshak Tovmasyan
 */
@Getter
@Setter
public class RegistryBinding {

    private String personName;

    private String address;

    private String certificateNumber;

    private String carNumber;

    private String carModel;
}
