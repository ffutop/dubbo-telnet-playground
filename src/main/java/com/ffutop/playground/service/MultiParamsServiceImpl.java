package com.ffutop.playground.service;

import com.alibaba.fastjson.JSONObject;
import com.ffutop.playground.api.MultiParamsService;
import com.ffutop.playground.model.PlayModel;
import com.ffutop.playground.util.ServiceMethodUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author fangfeng
 * @since 2020-06-16
 */
@Service("multiParamsService")
public class MultiParamsServiceImpl implements MultiParamsService {
    @Override
    public String multiParamsMethod1(int param1, PlayModel param2) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param1 + "," + JSONObject.toJSONString(param2) + ")";
    }

    @Override
    public String multiParamsMethod2(Map<String, Object> param1, List<Object> param2) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONObject.toJSONString(param1) + "," + JSONObject.toJSONString(param2) + ")";
    }

    @Override
    public String multiParamsMethod3(int param1, int param2, int param3, String param4) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + param1 + "," + param2 + "," + param3 + "," + param4 + ")";
    }
}
