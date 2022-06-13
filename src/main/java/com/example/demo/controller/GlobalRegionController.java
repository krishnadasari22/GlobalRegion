package com.example.demo.controller;
import com.example.demo.model.GlobalRegion;
import com.example.demo.repository.GlobalRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GlobalRegionController {
    @Autowired
    GlobalRegionRepository globalRegionRepository;
    @GetMapping(value="/global-region")
    public List<GlobalRegion> getAllRegions(){
        return globalRegionRepository.findAll();

    }
}
