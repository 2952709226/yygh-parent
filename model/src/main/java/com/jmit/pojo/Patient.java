package com.jmit.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    /**
    * 编号
    */
    private Long id;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 姓名
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
    * 性别
    */
    private Byte sex;

    /**
    * 出生年月
    */
    private Date birthdate;

    /**
    * 手机
    */
    private String phone;

    /**
    * 是否结婚
    */
    private Byte isMarry;

    /**
    * 省code
    */
    private String provinceCode;

    /**
    * 市code
    */
    private String cityCode;

    /**
    * 区code
    */
    private String districtCode;

    /**
    * 详情地址
    */
    private String address;

    /**
    * 联系人姓名
    */
    private String contactsName;

    /**
    * 联系人证件类型
    */
    private String contactsCertificatesType;

    /**
    * 联系人证件号
    */
    private String contactsCertificatesNo;

    /**
    * 联系人手机
    */
    private String contactsPhone;

    /**
    * 就诊卡号
    */
    private String cardNo;

    /**
    * 是否有医保
    */
    private Byte isInsure;

    /**
    * 状态（0：默认 1：已认证）
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