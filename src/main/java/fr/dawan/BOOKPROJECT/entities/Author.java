package fr.dawan.BOOKPROJECT.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "authors") //il faut le renommer pour les requetes jpql sinon le nom de l'entité prendrait tout  le chemin depuis le package
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	private String firstname;

	@Column(length = 20)
	private String lastname;
	
	

	//Liste de mapping avec author-book
	//books
	//@JsonIgnoreProperties(value = "authors")
	@ManyToMany(mappedBy = "authors")//PERMET D'EFFACER L'AUTEUR AVEC LE LIVRE
	@JsonIgnore
	private List<Book> books = new ArrayList<>();
	
	
	
	public Author() {
		super();
	}

	public Author(String firstname, String lastname, List<Book> books) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.books = books;
	}

	public long getId() {
		return id;
	}
	


	

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", books=" + books + "]";
	}

	
	
}
