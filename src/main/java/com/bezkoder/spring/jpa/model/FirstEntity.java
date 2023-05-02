package com.bezkoder.spring.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FirstEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "khach_hang_key")
    private Integer customerKey;

    @Column(name = "mat_hang_key")
    private Integer productKey;

    @Column(name = "cua_hang_key")
    private Integer shopKey;

    @Column(name = "thoi_gian_key")
    private Integer timeKey;

    @Column(name = "tong_sl")
    private Integer totalSl;

    @Column(name = "tong_dt")
    private Integer totalDt;

    @Column(name = "thang")
    private String month;

    @Column(name = "quy")
    private String quarter;

    @Column(name = "nam")
    private String year;
}
