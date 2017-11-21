package com.chinauicom.bluesky.config.servlets;

import com.chinauicom.bluesky.config.filters.IndexFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 配置web 的sevlet类 示例
 *
 * <p>
 *     相当于在web.xml配置<sevlet>标签
 *     </>
 */
public class CxfServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(IndexFilter.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("hello word!");
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }


}
