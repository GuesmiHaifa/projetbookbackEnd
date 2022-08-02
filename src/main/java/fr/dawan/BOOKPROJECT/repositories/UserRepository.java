package fr.dawan.BOOKPROJECT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.dawan.BOOKPROJECT.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

	@Query("FROM User u WHERE u.username LIKE :username")
			User findByUsername(@Param("username") String  username);

}
