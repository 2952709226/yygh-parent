package com.jmit.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface DictService extends IService<Dict> {

    List<Dict> findAll();
}
