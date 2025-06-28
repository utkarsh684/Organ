package com.example.organ.repository;

import com.example.organ.entities.Organ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganRepository extends JpaRepository<Organ,Long> {
    List<Organ> findByOrganTypeAndIsDonatedFalse(String organType);
}
