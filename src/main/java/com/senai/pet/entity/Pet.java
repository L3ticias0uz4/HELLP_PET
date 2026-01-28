package com.senai.pet.entity;

import com.senai.pet.enums.Porte;
import com.senai.pet.enums.Tipo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Table(name = "tb_pet")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private int idade;
    private Porte porte;
    private Tipo tipo;
    private String raca;
    public Pet()

    public Pet(@NotBlank String nome, int idade, @NotBlank Porte porte, @NotBlank Tipo tipo, String raca) {
    }
}
