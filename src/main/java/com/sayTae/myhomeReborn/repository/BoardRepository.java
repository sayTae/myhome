package com.sayTae.myhomeReborn.repository;

import com.sayTae.myhomeReborn.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
