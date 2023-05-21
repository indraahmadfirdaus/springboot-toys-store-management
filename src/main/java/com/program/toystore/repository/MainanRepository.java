package com.program.toystore.repository;

import com.program.toystore.model.Mainan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainanRepository extends JpaRepository<Mainan, Long> {
}
