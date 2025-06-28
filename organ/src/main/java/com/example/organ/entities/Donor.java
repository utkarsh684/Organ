package com.example.organ.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donor extends User{
    private LocalDateTime dateOfBirth;
    private boolean isAvailable;

    @OneToMany(mappedBy = "donor",cascade= CascadeType.ALL)
    @JsonManagedReference
    private List<Organ> organs;
}
