package com.program.toystore.service;

import com.program.toystore.model.DetailTransaksi;
import com.program.toystore.repository.DetailTransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailTransaksiService {
    private final DetailTransaksiRepository detailTransaksiRepository;

    @Autowired
    public DetailTransaksiService(DetailTransaksiRepository detailTransaksiRepository) {
        this.detailTransaksiRepository = detailTransaksiRepository;
    }

    public List<DetailTransaksi> getAllDetailTransaksi() {
        return detailTransaksiRepository.findAll();
    }

    public DetailTransaksi addDetailTransaksi(DetailTransaksi detailTransaksi) {
        return detailTransaksiRepository.save(detailTransaksi);
    }

    public void deleteDetailTransaksi(Long id) {
        detailTransaksiRepository.deleteById(id);
    }
}
