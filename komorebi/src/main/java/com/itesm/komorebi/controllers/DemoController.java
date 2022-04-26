package com.itesm.komorebi.controllers;


import com.itesm.komorebi.repositories.RecordingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {

    @Autowired
    RecordingRepository recoringRepository;

    @GetMapping("/hello-world")
    public String helloWorld(){
        String miString="Hola";
        recoringRepository.findAll();
        return miString;
    }
}
