package com.example.organ.service;

import com.example.organ.entities.Donor;
import com.example.organ.repository.DonorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;


    public Donor createDonor(Donor donor) {

        return donorRepository.save(donor);
    }

    public List<Donor> getAllDonors() {

        return donorRepository.findAll();
    }

    public Donor getDonorById(Long id) {
        return donorRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("No donor exist for this Id"));
    }

    public List<Donor> getAvaiableDonors() {

        return donorRepository.findByisAvailableTrue();
    }

    public void deleteDonorById(Long id){
        donorRepository.deleteById(id);
    }

    public void deleteDonor(){
        donorRepository.deleteAll();
    }
}
