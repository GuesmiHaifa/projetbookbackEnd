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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categories")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	private String categoryName;
	
	
	
	//Liste de mapping category-book
	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	//@JsonIgnoreProperties(value = "categories")
	
	List<Book> booksCategory = new ArrayList<>();

	public Category() {
		super();
	}

	public Category(String categoryName, List<Book> booksCategory) {
		super();
		this.categoryName = categoryName;
		this.booksCategory = booksCategory;
	}

	public long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Book> getBooksCategory() {
		return booksCategory;
	}

	public void setBooksCategory(List<Book> booksCategory) {
		this.booksCategory = booksCategory;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", booksCategory=" + booksCategory + "]";
	}
	
	
	

}
