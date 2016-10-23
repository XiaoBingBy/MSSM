package sys.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.Users;
import sy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestMyBatis2 {

	@Autowired
	private UserService userService;
	
	@Test
	public void demo1() {
		Users user = userService.findUserById(1l);
		System.out.println(user.toString());
		System.out.println(123);
	}

}
