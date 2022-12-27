package com.testesapi.testesapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private List<Frete> fretes;
    private String nome;
    private String uf;
    private float taxa;

}
