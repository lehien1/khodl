package com.example.demo.endpoint.service;

import com.example.demo.endpoint.entity.CuaHangEntity;
import com.example.demo.endpoint.entity.CubeBanHangEntity;
import com.example.demo.endpoint.entity.FactBanHangEntity;

import java.util.List;
import java.util.Optional;

public interface BaseService {

    List<CuaHangEntity> getListCuaHang();
    List<FactBanHangEntity> getListFactBanHang();

    Optional<CubeBanHangEntity> getTongTatCaDoanhThu();
}
