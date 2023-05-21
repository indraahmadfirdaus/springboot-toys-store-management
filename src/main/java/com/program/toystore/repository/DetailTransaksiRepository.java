package com.program.toystore.repository;

import com.program.toystore.model.DetailTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailTransaksiRepository extends JpaRepository<DetailTransaksi, Long> {
}
