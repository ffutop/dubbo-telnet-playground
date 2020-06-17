package com.ffutop.playground.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ffutop.playground.api.CollectionService;
import com.ffutop.playground.util.ServiceMethodUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author fangfeng
 * @since 2020-06-15
 */
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService {
    @Override
    public String arrayMethod(Object[] params) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONArray.toJSONString(params) + ")";
    }

    @Override
    public String listMethod(List<Object> params) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONObject.toJSONString(params) + ")";
    }

    @Override
    public String setMethod(Set<Object> params) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONObject.toJSONString(params) + ")";
    }

    @Override
    public String mapMethod(Map<String, Object> params) {
        return ServiceMethodUtil.getServiceMethodName() + "(" + JSONObject.toJSONString(params) + ")";
    }
}
