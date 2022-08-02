package fr.dawan.BOOKPROJECT.controllers;


import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.BOOKPROJECT.entities.User;

import fr.dawan.BOOKPROJECT.repositories.UserRepository;


@RestController
@CrossOrigin(origins = "http://localhost:3002")
@RequestMapping(value = "/api/users")
public class UserController {

	
	@Autowired UserRepository userRepository;
			
			@GetMapping(value = "", produces = "application/json")
			public List<User> getAll(){
				
				return userRepository.findAll();
			}
			
			
			@GetMapping(value = "/getuser{id}", produces = "application/json")
			public ResponseEntity<Object> getByID(@PathVariable("id") long id) {
				
			Optional<User> user = userRepository.findById(id);
				if(user==null) {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("L'utilisateur avec id " + id + " est introuvable.");
				}else {
					return ResponseEntity.status(HttpStatus.OK).body(user);
				} 
			}
			
			
			@GetMapping(value = "/{username}", produces = "application/json")
			public ResponseEntity<Object> searchByUsername(@PathVariable("username") String username) {
				
				User user = userRepository.findByUsername(username);
				if(user==null) {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("L'utilisateur " + username + " est introuvable.");
				}else {
					return ResponseEntity.status(HttpStatus.OK).body(user);
				}
			}
			
			@PostMapping(value = "/adduser", consumes  = "application/json", produces = "application/json")
			public ResponseEntity<User> addUser(@RequestBody User user) {
				
				User newUser = userRepository.saveAndFlush(user);

				return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
				}
			
			
			@PutMapping(value = "/update", consumes = "application/json" ,produces = "application/json") 
			public ResponseEntity<Object> updateUser(@RequestBody User user) {
				
				User userUp = userRepository.saveAndFlush(user);
				
				return ResponseEntity.status(HttpStatus.OK).body(userUp);
				}
			
			@DeleteMapping(value = "/{id}", produces = "text/plain")
			public ResponseEntity<Object> deleteUser(@PathVariable("id") long id ){
				
				Optional<User> user = userRepository.findById(id);
			
				if(user==null) {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("L'utilisateur  avec id = " + id +" est introuvable.");
				}else {
					userRepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.OK).body("L'utilisateur avec id = " + id+ " a été supprimé avec succés." );
				}
			}
			@PostMapping(value ="/adduserslist", consumes = "application/json", produces = "application/json")
			public ResponseEntity<List<User>> addListUser(@RequestBody List<User> users){
				
				List<User> usersNew = userRepository.saveAllAndFlush(users);
				return ResponseEntity.status(HttpStatus.CREATED).body(usersNew);
			}
}
