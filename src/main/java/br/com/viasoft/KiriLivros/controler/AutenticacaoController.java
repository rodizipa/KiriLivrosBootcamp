package br.com.viasoft.KiriLivros.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutenticacaoController {
    @GetMapping("/login")
    public String formLogin(){
        return "auth/login";
    }
}
