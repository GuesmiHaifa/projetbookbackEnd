package fr.dawan.BOOKPROJECT;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import fr.dawan.BOOKPROJECT.entities.Author;
import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.entities.Category;
import fr.dawan.BOOKPROJECT.enums.Availability;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.enums.Language;
import fr.dawan.BOOKPROJECT.repositories.BookRepository;
import fr.dawan.BOOKPROJECT.services.BookService;

public class ServiceRunner implements ApplicationRunner {
	@Autowired BookService bookService;
	//@Autowired BookRepository bookrRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// CREATION DES AUTEURS DU LIVRE
		
//		Author author1 = new Author();
//		author1.setFirstname("balla");
//		author1.setLastname("ba");
//		Author author2 = new Author();
//		author2.setFirstname("mamadou");
//		author2.setLastname("sow");
//		ArrayList<Author> authors = new ArrayList<Author>();
//		authors.add(author1);
//		authors.add(author2);
//		//categoryRepository.saveAll(categories)	/*******************************************************************************************************************/
//		
//		// CREATION DE LA CATEGORIE
//		Category cat1 = new Category();
//		Category cat2 = new Category();
//		cat1.setCategoryName("droit");
//		cat2.setCategoryName("medecine");
//		ArrayList<Category> categories = new ArrayList<Category>();
//		categories.add(cat1);
//		categories.add(cat2);
//		//categoryRepository.saveAll(categories);/******************************************************************************************************/
//		
//		// CREATION DU LIVRE
//		Book book1 = new Book();
//		book1.setAuthors(authors);
//		book1.setCategories(categories);
//		book1.setAvailability(Availability.AVAILABLE);
//		book1.setBookEtat(BookEtat.NEUF);
//		book1.setDescription("Lorem ipsum dolor sit amet consectetur, adipisicing elit.");
//		book1.setIsbn("9782035887351");
//		book1.setLanguage(Language.FRANÇAIS);
//		book1.setPageNumber(295);
//		
//		book1.setPointBook(10);
//		book1.setPrice(5.99);
//	    book1.setPublishedDate(LocalDate.of(2020, 10, 20));
//		book1.setPublishingHouse("LAROUSSE");
//		book1.setTitle("Le secret du charisme");
//		book1.setWeight(400);
//		bookService.saveOneBook(book1); /********************************************************************************************/
//	   System.out.println("EXECUTION DU SERVICE RUNNER" + " " + book1);
////		
		//bookService.deleteBookById(1);
		
	}
	

}
