package com.uabc.edu.mx.examen.service;

import com.uabc.edu.mx.examen.model.Usuario;
import com.uabc.edu.mx.examen.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;

    public boolean validate(String username,String pass){
        boolean ban = false;
        List<Usuario> result = (List<Usuario>) repository.findAll();
        for (int x =0; x<result.size();x++){
            if ((result.get(x).getUsername().equals(username))&&(result.get(x).getPassUser().equals(pass))){
              ban = true;
              break;
            }

        }
        return ban;
    }
}
