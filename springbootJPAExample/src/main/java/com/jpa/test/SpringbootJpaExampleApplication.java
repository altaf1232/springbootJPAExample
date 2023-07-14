package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dio.UserRespository;
import com.jpa.test.entityes.User;

@SpringBootApplication
public class SpringbootJpaExampleApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(SpringbootJpaExampleApplication.class, args);
		UserRespository userRespository =context.getBean(UserRespository.class);
		 System.out.println(userRespository);
		  
		 User user=new User();
		      user.setName("altaf malik mumbai");
		      user.setCity("Mumbai");
		      user.setStatus("i am working on a java developer");
		      user.setName("Salman");
		      user.setCity("delhi");
		      user.setStatus("i am not working a javadeveloper");
		      
		   User user1 = userRespository.save(user);
		   System.out.println(user1);
		      
		      
	}
	

}
