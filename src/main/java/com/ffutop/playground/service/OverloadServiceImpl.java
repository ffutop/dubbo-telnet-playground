package com.ffutop.playground.service;

import com.alibaba.fastjson.JSONObject;
import com.ffutop.playground.api.OverloadService;
import com.ffutop.playground.model.AnotherPlayModel;
import com.ffutop.playground.model.PlayModel;
import com.ffutop.playground.util.ServiceMethodUtil;
import org.springframework.stereotype.Service;

/**
 * @author fangfeng
 * @since 2020-06-13
 */
@Service("overloadService")
public class OverloadServiceImpl implements OverloadService {

    @Override
    public String method(long param) {
        return ServiceMethodUtil.getServiceMethodName() + "(long " + param + ")";
    }

    @Override
    public String method(Integer param) {
        return ServiceMethodUtil.getServiceMethodName() + "(Integer " + param + ")";
    }

    @Override
    public String method(String param) {
        return ServiceMethodUtil.getServiceMethodName() + "(String " + param + ")";
    }

    @Override
    public String method(PlayModel param) {
        return ServiceMethodUtil.getServiceMethodName() + "(PlayModel " + JSONObject.toJSONString(param) + ")";
    }

    @Override
    public String method(AnotherPlayModel param) {
        return ServiceMethodUtil.getServiceMethodName() + "(AnotherPlayModel " + JSONObject.toJSONString(param) + ")";
    }

    @Override
    public String method(String param1, PlayModel param2) {
        return ServiceMethodUtil.getServiceMethodName() + "(String " + param1 + ", PlayModel " + JSONObject.toJSONString(param2) + ")";
    }

    @Override
    public String method(PlayModel param1, AnotherPlayModel param2) {
        return ServiceMethodUtil.getServiceMethodName() + "(PlayModel " + JSONObject.toJSONString(param1) + ", AnotherPlayModel" + JSONObject.toJSONString(param2) + ")";
    }

}
