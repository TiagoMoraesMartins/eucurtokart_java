package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.ParticipanteEvento;

@Component
public class ParticipanteEventoRepository {

    private Map<Long, ParticipanteEvento> map = new HashMap<>();

    public void save(ParticipanteEvento participanteEvento) {
        map.put(participanteEvento.getId(), participanteEvento);
    }

    public ParticipanteEvento findById(Long id) {
        return map.get(id);
    }

    public List<ParticipanteEvento> findAll() {
        return new ArrayList<ParticipanteEvento>(map.values());
    }

}