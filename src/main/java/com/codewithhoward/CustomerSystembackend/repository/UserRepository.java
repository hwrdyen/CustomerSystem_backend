package com.codewithhoward.CustomerSystembackend.repository;

import com.codewithhoward.CustomerSystembackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
