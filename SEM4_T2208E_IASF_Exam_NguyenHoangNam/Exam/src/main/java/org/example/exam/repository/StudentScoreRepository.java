package org.example.exam.repository;


import org.example.exam.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<Score, Double> {
}
