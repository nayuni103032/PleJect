package conn;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import conn.RequestMapping;
import conn.RequestMapping.RequestMethod;
import dao.InterestDao;
import model.InterestDataBean;

public class MainController extends ActionAnnotation {
	
	@Override
	public void initProcess(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session=request.getSession();
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		System.out.println("@@@@@@@@111@@@@@@@@");
		String memEmail = (String)session.getAttribute("memEmail");
		System.out.println(memEmail);
		String memEmail2 = (String)session.getAttribute("memEmail2");
		System.out.println(memEmail2);*/
		
		String name = (String)session.getAttribute("name");
		System.out.println(name);
	}
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String content_main(HttpServletRequest request, HttpServletResponse res) throws Exception {
		HttpSession session = request.getSession();
		return "/view/content/main.jsp";
	}
	
	@RequestMapping(value = "loginForm", method = RequestMethod.GET)
	public String content_loginForm(HttpServletRequest request, HttpServletResponse res) throws Exception {
		HttpSession session = request.getSession();
		return "/view/content/loginForm.jsp";
	}
	
	@RequestMapping(value = "memberLikeForm", method = RequestMethod.GET)
	public String content_memberLikeForm(HttpServletRequest request, HttpServletResponse res) throws Exception {
		HttpSession session = request.getSession();
		InterestDao service = InterestDao.getInstance();
		List<InterestDataBean> interestList = service.allgetTit();
		// System.out.println(interestList.get(0));
		request.setAttribute("interestList", interestList);
		
		return "/view/content/memberLikeForm.jsp";
	}
	
	@RequestMapping(value = "index", method = RequestMethod.POST)
	public String content_index(HttpServletRequest request, HttpServletResponse res) throws Exception {
		HttpSession session = request.getSession();
		InterestDao service = InterestDao.getInstance();
		String[] chkbox = request.getParameterValues("like");
		List li = new ArrayList();
		for( int i = 0; i < chkbox.length; i++) {
			System.out.println(chkbox[i]);
			String checklist = chkbox[i];
			List<InterestDataBean> lia = service.getLikeSub(checklist);
			li.add(lia);
			System.out.println(lia.size() + "##########");
		}
		
		request.setAttribute("li", li);
		
		return "/view/content/index.jsp";
	}
	
	

}
