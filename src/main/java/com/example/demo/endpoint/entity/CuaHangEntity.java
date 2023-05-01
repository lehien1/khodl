package com.example.demo.endpoint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "cua_hang")
public class CuaHangEntity {
    @Id
    private Integer ma_cua_hang;

    @Column
    private String so_dien_thoai;

    @Column
    private Date thoi_gian_thanh_lap_ch;

    @Column
    private Integer ma_thanh_pho;
}
