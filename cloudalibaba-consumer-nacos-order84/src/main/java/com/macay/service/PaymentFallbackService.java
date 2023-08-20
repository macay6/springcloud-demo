package com.macay.service;

import com.macay.entity.CommonResult;
import com.macay.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PaymentFallbackService
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/20 2:59 下午
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
