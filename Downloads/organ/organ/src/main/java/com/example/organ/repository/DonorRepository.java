package com.example.organ.repository;

import com.example.organ.entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonorRepository extends JpaRepository<Donor,Long> {
    List<Donor> findByisAvailableTrue();
}
