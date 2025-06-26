package com.example.organ.repository;

import com.example.organ.entities.Organ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganRepository extends JpaRepository<Organ,Long> {
}
