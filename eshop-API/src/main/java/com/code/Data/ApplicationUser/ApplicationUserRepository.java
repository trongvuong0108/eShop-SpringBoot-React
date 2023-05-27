package com.code.Data.ApplicationUser;

import com.code.Data.ApplicationUser.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Integer> {
    public ApplicationUser findApplicationUserByUsername(String UserName);
}
