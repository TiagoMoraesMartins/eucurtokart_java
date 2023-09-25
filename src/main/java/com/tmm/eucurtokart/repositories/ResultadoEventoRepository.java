package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.ResultadoEvento;

@Component
public class ResultadoEventoRepository {

    private Map<Long, ResultadoEvento> map = new HashMap<>();

    public void save(ResultadoEvento resultadoEvento) {
        map.put(resultadoEvento.getId(), resultadoEvento);
    }

    public ResultadoEvento findById(Long id) {
        return map.get(id);
    }

    public List<ResultadoEvento> findAll() {
        return new ArrayList<ResultadoEvento>(map.values());
    }
}