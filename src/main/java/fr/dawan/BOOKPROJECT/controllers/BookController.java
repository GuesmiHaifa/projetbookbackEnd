package fr.dawan.BOOKPROJECT.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.repositories.BookRepository;
import fr.dawan.BOOKPROJECT.services.BookService;

@RestController
@CrossOrigin(origins = "http://localhost:3002")
//@RequestMapping("/api/books")

public class BookController {
	
	@Autowired BookRepository bookRepository;
/******************************************************************************************/
	@Autowired
	BookService bookService;
	//GET ALL
	@GetMapping("api/books")
	public List <Book> findAll(){
		return bookRepository.findAll();
	}
/********************************************************************************/
	  //GET ONE
	@GetMapping(value="api/books/{id}", produces = "application/json")
	public ResponseEntity<Object> getById(@PathVariable("id")  int id) {

		Book p = bookRepository.findById(id);
		if(p == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("book avec id = "+id+" introuvable.");
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(p);
		}
	}
	/*************************************************************/
	//POST ONE
	@PostMapping(value="api/books/save", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Book> insertBook(@RequestBody Book b){
		
		Book recup = bookRepository.saveAndFlush(b);
		return ResponseEntity.status(HttpStatus.CREATED).body(recup);
	}  
	  /*****************************************************************/
		 //DELETE ONE
	@DeleteMapping(value="/api/books/{id}", produces = "text/plain")
	public ResponseEntity<Object> deleteBook(@PathVariable("id") int id){
		//Book p = produitService.getById(id);
		Book p = bookRepository.findById(id);
		if(p == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Livre avec id = "+id+" introuvable");
		}else {
			//produitService.deleteById(id);
			bookRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("Livre avec id = "+id+" supprimé avec succés");
		}
	}
	/*******************************************************************/
	//LIST BY FIRST NAME
	  //GET ONE
	@GetMapping(value="api/books-author-fn/{firstname}", produces = "application/json")
	public List<Book> BookByAuFiName(@PathVariable("firstname")  String firstname) {

		List<Book> lstBookByAuthorFirstName = null;
		lstBookByAuthorFirstName = bookRepository.findByAuthorFirstName(firstname);
		System.out.println("##############################################################" );
		return lstBookByAuthorFirstName;
	}
	/*******************************************************************/
	//LIST BY LAST NAME
	  //GET ONE
	@GetMapping(value="api/books-author-ln/{lastname}", produces = "application/json")
	public List<Book> BookByAuLaName(@PathVariable("lastname")  String lastname) {

		List<Book> lstBookByAuthorLastName = null;
		lstBookByAuthorLastName = bookRepository.findByAuthorLastName(lastname);
		System.out.println("##############################################################" );
		return lstBookByAuthorLastName;
	}
	/*******************************************************************/
	//LIST BY CATEGORIE
	  //GET ONE
	@GetMapping(value="api/books-cat/{category}", produces = "application/json")
	public List<Book> BookByCat(@PathVariable("category")  String category) {

		List<Book> lstBookByCat = null;
		lstBookByCat = bookRepository.findBookByCategoryName(category);
		System.out.println("##############################################################" );
		return lstBookByCat;
	}
	/********************************************************************/
	//LIVRE DONT LE TRITRE CONTIENT
	@GetMapping(value="api/books-title/{title}", produces = "application/json")
	public List<Book> findByTitleIsContaining(@PathVariable("title")  String title) {

		List<Book> lst = null;
		lst = bookRepository.findByTitleIsContaining(title);
		System.out.println("##############################################################" );
		return lst;
	}
	
	
	
	
	/******************************************************************/
	/******************************************************************/
	/******************************************************************/
	
	@PutMapping(value="api/books/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> updateProduit(@RequestBody Book b){
		Book recup = bookRepository.saveAndFlush(b);
		return ResponseEntity.status(HttpStatus.OK).body(recup);
	}

	
	
	
	@PostMapping(value ="api/books/addbookslist", consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<Book>> addListBook(@RequestBody List<Book> books){
		
		List<Book> booksNew = bookRepository.saveAllAndFlush(books);
		return ResponseEntity.status(HttpStatus.CREATED).body(booksNew);
	}
//   @GetMapping(value="api/books/rechercher/{key}", produces = "application/json")
//    public List<Book> findBookBykeyBooks(@PathVariable("key")  String key) {
//
//		List<Book> lst = null;
//		lst = bookRepository.findBookBykeyBooks(key);
//		return lst;
//	}
	
	@GetMapping(value = "api/books/emprunter/{idBook}")
	public String emprunter( @PathVariable Long idBook) {
		
		return bookService.emprunter(idBook);
		
	}
	@GetMapping(value = "api/books/returnbook/{idBook}")
	public String returnBook( @PathVariable Long idBook) {
		
		return bookService.returnBook(idBook);
		
	}
	
	
//	@GetMapping(value = "api/books/search/{mot}")
//	public List<BookDto> findBooksByKey( @PathVariable String mot) {
//		
//		List<Book> books = bookService.findBooksBykey(mot);
//		List<BookDto> booksDto = new ArrayList<>();
//		if (null != books && !books.isEmpty()) {
//			for (Book book : books) {s
//				booksDto.add(BookDto.convertBookToBookDto(book));
//			}
//			return booksDto;	
//		}
//		 return Collections.emptyList();
//		
//	}
	@GetMapping(value = "api/books/search/{mot}")
	public List<Book> findBooksByKey( @PathVariable String mot) {
		
		return bookService.findBooksBykey(mot);
		
	}
//	@RequestMapping(value = "api/books/point/{id}", method = RequestMethod.GET)
//	public BookEtat getBookEtatByIdBook(@PathVariable(value = "point") BookEtat bookEtat) {
//		return bookService.
//	}
	
		
	   
	
	
	
	
	
	
	
	
}//fin classe
