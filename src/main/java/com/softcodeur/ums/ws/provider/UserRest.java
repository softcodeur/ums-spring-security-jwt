package com.softcodeur.ums.ws.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softcodeur.ums.bean.User;
import com.softcodeur.ums.service.facade.UserService;

@RequestMapping("/ums-api/user")
@RestController
public class UserRest {
	@Autowired
	private UserService userService;
	//@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
	@GetMapping("/")
	public List<User> findAll(){
		   return this.userService.findAll();
		}

	public User findByUsername(String username) {
		return userService.findByUsername(username);
	}
     @GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}
     @DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		userService.deleteById(id);
	}
     
    @PostMapping("/save")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
     @PutMapping("/")
	public User update(@RequestBody User user) {
		return userService.update(user);
	}
    @DeleteMapping("/")
	public int delete(@RequestBody User user) {
		return userService.delete(user);
	}

     @GetMapping("/username/{username}")
	public User findByUsernameWithRoles(@PathVariable String username) {
		return userService.findByUsernameWithRoles(username);
	}

    @DeleteMapping("/username/{username}")
	public int deleteByUsername(@PathVariable String username) {
		return userService.deleteByUsername(username);
	}
	
	
	
	
	

}
