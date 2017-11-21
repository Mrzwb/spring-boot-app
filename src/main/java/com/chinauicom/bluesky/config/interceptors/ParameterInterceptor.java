package com.chinauicom.bluesky.config.interceptors;

import org.springframework.lang.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 参数拦截器
 *
 * @author zhouwb15 2017-11-16
 */
public class ParameterInterceptor extends AbstractHandleInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        System.out.println("parameter Interceptor...");
    }
}
