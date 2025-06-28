package com.example.organ.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipient extends User{

    private LocalDateTime dateOfBirth;
    private String medicalCondition;

    @OneToMany(mappedBy = "recipient",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<OrganRequest> organRequests;

}
