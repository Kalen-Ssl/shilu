package servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User;
import pojo.UserInfo;

/**
 * Servlet implementation class UserAbout
 */
public class UserAbout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAbout() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    /*
     * 用户注册
     */
    protected void doRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//获取用户提交的信息
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		//创建用户对象
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPasswd(passwd);
		user.setPhone(phone);
		user.setEmail(email);
		
		//调用注册方法
		User dao = new User();
		dao.add(user);
		System.out.println("register success");
		//获取该用户信息
		UserInfo rs = dao.findUser(user);

		//转码，url字符串编码不是utf-8
		String valName = URLEncoder.encode(name,"utf-8");
		String valId = URLEncoder.encode(String.valueOf(rs.getId()),"utf-8");
		// 设置 uname 和 uid cookie
		Cookie uid = new Cookie("uid", valId);
		Cookie uname = new Cookie("uname", valName);
		// 设置cookie过期时间为24小时。
		uname.setMaxAge(60*60*24); 
		uid.setMaxAge(60*60*24); 
		// 在响应头部添加cookie
		response.addCookie(uid);
		response.addCookie(uname);
		
		System.out.println("cookie set success, valName=" + valName + ", valId=" + valId);
		//请求转发
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
    
    /*
     * 用户退出登陆
     */
    protected void doLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//获取用户提交的信息
		request.setCharacterEncoding("utf-8");

		//转码，url字符串编码不是utf-8，设置 uname 和 uid为无效值
		String valName = URLEncoder.encode("null","utf-8");
		String valId = URLEncoder.encode("-1","utf-8");
		// 设置 uname 和 uid cookie
		Cookie uid = new Cookie("uid", valId);
		Cookie uname = new Cookie("uname", valName);
		// 设置cookie过期时间为24小时。
		uname.setMaxAge(60*60*24); 
		uid.setMaxAge(60*60*24); 
		// 在响应头部添加cookie
		response.addCookie(uid);
		response.addCookie(uname);
		System.out.println("login failed");
		//请求转发
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
    
    /*
     * 用户登陆
     */
    protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//获取用户提交的信息
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPasswd(passwd);
		
		
		User dao = new User();
		//调用查询方法
		UserInfo result = dao.findUser(user);
		
		if (null != result) {//登陆成功
			//转码
			String valName = URLEncoder.encode(request.getParameter("name"),"utf-8");
			String valId = URLEncoder.encode(String.valueOf(result.getId()),"utf-8");
			// 设置 uname 和 uid cookie 为有效值
			Cookie uid = new Cookie("uid", valId);
			Cookie uname = new Cookie("uname", valName);
			// 设置cookie过期时间为24小时。
			uname.setMaxAge(60*60*24); 
			uid.setMaxAge(60*60*24); 
			// 在响应头部添加cookie
			response.addCookie(uid);
			response.addCookie(uname);
			
			System.out.println("login success");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {//登陆失败
			// 设置 uname 和 uid cookie 为无效值
			String valName = URLEncoder.encode("null","utf-8");
			String valId = URLEncoder.encode("-1","utf-8");
			Cookie uid = new Cookie("uid", valId);
			Cookie uname = new Cookie("uname", valName);
			// 设置cookie过期时间为24小时。
			uname.setMaxAge(60*60*24); 
			uid.setMaxAge(60*60*24); 
			// 在响应头部添加cookie
			response.addCookie(uid);
			response.addCookie(uname);
			System.out.println("login failed");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		//根据cmd命令判断行为
		try {
			cmd.length();
		} catch (Exception e) {
			System.out.println("cmd empty");
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		if (cmd.equals("login")) {//登陆
			try {
				this.doLogin(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} else if (cmd.equals("logout")) {//登出
			try {
				this.doLogin(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} else if (cmd.equals("register")) {//注册
			try {
				this.doRegister(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
