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


import fr.dawan.BOOKPROJECT.entities.Category;

import fr.dawan.BOOKPROJECT.repositories.CategoryRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3002")
@RequestMapping(value = "/api/categories")
public class CategoryController {

				@Autowired CategoryRepository catRep;
				
				@PostMapping(value ="/addcategorieslist", consumes = "application/json", produces = "application/json")
				public ResponseEntity<List<Category>> addListCategory(@RequestBody List<Category> categories){
					
					List<Category>  categoriesNew = catRep.saveAllAndFlush(categories);
					return ResponseEntity.status(HttpStatus.CREATED).body(categoriesNew);
				}
				
				@GetMapping(value = "", produces = "application/json")
				public List<Category> getAll(){
					
					return catRep.findAll();
				}
	}

