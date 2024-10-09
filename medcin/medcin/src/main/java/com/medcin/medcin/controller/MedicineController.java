package com.medcin.medcin.controller;

import com.medcin.medcin.entity.Medicine;
import com.medcin.medcin.service.BillingService;
import com.medcin.medcin.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MedicineController {


    @Autowired
    MedicineService medicineService;
    @Autowired
    BillingService billingService;
    @GetMapping("/medicines/{name}")
    private List<Medicine> getMedicines(@PathVariable("name")String name){
        return medicineService.findMedicineByName(name);

    }
    @PutMapping("/medicines")
    private Integer AddMedicine(@RequestBody Medicine medicine){
        medicineService.saveMedicine(medicine);
        return Math.toIntExact(medicine.getId());

    }
    @GetMapping("/{id}")
    private Optional<Medicine> findMedicineById(@PathVariable int id){
        return medicineService.findMedicineById(id);
    }
    @PostMapping("/sell")

    private ResponseEntity<String> sellMedicine(@RequestParam int id, @RequestParam int quantitySold, @RequestParam double pricePerUnit){
        String response= billingService.sellMedicine(id, quantitySold, pricePerUnit);

        if (response.equals("Medicine sold successfully!")){
            return ResponseEntity.ok(response);
        }else
            return ResponseEntity.badRequest().body(response);
    }

}
