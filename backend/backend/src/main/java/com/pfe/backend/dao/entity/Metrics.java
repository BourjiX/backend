package com.pfe.backend.dao.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class Metrics {

    private String temp;

    private String hum;

    private boolean gaz;

    private boolean son;
    private ZonedDateTime date;

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    @Id
    public ZonedDateTime getDate() {
        return date;
    }
}
