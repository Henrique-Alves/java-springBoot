package com.javaCurso.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaCurso.cursoJava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
