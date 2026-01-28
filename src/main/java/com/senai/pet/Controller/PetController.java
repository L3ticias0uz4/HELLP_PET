package com.senai.pet.Controller;


import com.senai.pet.DTO.PetDTO;
import com.senai.pet.entity.Pet;
import com.senai.pet.repository.PetService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Pet")
@RestController
public class PetController<dto> {

    private final PetService petService;

    public PetController(PetService petService){
        this.petService =petService;
    }

    @PostMapping
    public ResponseEntity<?>savePet(@Valid @RequestBody PetDTO dto){
        petService.salvarPet(dto);
        return ResponseEntity.ok("Salvo!");
    }
}
