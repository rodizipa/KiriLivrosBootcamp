package br.com.viasoft.KiriLivros.controler;

import br.com.viasoft.KiriLivros.dto.ProdutoFormularioDTO;
import br.com.viasoft.KiriLivros.model.Produto;
import br.com.viasoft.KiriLivros.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produto/novo")
    public String getProduto(ProdutoFormularioDTO produtoFormularioDTO){
        return "produto/formularioproduto";
    }

    @PostMapping("/produto/salvar")
    public String formProduto(@Valid ProdutoFormularioDTO produtoDTO, BindingResult result) {
        if (result.hasErrors()){
            return "produto/formularioproduto";
        }

        Produto produto = produtoDTO.toProduto();
        produtoRepository.save(produto);
        return "produto/formularioproduto";
    }
}
