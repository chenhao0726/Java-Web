package com.chen.xmlservlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Administrator
 */
public class OneDemoServlet implements Servlet {

    public OneDemoServlet() {
        System.out.println("创建了Servlet对象");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化Servlet");
        System.out.println("servletConfig.getServletContext():" + servletConfig.getServletContext());
        System.out.println("servletConfig.getServletName():" + servletConfig.getServletName());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("正在运行Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Servlet被销毁");
    }
}
