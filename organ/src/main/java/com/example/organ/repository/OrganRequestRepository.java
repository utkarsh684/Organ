package com.example.organ.repository;

import com.example.organ.entities.OrganRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface OrganRequestRepository extends JpaRepository<OrganRequest,Long> {
    List<OrganRequest> findByOrganTypeAndMatchedFalse(String organType);
}
