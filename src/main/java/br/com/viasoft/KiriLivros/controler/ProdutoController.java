package br.com.viasoft.KiriLivros.controler;

import br.com.viasoft.KiriLivros.dto.ProdutoFormularioDTO;
import br.com.viasoft.KiriLivros.model.Produto;
import br.com.viasoft.KiriLivros.repository.ProdutoRepository;
import br.com.viasoft.KiriLivros.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/produto")
    public String listaProduto(Model model){
        List<Produto> lista = produtoService.findAll();
        model.addAttribute("lista", lista);
        return "produto/listaprodutos";
    }
    
    @GetMapping("/produto/{id}")
    public String listaProdutoById(@PathVariable("id") Long id, Model model){
        Produto p1 = produtoRepository.findById(id).orElse(null);

        model.addAttribute("produto",p1);
        return "produto/produtodetail";
    }

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
