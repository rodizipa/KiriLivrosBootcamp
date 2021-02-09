package br.com.viasoft.KiriLivros.controler;

import br.com.viasoft.KiriLivros.model.Produto;
import br.com.viasoft.KiriLivros.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public HomeController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/")
    public String getHome(){
        return "home";
    }

}
