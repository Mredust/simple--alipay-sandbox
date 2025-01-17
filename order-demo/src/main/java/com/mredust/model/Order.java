package com.mredust.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Auther: Mredust
 * @Description: 商品订单实体类(支付实体对象)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Order {
    /**
     * 商品订单号：必填唯一
     */
    private String out_trade_no;
    
    /**
     * 订单名称：必填
     */
    private String subject;
    
    /*
     * 付款金额：必填
     */
    private String total_amount;
    
    /**
     * 超时时间参数
     */
    private String timeout_express = "10m";
    /**
     * 产品编号
     */
    private String product_code = "FAST_INSTANT_TRADE_PAY";
}
