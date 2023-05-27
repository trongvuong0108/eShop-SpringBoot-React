package com.code.Data.ApplicationUser;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("userDetailService")
public class UserDetailService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Account account = accountService.findByUsername(username);
//        if(account == null || !account.isEnable() ) throw new UsernameNotFoundException("User not find");
//        else {
            Set<GrantedAuthority> auth = new HashSet<>();
            //auth.add(new SimpleGrantedAuthority(account.getRole().getText()));
            auth.add(new SimpleGrantedAuthority("Admin"));
            return  new org.springframework.security.core.userdetails
//                    .User(account.getUsername(),account.getPassword(),true,true,true,true,auth);
                    .User("admin","admin",true,true,true,true,auth);
        //}
    }
}