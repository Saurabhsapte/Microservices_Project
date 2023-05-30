package com.micro.repository;

import com.micro.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
//    Optional<Inventory> findBySkuCode(String skuCode);
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
