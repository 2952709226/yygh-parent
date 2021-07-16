package com.jmit.yygh.controller;

import com.alibaba.excel.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jmit.pojo.HospitalSet;
import com.jmit.pojo.vo.hosp.HospitalSetQueryVo;
import com.jmit.yygh.common.exception.YyghException;
import com.jmit.yygh.common.result.Result;
import com.jmit.yygh.common.utils.MD5;
import com.jmit.yygh.service.HospService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/HospitalSet")
public class HopsController {
    @Autowired
    HospService hospServiceImpl;

    //1.查询所有
    @ApiOperation(value = "获取所有医院设置")
    @GetMapping("/findAll")
    public Result findAllHospitalSet(){

        List<HospitalSet> list = hospServiceImpl.findAll();
        return Result.ok(list);
    }

    //2 逻辑删除医院设置
    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping("{id}")
    public Result removeHospitalSet(@PathVariable Long id) {
        boolean flag = hospServiceImpl.removeById(id);
        if(flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }


    //3 条件查询带分页
//    http://localhost:8201/HospitalSet/findPageHospSet/1/2【post】
    @PostMapping("findPageHospitalSet/{current}/{limit}")
    public Result findPageHospitalSet(@PathVariable long current,
                                  @PathVariable long limit,
                                  @RequestBody(required = false) HospitalSetQueryVo hospitalSetQueryVo) {//json形式,可以为空
        //创建page对象，传递当前页，每页记录数
        Page<HospitalSet> page = new Page<>(current,limit);
        //构建条件
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        String hosname = hospitalSetQueryVo.getHosname();//医院名称
        String hoscode = hospitalSetQueryVo.getHoscode();//医院编号
        if(!StringUtils.isEmpty(hosname)) {
            wrapper.like("hosname",hospitalSetQueryVo.getHosname());
        }
        if(!StringUtils.isEmpty(hoscode)) {
            wrapper.eq("hoscode",hospitalSetQueryVo.getHoscode());
        }
        //调用方法实现分页查询
        Page<HospitalSet> pageHospitalSet = hospServiceImpl.page(page, wrapper);
        //返回结果
        return Result.ok(pageHospitalSet);
    }

    //4.添加医院设置
    @PostMapping("saveHospitalSet")
    private Result saveHospitalSet(@RequestBody HospitalSet hospitalSet){
        //设置状态 1 使用 0 不使用
        hospitalSet.setStatus(1);

        //设置签名密钥
        Random random = new Random();
        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis()+""+random.nextInt(1000)));

        //调用service
        boolean save = hospServiceImpl.save(hospitalSet);
        if (save){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    //5.根据id获取医院设置
    @GetMapping("getIdHospitalSet/{id}")
    public Result getByIdHospitalSet(@PathVariable Long id){
//        try {
//            //模拟异常
//            int a = 1/0;
//        }catch (Exception e){
//            throw new YyghException("报告有错误啦!",201);
//        }
        HospitalSet byId = hospServiceImpl.getById(id);
        return Result.ok(byId);
    }

    //6.修改医院设置
    @PostMapping("updateHospitalSet")
    public Result updateHospitalSet(@RequestBody HospitalSet hospitalSet){
        boolean flag = hospServiceImpl.updateById(hospitalSet);
        if (flag){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    //7.批量删除医院设置
//    [id,id]集合
    @DeleteMapping("batchRemove")
    private Result batchRemoveHospitalSet(@RequestBody List<Long> idList){
        boolean byIds = hospServiceImpl.removeByIds(idList);
        return Result.ok();
    }

    //8.医院设置锁定和解锁
    @PutMapping("lockHospitalSet/{id}/{status}")
    private Result lockHospitalSet(@PathVariable Long id,
                                   @PathVariable Integer status){
        //根据id查询医院设置信息
        HospitalSet hospitalSet = hospServiceImpl.getById(id);
        //设置状态
        hospitalSet.setStatus(status);
        //调用方法
        hospServiceImpl.updateById(hospitalSet);
        return Result.ok();
    }

    //9.发送签名密钥
    @PutMapping("sendKey/{id}")
    private Result sengKenyHospitalSet(@PathVariable Long id){
        HospitalSet hospitalSet = hospServiceImpl.getById(id);
        String signKey = hospitalSet.getSignKey();
        String hoscode = hospitalSet.getHoscode();
        //TODO 发送短信
        return Result.ok();
    }

}
