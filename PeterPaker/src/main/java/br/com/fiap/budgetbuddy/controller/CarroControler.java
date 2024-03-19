package br.com.fiap.budgetbuddy.controller;

import br.com.fiap.budgetbuddy.model.Carro;
import br.com.fiap.budgetbuddy.repository.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carro")
public class CarroControler {

    @Autowired
    CarroRepository repo;

    @GetMapping
    public List<Carro> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Carro save(@RequestBody Carro p) {
        return repo.save( p );
    }
}
