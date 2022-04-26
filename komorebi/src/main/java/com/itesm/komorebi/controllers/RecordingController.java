package com.itesm.komorebi.controllers;

import com.itesm.komorebi.models.Recording;
import com.itesm.komorebi.services.RecordingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/v1/recording")
public class RecordingController {
    @Autowired
    RecordingService recordingService;
    @GetMapping("/all")
    public List<Recording> getAllRecordings(){
        return recordingService.findAll();
    }
}
