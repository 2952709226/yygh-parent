package com.jmit.controller;

import com.jmit.pojo.vo.user.LoginVo;
import com.jmit.service.UserInfoService;

import com.jmit.yygh.common.result.Result;


import com.jmit.yygh.common.utils.IpUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserInfoApiController {
    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "会员登录")
    @PostMapping("/login")
    public Result login(@RequestBody LoginVo loginVo, HttpServletRequest request) {
        loginVo.setIp(IpUtil.getIpAddr(request));
        Map<String, Object> info = userInfoService.login(loginVo);
        return Result.ok(info);
    }

    @GetMapping("/login")
    public String login() {
//        loginVo.setIp(IpUtil.getIpAddr(request));
//        Map<String, Object> info = userInfoService.login(loginVo);
        return "12321";
    }
}
