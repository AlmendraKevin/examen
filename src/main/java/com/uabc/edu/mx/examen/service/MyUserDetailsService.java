package com.uabc.edu.mx.examen.service;

import com.uabc.edu.mx.examen.model.Usuario;
import com.uabc.edu.mx.examen.repository.UserRepository;
import com.uabc.edu.mx.examen.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Usuario> user = userRepository.findByUserName(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("No encontrado"+userName));
        return user.map(MyUserDetails::new).get();
    }
}
