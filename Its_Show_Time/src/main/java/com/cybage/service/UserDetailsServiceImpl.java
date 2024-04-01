package com.cybage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cybage.dao.UserDetailsDao;
import com.cybage.entity.UserDetailsEntity;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDetailsDao userDetailsDao;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDetailsEntity> userDetailsEntity = userDetailsDao.findByUserName(username);
        return userDetailsEntity.map(UserDetailsEntityToUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username Not Found: " + username));
    }

    public String addUser(UserDetailsEntity userDetailsEntity) {
        userDetailsEntity.setPassword(passwordEncoder.encode(userDetailsEntity.getPassword()));
        userDetailsDao.save(userDetailsEntity);
        return "User Added Successfully";
    }
}
