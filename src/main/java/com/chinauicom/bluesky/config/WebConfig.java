package com.chinauicom.bluesky.config;

import com.chinauicom.bluesky.config.filters.IndexFilter;
import com.chinauicom.bluesky.config.servlets.CxfServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Servlet、Filter、Listener配置
 *
 *  @author zhouwb15 2017-11-20
 */
@Configuration
public class WebConfig {

    /**
     * filter 注入
     * @return
     */
    @Bean
    public FilterRegistrationBean indexFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new IndexFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    /**
     * servlet 注入
     * @return
     */
    @Bean
    public ServletRegistrationBean indexServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new CxfServlet());
        registration.addUrlMappings("/services");
        return registration;
    }



}
