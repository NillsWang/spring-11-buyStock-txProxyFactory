package com.wmz.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wmz.exception.BuyStockException;
import com.wmz.service.IBuyStockService;


public class MyTest {
	
	
	private IBuyStockService service;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (IBuyStockService) ac.getBean("serviceProxy");
	}
	
	@Test
	public void testOpen() {
		
		service.openAccount("张三", 10000);
		service.openStock("动力节点", 0);
	}
	
	@Test
	public void testBuyStock() throws BuyStockException {
		
		service.buyStock("张三", 2000, "动力节点", 5);
		
	}

}
