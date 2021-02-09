package br.com.viasoft.KiriLivros.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String autor;
    private String imagem;
}


