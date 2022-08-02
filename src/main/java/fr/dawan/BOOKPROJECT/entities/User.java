package fr.dawan.BOOKPROJECT.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.dawan.BOOKPROJECT.enums.UserType;




@Entity
@Table(name = "Utilisateurs")
public class User implements Serializable {
			/**
		 * 
		 */
			private static final long serialVersionUID = 1L;
	
				
				
			
			@Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private long id;
            
			
			private String username;
			
			@Enumerated(EnumType.STRING)
			private UserType userType;
			
			
			private String firstName;
			
			
			private String lastName;
			
			private String password;

			private String Email;
			
			
			private String numPhone;
			
			private int pointUser;
			
			
			public int getPointUser() {
				return pointUser;
			}



			public void setPointUser(int pointUser) {
				this.pointUser = pointUser;
			}



			private String adress;

			@OneToMany(mappedBy = "userBook", cascade = CascadeType.ALL)
			//@JsonIgnoreProperties(value = "userBook")
			private List<Book> booksUser = new ArrayList<>();
			
			
			
			public User() {
			}

			


			public User(long id, String username, UserType userType, String firstName, String lastName, String password,
					String email, String numPhone, int pointUser, String adress, List<Book> booksUser) {
				super();
				this.id = id;
				this.username = username;
				this.userType = userType;
				this.firstName = firstName;
				this.lastName = lastName;
				this.password = password;
				Email = email;
				this.numPhone = numPhone;
				this.pointUser = pointUser;
				this.adress = adress;
				this.booksUser = booksUser;
			}



			public String getFirstName() {
				return firstName;
			}



			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}



			public String getLastName() {
				return lastName;
			}



			public void setLastName(String lastName) {
				this.lastName = lastName;
			}



			public String getEmail() {
				return Email;
			}



			public void setEmail(String email) {
				Email = email;
			}



			public List<Book> getBooksUser() {
				return booksUser;
			}



			public void setBooksUser(List<Book> booksUser) {
				this.booksUser = booksUser;
			}



	
			
			
			
			
			public long getId() {
				return id;
			}



			public void setId(long id) {
				this.id = id;
			}



			public String getUsername() {
				return username;
			}



			public void setUsername(String username) {
				this.username = username;
			}



			public String getPassword() {
				return password;
			}



			public void setPassword(String password) {
				this.password = password;
			}



			public String getNumPhone() {
				return numPhone;
			}



			public void setNumPhone(String numPhone) {
				this.numPhone = numPhone;
			}



			public String getAdress() {
				return adress;
			}



			public void setAdress(String adress) {
				this.adress = adress;
			}



			public String getUserType() {
				return userType.getUrl();
			}



			public void setUserType(UserType userType) {
				this.userType = userType;
			}



		



			public List<Book> getBooks() {
				return booksUser;
			}



			public void setBooks(List<Book> books) {
				this.booksUser = books;
			}



			@Override
			public String toString() {
				return "User [id=" + id + ", username=" + username + ", password=" + password + ", numPhone=" + numPhone
						+ ", adress=" + adress + ", userType=" + userType + ", books=" + booksUser + "]";
			}
			
			



			
            
            
			

}
