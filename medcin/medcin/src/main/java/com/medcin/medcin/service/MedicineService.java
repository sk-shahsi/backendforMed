package com.medcin.medcin.service;

import com.medcin.medcin.entity.Medicine;
import com.medcin.medcin.repo.MedicineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicineService {
    @Autowired
    MedicineRepo medicineRepo;

    public void addMedicine(Medicine medicine){
        medicineRepo.save(medicine);
    }
    public List<Medicine> findMedicineByName(String name){

        return medicineRepo.findByName(name);
    }
    public void saveMedicine(Medicine medicin){
        medicineRepo.save(medicin);
    }
}
