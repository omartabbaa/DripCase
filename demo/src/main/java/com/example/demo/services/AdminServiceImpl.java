package com.example.demo.services;

import com.example.demo.dto.input.AdminInputDTO;
import com.example.demo.dto.output.AdminOutputDTO;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final AdminMapper adminMapper;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository, AdminMapper adminMapper) {
        this.adminRepository = adminRepository;
        this.adminMapper = adminMapper;
    }

    @Override
    public List<AdminOutputDTO> findAll() {
        return ;
    }

    @Override
    public AdminOutputDTO findById(int id) {
        return ;
    }

    @Override
    public AdminOutputDTO create(AdminInputDTO adminInputDTO) {
        return ;
    }

    @Override
    public AdminOutputDTO update(int id, AdminInputDTO adminInputDTO) {
        return ;
    }

    @Override
    public void delete(int id) {
    }
} 