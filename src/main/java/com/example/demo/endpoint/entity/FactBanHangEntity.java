package com.example.demo.endpoint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "fact_ban_hang")
public class FactBanHangEntity {
    @Id
    private Long mat_hang_key;

    @Column
    private Long khach_hang_key;

    @Column
    private Long cua_hang_key;

    @Column
    private Long thoi_gian_key;

    @Column
    private Integer tong_sl;

    @Column
    private Integer tong_dt;
}
