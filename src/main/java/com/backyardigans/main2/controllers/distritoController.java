package com.backyardigans.main2.controllers;

import com.backyardigans.main2.repository.distritoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/api/distritos")
public class distritoController {

    private final distritoRepository distritoRepository;

    public distritoController(distritoRepository distritoRepository) {
        this.distritoRepository = distritoRepository;
    }

    @GetMapping
    public List<Map<String, String>> buscarUbigeos(@RequestParam("nombre") String nombre) {
        List<Object[]> resultados = distritoRepository.buscarUbigeos(nombre);
        List<Map<String, String>> respuesta = new ArrayList<>();

        for (Object[] fila : resultados) {
            Map<String, String> item = new HashMap<>();
            item.put("distrito", (String) fila[0]);
            item.put("provincia", (String) fila[1]);
            item.put("departamento", (String) fila[2]);
            respuesta.add(item);
        }

        return respuesta;
    }
}
