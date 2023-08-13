package com.macay.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentFallbackService
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/13 2:03 下午
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
