package com.example.demo.mapper;

import com.example.demo.dto.input.AdminInputDTO;
import com.example.demo.dto.output.AdminOutputDTO;
import com.example.demo.entity.Admin;
import org.springframework.stereotype.Component;

@Component

public interface AdminMapper {


    AdminOutputDTO toDTO(Admin admin);
    Admin toEntity(AdminInputDTO adminDTO);
} 