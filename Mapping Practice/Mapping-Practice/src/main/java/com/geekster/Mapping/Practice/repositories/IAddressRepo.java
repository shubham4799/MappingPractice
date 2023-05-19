package com.geekster.Mapping.Practice.repositories;

import com.geekster.Mapping.Practice.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address , Integer> {
    @Modifying
    @Query(value = "update address set address_Landmark = :addressLandmark , address_Zipcode = :addressZipcode , " +
            "address_District = :addressDistrict , address_State = :addressState , address_Country = :addressCountry " +
            "where address_Id = :addressId" , nativeQuery = true)
    void updateAddress(Integer addressId, String addressLandmark, String addressZipcode, String addressDistrict,
                       String addressState, String addressCountry);
}
