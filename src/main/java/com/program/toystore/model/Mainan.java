package com.program.toystore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mainan")
public class Mainan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kode_mainan")
    private String kodeMainan;

    private String nama;

    @ManyToOne
    @JoinColumn(name = "kategori_mainan_id")
    private KategoriMainan kategoriMainan;

    private int qty;

    private double harga;

    // constructors, getters, setters
}