package com.jmit.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefundInfo {
    /**
    * 编号
    */
    private Integer id;

    /**
    * 对外业务编号
    */
    private String outTradeNo;

    /**
    * 订单编号
    */
    private Long orderId;

    /**
    * 支付类型（微信 支付宝）
    */
    private Byte paymentType;

    /**
    * 交易编号
    */
    private String tradeNo;

    /**
    * 退款金额
    */
    private BigDecimal totalAmount;

    /**
    * 交易内容
    */
    private String subject;

    /**
    * 退款状态
    */
    private Byte refundStatus;

    /**
    * 回调信息
    */
    private String callbackContent;

    private Date callbackTime;

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