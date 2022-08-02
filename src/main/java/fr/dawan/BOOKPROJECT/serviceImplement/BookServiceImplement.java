package fr.dawan.BOOKPROJECT.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.entities.User;
import fr.dawan.BOOKPROJECT.enums.Availability;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.repositories.BookRepository;
import fr.dawan.BOOKPROJECT.repositories.UserRepository;
import fr.dawan.BOOKPROJECT.services.BookService;
//import fr.dawan.springboot.entities.Produit;

@Service
public class BookServiceImplement implements BookService {
	
	//1TROUVER UN LIVRE PAR UN MOT DE SON TITRE
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired BookRepository bookRepository;
	@Override
	public List<Book> getByTitle(String title) {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookById(long id) {
		bookRepository.deleteById(id);

	}

	@Override
	public List<Book> getByAuthorFirstName(String firstnameToSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthorLastName(String lastnameToSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book saveOneBook(Book book) {
		//return bookRepository.save(book);
		
		Book b = bookRepository.save(book);
		return book;
		
	}

	@Override
	public void saveBookList(List<Book> book) {
		

	}

	@Override
	public String emprunter(long idBook) {

		Book book = bookRepository.findById(idBook);
		if (null == book) {
			return "Livre introuvable";
		} else {
			if (!book.getEmprunte()) {
				book.setEmprunte(true);
				book.setAvailability(Availability.UNAVAILABLE);
				// cette instruction doit etre remplacé par l'utilisateur connecté
				User userConnecte = userRepository.findById(17L).orElse(null);
				book.setUserBook(userConnecte);
				bookRepository.save(book);
				return "opération d'empreint réussie";
			} else {
				return "Le livre est déjà emprunté !";
			}
		}
		
		

	}

	@Override
	public String returnBook(long idBook) {

		Book book = bookRepository.findById(idBook);
		if (null == book) {
			return "Livre introuvable";
		} else {
			if (book.getEmprunte()) {///le livre est deja emprunté
				book.setEmprunte(false);
				book.setAvailability(Availability.AVAILABLE);
				
				// cette instruction doit etre remplacé par l'utilisateur connecté
				User userConnecte = userRepository.findById(1L).orElse(null);
				book.setUserBook(null);
				bookRepository.save(book);
				return "opération de retour a réussie";
			} else {
				return "Le livre n'est pas emprunté !";
			}
		}
		

	}

	@Override
	public List<Book> findBooksBykey(String mot) {
		return bookRepository.findBooksBykey(mot);


	

}

	

}	

