package br.com.viasoft.KiriLivros.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private String cliente;

    private BigDecimal valorTotal;
}
