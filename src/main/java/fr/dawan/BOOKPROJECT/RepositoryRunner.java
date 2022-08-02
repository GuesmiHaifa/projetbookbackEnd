package fr.dawan.BOOKPROJECT;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import fr.dawan.BOOKPROJECT.entities.Author;
import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.entities.Category;
import fr.dawan.BOOKPROJECT.entities.User;
import fr.dawan.BOOKPROJECT.enums.Availability;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.enums.Language;
import fr.dawan.BOOKPROJECT.enums.UserType;
import fr.dawan.BOOKPROJECT.repositories.AuthorRepository;
import fr.dawan.BOOKPROJECT.repositories.BookRepository;
import fr.dawan.BOOKPROJECT.repositories.CategoryRepository;
import fr.dawan.BOOKPROJECT.repositories.UserRepository;
import fr.dawan.BOOKPROJECT.services.BookService;

@Component
public class RepositoryRunner implements ApplicationRunner {
	@Autowired
	BookRepository bookRepository;
	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	BookService bookService;

	@Autowired 
	UserRepository userRepository;
    @SuppressWarnings("null")
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		
		// CREATION DES AUTEURS DU LIVRE
//	
		Author author1 = new Author();
		author1.setFirstname("Andreas");
		author1.setLastname("J. Wiesand");
		Author author2 = new Author();
		author2.setFirstname("Kalliopi");
		author2.setLastname("Chainoglou");
		Author author3 = new Author();
		author3.setFirstname("Anna");
		author3.setLastname("Sledzinska-Simon");
		ArrayList<Author> authors1 = new ArrayList<Author>();
		authors1.add(author1);
		authors1.add(author2);
		
		authorRepository.save(author1);
		authorRepository.save(author2);
		
