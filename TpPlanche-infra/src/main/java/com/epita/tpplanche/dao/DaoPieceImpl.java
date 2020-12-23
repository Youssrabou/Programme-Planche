package com.epita.tpplanche.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.epita.tpplanche.entity.IPiece;
import com.epita.tpplanche.entity.Piece;


@Repository
public class DaoPieceImpl implements IPiece {
    
	
	private final DaoPiece pieceRepository;
	
	public DaoPieceImpl(@Lazy final DaoPiece pieceRepository) {
		this.pieceRepository = pieceRepository;
	}
	
	public Piece createPiece(Piece c) {
		return pieceRepository.save(c);	
	}
	

}	
	
	
	


