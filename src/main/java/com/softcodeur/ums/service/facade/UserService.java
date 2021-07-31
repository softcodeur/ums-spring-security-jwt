package com.softcodeur.ums.service.facade;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.softcodeur.ums.bean.User;

public interface UserService {

	List<User> findAll();
	   

	User findByUsername(String username);

  
	User findById(Long id);
     
  
	void deleteById(Long id);


 
	User save(User user);

     
    User update(User user);
    
    
	int delete(User user);


    User findByUsernameWithRoles(String username);

  
	int  deleteByUsername(String username);
	
	
	
}
