package com.example.organ.controller;

import com.example.organ.entities.Recipient;
import com.example.organ.service.RecipientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipient")
@RequiredArgsConstructor
public class RecipientController {

    @Autowired
    private RecipientService recipientService;

    @PostMapping
    public ResponseEntity<Recipient> createRecipient(@RequestBody Recipient recipient){
        return  ResponseEntity.ok(recipientService.createRecipient(recipient));
    }

    @GetMapping
    public ResponseEntity<List<Recipient>> findAllRecipient(){
        return ResponseEntity.ok(recipientService.findAllRecipient());
    }

    @GetMapping
    public ResponseEntity<Recipient> findRecipientById(@PathVariable Long id){
        return ResponseEntity.ok(recipientService.findRecipientById(id));
    }
}
