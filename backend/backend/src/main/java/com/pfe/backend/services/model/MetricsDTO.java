package com.pfe.backend.services.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetricsDTO {

    private String temp;

    private String hum;

    private boolean gaz;

    private boolean son;
}
