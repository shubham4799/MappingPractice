package com.geekster.Mapping.Practice.servises;

import com.geekster.Mapping.Practice.models.Laptop;
import com.geekster.Mapping.Practice.models.Student;
import com.geekster.Mapping.Practice.repositories.ILaptopRepo;
import com.geekster.Mapping.Practice.repositories.IStudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private ILaptopRepo iLaptopRepo;
    @Autowired
    private IStudentRepo studentRepo;

    public String addLaptop(Laptop laptop) {
        Integer studentId = laptop.getStudent().getStudentId();
        Student studentObject = studentRepo.findById(studentId).get();
        laptop.setStudent(studentObject);

        iLaptopRepo.save(laptop);

        return "Laptop Added successfully!!";
    }

    public List<Laptop> getAllLaptop() {
       return iLaptopRepo.findAll();
    }
    @Transactional
    public String updateLaptop(Laptop laptop) {
        iLaptopRepo.updateLaptop(laptop.getLaptopId(),laptop.getLaptopName(),laptop.getLaptopBrand(),laptop.getLaptopPrice());
        return "Laptop updated successfully!!";
    }

    public String deleteLaptopById(Integer laptopId) {
        iLaptopRepo.deleteById(laptopId);
        return "Id "+laptopId+" Laptop deleted successfully!!";
    }
}
