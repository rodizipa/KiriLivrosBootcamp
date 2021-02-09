package br.com.viasoft.KiriLivros.repository;

import br.com.viasoft.KiriLivros.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
