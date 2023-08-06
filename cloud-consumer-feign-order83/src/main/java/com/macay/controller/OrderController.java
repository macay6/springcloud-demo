package com.macay.controller;

import com.macay.entity.CommonResult;
import com.macay.entity.Payment;
import com.macay.feign.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @ClassName: PaymentController
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/28 5:59 下午
 */

@RestController
@Slf4j
public class OrderController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        CommonResult<Payment> paymentById = paymentFeignService.getPaymentById(id);
        return paymentById;
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //open-feign-ribbon,客户端默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
