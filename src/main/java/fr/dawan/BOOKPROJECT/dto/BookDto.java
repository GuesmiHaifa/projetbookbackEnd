//package fr.dawan.BOOKPROJECT.dto;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import fr.dawan.BOOKPROJECT.entities.Author;
//import fr.dawan.BOOKPROJECT.entities.Book;
//import fr.dawan.BOOKPROJECT.entities.Category;
//import fr.dawan.BOOKPROJECT.entities.User;
//import fr.dawan.BOOKPROJECT.enums.Availability;
//
//
//
//public class BookDto {
//
//
//
//			private long id;
//			
//			
//			private String isbn;
//		
//			
//			private String title;
//		
//			
//			private LocalDate publishedDate = LocalDate.now();
//		
//			
//			private String publishingHouse;
//			
//			private double weight;
//		
//			private int pageNumber;
//			
//			private String description;
//			
//			private boolean emprunte = false;
//		
//			private List<AuthorDto> authorsDto;
//			
//			private List<CategoryDto> categorysDto;
//			
//			private  UserDto userDto;
//	
//			private Availability availability;
//			
//			private int pointBook;
//			
//			
//
//			public List<AuthorDto> getAuthorsDto() {
//				return authorsDto;
//			}
//
//			public void setAuthorsDto(List<AuthorDto> authorsDto) {
//				this.authorsDto = authorsDto;
//			}
//			
//
//			public long getId() {
//				return id;
//			}
//
//			public void setId(long id) {
//				this.id = id;
//			}
//
//			
//
//			
//
//			public String getIsbn() {
//				return isbn;
//			}
//
//			public void setIsbn(String isbn) {
//				this.isbn = isbn;
//			}
//
//			public String getTitle() {
//				return title;
//			}
//
//			public void setTitle(String title) {
//				this.title = title;
//			}
//
//			public LocalDate getPublishedDate() {
//				return publishedDate;
//			}
//
//			public void setPublishedDate(LocalDate publishedDate) {
//				this.publishedDate = publishedDate;
//			}
//
//			public String getPublishingHouse() {
//				return publishingHouse;
//			}
//
//			public void setPublishingHouse(String publishingHouse) {
//				this.publishingHouse = publishingHouse;
//			}
//
//			public double getWeight() {
//				return weight;
//			}
//
//			public void setWeight(double weight) {
//				this.weight = weight;
//			}
//
//			public int getPageNumber() {
//				return pageNumber;
//			}
//
//			public void setPageNumber(int pageNumber) {
//				this.pageNumber = pageNumber;
//			}
//
//			public String getDescription() {
//				return description;
//			}
//
//			public void setDescription(String description) {
//				this.description = description;
//			}
//
//			public boolean isEmprunte() {
//				return emprunte;
//			}
//
//			public void setEmprunte(boolean emprunte) {
//				this.emprunte = emprunte;
//			}
//
//			public Availability getAvailability() {
//				return availability;
//			}
//
//			public void setAvailability(Availability availability) {
//				this.availability = availability;
//			}
//
//			public int getPointBook() {
//				return pointBook;
//			}
//
//			public void setPointBook(int pointBook) {
//				this.pointBook = pointBook;
//			}
//			
//			public List<CategoryDto> getCategorysDto() {
//				return categorysDto;
//			}
//
//			public void setCategorysDto(List<CategoryDto> categorysDto) {
//				this.categorysDto = categorysDto;
//			}
//			public UserDto getUserDto() {
//				return userDto;
//			}
//
//			public void setUserDto(UserDto userDto) {
//				this.userDto = userDto;
//			}
//	         
//
//			public static BookDto convertBookToBookDto(Book book) {
//				BookDto bookDto = new BookDto();
//				bookDto.setId(book.getId());
//				bookDto.setDescription(book.getDescription());
//				bookDto.setEmprunte(book.getEmprunte());
//				bookDto.setTitle(book.getTitle());
//				bookDto.setIsbn(book.getIsbn());
//				bookDto.setPointBook(book.getPointBook());
//				
//				List<AuthorDto> authorsDto = new ArrayList<>();
//				for (Author auth : book.getAuthors()) {
//					authorsDto.add(AuthorDto.convertAuthorToAuthorDto(auth));
//				} 
//				bookDto.setAuthorsDto(authorsDto);
//				
//				List<CategoryDto> categorysDto = new ArrayList<>();
//			     for (Category categ : book.getCategories()) {
//				      categorysDto.add(CategoryDto.convertCategoryToCategoryDto(categ));
//			    } 
//			        bookDto.setCategorysDto(categorysDto);
//			        
//			    
//			        
//			       return bookDto;
//
//			}
//
//			
//			
//			
//			
//			
//			
//}
//			
//			
//		
//
//			
//		
//
//			
//
//			
//		
//			
//
//	         
//	         
//			
//
