package com.macay.service.impl;

import com.macay.dao.PaymentDao;
import com.macay.entity.Payment;
import org.springframework.stereotype.Service;
import com.macay.service.PaymentService;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/28 5:58 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
