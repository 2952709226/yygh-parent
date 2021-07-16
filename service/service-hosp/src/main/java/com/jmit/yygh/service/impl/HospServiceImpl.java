package com.jmit.yygh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.pojo.HospitalSet;
import com.jmit.yygh.mapper.HospitalSetMapper;
import com.jmit.yygh.service.HospService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class HospServiceImpl extends ServiceImpl<HospitalSetMapper,HospitalSet> implements HospService {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

    @Override
    public List<HospitalSet> findAll() {
        return hospitalSetMapper.selectList(null);
    }


}
