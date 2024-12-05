package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(DemoJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing.......!!!");
//		logger.info("Test case executing second log statement.......!!!");

		assertEquals(true, true);
	}

}
