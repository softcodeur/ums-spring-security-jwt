package com.softcodeur.ums;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.softcodeur.ums.bean.User;
import com.softcodeur.ums.dao.UserDao;

@SpringBootApplication
public class UniversityManagementSystemApplication implements CommandLineRunner {


	

    public static ConfigurableApplicationContext ctx;
    public static void main(String[] args) {
         ctx= SpringApplication.run(UniversityManagementSystemApplication.class, args);

    }
	@Autowired
	private UserDao userDao;
	@Override
	public void run(String... args) throws Exception {
		
	
       Stream.of("yassir", "chaimaa", "amadou").forEach(username ->{
    	         User user = new User();
    	         user.setUsername(username);
    	          User u = this.userDao.save(user);
       });		
	}
	public static ConfigurableApplicationContext getCtx() {
		return ctx;
	}
	
	   
	    
	
	
	

}
