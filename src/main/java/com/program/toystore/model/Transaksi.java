package com.program.toystore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
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

    @OneToMany(mappedBy = "transaksi", cascade = CascadeType.ALL)
    private List<DetailTransaksi> detailTransaksi = new ArrayList<>();

    @JsonManagedReference
    public List<DetailTransaksi> getDetailTransaksi() {
        return detailTransaksi;
    }

}

