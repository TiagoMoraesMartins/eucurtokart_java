package com.tmm.eucurtokart.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.eucurtokart.entities.FotoPostagem;

@Component
public class FotoPostagemRepository {

    private Map<Long, FotoPostagem> map = new HashMap<>();

    public void save(FotoPostagem fotoPostagem) {
        map.put(fotoPostagem.getId(), fotoPostagem);
    }

    public FotoPostagem findById(Long id) {
        return map.get(id);
    }

    public List<FotoPostagem> findAll() {
        return new ArrayList<FotoPostagem>(map.values());
    }

}