package com.example.demo.endpoint.repository;

import com.example.demo.endpoint.entity.CuaHangEntity;
import com.example.demo.endpoint.entity.CubeBanHangEntity;
import com.example.demo.endpoint.entity.FactBanHangEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BaseRepositoryImpl implements BaseRepository {
    @Autowired
    EntityManager manager;

    @Override
    public List<CuaHangEntity> getListCuaHang() {
        return null;
    }

    @Override
    public List<FactBanHangEntity> getListFactBanHang() {
        return null;
    }

    @Override
    public Optional<CubeBanHangEntity> getTongDoanhThu() {
        var query = manager
                .createNativeQuery("select \n" +
                        "\t\t*\n" +
                        "\tfrom cube_banhang \n" +
                        "\tinner join dim_thoi_gian on cube_banhang.thoi_gian_key = dim_thoi_gian.thoi_gian_key\n" +
                        "\twhere \n" +
                        "\t cube_banhang.thoi_gian_key is not null \n" +
                        "\t and cube_banhang.khach_hang_key is null \n" +
                        "\t and cube_banhang.mat_hang_key is null \n" +
                        "\t and cube_banhang.cua_hang_key is null\n" +
                        "\tand dim_thoi_gian.nam = 2022", Tuple.class);

        return (Optional<CubeBanHangEntity>) query.getSingleResult();
    }
}
