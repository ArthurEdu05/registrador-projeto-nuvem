package br.mackenzie.registrador.repository;

import br.mackenzie.registrador.entities.Camisa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamisaRepository extends JpaRepository<Camisa, Long> {

}
