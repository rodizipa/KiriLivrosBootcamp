package br.com.viasoft.KiriLivros.service;

import br.com.viasoft.KiriLivros.model.Produto;
import framework.CrudService;

import java.util.List;

public interface ProdutoService extends CrudService<Produto, Long> {
    List<Produto> findByAutor(String autor);
}
