package com.gs.poc.web;

import com.gs.poc.service.POCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POCController {
    @Autowired
    POCService pocService;

    @GetMapping("/poc")
    public String getPOCResult(){
        pocService.testRestTemplate();
        return "Hello";
    }

    @GetMapping("/dockerpoc")
    public String getDockerPOCResult(){
        //pocService.testRestTemplate();
        return "Hello From Docker";
    }

}
