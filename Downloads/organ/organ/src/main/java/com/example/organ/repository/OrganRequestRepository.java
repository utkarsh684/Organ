package com.example.organ.repository;

import com.example.organ.entities.OrganRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganRequestRepository extends JpaRepository<OrganRequest,Long> {
}
