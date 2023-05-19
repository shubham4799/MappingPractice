package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.models.Laptop;
import com.geekster.Mapping.Practice.servises.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping("/addLaptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping("/getAllLaptop")
    public List<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();
    }

    @PutMapping("/updateLaptop")
    public String updateLaptop(@RequestBody Laptop laptop){
        return laptopService.updateLaptop(laptop);
    }

    @DeleteMapping("/deleteLaptopById/{laptopId}")
    public String deleteLaptopById(@PathVariable Integer laptopId){
        return laptopService.deleteLaptopById(laptopId);
    }
}
