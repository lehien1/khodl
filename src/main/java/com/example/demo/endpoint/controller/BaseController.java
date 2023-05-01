package com.example.demo.endpoint.controller;

import com.example.demo.endpoint.entity.CubeBanHangEntity;
import com.example.demo.endpoint.entity.FactBanHangEntity;
import com.example.demo.endpoint.service.BaseService;
import com.example.demo.endpoint.entity.CuaHangEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class BaseController {

    @Autowired
    public BaseService baseService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping( "/list-cua-hang")
    public ResponseEntity<List<CuaHangEntity>> getListCuaHang() {
        List<CuaHangEntity> list = baseService.getListCuaHang();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping( "/list-fact-ban-hang")
    public ResponseEntity<List<FactBanHangEntity>> getListFactBanHang() {
        List<FactBanHangEntity> list = baseService.getListFactBanHang();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping( "/tong-tat-ca-doanh-thu")
    public ResponseEntity<Optional<CubeBanHangEntity>> getTongDoanhThu() {
        return new ResponseEntity<>(baseService.getTongTatCaDoanhThu(), HttpStatus.OK);
    }

}
