package com.sollers.calcapp.persistence;

import com.sollers.calcapp.domain.Addition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdditionRepository extends JpaRepository<Addition, Long> {
    List<Addition> findByResult(int result);
    Addition findById(long id);
}
