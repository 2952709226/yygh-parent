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

    /*@Override
    public List<HospitalSet> findAll() {
        return hospitalSetMapper.selectList(null);
    }

    @Override
    public void deleteById(Long id) {
        hospitalSetMapper.deleteById(id);
    }

    @Override
    public Page<HospitalSet> fingByPage(long page, long size, Map<String, Object> map) {
        QueryWrapper<HospService> wrapper = new QueryWrapper<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet){
//          第一个参数是否把后面的条件加入到查询条件中
//          和上面的if判断的写法是一样的效果，实现动态sql
            wrapper.eq(map.get(key) != null,key,map.get(key));
        }
        //设置分页参数
        Page<HospitalSet> pageDate = new Page<>(page,size);

        //第一个是分页参数，第二个是查询条件
//        List<HospitalSet> list = hospitalSetMapper.selectPage(pageDate,wrapper);
//        hospitalSetMapper.sele

//        pageDate.setRecords(list);
        //返回
        return pageDate;
    }*/

}
