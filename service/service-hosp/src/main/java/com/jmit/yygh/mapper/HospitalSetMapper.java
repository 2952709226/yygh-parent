package com.jmit.yygh.mapper;

import com.jmit.pojo.HospitalSet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HospitalSetMapper {

    @Select("select * from hospital_set")
    List<HospitalSet> findAll();
}
