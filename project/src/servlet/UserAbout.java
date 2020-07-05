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
		String valName = URLEncoder.encode(rs.getName(),"utf-8");
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
		//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
		request.setAttribute("mesage", "ע��ɹ�");
		request.getRequestDispatcher("mesage.jsp").forward(request, response);
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
		System.out.println("logout success");
		//����ת��
		//request.getRequestDispatcher("index.jsp").forward(request, response);
		response.sendRedirect("index.jsp");
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
			//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
			request.setAttribute("mesage", "��½�ɹ�");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
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
			//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
			request.setAttribute("mesage", "��½ʧ��");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
		}
	}
    
    /*
     * �û��ѳ�����뵽���ﳵ
     */
    protected void doAddPetToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	
		request.setCharacterEncoding("utf-8");
		
		//��ȡ�����pid
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		//�ȸ���cookie����Ƿ��½
		// ��ȡ cookies ������,��һ������
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//��ȡuid
					break;
				}
			}
			//��cookie�л�ȡ�û���uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
			System.out.println("uid=" + uid);
		}
		if (-1 != uid) {//�û�uid��Ч���ǵ�½״̬
			User user = new User();
			try {
				user.addPetToCart(uid, pid);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
				request.setAttribute("mesage", "�Ѵ��ڹ��ﳵ�������Ч");
				request.getRequestDispatcher("mesage.jsp").forward(request, response);
				return;
			}
			System.out.println("finish");
			//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
			request.setAttribute("mesage", "��ӳɹ�");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
		} else {//�û�uid��Ч��ת����½����
			System.out.println("û�е�½�����½");
			//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
			request.setAttribute("mesage", "û�е�½����ע����½");
			request.getRequestDispatcher("mesage.jsp").forward(request, response);
		}
		
	}
    
    
    /*
     * չʾ�û����ﳵ
     * ���ܵ����վͷ���Ĺ��ﳵ����֤������ͷ�����飬�û�id��Ч����˱�����������֤��
     */
    protected void doCartList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ֹ����
		request.setCharacterEncoding("utf-8");
		
		//����ҳ�Ĺ��ﳵ�����е���Ϣ��ȡ�û�id
		int id = Integer.parseInt(request.getParameter("id"));
		
		User user = new User();
		//ͨ��dao��ȡ���ﳵ�еĳ����б�
		List<PetInfo> pets = user.listPetsInCart(id);
		for (int i = 0; i < pets.size(); i++) {
			System.out.println("pid=" + pets.get(i).getId());
			System.out.println("name=" + pets.get(i).getName());
			System.out.println("describe=" + pets.get(i).getDescribe());
		}
		
		//�������Զ������תҳ��
		request.setAttribute("pets", pets);
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		//response.sendRedirect("cart.jsp");
		
	}
    
    /*
     * ���ݳ���id��һ������ӹ��ﳵ���Ƴ�
     * ���ܵ����վͷ���Ĺ��ﳵ����֤������ͷ�����飬�û�id��Ч����˱�����������֤��
     */
    protected void doRemoveOnePet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ֹ����
		request.setCharacterEncoding("utf-8");
		
		//��url�л�ȡ����id
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		//��cookie�л�ȡ�û���uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//��ȡuid
					break;
				}
			}
			//��cookie�л�ȡ�û���uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		System.out.println("pid=" + pid);
		
		User user = new User();
		//�Ƴ�ĳ������
		user.removeOnePetInCart(uid, pid);
		//���»�ȡ���ﳵ�еĳ����б�
		List<PetInfo> pets = user.listPetsInCart(uid);
		
		//�������Զ������תҳ��
		request.setAttribute("pets", pets);
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		//response.sendRedirect("cart.jsp");
	}
    
    /*
     * ���ݳ���id��ȫ������ӹ��ﳵ���Ƴ�
     * ���ܵ����վͷ���Ĺ��ﳵ����֤������ͷ�����飬�û�id��Ч����˱�����������֤��
     */
    protected void doRemoveAllPet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ֹ����
		request.setCharacterEncoding("utf-8");
		
		//��cookie�л�ȡ�û���uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//��ȡuid
					break;
				}
			}
			//��cookie�л�ȡ�û���uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		
		User user = new User();
		//��չ��ﳵ
		user.removeAllPetsInCart(uid);
		
		//�����������Զ���ֱ����ת����
