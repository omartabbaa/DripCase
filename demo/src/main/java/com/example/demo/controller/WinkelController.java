package com.example.demo.controller;

import com.example.demo.dto.input.WinkelInputDTO;
import com.example.demo.dto.output.WinkelOutputDTO;
import com.example.demo.service.WinkelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/winkels")
public class WinkelController {

    private final WinkelService winkelService;

    @Autowired
    public WinkelController(WinkelService winkelService) {
        this.winkelService = winkelService;
    }

    @GetMapping
    public ResponseEntity<List<WinkelOutputDTO>> getAllWinkels() {
        return ResponseEntity.ok(winkelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WinkelOutputDTO> getWinkelById(@PathVariable int id) {
        return ResponseEntity.ok(winkelService.findById(id));
    }

    @PostMapping
    public ResponseEntity<WinkelOutputDTO> createWinkel(@RequestBody WinkelInputDTO winkelInputDTO) {
        return ResponseEntity.ok(winkelService.create(winkelInputDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WinkelOutputDTO> updateWinkel(@PathVariable int id, @RequestBody WinkelInputDTO winkelInputDTO) {
        return ResponseEntity.ok(winkelService.update(id, winkelInputDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWinkel(@PathVariable int id) {
        winkelService.delete(id);
        return ResponseEntity.noContent().build();
    }
} 