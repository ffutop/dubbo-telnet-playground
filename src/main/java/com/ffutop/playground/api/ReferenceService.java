package com.ffutop.playground.api;

import com.ffutop.playground.model.PlayModel;

/**
 * @author fangfeng
 * @since 2020-06-13
 */
public interface ReferenceService {

    String stringMethod(String param);

    String refMethod(PlayModel param);

}
