package com.chen.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author Administrator
 */
@WebServlet("/login")
public class FromServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("访问到了doGet");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("访问到了doPost");
//    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 防止出现乱码，在第一行添加字符集编码，能够正确获取post请求的中文参数而不出现乱码
        req.setCharacterEncoding("UTF-8");

        // 响应页面的文件格式和编码格式
        resp.setContentType("text/html;charset=utf-8");

        // getContextPath 获取上下文路径
        System.out.println("getContextPath：" + req.getContextPath());
        // getHeader 根据指定的请求头获取对应的请求头的值
        System.out.println("getHeader: " + req.getHeader("Host"));
        // getRequestURI 返回请求的资源路径
        System.out.println("getRequestURI：" + req.getRequestURI());
        // getRequestURL 返回浏览器请求地址URL
        System.out.println("getRequestURL：" + req.getRequestURL());
        // getRemoteAddr 返回请求服务器的客户端IP
        System.out.println("getRemoteAddr：" + req.getRemoteAddr());
        // getServletPath 返回请求，<url-pattern>中的值
        System.out.println("getServletPath：" + req.getServletPath());
        // getParameter 根据参数名称获取对应的参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + "===" + password);
        // getParameterValues 根据参数名称获取对应的参数的多个值
        String[] usernames = req.getParameterValues("username");
        System.out.println(Arrays.toString(usernames));
        // Map<String,String[]> getParameterMap()：返回请求参数组成的Map集合；

        // getProtocol 获取协议版本HTTP/1.1
        System.out.println("getProtocol：" + req.getProtocol());
        // getMethod 获取请求方式（get 或 post）
        System.out.println("getMethod：" + req.getMethod());
        // getServerPort 获取端口号
        System.out.println("getServerPort：" + req.getServerPort());

        // 提交成功，输出页面提示成功
        String html = "<!DOCTYPE html><html><head><meta charset=\\\"UTF-8\\\"><title>Insert title here</title></head><body>访问成功~~</body></html>";
        PrintWriter writer = resp.getWriter();
        writer.write(html);
    }
}
