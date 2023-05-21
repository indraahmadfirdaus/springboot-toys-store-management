package com.program.toystore.service;

import com.program.toystore.model.Transaksi;
import com.program.toystore.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaksiService {
    private final TransaksiRepository transaksiRepository;

    @Autowired
    public TransaksiService(TransaksiRepository transaksiRepository) {
        this.transaksiRepository = transaksiRepository;
    }

    public List<Transaksi> getAllTransaksi() {
        return transaksiRepository.findAll();
    }

    public Transaksi addTransaksi(Transaksi transaksi) {
        return transaksiRepository.save(transaksi);
    }

    public void deleteTransaksi(Long id) {
        transaksiRepository.deleteById(id);
    }
}
