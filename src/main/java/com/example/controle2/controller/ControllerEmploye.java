package com.example.controle2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerEmploye {
    @GetMapping("")
    public String index(){
        return "redirect:/employeAffectation";
    }
    @GetMapping("/employeAffectation")
    public String showForm(){
        return "employeAffectation";
    }
}
