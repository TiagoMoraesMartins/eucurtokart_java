package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.Comentario;

@Component
public class ComentarioRepository {

    private Map<Long, Comentario> map = new HashMap<>();

    public void save(Comentario comentario) {
        map.put(comentario.getId(), comentario);
    }

    public Comentario findById(Long id) {
        return map.get(id);
    }

    public List<Comentario> findAll() {
        return new ArrayList<Comentario>(map.values());
    }
}