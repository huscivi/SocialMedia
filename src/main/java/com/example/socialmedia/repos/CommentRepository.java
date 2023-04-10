package com.example.socialmedia.repos;

import com.example.socialmedia.entities.Comment;
import com.example.socialmedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
