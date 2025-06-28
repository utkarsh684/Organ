package com.example.organ.service;

import com.example.organ.entities.Recipient;
import com.example.organ.repository.RecipientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipientService {

    @Autowired
    private RecipientRepository recipientRepository;


    public Recipient createRecipient(Recipient recipient) {
        return recipientRepository.save(recipient);
    }

    public List<Recipient> findAllRecipient() {
        return recipientRepository.findAll();
    }

    public Recipient findRecipientById(Long id) {
        return recipientRepository.findById(id).orElseThrow(() -> new RuntimeException("No Recipient of this id"));
    }
}
