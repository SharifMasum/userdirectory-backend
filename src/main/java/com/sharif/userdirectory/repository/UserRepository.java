package com.sharif.userdirectory.repository;

import com.sharif.userdirectory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
