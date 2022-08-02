package fr.dawan.BOOKPROJECT.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.enums.BookEtat;

public interface BookService {
	//1TROUVER UN LIVRE PAR UN MOT DE SON TITRE
	List<Book> getByTitle(String title);
	
	//2 TROUVER UN LIVRE PAR SON ID
	Book getBookById(long id);
	
	//3 AFFICHER TOUS LES LIVRES
	List <Book> getAllBooks();
	
	//4 EFFACER UN LIVRE
	void deleteBookById(long id);
	
	//5 LISTE DES LIVRES CONNAISSANT LE FIRSTNAME DE L'AUTEUR
	List<Book> getByAuthorFirstName(String firstnameToSearch);
	
	//6 LISTE DES LIVRES CONNAISSANT LE LASTNAME DE L'AUTEUR
	List<Book> getByAuthorLastName(String lastnameToSearch);
	
	//7 RECHERCHER LES LIVRES PAR CATEGORIE
	List<Book> getBooksByCategoryName(String categoryName);
	
	//8 SAUVEGARDER UN LIVRE
	Book saveOneBook(Book book);
	
	//9 SAUVEGARDER DES LIVRES
	void saveBookList(List<Book> book);
	
	//rechercher par clé
	public List<Book> findBooksBykey(String mot);
	
	public String emprunter(long idBook);
	
	public String returnBook(long idBook);
	
	//public void getStringToBookEtat(@Param("book_etat") BookEtat booketat);
	
}
