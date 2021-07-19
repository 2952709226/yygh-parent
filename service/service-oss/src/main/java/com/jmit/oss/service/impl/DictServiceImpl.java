package com.jmit.oss.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.oss.mapper.DictMapper;
import com.jmit.oss.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl extends ServiceImpl<DictMapper,Dict> implements DictService {

    @Autowired
    DictMapper dictMapper ;


    @Override
    public List<Dict> findAll() {
        return dictMapper.selectList(null);
    }
}
