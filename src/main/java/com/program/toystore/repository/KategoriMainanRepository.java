package com.program.toystore.repository;

import com.program.toystore.model.KategoriMainan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriMainanRepository extends JpaRepository<KategoriMainan, Long> {
}
