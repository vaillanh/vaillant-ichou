package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Commentary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaryRepository extends JpaRepository<Commentary, Long> {
}
