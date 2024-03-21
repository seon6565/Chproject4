package controller.member;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.MemberDAO;
import member.MemberDTO;

@WebServlet("/member/join.do")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.MemberList();
		
		dao.close();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("/member/join.jsp").forward(req, resp);
		
	}
}
