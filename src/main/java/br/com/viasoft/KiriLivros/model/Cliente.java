package br.com.viasoft.KiriLivros.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;

    @OneToMany(orphanRemoval = true)
    List<Pedido> pedidos = new ArrayList<Pedido>();
}
