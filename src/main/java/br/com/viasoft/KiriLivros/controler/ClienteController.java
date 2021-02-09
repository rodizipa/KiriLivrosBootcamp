package br.com.viasoft.KiriLivros.controler;

import br.com.viasoft.KiriLivros.model.Cliente;
import br.com.viasoft.KiriLivros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public String getCliente(Model model) {
        List<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("clientes", clientes);
        return "cliente";
    }

}
