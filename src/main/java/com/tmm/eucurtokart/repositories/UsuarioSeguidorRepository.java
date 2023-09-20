package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.UsuarioSeguidor;

@Component
public class UsuarioSeguidorRepository {

    private Map<Long, UsuarioSeguidor> map = new HashMap<>();

    public void save(UsuarioSeguidor usuarioSeguidor) {
        map.put(usuarioSeguidor.getId(), usuarioSeguidor);
    }

    public UsuarioSeguidor findById(Long id) {
        return map.get(id);
    }

    public List<UsuarioSeguidor> findAll() {
        return new ArrayList<UsuarioSeguidor>(map.values());
    }
}