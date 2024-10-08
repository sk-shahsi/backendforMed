package com.medcin.medcin.controller;

import com.medcin.medcin.entity.Medicine;
import com.medcin.medcin.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicineController {

    @Autowired
    MedicineService medicineService;
    @PostMapping("/medicines/{name}")
    private List<Medicine> getMedicines(@PathVariable("name")String name){

        return medicineService.findMedicineByName(name);

    }
    @PutMapping("/medicines")
    private Integer AddMedicine(@RequestBody Medicine medicine){

        medicineService.saveMedicine(medicine);
        return Math.toIntExact(medicine.getId());

    }

}
