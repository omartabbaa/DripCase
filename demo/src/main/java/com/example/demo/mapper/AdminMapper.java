package com.example.demo.mapper;

import com.example.demo.dto.input.AdminInputDTO;
import com.example.demo.dto.output.AdminOutputDTO;
import com.example.demo.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    AdminOutputDTO toDTO(Admin admin);
    Admin toEntity(AdminInputDTO adminDTO);
} 