package com.jmit.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    /**
    * 编号
    */
    private Long id;

    private Long userId;

    /**
    * 订单交易号
    */
    private String outTradeNo;

    /**
    * 医院编号
    */
    private String hoscode;

    /**
    * 医院名称
    */
    private String hosname;

    /**
    * 科室编号
    */
    private String depcode;

    /**
    * 科室名称
    */
    private String depname;

    /**
    * 医生职称
    */
    private String title;

    /**
    * 排班编号（医院自己的排班主键）
    */
    private String hosScheduleId;

    /**
    * 安排日期
    */
    private Date reserveDate;

    /**
    * 安排时间（0：上午 1：下午）
    */
    private Byte reserveTime;

    /**
    * 就诊人id
    */
    private Integer patientId;

    /**
    * 就诊人名称
    */
    private String patientName;

    /**
    * 就诊人手机
    */
    private String patientPhone;

    /**
    * 预约记录唯一标识（医院预约记录主键）
    */
    private String hosRecordId;

    /**
    * 预约号序
    */
    private Integer number;

    /**
    * 建议取号时间
    */
    private String fetchTime;

    /**
    * 取号地点
    */
    private String fetchAddress;

    /**
    * 医事服务费
    */
    private Long amount;

    /**
    * 退号时间
    */
    private Date quitTime;

    /**
    * 订单状态
    */
    private Byte orderStatus;

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