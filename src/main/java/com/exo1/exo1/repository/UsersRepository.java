package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
