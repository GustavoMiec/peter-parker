package br.com.fiap.budgetbuddy.repository;

import br.com.fiap.budgetbuddy.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {}