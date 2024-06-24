package com.example.springScurityConfig;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{

    String userName;

    public MyUserDetails(String userName){
        this.userName=userName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return "pass";
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return userName;
    }
    
}
