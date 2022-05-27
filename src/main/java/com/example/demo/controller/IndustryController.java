package com.example.demo.controller;

import com.example.demo.model.Industry;
import com.example.demo.repository.IndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndustryController {
    @Autowired
    IndustryRepository industryRepository;
    @GetMapping(value = "/industry")
    public List<Industry> getAllIndustries(){
        return industryRepository.findAll();
    }
}
