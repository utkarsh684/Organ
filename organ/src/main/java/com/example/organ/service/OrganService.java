package com.example.organ.service;

import com.example.organ.entities.Organ;
import com.example.organ.repository.OrganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganService {

    @Autowired
    private OrganRepository organRepository;

    public Organ addOrgan(Organ organ) {

        return organRepository.save(organ);
    }

    public List<Organ> getAllOrgans() {
        return organRepository.findAll();
    }

    public List<Organ> getOrgansByType(String organType) {
        return organRepository.findByOrganTypeAndIsDonatedFalse(organType);
    }
}
