package com.jmit.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "医院设置")
@TableName("hospital_set")
public class HospitalSet extends BaseEntity{
    /**
    * 编号
    */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
    * 医院名称
    */
    private String hosname;

    /**
    * 医院编号
    */
    private String hoscode;

    /**
    * api基础路径
    */
    private String apiUrl;

    /**
    * 签名秘钥
    */
    private String signKey;

    /**
    * 联系人
    */
    private String contactsName;

    /**
    * 联系人手机
    */
    private String contactsPhone;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * (1:已删除，0:未删除)
     * @TableLogic注解表示逻辑删除,删除方法会变成修改
    */
    @TableLogic
    private Integer isDeleted;
}