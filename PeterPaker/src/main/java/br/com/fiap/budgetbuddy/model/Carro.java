package br.com.fiap.budgetbuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity

@Table(name = "TB_CARRO")
public class Carro {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLA_CARRO")
    private String placa;

    @Column(name = "MOL_CARRO")
    private String modelo;

    @Column(name = "COR_CARRO")
    private String cor;

    @Column(name = "DESC_CARRO")
    private String descricao;
}
