package com.example.organ.controller;

import com.example.organ.entities.OrganRequest;
import com.example.organ.service.OrganRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@RequiredArgsConstructor
public class OrganRequestController {

    @Autowired
    private OrganRequestService organRequestService;

    @PostMapping
    public ResponseEntity<OrganRequest> createOrganRequest(@RequestBody OrganRequest organRequest){
        return ResponseEntity.ok(organRequestService.createOrganRequest(organRequest));
    }

    @GetMapping
    public ResponseEntity<List<OrganRequest>> getAllOrganRequests(){
        return ResponseEntity.ok(organRequestService.getAllOrganRequests());
    }

    @GetMapping("/unmatched/{organType}")
    public ResponseEntity<List<OrganRequest>> getUnmatchedRequests(@PathVariable String organType) {
        return ResponseEntity.ok(organRequestService.getUnmatchedRequests(organType));
    }


}
