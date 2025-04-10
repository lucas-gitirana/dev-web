package dsw.projeto_rest.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dsw.projeto_rest.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
