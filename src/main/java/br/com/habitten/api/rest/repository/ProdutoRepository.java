package br.com.habitten.api.rest.repository;

import br.com.habitten.api.rest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

  Produto findById(long id);

}
