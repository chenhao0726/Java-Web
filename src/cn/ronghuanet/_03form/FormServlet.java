package cn.ronghuanet._03form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormServlet extends HttpServlet{

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("访问到了doGet");
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("访问到了doPost");
//	}
//	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
//		(1) String getContextPath()：获取上下文路径，<Context path="上下文" ../>；
//		(2) String getHeader(String headName)：根据指定的请求头获取对应的请求头的值；
//		System.out.println("getHeader:" + req.getHeader("Host"));
////		(3) String getRequestURI()：返回当期请求的资源路径URI（上下文路径/资源名）；
//		System.out.println("getRequestURI:" + req.getRequestURI());
////		(4) StringBuffer getRequestURL()：返回浏览器请求地址URL；
//		System.out.println("getRequestURL:" + req.getRequestURL());
////		(5) String getRemoteAddr()：返回请求服务器的客户端的IP；
//		System.out.println("getRemoteAddr:" + req.getRemoteAddr());
////		(6) String getServletPath()：返回请求，<url-pattern>中的值；
//		System.out.println("getServletPath:" + req.getServletPath());
////		(11)   String getProtocol())：获取协议版本HTTP/1.1
//		System.out.println("getProtocol:" + req.getProtocol());
////		(12)   String getMethod())：获取请求方式（GET or POST）
//		System.out.println("getMethod:" + req.getMethod());
////		(13)   int getServerPort()：获取端口号
//		System.out.println("getServerPort:" + req.getServerPort());
//		System.out.println("不管你是get还是post都会访问这个方法service");
		
		
//		(7) **String getParameter(String name**)：根据参数名称,获取对应参数的值；
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username+ ":" + password);
//		(8) String[] getParameterValues(String name)：根据参数名称,获取该参数的多个值；
//		(9) Map<String,String[]> getParameterMap()：返回请求参数组成的Map集合；
/*
 * 		(10) void req.setCharacterEncoding("UTF-8")：
 * 			能够正确获取post请求的中文参数而不出现乱码；
 */
		String html = "<!DOCTYPE html><html><head><meta charset=\\\"UTF-8\\\"><title>Insert title here</title></head><body>访问成功~~</body></html>";
		

		PrintWriter writer = resp.getWriter();
		writer.write(html);
		/*
		 *  servlet 的三大职责\
		 *  	接收参数
		 *  	封装domain
		 *  	返回页面
		 */
	}
}
