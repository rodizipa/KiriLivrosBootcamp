package br.com.viasoft.KiriLivros.service.impl;

import br.com.viasoft.KiriLivros.model.Produto;
import br.com.viasoft.KiriLivros.repository.ProdutoRepository;
import br.com.viasoft.KiriLivros.service.ProdutoService;
import framework.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public JpaRepository<Produto, Long> getRepository() {
        return produtoRepository;
    }
}
