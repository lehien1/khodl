package com.example.demo.endpoint.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cube_ban_hang")
public class CubeBanHangEntity {
    @Id
    private Integer mat_hang_key;

    @Column
    private Integer khach_hang_key;

    @Column
    private Integer cua_hang_key;

    @Column
    private Integer thoi_gian_key;

    @Column
    private Integer tong_sl;

    @Column
    private Integer tong_dt;
}