//		request.setAttribute("pets", pets);
//		request.getRequestDispatcher("cart.jsp").forward(request, response);
//		List<PetInfo> pets = user.listPetsInCart(uid);
		response.sendRedirect("cart.jsp");
		
	}
    
    /*
     * �û��ڹ��ﳵ����˹���ť
     * ���ܵ����վͷ���Ĺ��ﳵ����֤������ͷ�����飬�û�id��Ч����˱�����������֤��
     * (��ҳ��js��֤���ﳵ�Ƿ�Ϊ�գ���ת������˵������һ����Ч)
     */
    protected void doBuyBuyBuy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ֹ����
		request.setCharacterEncoding("utf-8");
		
		//��cookie�л�ȡ�û���uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//��ȡuid
					break;
				}
			}
			//��cookie�л�ȡ�û���uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		
		User user = new User();
		Pet pet = new Pet();
		
		//�������ݿ��ж�Ӧ�ĳ����flagΪ0����ʾ����ɹ�
		List<PetInfo> pets = user.listPetsInCart(uid);
		for (int i = 0; i < pets.size(); ++i) {
			//����û�������ʷ��¼
			user.addHistory(uid, pets.get(i).getId());
			//flag����Ϊ0
			pet.deleteOnePet(pets.get(i).getId());
			//pets.get(i).setFlag(0);
		}
		System.out.println("????????????????????");
		//��չ��ﳵ
		user.removeAllPetsInCart(uid);
		//
		//�����������Զ���ֱ����ת����
//		request.setAttribute("pets", pets);
//		request.getRequestDispatcher("cart.jsp").forward(request, response);
//		List<PetInfo> pets = user.listPetsInCart(uid);
		//ת����Ϣ��ʾҳ�棬�����ʾ��Ϣ
		request.setAttribute("mesage", "��ϲ��������ɹ���");
		request.getRequestDispatcher("mesage.jsp").forward(request, response);
		
	}
    
    /*
     * չʾ�û�������ʷ��¼
     * ���ܵ����վͷ���Ĺ��ﳵ����֤������ͷ�����飬�û�id��Ч����˱�����������֤��
     */
    protected void doShowHistory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	//��ֹ����
		request.setCharacterEncoding("utf-8");
		
		//��cookie�л�ȡ�û���uid
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		int uid = 0;
		
		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if (cookie.getName().equals("uid")){//��ȡuid
					break;
				}
			}
			//��cookie�л�ȡ�û���uid
			uid = Integer.parseInt(URLDecoder.decode(cookie.getValue(), "utf-8"));
		}
		
		System.out.println("uid=" + uid);
		
		User user = new User();
		//����ȫ������ʷ��¼����
		List<HistoryInfo> records = user.showHistoryInfo(uid);
		//�������Ժ���תҳ��
		request.setAttribute("records", records);
		request.getRequestDispatcher("history.jsp").forward(request, response);
		
//		//�������ݿ��ж�Ӧ�ĳ����flagΪ0����ʾ����ɹ�
//		List<PetInfo> pets = user.listPetsInCart(uid);
//		for (int i = 0; i < pets.size(); ++i) {
//			//����û�������ʷ��¼
//			user.addHistory(uid, pets.get(i).getId());
//			//flag����Ϊ0
//			pet.deleteOnePet(pets.get(i).getId());
//			//pets.get(i).setFlag(0);
//		}
//		System.out.println("????????????????????");
//		//��չ��ﳵ
//		user.removeAllPetsInCart(uid);
//		//
//		//�����������Զ���ֱ����ת����
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
				this.doLogout(request, response);
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
		} else if (cmd.equals("addPetToCart")) {//���빺�ﳵ
			try {
				System.out.println("addPetToCart---->");
				this.doAddPetToCart(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} else if (cmd.equals("cart")) {//չʾ���ﳵ
			try {
				this.doCartList(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} else if (cmd.equals("removeOne")) {//�Ƴ����ﳵ�е�һ������
			try {
				this.doRemoveOnePet(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} else if (cmd.equals("removeAll")) {//�Ƴ����ﳵ�е�ȫ������
			try {
				this.doRemoveAllPet(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} else if (cmd.equals("buybuybuy")) {//�û�����˹��ﳵ�Ĺ���ť
			try {
				System.out.println("here----->buybuybuy");
				this.doBuyBuyBuy(request, response);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out.println("buy error");
			}
		} else if (cmd.equals("history")) {//չʾ�û�������ʷ
			try {
				this.doShowHistory(request, response);
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
