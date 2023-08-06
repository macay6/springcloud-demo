package com.macay.dao;

import com.macay.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentDao
 * @Description:
 * @Author: Macay
 * @Date: 2023/3/28 5:46 下午
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
