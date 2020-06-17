package com.ffutop.playground.api;

import com.ffutop.playground.model.PlayModel;

import java.util.List;
import java.util.Map;

/**
 * @author fangfeng
 * @since 2020-06-16
 */
public interface MultiParamsService {

    String multiParamsMethod1(int param1, PlayModel param2);

    String multiParamsMethod2(Map<String, Object> param1, List<Object> param2);

    String multiParamsMethod3(int param1, int param2, int param3, String param4);

}
