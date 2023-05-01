package com.example.demo.endpoint.repository;

import com.example.demo.endpoint.entity.CuaHangEntity;
import com.example.demo.endpoint.entity.CubeBanHangEntity;
import com.example.demo.endpoint.entity.FactBanHangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository {

    @Query("SELECT u FROM CuaHangEntity AS u ")
    List<CuaHangEntity> getListCuaHang();

    @Query("SELECT u FROM FactBanHangEntity AS u ")
    List<FactBanHangEntity> getListFactBanHang();

    Optional<CubeBanHangEntity> getTongDoanhThu();
}
