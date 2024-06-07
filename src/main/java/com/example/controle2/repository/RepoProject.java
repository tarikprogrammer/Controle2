package com.example.controle2.repository;

import com.example.controle2.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoProject extends JpaRepository<Project,Long> {
}
