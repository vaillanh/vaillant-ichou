package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long> {
}
