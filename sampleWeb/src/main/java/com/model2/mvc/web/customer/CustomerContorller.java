package com.model2.mvc.web.customer;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model2.mvc.common.Page;
import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.user.UserService;


//==> Customer관리 Controller
@Controller
@RequestMapping("/customer/*")
public class CustomerContorller {
	
	///Field
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	public CustomerContorller(){
		System.out.println(this.getClass());
	}
	
	@RequestMapping( value="getUser", method=RequestMethod.GET )
	public String getUser( @RequestParam("userId") String userId , Model model ) throws Exception {
		
		System.out.println("/user/getUser : GET");
		//Business Logic
		User user = userService.getUser(userId);
		// Model 과 View 연결
		model.addAttribute("user", user);
		
		return "forward:/user/getUser.jsp";
	}
	//////////////////////////////////////////////////////////  추가된 부분 ///////////////////////////////////////////////////////////////
	@RequestMapping( value="getJsonUser/{userId}", method=RequestMethod.GET )
	public void getJsonUser(	@PathVariable String userId, 
									 			Model model) throws Exception{
		System.out.println("/getJsonUser/getUser : GET");
		//Business Logic
		User user = userService.getUser(userId);
		// Model 과 View 연결
		model.addAttribute("user", user);
	}
	//////////////////////
	
	//===========================================
	//===========================================
	@RequestMapping( value="getJsonCustomer/{customerTel}", method=RequestMethod.GET)
	public void getJsonCustomer(	@PathVariable String customerTel
										) throws Exception{
		System.out.println("/getJsonCustomer/getUser : GET" + customerTel);
		
	}
	//===========================================
	//===========================================
	
	//////////////////////////////////////////////////////////  추가된 부분 ///////////////////////////////////////////////////////////////
	@RequestMapping( value="jsonLogin", method=RequestMethod.POST )
	public void jsonLogin(	@RequestBody User user,
												HttpSession session,
												Model model) throws Exception{
	
		System.out.println("/user/jsonLogin : POST");
		//Business Logic
		System.out.println("::"+user);
		User dbUser=userService.getUser(user.getUserId());
		
		if( user.getPassword().equals(dbUser.getPassword())){
			session.setAttribute("user", dbUser);
		}
		
		model.addAttribute("user", dbUser);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}