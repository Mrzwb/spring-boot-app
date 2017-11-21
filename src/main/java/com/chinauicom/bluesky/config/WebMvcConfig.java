package com.chinauicom.bluesky.config;

import com.chinauicom.bluesky.config.interceptors.AbstractHandleInterceptor;
import com.chinauicom.bluesky.config.interceptors.ParameterInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * spring mvc 额外配置
 *
 * author: zhouwb 2017-11-16
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    /**
     * 添加自定义拦截器
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getParameterInterceptor());
    }

    @Bean
    public AbstractHandleInterceptor getParameterInterceptor(){
        return new ParameterInterceptor();
    }


}
