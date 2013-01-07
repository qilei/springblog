package me.lei.springblog.web;

import me.lei.springblog.domain.ShiroUser;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/user")
public class UserController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(Model model){
		model.addAttribute("user", new ShiroUser());
		return "user/login";
	}

	@RequestMapping(value="authenticate",method=RequestMethod.POST)
	public String authenticate(@RequestParam(value="userid") String userid,@RequestParam(value="passphrase") String passphrase){

	    UsernamePasswordToken token = new UsernamePasswordToken(userid, passphrase);

	    // �Remember Me� built-in, just do this
	    // TODO: Make this a user option instead of hard coded in.
	    token.setRememberMe(true);

	    Subject currentUser = SecurityUtils.getSubject();

	    try {
	      currentUser.login(token);
	      logger.info("AUTH SUCCESS");
	    } catch (AuthenticationException ae) {
	      logger.info("AUTH MSSG: " + ae.getMessage());
	    }

	    if (currentUser.isAuthenticated()) {
	      return "redirect:/";
	    }

	    return "user/login";
	}
	
	@RequestMapping(value="logout")
	public String logout(){
	    Subject currentUser = SecurityUtils.getSubject();
	    currentUser.logout();
		return "redirect:/index";
	}
}
