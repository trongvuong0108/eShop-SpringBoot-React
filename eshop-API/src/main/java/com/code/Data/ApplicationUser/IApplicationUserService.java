package com.code.Data.ApplicationUser;

import com.code.Data.ApplicationUser.Dto.Request.CreateUserRequest;

import java.util.List;

public interface IApplicationUserService {
    public ApplicationUser getUserByUserName(String userName);
    public void CreateNewUser(CreateUserRequest createUserRequest);

    public List<ApplicationUser> findAll();
}
