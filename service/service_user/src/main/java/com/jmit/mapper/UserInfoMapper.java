package com.jmit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jmit.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Resource
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
