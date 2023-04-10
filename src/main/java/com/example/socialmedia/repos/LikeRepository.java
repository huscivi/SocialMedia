package com.example.socialmedia.repos;

import com.example.socialmedia.entities.Like;
import com.example.socialmedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
