package sys.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.model.Users;
import sy.service.UserService;

public class TestMyBatis {

	ApplicationContext applicationContext = null;
	
	@Before
	public void Before() {
		applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});
	}
	
	@Test
	public void demo1() {
		UserService userService = (UserService) applicationContext.getBean("userService");
		Users user = userService.findUserById(1l);
		System.out.println(user.toString());
		System.out.println(123);
	}

}
