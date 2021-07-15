package com.jmit.yygh.service;

import com.jmit.pojo.HospitalSet;
import com.jmit.yygh.mapper.HospitalSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospService {
    @Autowired
    HospitalSetMapper hospitalSetMapper;

    @Cacheable(value = "hosp",keyGenerator = "keyGenerator")
    public List<HospitalSet> findAll(){
        return hospitalSetMapper.findAll();
    }

}
