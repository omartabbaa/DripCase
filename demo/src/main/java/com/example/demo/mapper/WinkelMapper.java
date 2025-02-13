package com.example.demo.mapper;

import com.example.demo.dto.input.WinkelInputDTO;
import com.example.demo.dto.output.WinkelOutputDTO;
import com.example.demo.entity.Winkel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WinkelMapper {
    WinkelMapper INSTANCE = Mappers.getMapper(WinkelMapper.class);

    WinkelOutputDTO toDTO(Winkel winkel);
    Winkel toEntity(WinkelInputDTO winkelDTO);
} 