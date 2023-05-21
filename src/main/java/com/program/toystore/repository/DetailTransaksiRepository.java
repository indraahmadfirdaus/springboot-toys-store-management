package com.program.toystore.repository;

import com.program.toystore.model.DetailTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface DetailTransaksiRepository extends JpaRepository<DetailTransaksi, Long> {

    public Set<DetailTransaksi> findByTransaksiId(Long transaksiId);
}
