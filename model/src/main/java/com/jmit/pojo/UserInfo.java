package com.jmit.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    /**
    * 编号
    */
    private Long id;

    /**
    * 微信openid
    */
    private String openid;

    /**
    * 昵称
    */
    private String nickName;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 用户姓名
    */
    private String name;

    /**
    * 证件类型
    */
    private String certificatesType;

    /**
    * 证件编号
    */
    private String certificatesNo;

    /**
    * 证件路径
    */
    private String certificatesUrl;

    /**
    * 认证状态（0：未认证 1：认证中 2：认证成功 -1：认证失败）
    */
    private Byte authStatus;

    /**
    * 状态（0：锁定 1：正常）
    */
    private Byte status;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 逻辑删除(1:已删除，0:未删除)
    */
    private Byte isDeleted;
}