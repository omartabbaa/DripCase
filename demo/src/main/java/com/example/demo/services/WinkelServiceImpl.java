package com.example.demo.services;

import com.example.demo.dto.input.WinkelInputDTO;
import com.example.demo.dto.output.WinkelOutputDTO;
import com.example.demo.mapper.WinkelMapper;
import com.example.demo.Repository.WinkelRepository;
import com.example.demo.Service.WinkelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WinkelServiceImpl implements WinkelService {

    private final WinkelRepository winkelRepository;
    private final WinkelMapper winkelMapper;

    @Autowired
    public WinkelServiceImpl(WinkelRepository winkelRepository, WinkelMapper winkelMapper) {
        this.winkelRepository = winkelRepository;
        this.winkelMapper = winkelMapper;
    }

    @Override
    public List<WinkelOutputDTO> findAll() {
        return ;
    }

    @Override
    public WinkelOutputDTO findById(int id) {
        return ;
    }

    @Override
    public WinkelOutputDTO create(WinkelInputDTO winkelInputDTO) {
        return ;
    }

    @Override
    public WinkelOutputDTO update(int id, WinkelInputDTO winkelInputDTO) {
        return ;
    }

    @Override
    public void delete(int id) {
    }
} 