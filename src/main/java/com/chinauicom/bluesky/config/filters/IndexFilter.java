package com.chinauicom.bluesky.config.filters;

import com.chinauicom.bluesky.controller.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * 配置web 的过来类(Filter) 示例
 * <p>
 *     相当于在web.xml配置<filter>标签
 *     </>
 */
public class IndexFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(IndexFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("init IndexFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter IndexFilter");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
