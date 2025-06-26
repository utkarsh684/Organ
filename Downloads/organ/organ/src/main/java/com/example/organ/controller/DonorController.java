package com.example.organ.controller;

import com.example.organ.entities.Donor;
import com.example.organ.service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@RequiredArgsConstructor
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping
    public ResponseEntity<Donor> createDonor(@RequestBody Donor donor){
        return ResponseEntity.ok(donorService.createDonor(donor));
    }

    @GetMapping
    public ResponseEntity<List<Donor>> getAllDonors(){
        return ResponseEntity.ok(donorService.getAllDonors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donor> getDonorById(@PathVariable Long id){
        return ResponseEntity.ok(donorService.getDonorById(id));
    }

    @GetMapping("/available")
    public ResponseEntity<List<Donor>> getAvailableDonors(){
        return ResponseEntity.ok(donorService.getAvaiableDonors());
    }



}
