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
     * �û�ע��
     */
    protected void doRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ȡ�û��ύ����Ϣ
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		//�����û�����
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPasswd(passwd);
		user.setPhone(phone);
		user.setEmail(email);
		
		//����ע�᷽��
		User dao = new User();
		dao.add(user);
		System.out.println("register success");
		//��ȡ���û���Ϣ
		UserInfo rs = dao.findUser(user);

		//ת�룬url�ַ������벻��utf-8
		String valName = URLEncoder.encode(name,"utf-8");
		String valId = URLEncoder.encode(String.valueOf(rs.getId()),"utf-8");
		// ���� uname �� uid cookie
		Cookie uid = new Cookie("uid", valId);
		Cookie uname = new Cookie("uname", valName);
		// ����cookie����ʱ��Ϊ24Сʱ��
		uname.setMaxAge(60*60*24); 
		uid.setMaxAge(60*60*24); 
		// ����Ӧͷ�����cookie
		response.addCookie(uid);
		response.addCookie(uname);
		
		System.out.println("cookie set success, valName=" + valName + ", valId=" + valId);
		//����ת��
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
    
    /*
     * �û��˳���½
     */
    protected void doLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ȡ�û��ύ����Ϣ
		request.setCharacterEncoding("utf-8");

		//ת�룬url�ַ������벻��utf-8������ uname �� uidΪ��Чֵ
		String valName = URLEncoder.encode("null","utf-8");
		String valId = URLEncoder.encode("-1","utf-8");
		// ���� uname �� uid cookie
		Cookie uid = new Cookie("uid", valId);
		Cookie uname = new Cookie("uname", valName);
		// ����cookie����ʱ��Ϊ24Сʱ��
		uname.setMaxAge(60*60*24); 
		uid.setMaxAge(60*60*24); 
		// ����Ӧͷ�����cookie
		response.addCookie(uid);
		response.addCookie(uname);
		System.out.println("login failed");
		//����ת��
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
    
    /*
     * �û���½
     */
    protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ȡ�û��ύ����Ϣ
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPasswd(passwd);
		
		
		User dao = new User();
		//���ò�ѯ����
		UserInfo result = dao.findUser(user);
		
		if (null != result) {//��½�ɹ�
			//ת��
			String valName = URLEncoder.encode(request.getParameter("name"),"utf-8");
			String valId = URLEncoder.encode(String.valueOf(result.getId()),"utf-8");
			// ���� uname �� uid cookie Ϊ��Чֵ
			Cookie uid = new Cookie("uid", valId);
			Cookie uname = new Cookie("uname", valName);
			// ����cookie����ʱ��Ϊ24Сʱ��
			uname.setMaxAge(60*60*24); 
			uid.setMaxAge(60*60*24); 
			// ����Ӧͷ�����cookie
			response.addCookie(uid);
			response.addCookie(uname);
			
			System.out.println("login success");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {//��½ʧ��
			// ���� uname �� uid cookie Ϊ��Чֵ
			String valName = URLEncoder.encode("null","utf-8");
			String valId = URLEncoder.encode("-1","utf-8");
			Cookie uid = new Cookie("uid", valId);
			Cookie uname = new Cookie("uname", valName);
			// ����cookie����ʱ��Ϊ24Сʱ��
			uname.setMaxAge(60*60*24); 
			uid.setMaxAge(60*60*24); 
			// ����Ӧͷ�����cookie
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
		//����cmd�����ж���Ϊ
		try {
			cmd.length();
		} catch (Exception e) {
			System.out.println("cmd empty");
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		if (cmd.equals("login")) {//��½
			try {
				this.doLogin(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} else if (cmd.equals("logout")) {//�ǳ�
			try {
				this.doLogin(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} else if (cmd.equals("register")) {//ע��
			try {
				this.doRegister(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
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
