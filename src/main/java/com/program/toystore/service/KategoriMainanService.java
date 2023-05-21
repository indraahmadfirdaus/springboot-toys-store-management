package com.program.toystore.service;

import com.program.toystore.model.KategoriMainan;
import com.program.toystore.repository.KategoriMainanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KategoriMainanService {
    private final KategoriMainanRepository kategoriMainanRepository;

    @Autowired
    public KategoriMainanService(KategoriMainanRepository kategoriMainanRepository) {
        this.kategoriMainanRepository = kategoriMainanRepository;
    }

    public List<KategoriMainan> getAllKategoriMainan() {
        return kategoriMainanRepository.findAll();
    }

    public Optional<KategoriMainan> getKategoriMainanById(Long id) { return kategoriMainanRepository.findById(id); }

    public KategoriMainan addKategoriMainan(KategoriMainan kategoriMainan) {
        return kategoriMainanRepository.save(kategoriMainan);
    }

    public void deleteKategoriMainan(Long id) {
        kategoriMainanRepository.deleteById(id);
    }
}
