package com.example.cursomc.service;

import com.example.cursomc.entity.Categoria;
import com.example.cursomc.repository.CategoriaRepository;
import com.example.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria procurar(Integer id)
    {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
