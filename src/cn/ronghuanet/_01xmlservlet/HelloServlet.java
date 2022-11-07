package cn.ronghuanet._01xmlservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * servlet
 * 	第一次访问的时候才会创建对象(构造方法)-初始化(init)-运行(service) 
 * 	关闭tomcat的时候调用销毁(destory)方法
 *  
 * 	servlet对象被创建之后 就不会再重复创建了 是单例的
 * 	
 * @author EDY
 *
 */
public class HelloServlet implements Servlet{
	
	public HelloServlet() {
		System.out.println("哈哈哈  我诞生啦~~~");
	}

	@Override
	public void destroy() {
		System.out.println("啊呀~   嗝屁了");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("正在初始化中ing ......");
		System.out.println("config.getServletContext():" + config.getServletContext());
		System.out.println("config.getServletName():" + config.getServletName());
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("天天造啊造.....");
	}

}
