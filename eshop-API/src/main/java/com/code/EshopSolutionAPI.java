package com.code;

import com.code.Data.ApplicationUser.Dto.Request.CreateUserRequest;
import com.code.Data.ApplicationUser.ApplicationUser;
import com.code.Data.ApplicationUser.IApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class EshopSolutionAPI {


	public static void main(String[] args) {
		SpringApplication.run(EshopSolutionAPI.class, args);
	}
	@Autowired
	private IApplicationUserService applicationUserService;
	@PostConstruct
	public void dataSeeding() {
		List<ApplicationUser> users = applicationUserService.findAll();
		if (users!= null && users.isEmpty()) {
			applicationUserService.CreateNewUser(new CreateUserRequest(
					"admin",
					"admin",
					"admin@gmail.com",
					"0123456789"
			));
		}
	}
}
