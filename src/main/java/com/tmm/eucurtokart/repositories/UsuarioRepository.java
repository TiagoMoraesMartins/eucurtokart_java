package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.Usuario;

/*@Component utilizado para realizar a injeção de dependência */
@Component
public class UsuarioRepository {

    private Map<Long, Usuario> map = new HashMap<>();

    public void save(Usuario usuario) {
        map.put(usuario.getId(), usuario);
    }

    public Usuario findById(Long id) {
        return map.get(id);
    }

    public List<Usuario> findAll() {
        return new ArrayList<Usuario>(map.values());
    }
}