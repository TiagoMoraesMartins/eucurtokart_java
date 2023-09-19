package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.Postagem;

@Component
public class PostagemRepository {

    private Map<Long, Postagem> map = new HashMap<>();

    public void save(Postagem postagem) {
        map.put(postagem.getId(), postagem);
    }

    public Postagem findById(Long id) {
        return map.get(id);
    }

    public List<Postagem> findAll() {
        return new ArrayList<Postagem>(map.values());
    }

}