package com.ffutop.playground.api;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author fangfeng
 * @since 2020-06-15
 */
public interface CollectionService {

    String arrayMethod(Object[] params);

    String listMethod(List<Object> params);

    String setMethod(Set<Object> params);

    String mapMethod(Map<String, Object> params);

}
