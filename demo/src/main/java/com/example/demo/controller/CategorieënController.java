package com.example.demo.controller;

import com.example.demo.dto.input.CategorieënInputDTO;
import com.example.demo.dto.output.CategorieënOutputDTO;
import com.example.demo.service.CategorieënService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorieën")
public class CategorieënController {

    private final CategorieënService categorieënService;

    @Autowired
    public CategorieënController(CategorieënService categorieënService) {
        this.categorieënService = categorieënService;
    }

    @GetMapping
    public ResponseEntity<List<CategorieënOutputDTO>> getAllCategorieën() {
        return ResponseEntity.ok(categorieënService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategorieënOutputDTO> getCategorieënById(@PathVariable int id) {
        return ResponseEntity.ok(categorieënService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CategorieënOutputDTO> createCategorieën(@RequestBody CategorieënInputDTO categorieënInputDTO) {
        return ResponseEntity.ok(categorieënService.create(categorieënInputDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategorieënOutputDTO> updateCategorieën(@PathVariable int id, @RequestBody CategorieënInputDTO categorieënInputDTO) {
        return ResponseEntity.ok(categorieënService.update(id, categorieënInputDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategorieën(@PathVariable int id) {
        categorieënService.delete(id);
        return ResponseEntity.noContent().build();
    }
} 