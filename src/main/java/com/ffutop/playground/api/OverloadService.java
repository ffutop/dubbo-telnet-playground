package com.ffutop.playground.api;

import com.ffutop.playground.model.AnotherPlayModel;
import com.ffutop.playground.model.PlayModel;

import java.util.List;

/**
 * @author fangfeng
 * @since 2020-06-13
 */
public interface OverloadService {

    String method(long param);

    String method(Integer param);

    String method(String param);

    String method(PlayModel param);

    String method(AnotherPlayModel param);

    String method(String param1, PlayModel param2);

    String method(PlayModel param1, AnotherPlayModel param2);

}
