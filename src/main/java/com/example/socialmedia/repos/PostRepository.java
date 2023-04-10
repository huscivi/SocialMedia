package com.example.socialmedia.repos;

import com.example.socialmedia.entities.Post;
import com.example.socialmedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
