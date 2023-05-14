package com.MyCode.fullstack.backend.repository;

import com.MyCode.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 this is JPA repository Interface which is used to help in database interaction
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
