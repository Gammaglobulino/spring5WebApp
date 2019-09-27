package com.thedigibro.spring5WebApp;

import com.thedigibro.spring5WebApp.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring5WebAppApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetTitle(){
		Book book=new Book("Storia di Andrea","0001020003034","Andrea inc");

	}

}
