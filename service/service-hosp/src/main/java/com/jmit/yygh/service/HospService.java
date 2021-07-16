package com.jmit.yygh.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jmit.pojo.HospitalSet;
import com.jmit.yygh.mapper.HospitalSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface HospService extends IService<HospitalSet> {

    /*List<HospitalSet> findAll();

    void deleteById(Long id);

    Page<HospitalSet> fingByPage(long page, long size, Map<String, Object> map);*/

}
