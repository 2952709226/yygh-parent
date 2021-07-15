package com.jmit.yygh.controller;

import com.jmit.pojo.HospitalSet;
import com.jmit.yygh.service.HospService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HopsController {
    @Autowired
    HospService hospService;

    @GetMapping("/hosp")
    public List<HospitalSet> findAll(){
        return hospService.findAll();
    }

}
