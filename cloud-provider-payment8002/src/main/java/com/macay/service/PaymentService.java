package com.macay.service;

import com.macay.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentService
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/28 5:57 下午
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
