package servlet;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Pet;
import dao.User;
import pojo.HistoryInfo;
import pojo.PetInfo;
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
		String valName = URLEncoder.encode(rs.getName(),"utf-8");
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
		//转到消息提示页面，输出提示信息
		request.setAttribute("mesage", "注册成功");
		request.getRequestDispatcher("mesage.jsp").forward(request, response);
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
		System.out.println("logout success");
		//请求转发
		//request.getRequestDispatcher("index.jsp").forward(request, response);
		response.sendRedirect("index.jsp");
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
			//转到消息提示页面，输出提示信息
			request.setAttribute("mesage", "登陆成功");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
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
			//转到消息提示页面，输出提示信息
			request.setAttribute("mesage", "登陆失败");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
		}
	}
    
    /*
     * 用户把宠物加入到购物车
     */
    protected void doAddPetToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	
		request.setCharacterEncoding("utf-8");
		
		//获取宠物的pid
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		//先根据cookie检查是否登陆
		// 获取 cookies 的数据,是一个数组
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//获取uid
					break;
				}
			}
			//从cookie中获取用户的uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
			System.out.println("uid=" + uid);
		}
		if (-1 != uid) {//用户uid有效，是登陆状态
			User user = new User();
			try {
				user.addPetToCart(uid, pid);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				//转到消息提示页面，输出提示信息
				request.setAttribute("mesage", "已存在购物车，添加无效");
				request.getRequestDispatcher("mesage.jsp").forward(request, response);
				return;
			}
			System.out.println("finish");
			//转到消息提示页面，输出提示信息
			request.setAttribute("mesage", "添加成功");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
		} else {//用户uid无效，转到登陆界面
			System.out.println("没有登陆，请登陆");
			//转到消息提示页面，输出提示信息
			request.setAttribute("mesage", "没有登陆，请注册或登陆");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
		}
		
	}
    
    
    /*
     * 展示用户购物车
     * （能点击网站头部的购物车连接证明经过头部检验，用户id有效，因此本方法不做验证）
     */
    protected void doCartList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//防止乱码
		request.setCharacterEncoding("utf-8");
		
		//从首页的购物车连接中的信息获取用户id
		int id = Integer.parseInt(request.getParameter("id"));
		
		User user = new User();
		//通过dao获取购物车中的宠物列表
		List<PetInfo> pets = user.listPetsInCart(id);
		for (int i = 0; i < pets.size(); i++) {
			System.out.println("pid=" + pets.get(i).getId());
			System.out.println("name=" + pets.get(i).getName());
			System.out.println("describe=" + pets.get(i).getDescribe());
		}
		
		//设置属性对象和跳转页面
		request.setAttribute("pets", pets);
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		//response.sendRedirect("cart.jsp");
		
	}
    
    /*
     * 根据宠物id把一个宠物从购物车中移除
     * （能点击网站头部的购物车连接证明经过头部检验，用户id有效，因此本方法不做验证）
     */
    protected void doRemoveOnePet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//防止乱码
		request.setCharacterEncoding("utf-8");
		
		//从url中获取宠物id
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		//从cookie中获取用户的uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//获取uid
					break;
				}
			}
			//从cookie中获取用户的uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		System.out.println("pid=" + pid);
		
		User user = new User();
		//移除某个宠物
		user.removeOnePetInCart(uid, pid);
		//重新获取购物车中的宠物列表
		List<PetInfo> pets = user.listPetsInCart(uid);
		
		//设置属性对象和跳转页面
		request.setAttribute("pets", pets);
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		//response.sendRedirect("cart.jsp");
	}
    
    /*
     * 根据宠物id把全部宠物从购物车中移除
     * （能点击网站头部的购物车连接证明经过头部检验，用户id有效，因此本方法不做验证）
     */
    protected void doRemoveAllPet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//防止乱码
		request.setCharacterEncoding("utf-8");
		
		//从cookie中获取用户的uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//获取uid
					break;
				}
			}
			//从cookie中获取用户的uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		
		User user = new User();
		//清空购物车
		user.removeAllPetsInCart(uid);
		
		//不用设置属性对象，直接跳转就行
