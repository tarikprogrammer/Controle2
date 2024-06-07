package com.example.controle2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "project_employes")
public class ProjectEmployes {
    @Id
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employe employe;

    @Id
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
