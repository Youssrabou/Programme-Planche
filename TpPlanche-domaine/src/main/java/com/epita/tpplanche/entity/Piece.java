package com.epita.tpplanche.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Piece {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Planche> planche;
	
	private long superficie;
	private int nbPlanches;
	
	public Piece(){}

	public Piece(long superficie, Set<Planche> planche) {
		nbPlanches = calculNbPlanche(superficie);
		this.superficie = superficie;
		this.planche = planche;
	}

	private int calculNbPlanche(long superficie) {
		int result = 0 ;
		int resultfinal = 0;
		result= (int) (superficie/0.31) ;
		resultfinal= result + (int) (result*0.1);
	   return resultfinal;
		
	}

	public long getId() {
		return id;
	}

	public Set<Planche> getPlanche() {
		return planche;
	}

	public void setPlanche(Set<Planche> planche) {
		this.planche = planche;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSuperficie() {
		return superficie;
	}

	public void setSuperficie(long superficie) {
		this.superficie = superficie;
	}

	public int getNbPlanches() {
		return nbPlanches;
	}
	
}
