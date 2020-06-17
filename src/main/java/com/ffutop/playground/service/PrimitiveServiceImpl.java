package com.ffutop.playground.service;

import com.ffutop.playground.api.PrimitiveService;
import com.ffutop.playground.util.ServiceMethodUtil;
import org.springframework.stereotype.Service;

/**
 * @author fangfeng
 * @since 2020-06-13
 */
@Service("primitiveService")
public class PrimitiveServiceImpl implements PrimitiveService {

    @Override
    public String boolMethod(boolean param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String byteMethod(byte param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String shortMethod(short param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String intMethod(int param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String longMethod(long param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String floatMethod(float param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String doubleMethod(double param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }

    @Override
    public String charMethod(char param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param + ")";
    }
}
