package br.com.viasoft.KiriLivros.repository;

import br.com.viasoft.KiriLivros.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
