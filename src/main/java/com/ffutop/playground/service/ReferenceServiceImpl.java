package com.ffutop.playground.service;

import com.alibaba.fastjson.JSONObject;
import com.ffutop.playground.api.ReferenceService;
import com.ffutop.playground.model.PlayModel;
import com.ffutop.playground.util.ServiceMethodUtil;
import org.springframework.stereotype.Service;

/**
 * @author fangfeng
 * @since 2020-06-13
 */
@Service("referenceService")
public class ReferenceServiceImpl implements ReferenceService {

    @Override
    public String stringMethod(String param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONObject.toJSONString(param) + ")";
    }

    @Override
    public String refMethod(PlayModel param) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONObject.toJSONString(param) + ")";
    }
}
