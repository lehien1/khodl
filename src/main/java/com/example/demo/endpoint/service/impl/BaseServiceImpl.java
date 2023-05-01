package com.example.demo.endpoint.service.impl;

import com.example.demo.endpoint.entity.CubeBanHangEntity;
import com.example.demo.endpoint.entity.FactBanHangEntity;
import com.example.demo.endpoint.repository.BaseRepository;
import com.example.demo.endpoint.service.BaseService;
import com.example.demo.endpoint.entity.CuaHangEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    public BaseRepository storeRepository;

    @Override
    public List<CuaHangEntity> getListCuaHang() {
        List<CuaHangEntity> listStore = new ArrayList<>();
        listStore = storeRepository.getListCuaHang();
        return listStore;
    }

    @Override
    public List<FactBanHangEntity> getListFactBanHang() {
        List<FactBanHangEntity> listStore = new ArrayList<>();
        listStore = storeRepository.getListFactBanHang();
        return listStore;
    }

    @Override
    public Optional<CubeBanHangEntity> getTongTatCaDoanhThu() {
        return storeRepository.getTongDoanhThu();
    }
}
