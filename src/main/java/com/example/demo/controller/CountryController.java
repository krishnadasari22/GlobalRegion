package com.example.demo.controller;


import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryRepository countryRepository;
    @GetMapping(value="/countries")
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }
}