package fr.dawan.BOOKPROJECT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.BOOKPROJECT.entities.Author;

//import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.repositories.AuthorRepository;


@RestController
@RequestMapping(value = "/api/authors")
@CrossOrigin(origins = "http://localhost:3002")
public class AuthorController {
	
			@Autowired AuthorRepository authorRepository;
			
			@PostMapping(value ="/addauthorslist", consumes = "application/json", produces = "application/json")
			public ResponseEntity<List<Author>> addListAuthor(@RequestBody List<Author> authors){
				
				List<Author> authorsNew = authorRepository.saveAllAndFlush(authors);
				return ResponseEntity.status(HttpStatus.CREATED).body(authorsNew);
			}
			
			@GetMapping(value = "", produces = "application/json")
			public List<Author> getAll(){
				
				return authorRepository.findAll();
			}
}
