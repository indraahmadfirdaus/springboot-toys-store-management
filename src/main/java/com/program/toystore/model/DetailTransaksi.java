package com.program.toystore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "detail_transaksi")
public class DetailTransaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "transaksi_id")
    private Transaksi transaksi;

    @ManyToOne
    @JoinColumn(name = "mainan_id")
    private Mainan mainan;

    private int qty;

    private double harga;

    @JsonBackReference
    public Transaksi getTransaksi(){
        return transaksi;
    }
}