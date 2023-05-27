package com.code.Data.ApplicationUser;

import com.code.Data.ApplicationUser.Dto.Request.CreateUserRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUserService implements IApplicationUserService {
    @Override
    public ApplicationUser getUserByUserName(String userName) {
        return null;
    }

    @Override
    public void CreateNewUser(CreateUserRequest createUserRequest) {

    }

    @Override
    public List<ApplicationUser> findAll() {
        return null;
    }
}
