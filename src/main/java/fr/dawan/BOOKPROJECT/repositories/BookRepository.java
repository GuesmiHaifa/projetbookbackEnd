package fr.dawan.BOOKPROJECT.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.enums.BookEtat;



public interface BookRepository extends JpaRepository<Book, Long> {
	
	//1 TROUVER UN LIVRE PAR UN MOT DE SON TITRE
	public List<Book> findByTitleIsContaining(String title);
	
	//2 TROUVER UN LIVRE PAR SON ID
	Book findById(long id);
    
	//3 AFFICHER TOUS LES LIVRES
	List <Book> findAll();
	
	//4 EFFACER UN LIVRE
	Book deleteById(long id);
	
	
	//5 LISTE DES LIVRES CONNAISSANT LE FIRSTNAME+ DE L'AUTEUR
	@Query(value = "FROM Book b join b.authors a WHERE a.firstname=:firstnameToSearch")
	List<Book> findByAuthorFirstName(@Param("firstnameToSearch")String firstnameToSearch);
	
	//6 LISTE DES LIVRES CONNAISSANT LE LASTNAME DE L'AUTEUR
	@Query(value = "FROM Book b join b.authors a WHERE a.lastname=:lastnameToSearch")
	List<Book> findByAuthorLastName(@Param("lastnameToSearch")String lastnameToSearch);
	
	//7 RECHERCHER LES LIVRES PAR CATEGORIE
	@Query(value = "FROM Book b Join b.categories c WHERE c.categoryName=:categoryToSearch")
	List<Book> findBookByCategoryName(@Param("categoryToSearch") String categoryToSearch);

	@Query(value ="SELECT * FROM books b WHERE b.id \n"
			+ "	IN (SELECT DISTINCT(b.id) FROM `books` b \n"
			+ "        INNER JOIN `books_categories` bc ON b.id = bc.books_category_id \n"
			+ "        INNER JOIN `categories` c ON c.id = bc.categories_id \n"
			+ "        INNER JOIN `books_authors` ba ON ba.books_id = b.id \n"
			+ "        INNER JOIN `authors` a ON a.id = ba.authors_id \n"
			+ "        WHERE b.title LIKE %:mot%\n"
			+ "        OR c.category_name LIKE %:mot% \n"
			+ "        OR a.firstname LIKE %:mot% \n"
			+ "        OR a.lastName LIKE %:mot%)", nativeQuery = true)
	public List<Book> findBooksBykey(@Param("mot") String mot);
	
	
	//public String getEtatBookByBookId(@Param("book_etat") long id);
	
}









