package com.example.codinglive.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME_PRODUTO")
    private String name;

    @Column(name = "PRECO_PRODUTO")
    private double preco;
}

