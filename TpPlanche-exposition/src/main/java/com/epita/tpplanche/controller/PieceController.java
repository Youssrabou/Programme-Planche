package com.epita.tpplanche.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epita.tpplanche.entity.Piece;
import com.epita.tpplanche.entity.Planche;
import com.epita.tpplanche.service.CalculPlanche;



	
@RestController
@RequestMapping("/piece")
public class PieceController {
	
	@Autowired
	CalculPlanche service;
	
	@GetMapping("/calcul/{nom}")
	 public void create(@PathVariable("nom") String nom) {

		
	} 
	
	@PostMapping("/create")
	public void createPiece(@RequestBody Piece piece) {
		
		service.createPiece(piece);
	}
	
	@GetMapping("createTemp")
	public Piece createPieceGet() {
		
		Planche planche = new Planche(0.31);
		Set<Planche> planches = new HashSet<Planche>();
		planches.add(planche);
		
		Piece piece = new Piece(50, planches);
		return service.createPiece(piece);
		
//		Piece piece1 = new Piece(100, planches);
//		return service.createPiece(piece1);
		
	//	Piece piece = new Piece();
	}
	

}
