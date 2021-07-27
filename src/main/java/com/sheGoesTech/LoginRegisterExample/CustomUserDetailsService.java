package com.sheGoesTech.LoginRegisterExample;

import com.sheGoesTech.LoginRegisterExample.model.User;
import com.sheGoesTech.LoginRegisterExample.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Data


public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user ==null){
            throw new UsernameNotFoundException("User not found");

        }
        return new CustomUserDetails(user);
    }
}
