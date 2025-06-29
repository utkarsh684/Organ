package com.example.organ.controller;

import com.example.organ.entities.Donor;
import com.example.organ.service.MatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/match")
public class MatchingController {

    @Autowired
    private MatchingService matchingService;

    @GetMapping("/recipient/{id}")
    public ResponseEntity<List<Donor>> findMatchesForRecipient(@PathVariable Long id){
        List<Donor> matches = matchingService.findMatchesForRecipient(id);
        return ResponseEntity.ok(matches);
    }

}
