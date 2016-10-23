package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.Users;
import sy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{pageid}")
	public String showUser(@PathVariable Long  pageid, HttpServletRequest request, Long id) {
		
		Users findUserById = userService.findUserById(pageid);
		request.setAttribute("user", findUserById);
		
		System.out.println(findUserById);
		
		return "showUser";
	}
	
}
