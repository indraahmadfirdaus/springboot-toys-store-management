package com.program.toystore.service;

import com.program.toystore.model.Mainan;
import com.program.toystore.repository.MainanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainanService {
    private final MainanRepository mainanRepository;

    @Autowired
    public MainanService(MainanRepository mainanRepository) {
        this.mainanRepository = mainanRepository;
    }

    public List<Mainan> getAllMainan() {
        return mainanRepository.findAll();
    }

    public Mainan addMainan(Mainan mainan) {
        return mainanRepository.save(mainan);
    }

    public void deleteMainan(Long id) {
        mainanRepository.deleteById(id);
    }
}