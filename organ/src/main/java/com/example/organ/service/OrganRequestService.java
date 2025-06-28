package com.example.organ.service;

import com.example.organ.entities.OrganRequest;
import com.example.organ.repository.OrganRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganRequestService {

    @Autowired
    private OrganRequestRepository organRequestRepository;

    public OrganRequest createOrganRequest(OrganRequest organRequest) {
        return organRequestRepository.save(organRequest);
    }

    public List<OrganRequest> getAllOrganRequests() {
        return organRequestRepository.findAll();
    }

    public List<OrganRequest> getUnmatchedRequests(String organType) {
        return organRequestRepository.findByOrganTypeAndMatchedFalse(organType);
    }
}
