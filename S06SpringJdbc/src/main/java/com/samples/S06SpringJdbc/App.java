package com.samples.S06SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06SpringJdbc/SpringConfig.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) springContainer.getBean("jdbctemplate");
		
		String sql = "insert into products values (?, ?)";
		int updateResult = jdbcTemplate.update(sql, 1, "John",22,"wat",3);
		System.out.println("Number of records inserted: " + updateResult);
		

	}
}