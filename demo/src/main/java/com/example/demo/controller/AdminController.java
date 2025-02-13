package com.example.demo.controller;

import com.example.demo.dto.input.AdminInputDTO;
import com.example.demo.dto.output.AdminOutputDTO;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public ResponseEntity<List<AdminOutputDTO>> getAllAdmins() {
        return ResponseEntity.ok(adminService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdminOutputDTO> getAdminById(@PathVariable int id) {
        return ResponseEntity.ok(adminService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AdminOutputDTO> createAdmin(@RequestBody AdminInputDTO adminInputDTO) {
        return ResponseEntity.ok(adminService.create(adminInputDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdminOutputDTO> updateAdmin(@PathVariable int id, @RequestBody AdminInputDTO adminInputDTO) {
        return ResponseEntity.ok(adminService.update(id, adminInputDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable int id) {
        adminService.delete(id);
        return ResponseEntity.noContent().build();
    }
} 