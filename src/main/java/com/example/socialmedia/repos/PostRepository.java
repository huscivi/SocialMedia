package com.example.socialmedia.repos;

import com.example.socialmedia.entities.Post;
import com.example.socialmedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);  // bu userId'ye sahip tüm postları döner.(JPA hallediyor)

}
