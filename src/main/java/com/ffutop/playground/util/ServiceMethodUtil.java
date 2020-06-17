package com.ffutop.playground.util;

/**
 * @author fangfeng
 * @since 2020-06-13
 */
public class ServiceMethodUtil {

    public static String getServiceMethodName() {
        StackTraceElement invokerElement = Thread.currentThread().getStackTrace()[2];
        return invokerElement.getClassName() + "#" + invokerElement.getMethodName();
    }
}
