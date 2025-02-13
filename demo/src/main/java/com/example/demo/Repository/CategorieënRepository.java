package com.example.demo.repository;

import com.example.demo.entity.Categorieën;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieënRepository extends JpaRepository<Categorieën, Integer> {
}