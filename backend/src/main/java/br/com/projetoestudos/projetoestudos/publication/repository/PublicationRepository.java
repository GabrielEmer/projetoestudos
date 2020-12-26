package br.com.projetoestudos.projetoestudos.publication.repository;

import br.com.projetoestudos.projetoestudos.publication.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
