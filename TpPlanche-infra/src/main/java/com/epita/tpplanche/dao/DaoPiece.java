package com.epita.tpplanche.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.epita.tpplanche.entity.Piece;

public interface DaoPiece extends JpaRepository<Piece, Long> {

}
