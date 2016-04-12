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
import com.model2.mvc.service.customer.CustomerService;
import com.model2.mvc.service.domain.Customer;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.user.UserService;


//==> Customer관리 Controller
@Controller
@RequestMapping("/customer/*")
public class CustomerContorller {
	
	///Field
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;

	public CustomerContorller(){
		System.out.println(this.getClass());
	}
	
	//===========================================
	//===========================================
	@RequestMapping( value="getJsonCustomer/{customerTel}", method=RequestMethod.GET)
	public void getJsonCustomer(	@PathVariable String customerTel,
			Model model	) throws Exception{
		System.out.println("/getJsonCustomer/getUser : GET" + customerTel);
		//Business Logic
		Customer customer = customerService.getCustomer(customerTel);
		// Model 과 View 연결
		model.addAttribute("customer",customer);
	}
	//===========================================
	//===========================================
	
	
}