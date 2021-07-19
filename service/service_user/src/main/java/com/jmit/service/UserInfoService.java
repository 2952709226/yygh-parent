package com.jmit.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.jmit.pojo.UserInfo;

import com.jmit.pojo.vo.user.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;

public interface UserInfoService extends IService<UserInfo> {

    //会员登录
    Map<String, Object> login(LoginVo lo);

}
