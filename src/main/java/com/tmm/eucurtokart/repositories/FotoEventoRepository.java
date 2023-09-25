package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.FotoEvento;

@Component
public class FotoEventoRepository {

    private Map<Long, FotoEvento> map = new HashMap<>();

    public void save(FotoEvento fotoEvento) {
        map.put(fotoEvento.getId(), fotoEvento);
    }

    public FotoEvento findById(Long id) {
        return map.get(id);
    }

    public List<FotoEvento> findAll() {
        return new ArrayList<FotoEvento>(map.values());
    }
}