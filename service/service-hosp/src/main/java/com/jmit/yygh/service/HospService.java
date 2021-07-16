package com.jmit.yygh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmit.pojo.HospitalSet;

import java.util.List;

public interface HospService extends IService<HospitalSet> {

    List<HospitalSet> findAll();

}
