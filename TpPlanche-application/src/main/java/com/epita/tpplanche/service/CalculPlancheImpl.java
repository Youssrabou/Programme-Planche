package com.epita.tpplanche.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.tpplanche.entity.IPiece;
import com.epita.tpplanche.entity.Piece;

@Service
@Transactional
public class CalculPlancheImpl implements CalculPlanche{
	
	
	@Autowired
	IPiece pieceDomaine;
			
	
	public Piece createPiece(Piece piece) {
		return pieceDomaine.createPiece(piece);
	}
	 
} 
		
		
	
		

		

