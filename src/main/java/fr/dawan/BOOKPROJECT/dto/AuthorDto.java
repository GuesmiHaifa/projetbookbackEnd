//package fr.dawan.BOOKPROJECT.dto;
//
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import fr.dawan.BOOKPROJECT.entities.Author;
//
//
//
//public class AuthorDto  {
//
//
//	private long id;
//
//	
//	private String firstname;
//
//
//	private String lastname;
//
//
//	public long getId() {
//		return id;
//	}
//
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//
//	public String getLastname() {
//		return lastname;
//	}
//
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//	
//	
//	public static AuthorDto convertAuthorToAuthorDto(Author author) {
//		AuthorDto authorDto = new AuthorDto();
//		authorDto.setId(author.getId());
//		authorDto.setFirstname(author.getFirstname());
//		authorDto.setLastname(author.getLastname());
//		
//		return authorDto;
//	}
//
//	
//}
