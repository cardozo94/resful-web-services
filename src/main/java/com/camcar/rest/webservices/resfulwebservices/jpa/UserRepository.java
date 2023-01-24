package com.camcar.rest.webservices.resfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camcar.rest.webservices.resfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
