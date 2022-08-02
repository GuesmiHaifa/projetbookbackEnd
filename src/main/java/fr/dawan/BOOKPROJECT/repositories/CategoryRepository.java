package fr.dawan.BOOKPROJECT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.BOOKPROJECT.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
