package com.program.toystore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaksi")
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "no_transaksi")
    private String noTransaksi;

    private LocalDate tanggal;

    @Column(name = "customer_vendor")
    private String customerVendor;

    @Column(name = "tipe_transaksi")
    private String tipeTransaksi;
}

