package com.card_api.card_api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.card_api.card_api.repository.*;
import com.card_api.card_api.dao.*;
import com.card_api.card_api.exception.NotFoundException;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class CardController {
	@Autowired
	private CardRepository cardRespository;
	
	// create get all cards API
	@GetMapping("/getcards")
	public List<Card> getAllCards(){
		return cardRespository.findAll();
	}
	// create card
	@PostMapping("/cards")
	public Card createCard(@Validated @RequestBody Card card)
	{
		return cardRespository.save(card);
	}

	
}
