package com.example.controle2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_id;
    private String name;
    private double budge;
    @ManyToMany(mappedBy = "projects")
    private List<Employe>employes;

}
