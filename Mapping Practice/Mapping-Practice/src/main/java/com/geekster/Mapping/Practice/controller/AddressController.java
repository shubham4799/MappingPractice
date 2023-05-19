package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.models.Address;
import com.geekster.Mapping.Practice.servises.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/addAddress")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping("/getAllAddress")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @PutMapping("/updateAddress")
    public String updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }
    @DeleteMapping("/deleteAddress/{addressId}")
    public String deleteAddress(@PathVariable Integer addressId){
        return addressService.deleteAddress(addressId);
    }


}
