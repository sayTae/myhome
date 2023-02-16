package com.sayTae.myhomeReborn.repository;

import com.sayTae.myhomeReborn.model.Board;
import com.sayTae.myhomeReborn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