//		request.setAttribute("pets", pets);
//		request.getRequestDispatcher("cart.jsp").forward(request, response);
//		List<PetInfo> pets = user.listPetsInCart(uid);
		response.sendRedirect("cart.jsp");
		
	}
    
    /*
     * 用户在购物车点击了购买按钮
     * （能点击网站头部的购物车连接证明经过头部检验，用户id有效，因此本方法不做验证）
     * (网页有js验证购物车是否为空，能转到这里说明数据一定有效)
     */
    protected void doBuyBuyBuy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//防止乱码
		request.setCharacterEncoding("utf-8");
		
		//从cookie中获取用户的uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//获取uid
					break;
				}
			}
			//从cookie中获取用户的uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		
		User user = new User();
		Pet pet = new Pet();
		
		//设置数据库中对应的宠物的flag为0，表示购买成功
		List<PetInfo> pets = user.listPetsInCart(uid);
		for (int i = 0; i < pets.size(); ++i) {
			//添加用户购买历史记录
			user.addHistory(uid, pets.get(i).getId());
			//flag设置为0
			pet.deleteOnePet(pets.get(i).getId());
			//pets.get(i).setFlag(0);
		}
		System.out.println("????????????????????");
		//清空购物车
		user.removeAllPetsInCart(uid);
		//
		//不用设置属性对象，直接跳转就行
//		request.setAttribute("pets", pets);
//		request.getRequestDispatcher("cart.jsp").forward(request, response);
//		List<PetInfo> pets = user.listPetsInCart(uid);
		//转到消息提示页面，输出提示信息
		request.setAttribute("mesage", "恭喜您，购买成功！");
		request.getRequestDispatcher("mesage.jsp").forward(request, response);
		
	}
    
    /*
     * 展示用户购买历史记录
     * （能点击网站头部的购物车连接证明经过头部检验，用户id有效，因此本方法不做验证）
     */
    protected void doShowHistory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//防止乱码
		request.setCharacterEncoding("utf-8");
		
		//从cookie中获取用户的uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//获取uid
					break;
				}
			}
			//从cookie中获取用户的uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		
		User user = new User();
		//查找全部的历史记录对象
		List<HistoryInfo> records = user.showHistoryInfo(uid);
		//设置属性和跳转页面
		request.setAttribute("records", records);
		request.getRequestDispatcher("history.jsp").forward(request, response);
		
//		//设置数据库中对应的宠物的flag为0，表示购买成功
//		List<PetInfo> pets = user.listPetsInCart(uid);
//		for (int i = 0; i < pets.size(); ++i) {
//			//添加用户购买历史记录
//			user.addHistory(uid, pets.get(i).getId());
//			//flag设置为0
//			pet.deleteOnePet(pets.get(i).getId());
//			//pets.get(i).setFlag(0);
//		}
//		System.out.println("????????????????????");
//		//清空购物车
//		user.removeAllPetsInCart(uid);
//		//
//		//不用设置属性对象，直接跳转就行
////		request.setAttribute("pets", pets);
////		request.getRequestDispatcher("cart.jsp").forward(request, response);
////		List<PetInfo> pets = user.listPetsInCart(uid);
//		response.sendRedirect("index.jsp");
		
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
				this.doLogout(request, response);
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
		} else if (cmd.equals("addPetToCart")) {//加入购物车
			try {
				System.out.println("addPetToCart---->");
				this.doAddPetToCart(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} else if (cmd.equals("cart")) {//展示购物车
			try {
				this.doCartList(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} else if (cmd.equals("removeOne")) {//移除购物车中的一个宠物
			try {
				this.doRemoveOnePet(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} else if (cmd.equals("removeAll")) {//移除购物车中的全部宠物
			try {
				this.doRemoveAllPet(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} else if (cmd.equals("buybuybuy")) {//用户点击了购物车的购买按钮
			try {
				System.out.println("here----->buybuybuy");
				this.doBuyBuyBuy(request, response);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				System.out.println("buy error");
			}
		} else if (cmd.equals("history")) {//展示用户购买历史
			try {
				this.doShowHistory(request, response);
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
