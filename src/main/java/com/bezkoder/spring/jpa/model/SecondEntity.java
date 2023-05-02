package com.bezkoder.spring.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SecondEntity {

    @Id
    @Column(name = "TongSL")
    private Integer totalSl;

    @Column(name = "TongDT")
    private Integer TotalDt;
}
