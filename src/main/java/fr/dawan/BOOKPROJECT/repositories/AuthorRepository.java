package fr.dawan.BOOKPROJECT.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.dawan.BOOKPROJECT.entities.Author;
import fr.dawan.BOOKPROJECT.entities.Book;


public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	//1TROUVER UN AUTEUR DONT LE PRENOM EST
	public List<Author> findByfirstnameLike(String modele);
	
	//2TROUVER UN AUTEUR DONT LE NOM DE FAMILLE EST
	public List<Author> findByLastnameLike(String modele);

    //3LISTE DES AUTEURS D'UN LIVRE
	@Query(value = "FROM Author a Join a.books b WHERE b.id=:idBook")
    List<Author> findByBookId(@Param("idBook") long idBook);
	


	

	
	
	//Author deleteById(long id); //A REVOIR SON IMPORTANCE
	
	//Author findById(long id);//A REVOIR SON IMPORTANCE
}