		// CREATION DE LA CATEGORIE
		Category cat1 = new Category();
		Category cat2 = new Category();
		cat1.setCategoryName("Political Science");
		cat2.setCategoryName("Arts");
		ArrayList<Category> categories1 = new ArrayList<Category>();
		categories1.add(cat1);
		categories1.add(cat2);
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
//		// CREATION DU LIVRE
		Book book1 = new Book();
		book1.setAuthors(authors1);
		book1.setCategories(categories1);
		book1.setAvailability(Availability.AVAILABLE);
		book1.setBookEtat(BookEtat.MOYEN);
		book1.getPoint();
		book1.setDescription("ted to freedom of, lture and human rights");
		book1.setIsbn("9782035887351");
		book1.setLanguage(Language.PORTUGAIS);
		book1.setPageNumber(295);
		book1.setPicturUrl("http://books.google.com/books/content?id=N1n1CAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
		book1.setPrice(5.99);
		book1.setPublishedDate(LocalDate.of(2016, 11, 07));
		book1.setTitle("Culture and Human Rights: The Wroclaw Commentaries");
		book1.setWeight(40);
      	bookRepository.save(book1);
      	
      	
      /********************************************************************************************************/
//    	Author author4 = new Author();
//		author4.setFirstname("Miquel");
//		author4.setLastname("Bulnes");
//		Author author5 = new Author();
//		author5.setFirstname("Isabelle");
//		author5.setLastname("CRosselin");
//		//Author author3 = new Author();
//		//author3.setFirstname("Anna");
//		//author3.setLastname("Sledzinska-Simon");
//		ArrayList<Author> authors2 = new ArrayList<Author>();
//		authors2.add(author4);
//		authors2.add(author5);
//		authorRepository.save(author4);
//		authorRepository.save(author5);
//		//authorRepository.save(author3);
////		
////		// CREATION DE LA CATEGORIE
//		Category cat3 = new Category();
//		Category cat4 = new Category();
//		cat3.setCategoryName("Fiction");
//		cat4.setCategoryName("Roman");
//		ArrayList<Category> categories2 = new ArrayList<Category>();
//		categories2.add(cat3);
//		categories2.add(cat4);
//		categoryRepository.save(cat3);
//		categoryRepository.save(cat4);
//		
////		// creation d'un utilisateur
    	
         User user1 = new User();
         user1.setUsername("haifa158");
         user1.setAdress("3 alle elmiser de rocher");
         user1.setFirstName("haifa");
         user1.setLastName("guesmi");
         user1.setEmail("guesmi_haifahotmail.fr");
         user1.setUserType(UserType.USER);
         userRepository.save(user1);
//////		// CREATION DU LIVRE
//		Book book3 = new Book();
//		book3.setAuthors(authors2);
//		book3.setCategories(categories2);
//		book3.setAvailability(Availability.AVAILABLE);
//		book3.setBookEtat(BookEtat.MOYEN);
//		book3.getPoint();
//		book3.setDescription("Espagne, été 1921. Blessé dans sa retraite face aux forces supérieures du chef berbère Abd-el-Krim, le capitaine de l’armée espagnole Augusto Santamaria del Valle est nommé chef de la Sureté de Madrid. Très vite, un meurtre commis dans une maison close ouvre, par ses multiples ramifications, une vertigineuse vue en coupe d’une société aux mœurs aussi troubles que son actualité politique est agitée. Immense fresque menée à un rythme d’enfer, Le Sang dans nos veines dresse le portrait stupéfiant de la respectabilité corrompue et de l’attrait du vice. Un roman kaléidoscopique d’une ambition rare.");
//		book3.setIsbn("9782330058159");
//		book3.setLanguage(Language.FRANÇAIS);
//		book3.setPageNumber(830);
//		book3.setPicturUrl("https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1450387740l/28234614._SY475_.jpg");
//		book3.setPrice(11.99);
//		book3.setPublishedDate(LocalDate.of(2011, 01, 01));
//		book3.setTitle("Le Sang dans nos veines");
//		book3.setWeight(0.0);
//      	bookRepository.save(book3);
////      	
//      ******************************************************************************************************************************	
//        Author author6 = new Author();
//		author6.setFirstname("Fabien");
//		author6.setLastname("Fournier");
//		
//		ArrayList<Author> authors3 = new ArrayList<Author>();
//		authors3.add(author6);
//		authorRepository.save(author6);
//		
//	
//		
//		// CREATION DE LA CATEGORIE
//		Category cat5 = new Category();
//		cat5.setCategoryName("Comics & Graphic Novels");
//		ArrayList<Category> categories3 = new ArrayList<Category>();
//		categories3.add(cat5);
//		categoryRepository.save(cat5);
//		
//		
////  // CREATION DU LIVRE
//		Book book4 = new Book();
//		book4.setAuthors(authors3);
//		book4.setCategories(categories3);
//		book4.setAvailability(Availability.AVAILABLE);
//		book4.setBookEtat(BookEtat.NEUF);
//		book4.setDescription("Les tomes 1 et 2 forment un arc narratif conclusif. Lecture sens japonais. Synopsis : Dans un monde dominé par la magie, les néogiciens, une civilisation portée par une puissance nouvelle appelée technologie, ont fondé l'Empire, dont la capitale est Centralis. Saly Asigar, une jeune Olydrienne, entreprend de rejoindre ce peuple. Pour y prétendre, elle doit subir une injection, l’isolant définitivement des flux magiques parcourant le monde d'Olydri. Une telle pratique n'est pas sans risques. Dans l'hypothèse d’une incompatibilité génétique, elle mourrait ou pire encore ! Elle pourrait muter en ce que les scientifiques appellent une aberration. À l'aube de ce second éveil, la procédure semble prendre une tournure inattendue...");
//		book4.setIsbn("9791095780724");
//		book4.setLanguage(Language.FRANÇAIS);
//		book4.setPageNumber(177);
//		book4.setPicturUrl("http://books.google.com/books/content?id=PaMlEAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
//		book4.setPrice(11.99);
//		book4.setPublishedDate(LocalDate.of(2014, 10, 01));
//		
//		book4.setTitle("Néogicia MANGA 1");
//		book4.setWeight(40.0);
//    	bookRepository.save(book4);
      	
//      ****************************************************************************************	
//    	Author author7 = new Author();
// 		author7.setFirstname("Fabien");
// 		author7.setLastname("Fournier");
// 		
// 		ArrayList<Author> authors7 = new ArrayList<Author>();
// 		authors7.add(author7);
// 		
// 		authorRepository.save(author7);
// 		
// 	
// 		
// 		// CREATION DE LA CATEGORIE
// 		Category cat6 = new Category();
// 		Category cat7 = new Category();
// 		cat6.setCategoryName("Comics & Graphic Novels");
// 		cat7.setCategoryName("Comics & Graphic Novels");
// 		
// 		ArrayList<Category> categories4 = new ArrayList<Category>();
//		categories4.add(cat6);
//		categories4.add(cat7);
//		categoryRepository.save(cat6);
//		categoryRepository.save(cat7);
// 		
// 		
// //  // CREATION DU LIVRE
// 		Book book5 = new Book();
// 		book5.setAuthors(authors7);
// 		book5.setCategories(categories4);
// 		book5.setAvailability(Availability.AVAILABLE);
// 		book5.setBookEtat(BookEtat.NEUF);
// 		book5.setDescription("Les tomes 1 et 2 forment un arc narratif conclusif. Lecture sens japonais. Synopsis : Dans un monde dominé par la magie, les néogiciens, une civilisation portée par une puissance nouvelle appelée technologie, ont fondé l'Empire, dont la capitale est Centralis. Saly Asigar, une jeune Olydrienne, entreprend de rejoindre ce peuple. Pour y prétendre, elle doit subir une injection, l’isolant définitivement des flux magiques parcourant le monde d'Olydri. Une telle pratique n'est pas sans risques. Dans l'hypothèse d’une incompatibilité génétique, elle mourrait ou pire encore ! Elle pourrait muter en ce que les scientifiques appellent une aberration. À l'aube de ce second éveil, la procédure semble prendre une tournure inattendue...");
// 		book5.setIsbn("9791095780724");
// 		book5.setLanguage(Language.FRANÇAIS);
// 		book5.setPageNumber(177);
// 		book5.setPicturUrl("http://books.google.com/books/content?id=taMlEAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
// 		book5.setPrice(11.99);
// 		book5.setPublishedDate(LocalDate.of(2014, 10, 01));
// 		book5.setTitle("Noob Reroll MANGA 1");
// 		book5.setWeight(40.0);
//     	bookRepository.save(book5);
////       	
//*************************************************************************************    	
//    	
//    	Author author8 = new Author();
// 		author8.setFirstname("");
// 		author8.setLastname("Fournier");
// 		
// 		ArrayList<Author> authors8 = new ArrayList<Author>();
// 		authors8.add(author8);
// 		
// 		authorRepository.save(author8);
// 		
// 	
// 		
// 		// CREATION DE LA CATEGORIE
// 		Category cat8 = new Category();
// 		Category cat9 = new Category();
// 		cat8.setCategoryName("Arts");
// 		
// 		
// 		ArrayList<Category> categories5 = new ArrayList<Category>();
//		categories5.add(cat8);
//		
//		categoryRepository.save(cat8);
//		categoryRepository.save(cat9);
// 		
// 		
// //  // CREATION DU LIVRE
// 		Book book6 = new Book();
// 		book6.setAuthors(authors8);
// 		book6.setCategories(categories5);
// 		book6.setAvailability(Availability.AVAILABLE);
// 		book6.setBookEtat(BookEtat.NEUF);
// 		book6.setDescription("Les tomes 1 et 2 forment un arc narratif conclusif. Lecture sens japonais. Synopsis : Dans un monde dominé par la magie, les néogiciens, une civilisation portée par une puissance nouvelle appelée technologie, ont fondé l'Empire, dont la capitale est Centralis. Saly Asigar, une jeune Olydrienne, entreprend de rejoindre ce peuple. Pour y prétendre, elle doit subir une injection, l’isolant définitivement des flux magiques parcourant le monde d'Olydri. Une telle pratique n'est pas sans risques. Dans l'hypothèse d’une incompatibilité génétique, elle mourrait ou pire encore ! Elle pourrait muter en ce que les scientifiques appellent une aberration. À l'aube de ce second éveil, la procédure semble prendre une tournure inattendue...");
// 		book6.setIsbn("9791095780724");
// 		book6.setLanguage(Language.FRANÇAIS);
// 		book6.setPageNumber(177);
// 		book6.setPicturUrl("http://books.google.com/books/content?id=T88yDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
// 		book6.setPrice(11.99);
// 		book6.setPublishedDate(LocalDate.of(2014, 10, 01));
// 		book6.setTitle("Les Architectes de l'illusion : Les Animaux fantastiques. Art book");
// 		book6.setWeight(40.0);
//     	bookRepository.save(book6);	Author author8 = new Author();
// 		author8.setFirstname("");
// 		author8.setLastname("Fournier");
// 		
// 		ArrayList<Author> authors8 = new ArrayList<Author>();
// 		authors8.add(author8);
// 		
// 		authorRepository.save(author8);
 		
 	
 		
 		// CREATION DE LA CATEGORIE
// 		Category cat8 = new Category();
// 		Category cat9 = new Category();
// 		cat8.setCategoryName("Arts");
// 		
// 		
// 		ArrayList<Category> categories5 = new ArrayList<Category>();
//		categories5.add(cat8);
//		
//		categoryRepository.save(cat8);
//		categoryRepository.save(cat9);
// 		
// 		
// //  // CREATION DU LIVRE
// 		Book book6 = new Book();
// 		book6.setAuthors(authors8);
// 		book6.setCategories(categories5);
// 		book6.setAvailability(Availability.AVAILABLE);
// 		book6.setBookEtat(BookEtat.NEUF);
// 		book6.setDescription("Les tomes 1 et 2 forment un arc narratif conclusif. Lecture sens japonais. Synopsis : Dans un monde dominé par la magie, les néogiciens, une civilisation portée par une puissance nouvelle appelée technologie, ont fondé l'Empire, dont la capitale est Centralis. Saly Asigar, une jeune Olydrienne, entreprend de rejoindre ce peuple. Pour y prétendre, elle doit subir une injection, l’isolant définitivement des flux magiques parcourant le monde d'Olydri. Une telle pratique n'est pas sans risques. Dans l'hypothèse d’une incompatibilité génétique, elle mourrait ou pire encore ! Elle pourrait muter en ce que les scientifiques appellent une aberration. À l'aube de ce second éveil, la procédure semble prendre une tournure inattendue...");
// 		book6.setIsbn("9791095780724");
// 		book6.setLanguage(Language.FRANÇAIS);
// 		book6.setPageNumber(177);
// 		book6.setPicturUrl("http://books.google.com/books/content?id=T88yDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
// 		book6.setPrice(11.99);
// 		book6.setPublishedDate(LocalDate.of(2014, 10, 01));
// 		book6.setTitle("Les Architectes de l'illusion : Les Animaux fantastiques. Art book");
// 		book6.setWeight(40.0);
//     	bookRepository.save(book6);	
 		
 		
 //  // CREATION DU LIVRE
// 		Book book6 = new Book();
// 		book6.setAuthors(authors8);
// 		book6.setCategories(categories5);
// 		book6.setAvailability(Availability.AVAILABLE);
// 		book6.setBookEtat(BookEtat.NEUF);
// 		book6.setDescription("Les tomes 1 et 2 forment un arc narratif conclusif. Lecture sens japonais. Synopsis : Dans un monde dominé par la magie, les néogiciens, une civilisation portée par une puissance nouvelle appelée technologie, ont fondé l'Empire, dont la capitale est Centralis. Saly Asigar, une jeune Olydrienne, entreprend de rejoindre ce peuple. Pour y prétendre, elle doit subir une injection, l’isolant définitivement des flux magiques parcourant le monde d'Olydri. Une telle pratique n'est pas sans risques. Dans l'hypothèse d’une incompatibilité génétique, elle mourrait ou pire encore ! Elle pourrait muter en ce que les scientifiques appellent une aberration. À l'aube de ce second éveil, la procédure semble prendre une tournure inattendue...");
// 		book6.setIsbn("9791095780724");
// 		book6.setLanguage(Language.FRANÇAIS);
// 		book6.setPageNumber(177);
// 		book6.setPicturUrl("http://books.google.com/books/content?id=T88yDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
// 		book6.setPrice(11.99);
// 		book6.setPublishedDate(LocalDate.of(2014, 10, 01));
// 		book6.setTitle("Les Architectes de l'illusion : Les Animaux fantastiques. Art book");
// 		book6.setWeight(40.0);
//     	bookRepository.save(book6);	
//    	
//    	
//    	Author author9 = new Author();
// 		author9.setFirstname("");
// 		author9.setLastname("Fournier");
// 		
// 		ArrayList<Author> authors9 = new ArrayList<Author>();
// 		authors9.add(author9);
// 		
// 		authorRepository.save(author9);
// 		
// 	
// 		
// 		// CREATION DE LA CATEGORIE
// 		Category cat8 = new Category();
// 		Category cat9 = new Category();
// 		cat8.setCategoryName("Arts");
// 		
// 		
// 		ArrayList<Category> categories5 = new ArrayList<Category>();
//		categories5.add(cat8);
//		
//		categoryRepository.save(cat8);
//		categoryRepository.save(cat9);
// 		
// 		
// //  // CREATION DU LIVRE
// 		Book book6 = new Book();
// 		book6.setAuthors(authors8);
// 		book6.setCategories(categories5);
// 		book6.setAvailability(Availability.AVAILABLE);
// 		book6.setBookEtat(BookEtat.NEUF);
// 		book6.setDescription("Les tomes 1 et 2 forment un arc narratif conclusif. Lecture sens japonais. Synopsis : Dans un monde dominé par la magie, les néogiciens, une civilisation portée par une puissance nouvelle appelée technologie, ont fondé l'Empire, dont la capitale est Centralis. Saly Asigar, une jeune Olydrienne, entreprend de rejoindre ce peuple. Pour y prétendre, elle doit subir une injection, l’isolant définitivement des flux magiques parcourant le monde d'Olydri. Une telle pratique n'est pas sans risques. Dans l'hypothèse d’une incompatibilité génétique, elle mourrait ou pire encore ! Elle pourrait muter en ce que les scientifiques appellent une aberration. À l'aube de ce second éveil, la procédure semble prendre une tournure inattendue...");
// 		book6.setIsbn("9791095780724");
// 		book6.setLanguage(Language.FRANÇAIS);
// 		book6.setPageNumber(177);
// 		book6.setPicturUrl("http://books.google.com/books/content?id=T88yDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api");
// 		book6.setPrice(11.99);
// 		book6.setPublishedDate(LocalDate.of(2014, 10, 01));
// 		book6.setTitle("Les Architectes de l'illusion : Les Animaux fantastiques. Art book");
// 		book6.setWeight(40.0);
//     	bookRepository.save(book6);	
////    	
//    	
//    	
//    	
//    	
//    	
//    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
      	
////		//************** DEUXIEME LIVRE 
//		Book book2 = new Book();
//		ArrayList<Author> authors2 = new ArrayList<Author>();
//		authors2.add(author2);
//		book2.setAuthors(authors2);
//		ArrayList<Category> categories2 = new ArrayList<Category>();
//		categories2.add(cat1);
//		book2.setCategories(categories2);
//		book2.setAvailability(Availability.AVAILABLE);
//		book2.setBookEtat(BookEtat.MOYEN);
//		book2.setDescription("Lorem ipsum dolor sit amet consectetur, adipisicing elit.");
//		book2.setIsbn("9782035887351");
//		book2.setLanguage(Language.PORTUGAIS);
//		book2.setPageNumber(295);
//		book2.setPicturUrl(null);
//		book2.setTitle("guerre des étoiles");
//		bookRepository.save(book2);	
//        List<Book> books = new ArrayList<>();		
//		  books.add(book2);
//          books.add(book1);		
//		bookRepository.saveAll(books);
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
		
		//System.out.println("################################" + " " + bookRepository.findById(1).getISBN());
		// SUPPRESSION PAR L'ID
		//bookRepository.deleteById(1);/************************************************************************************************/
		
		// AFFICHAGE DE TOUS LES LIVRES
        
		
		//bookRepository.findAll();
		//List<Book> lstOfAllBooks = null;
		//lstOfAllBooks = bookRepository.findAll();
		//for (Book book : lstOfAllBooks) {System.out.println("Livres trouvé" + " " + book.getTitle());}*/
		
		//System.out.println(book1);
		
		// RECHERCHER LES AUTEURS EN AYANT LA CATEGORIE
		/*List<Author> lstAuthorsByBookId = null;
		lstAuthorsByBookId = authorRepository.findByBookId(5);
		for (Author author : lstAuthorsByBookId) {System.out.println("Auteurs trouvés l'ID du livre" + " " + author.getFirstname());}*/
		
		//RECHERCHER UN LIVRE PAR LE PRENOM DE L'AUTEUR
		/*List<Book> lstBookByAuthorFirstName = null;
		lstBookByAuthorFirstName = bookRepository.findByAuthorFirstName("balla");
		for (Book book : lstBookByAuthorFirstName) {System.out.println("Livres trouvés par le prénom de l'auteur" + " " + book.getTitle());}*/
		
		//RECHERCHER UN LIVRE PAR LE NOM DE L'AUTEUR
		/*List<Book> lstBookByAuthorLastName = null;
		lstBookByAuthorLastName = bookRepository.findByAuthorLastName("diop");
		for (Book book : lstBookByAuthorLastName) {System.out.println("Livres trouvés par le nom de l'auteur" + " " + book.getTitle());}*/
		
		//RECHERCHER DES LIVRES PAR CATEGORIE
		
		
		
		/*List<Book> lstBookByCategory = null;
		lstBookByCategory = bookRepository.findBookByCategoryName("geographie");
		for (Book book : lstBookByCategory) {System.out.println("Livres trouvés dans cette catégorie" + " " + book.getTitle());}		
		
		// CREATION DES UTILISATEURS
		
		
	*/
       
		
        
        // emprunter un livre
        
        
        
	      //System.out.println(bookService.emprunter(2L));
		//System.out.println(bookService.returnBook(3L));
    	
		//System.out.println(bookService.findBooksBykey("maria"));
		
	
    	//System.out.println(bookEtat.NEUF.getValue()); // 
    	//System.out.println(BookEtat.NEUF.getPoint()); // -> DAY
		

	}

}

