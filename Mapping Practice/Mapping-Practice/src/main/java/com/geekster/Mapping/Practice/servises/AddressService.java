package com.geekster.Mapping.Practice.servises;

import com.geekster.Mapping.Practice.controller.AddressController;
import com.geekster.Mapping.Practice.models.Address;
import com.geekster.Mapping.Practice.repositories.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {


    @Autowired
   private IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address saved Successfully!!";
    }

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }
    @Transactional
    public String updateAddress(Address address) {
        iAddressRepo.updateAddress(address.getAddressId(),address.getAddressLandmark(), address.getAddressZipcode(),address.getAddressDistrict(),address.getAddressState(),address.getAddressCountry());
        return "Address Updated Successfully!!";
    }

    public String deleteAddress(Integer addressId) {
        iAddressRepo.deleteById(addressId);
        return "Id "+addressId+" Address deleted Successfully!!";
    }
}
