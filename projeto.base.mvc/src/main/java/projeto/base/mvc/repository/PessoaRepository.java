package projeto.base.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.base.mvc.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
