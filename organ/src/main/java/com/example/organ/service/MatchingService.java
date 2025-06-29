package com.example.organ.service;

import com.example.organ.entities.Donor;
import com.example.organ.entities.Recipient;
import com.example.organ.repository.DonorRepository;
import com.example.organ.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchingService {

    @Autowired
    private RecipientRepository recipientRepository;

    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> findMatchesForRecipient(Long id) {
        Recipient recipient =recipientRepository.findById(id).orElseThrow(()-> new RuntimeException("No Recipent for this id"));
        return donorRepository.findAll().stream()
                .filter(donor -> donor.getIsAvailable())
                .filter(donor -> donor.getBloodGroup().equalsIgnoreCase(recipient.getBloodGroup()))
                .filter(donor -> donor.getOrgans().stream().anyMatch(organ -> organ.getOrganType().equalsIgnoreCase(recipient.getRequiredOrgan())))
                .collect(Collectors.toList());
    }
}
