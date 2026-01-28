package com.senai.pet.repository;


import com.senai.pet.DTO.PetDTO;
import com.senai.pet.entity.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private PetRepository petRepository;

    public PetService  (PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public String salvarPet(PetDTO dto){
        Pet pet = new Pet(dto.getNome(),dto.getIdade(),dto.getPorte(), dto.getTipo(),dto.getRaca());
        return "Salvo com sucesso!";
    }

    }

