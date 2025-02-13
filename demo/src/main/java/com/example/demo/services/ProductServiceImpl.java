package com.example.demo.services;

import com.example.demo.dto.input.ProductInputDTO;
import com.example.demo.dto.output.ProductOutputDTO;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductOutputDTO> findAll() {
        return null;
    }

    @Override
    public ProductOutputDTO findById(int id) {
        return null;
    }

    @Override
    public ProductOutputDTO create(ProductInputDTO productInputDTO) {
        return null;
    }

    @Override
    public ProductOutputDTO update(int id, ProductInputDTO productInputDTO) {
        return null;
    }

    @Override
    public void delete(int id) {
    }
} 