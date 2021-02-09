package br.com.viasoft.KiriLivros.service.impl;

import br.com.viasoft.KiriLivros.model.Produto;
import br.com.viasoft.KiriLivros.repository.ProdutoRepository;
import br.com.viasoft.KiriLivros.service.ProdutoService;
import br.com.viasoft.KiriLivros.framework.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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
        List<Produto> result = super.findAll();
        Collections.sort(result);
        return result;
    }

    @Override
    public List<Produto> findByAutor(String autor) {
        return produtoRepository.findAllByAutorContainsIgnoreCase(autor);
    }

    @Override
    public void preSave(Produto produto) {
        System.out.println("Passei pelo pre save, o id era nulo");
    }

    @Override
    public void postSave(Produto produto) {
        System.out.println(String.format("Passei pelo post save, o id é %d", produto.getId()));
    }
}
