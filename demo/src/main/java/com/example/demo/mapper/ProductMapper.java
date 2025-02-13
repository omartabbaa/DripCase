package com.example.demo.mapper;

import com.example.demo.dto.input.ProductInputDTO;
import com.example.demo.dto.output.ProductOutputDTO;
import com.example.demo.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public interface ProductMapper {

    ProductOutputDTO toDTO(Product product);
    Product toEntity(ProductInputDTO productDTO);
} 