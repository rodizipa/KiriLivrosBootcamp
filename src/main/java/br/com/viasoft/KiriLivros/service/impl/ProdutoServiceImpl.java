package br.com.viasoft.KiriLivros.service.impl;

import br.com.viasoft.KiriLivros.model.Produto;
import br.com.viasoft.KiriLivros.repository.ProdutoRepository;
import br.com.viasoft.KiriLivros.service.ProdutoService;
import framework.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public JpaRepository<Produto, Long> getRepository() {
        return produtoRepository;
    }

    @Override
    public List<Produto> findAll() {
        List<Produto> result = (List<Produto>) super.findAll();
        Collections.sort(result);
        return result;
    }
}
