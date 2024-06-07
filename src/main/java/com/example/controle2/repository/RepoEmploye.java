package com.example.controle2.repository;

import com.example.controle2.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoEmploye extends JpaRepository<Employe,Long> {
}
