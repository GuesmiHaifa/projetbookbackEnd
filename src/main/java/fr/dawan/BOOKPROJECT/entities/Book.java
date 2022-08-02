package fr.dawan.BOOKPROJECT.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.dawan.BOOKPROJECT.enums.Availability;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.enums.Language;

@Entity
@Table(name = "books")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;
			
			
			private String isbn;
		
			
			private String title;
		
			
			private LocalDate publishedDate = LocalDate.now();
		
			
			private String publishingHouse;
			
			private double weight;
		
			private int pageNumber;
			
			private String description;
			
			private boolean emprunte = false;
			
			
			
			@Enumerated(EnumType.STRING)
			private BookEtat bookEtat;
			
			
			private double price;
			
//			@Lob
//			private byte[] picture;
 		
			private String picturUrl;

			@Enumerated(EnumType.STRING)
			private Language language;
			
			@Enumerated(EnumType.STRING)
			private Availability availability;
			
			
	         
	    
			//MAPPING BOOK AUTHORS
			
			//@JsonIgnoreProperties(value = "books")
			@ManyToMany(cascade = CascadeType.REMOVE)
			private List<Author> authors = new ArrayList<>();
			
			//MAPPING BOOK CATEGORY
			
			//@JsonIgnoreProperties(value = "booksCategory")
			@ManyToMany(cascade = CascadeType.REMOVE)
			private List<Category> categories = new ArrayList<>() ;
			
			//@JsonIgnoreProperties(value = "booksUser")
			@ManyToOne
			@JsonIgnore
			@JoinColumn(name = "id_user")
			private  User userBook;
			
			
			
			
			
		    public Book() {
				super();
			}

			public Book(long id, String isbn, String title, LocalDate publishedDate, String publishingHouse,
					double weight, int pageNumber, String description, boolean emprunte, BookEtat bookEtat,
					double price, String picturUrl, Language language, Availability availability, int point,
					List<Author> authors, List<Category> categories, User userBook) {
				super();
				this.id = id;
				this.isbn = isbn;
				this.title = title;
				this.publishedDate = publishedDate;
				this.publishingHouse = publishingHouse;
				this.weight = weight;
				this.pageNumber = pageNumber;
				this.description = description;
				this.emprunte = emprunte;
				this.bookEtat = bookEtat;
				this.price = price;
				this.picturUrl = picturUrl;
				this.language = language;
				this.availability = availability;
				
				this.authors = authors;
				this.categories = categories;
				this.userBook = userBook;
			}

			public boolean getEmprunte(){
	            return this.emprunte;
	        }
	         
	        public void setEmprunte(boolean emprunte){
	            this.emprunte = emprunte;
	        }
			
			public User getUserBook() {
				return userBook;
			}

			public void setUserBook(User userBook) {
				this.userBook = userBook;
			}

			
			public String getPublishingHouse() {
				return publishingHouse;
			}

			public void setPublishingHouse(String publishingHouse) {
				this.publishingHouse = publishingHouse;
			}


			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			

			public String getIsbn() {
				return isbn;
			}

			public void setIsbn(String isbn) {
				this.isbn = isbn;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public LocalDate getPublishedDate() {
				return publishedDate;
			}

			public void setPublishedDate(LocalDate publishedDate) {
				this.publishedDate = publishedDate;
			}

			public double getWeight() {
				return weight;
			}

			public void setWeight(double weight) {
				this.weight = weight;
			}

			public int getPageNumber() {
				return pageNumber;
			}

			public void setPageNumber(int pageNumber) {
				this.pageNumber = pageNumber;
			}

			public String getBookEtat() {
				return bookEtat.getAbrev();
			}

			public void setBookEtat(BookEtat bookEtat) {
				this.bookEtat = bookEtat;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public int getPoint() {
				return bookEtat.getPointb();
			}

			
			public Language getLanguage() {
				return language;
			}

			public void setLanguage(Language language) {
				this.language = language;
			}

			public String getAvailability() {
				return availability.getUrl();
			}

			public void setAvailability(Availability availability) {
				this.availability = availability;
			}

			public List<Author> getAuthors() {
				return authors;
			}

			public void setAuthors(List<Author> authors) {
				this.authors = authors;
			}

			
			public List<Category> getCategories() {
				return categories;
			}

			public void setCategories(List<Category> categories) {
				this.categories = categories;
			}
			
			public String getPicturUrl() {
				return picturUrl;
			}

			public void setPicturUrl(String picturUrl) {
				this.picturUrl = picturUrl;
			}

			

			

			
			

			
		
			

	         
	         
			

}