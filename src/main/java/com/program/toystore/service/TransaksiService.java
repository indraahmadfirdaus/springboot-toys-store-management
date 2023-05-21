package com.program.toystore.service;

import com.program.toystore.model.DetailTransaksi;
import com.program.toystore.model.Transaksi;
import com.program.toystore.repository.DetailTransaksiRepository;
import com.program.toystore.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class TransaksiService {
    private final TransaksiRepository transaksiRepository;
    private final DetailTransaksiRepository detailTransaksiRepository;

    @Autowired
    public TransaksiService(TransaksiRepository transaksiRepository, DetailTransaksiRepository detailTransaksiRepository) {
        this.transaksiRepository = transaksiRepository;
        this.detailTransaksiRepository = detailTransaksiRepository;
    }

    public List<Transaksi> getAllTransaksi() {
        List<Transaksi> dataRes = transaksiRepository.findAll();
        return dataRes;
    }

    @Transactional
    public Transaksi addTransaksi(Transaksi transaksi, DetailTransaksi detailTransaksi) {
        detailTransaksiRepository.save(detailTransaksi);
        return transaksiRepository.save(transaksi);
    }

    public void deleteTransaksi(Long id) {
        transaksiRepository.deleteById(id);
    }
}
