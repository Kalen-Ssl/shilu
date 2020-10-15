package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Pet;
import pojo.PetInfo;

/**
 * Servlet implementation class PetAbout
 */
public class PetAbout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetAbout() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
     * 宠物展示页
     */
    protected void doListPets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	//宠物分类
    	String sort = request.getParameter("sort");
		//目标网页
		String target = "index.jsp";
		
		Pet dao = new Pet();
		List<PetInfo> pets = null;
		try {
			//访问数据库，得到全部符合种类的宠物
			pets = dao.listPetBySort(sort);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//设置属性对象和跳转页面
		request.setAttribute("pets", pets);
		target = "petlist.jsp";
		
		System.out.println("target=" + target);
		//请求转发
		request.getRequestDispatcher(target).forward(request, response);
		return;
	}
    
    /*
     * 宠物详情页
     */
    protected void doPetDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	request.setCharacterEncoding("utf-8");
    	//宠物id
    	int id = Integer.parseInt(request.getParameter("id"));
		//目标网页
		String target = "petinfo.jsp";
		
		Pet dao = new Pet();
		PetInfo pet = dao.listPetById(id);
		
		//设置属性对象
		request.setAttribute("pet", pet);
		
		//请求转发
		System.out.println("target=" + target);
		request.getRequestDispatcher(target).forward(request, response);
		return;
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获取命令，根据不同的命令相应不同网页
		String cmd = request.getParameter("cmd");
		System.out.println("cmd=" + cmd);
		try {
			cmd.length();
		} catch (Exception e) {
			System.out.println("cmd empty");
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		if (cmd.equals("list")) {//宠物展示页
			System.out.println("list");
			this.doListPets(request, response);
		} else if (cmd.equals("detail")) {//宠物详情页
			System.out.println("detail");
			try {
				this.doPetDetail(request, response);
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
