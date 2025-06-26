package com.example.organ.controller;

import com.example.organ.entities.Organ;
import com.example.organ.service.OrganService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organ")
@RequiredArgsConstructor
public class OrganController {

    @Autowired
    private OrganService organService;

    @PostMapping
    public ResponseEntity<Organ> addOrgan(@RequestBody Organ organ){
        return ResponseEntity.ok(organService.addOrgan(organ));
    }

    @GetMapping
    public ResponseEntity<List<Organ>> getAllOrgans(){
        return ResponseEntity.ok(organService.getAllOrgans());
    }

    @GetMapping("/{type}/type")
    public ResponseEntity<List<Organ>> getOrgansByType(@PathVariable String type){
        return ResponseEntity.ok(organService.getOrgansByType(type));
    }


}
