package com.example.socialmedia.repos;

import com.example.socialmedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
