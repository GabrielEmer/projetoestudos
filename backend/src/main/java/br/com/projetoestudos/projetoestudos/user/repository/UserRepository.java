package br.com.projetoestudos.projetoestudos.user.repository;

import br.com.projetoestudos.projetoestudos.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
