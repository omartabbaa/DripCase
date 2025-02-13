package com.example.demo.Repository;

import com.example.demo.entity.Winkel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WinkelRepository extends JpaRepository<Winkel, Integer> {
} 