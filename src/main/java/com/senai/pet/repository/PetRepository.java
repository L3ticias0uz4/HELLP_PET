package com.senai.pet.repository;

import com.senai.pet.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class PetRepository {
    @Repository
    public interface petRepository extends JpaRepository <Pet, Long> {

    }
}
