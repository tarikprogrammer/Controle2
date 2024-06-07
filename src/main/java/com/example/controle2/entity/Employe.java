package com.example.controle2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
    private String name;
    private String email;
    @ManyToMany
    @JoinTable(name = "project_employes",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employe")
    private List<Skill>skills;

}
