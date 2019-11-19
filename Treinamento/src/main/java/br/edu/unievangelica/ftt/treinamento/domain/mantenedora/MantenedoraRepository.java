package br.edu.unievangelica.ftt.treinamento.domain.mantenedora;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenedoraRepository extends JpaRepository<Mantenedora, Long>{

}
