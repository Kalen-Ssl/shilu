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
     * ����չʾҳ
     */
    protected void doListPets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	//�������
    	String sort = request.getParameter("sort");
		//Ŀ����ҳ
		String target = "index.jsp";
		
		Pet dao = new Pet();
		List<PetInfo> pets = null;
		try {
			//�������ݿ⣬�õ�ȫ����������ĳ���
			pets = dao.listPetBySort(sort);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//�������Զ������תҳ��
		request.setAttribute("pets", pets);
		target = "petlist.jsp";
		
		System.out.println("target=" + target);
		//����ת��
		request.getRequestDispatcher(target).forward(request, response);
		return;
	}
    
    /*
     * ��������ҳ
     */
    protected void doPetDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	request.setCharacterEncoding("utf-8");
    	//����id
    	int id = Integer.parseInt(request.getParameter("id"));
		//Ŀ����ҳ
		String target = "petinfo.jsp";
		
		Pet dao = new Pet();
		PetInfo pet = dao.listPetById(id);
		
		//�������Զ���
		request.setAttribute("pet", pet);
		
		//����ת��
		System.out.println("target=" + target);
		request.getRequestDispatcher(target).forward(request, response);
		return;
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//��ȡ������ݲ�ͬ��������Ӧ��ͬ��ҳ
		String cmd = request.getParameter("cmd");
		System.out.println("cmd=" + cmd);
		try {
			cmd.length();
		} catch (Exception e) {
			System.out.println("cmd empty");
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		if (cmd.equals("list")) {//����չʾҳ
			System.out.println("list");
			this.doListPets(request, response);
		} else if (cmd.equals("detail")) {//��������ҳ
			System.out.println("detail");
			try {
				this.doPetDetail(request, response);
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
