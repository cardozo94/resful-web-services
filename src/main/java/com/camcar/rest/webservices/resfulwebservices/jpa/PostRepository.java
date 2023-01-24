package com.camcar.rest.webservices.resfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camcar.rest.webservices.resfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
