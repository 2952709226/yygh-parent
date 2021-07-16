package com.jmit.yygh.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jmit.pojo.HospitalSet;
import com.jmit.yygh.common.result.PageResult;
import com.jmit.yygh.common.result.Result;
import com.jmit.yygh.service.HospService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HopsController {
    @Autowired
    HospService hospService;

    //1.查询所有
    /*@ApiOperation(value = "获取所有医院设置")
    @GetMapping("/hosp")
    public Result findAllHospSet(){
        List<HospitalSet> list = hospService.findAll();
        return Result.ok(list);
    }

    //2.删除
    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping(value = "{id}")
    private Result removeHospSet(@PathVariable Long id){
        hospService.deleteById(id);
        return new Result(200,"删除成功");
    }


    //3.条件查询带分页
    //POST /findPageHospSet/{page}/{size}
    @RequestMapping(value = "findPageHospSet/{page}/{size}",method = RequestMethod.POST)
    private Result findPageHospSet(@PathVariable long page,
                                   @PathVariable long size,
                                   @RequestBody Map<String,Object> map){
        //根据条件分页查询
        Page<HospitalSet> pageData = hospService.fingByPage(page,size,map);
        //封装分页返回对象
        PageResult<HospitalSet> pageResult = new PageResult<>(
                pageData.getTotal(),pageData.getRecords()
        );
        return Result.ok(pageResult);


//        //创建page对象，传递当前页，每页记录数
//        Page<HospitalSet> page = new Page<>(current,limit);
//
//        //构造条件
//        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
//        String hosname = hospitalSetQueryVo.getHosname();
//        String hoscode = hospitalSetQueryVo.getHoscode();
//
//        if (!StringUtils.isEmpty(hosname)){
//            //医院名称模糊查询
//            wrapper.like("hosname",hospitalSetQueryVo.getHosname());
//        }
//        if (!StringUtils.isEmpty(hoscode)){
//            wrapper.eq("hoscode",hospitalSetQueryVo.getHoscode());
//        }
//
//        //调用方法实现分页查询
//        Page<HospitalSet> pageHospitalSet = hospService.page(page,wrapper);
//
//        return Result.ok(pageHospitalSet);
    }*/


    //4.添加医院设置

    //5.根据id获取医院设置

    //6.修改医院设置

    //7.批量删除医院设置






}
