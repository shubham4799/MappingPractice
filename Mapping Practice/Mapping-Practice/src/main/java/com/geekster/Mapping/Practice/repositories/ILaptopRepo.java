package com.geekster.Mapping.Practice.repositories;

import com.geekster.Mapping.Practice.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop , Integer> {
    @Modifying
    @Query(value = "update laptop set laptop_Name = :laptopName , laptop_Brand = :laptopBrand , laptop_Price = :laptopPrice where laptop_Id = :laptopId" , nativeQuery = true)
    void updateLaptop(Integer laptopId, String laptopName, String laptopBrand, Integer laptopPrice);
}
