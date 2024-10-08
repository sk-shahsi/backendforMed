package com.medcin.medcin.repo;

import com.medcin.medcin.entity.Medicine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Integer> {

    List<Medicine>findByName(String name);
}
