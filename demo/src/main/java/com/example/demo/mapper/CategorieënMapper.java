package com.example.demo.mapper;

import com.example.demo.dto.input.CategorieënInputDTO;
import com.example.demo.dto.output.CategorieënOutputDTO;
import com.example.demo.entity.Categorieën;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategorieënMapper {
    CategorieënMapper INSTANCE = Mappers.getMapper(CategorieënMapper.class);

    CategorieënOutputDTO toDTO(Categorieën categorieën);
    Categorieën toEntity(CategorieënInputDTO categorieënDTO);
} 