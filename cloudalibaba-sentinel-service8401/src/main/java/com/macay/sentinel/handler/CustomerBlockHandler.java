package com.macay.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.macay.entity.CommonResult;

/**
 * @ClassName: CustomerBlockHandler
 * @Description:
 * @Author: Macay
 * @Date: 2023/8/20 11:08 上午
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
