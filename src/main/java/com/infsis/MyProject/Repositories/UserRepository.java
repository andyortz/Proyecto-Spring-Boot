package com.infsis.MyProject.Repositories;

import com.infsis.MyProject.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
