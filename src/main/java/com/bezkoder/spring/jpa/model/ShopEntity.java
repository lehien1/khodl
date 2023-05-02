package com.bezkoder.spring.jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "cua_hang")
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_cua_hang")
    private Integer shopId;

    @Column(name = "so_dien_thoai")
    private String phoneNumber;

    @Column(name = "thoi_gian_thanh_lap_ch")
    private Timestamp time;

    @Column(name = "ma_thanh_pho")
    private Integer cityId;
}
