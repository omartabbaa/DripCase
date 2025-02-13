package com.example.demo.mapper;

import com.example.demo.dto.input.CategorieënInputDTO;
import com.example.demo.dto.output.CategorieënOutputDTO;
import com.example.demo.entity.Categorieën;
import jdk.jfr.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public interface CategorieënMapper {


    CategorieënOutputDTO toDTO(Categorieën categorieën);
    Categorieën toEntity(CategorieënInputDTO categorieënDTO);
} 