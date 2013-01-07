package me.lei.springblog;

import me.lei.springblog.domain.AppUser;
import me.lei.springblog.service.UserService;

import org.springframework.context.support.GenericXmlApplicationContext;

public class JpaUserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:root-context.xml");
		ctx.refresh();
		
		System.out.println("App context initialized successfully");
		
		UserService userService = ctx.getBean("userService", UserService.class);
		
		AppUser user=new AppUser();
		user.setEmail("ql@qq.com");
		user.setPassword("password");
		user.setUserName("qilei");
		userService.addUser(user);
		

	}

}
