package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.Evento;

@Component
public class EventoRepository {
    private Map<Long, Evento> map = new HashMap<>();

    public void save(Evento evento) {
        map.put(evento.getId(), evento);
    }

    public Evento findById(Long id) {
        return map.get(id);
    }

    public List<Evento> findAll() {
        return new ArrayList<Evento>(map.values());
    }
}