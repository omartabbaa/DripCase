package com.example.demo.services;

import com.example.demo.dto.input.CategorieënInputDTO;
import com.example.demo.dto.output.CategorieënOutputDTO;
import com.example.demo.mapper.CategorieënMapper;
import com.example.demo.Repository.CategorieënRepository;
import com.example.demo.Service.CategorieënService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategorieënServiceImpl implements CategorieënService {

    private final CategorieënRepository categorieënRepository;
    private final CategorieënMapper categorieënMapper;

    @Autowired
    public CategorieënServiceImpl(CategorieënRepository categorieënRepository, CategorieënMapper categorieënMapper) {
        this.categorieënRepository = categorieënRepository;
        this.categorieënMapper = categorieënMapper;
    }

    @Override
    public List<CategorieënOutputDTO> findAll() {
        return ;
    }

    @Override
    public CategorieënOutputDTO findById(int id) {
        return ;
    }

    @Override
    public CategorieënOutputDTO create(CategorieënInputDTO categorieënInputDTO) {
        return ;
    }

    @Override
    public CategorieënOutputDTO update(int id, CategorieënInputDTO categorieënInputDTO) {
        return ;
    }

    @Override
    public void delete(int id) {
    }
} 