package com.bezkoder.spring.jpa.repository;

import com.bezkoder.spring.jpa.model.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<ShopEntity, Integer> {
    ShopEntity findByShopId(int shopId);
}
