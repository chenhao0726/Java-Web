package com.chen.two.annoservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/done1", "/dtwo2"}, loadOnStartup = 2)
public class DogServlet implements Servlet {

    public DogServlet() {
        System.out.println("DogServlet构造.....");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化DogServlet......");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("DogServlet服务......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁......");
    }
}
