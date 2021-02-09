package br.com.viasoft.KiriLivros.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Produto implements Comparable<Produto> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String autor;
    private String imagem;

    @Override
    public int compareTo(Produto o) {
        return nome.compareTo(o.nome);
    }
}


