package com.program.toystore.controller;

import com.program.toystore.helpers.ResponseHandler;
import com.program.toystore.model.DetailTransaksi;
import com.program.toystore.model.Transaksi;
import com.program.toystore.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/transaksi")
public class TransaksiController {
    private final TransaksiService transaksiService;

    @Autowired
    public TransaksiController(TransaksiService transaksiService) {
        this.transaksiService = transaksiService;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Transaksi> dataRes = this.transaksiService.getAllTransaksi();
        return ResponseHandler.success(dataRes);
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Transaksi transaksi, @RequestBody DetailTransaksi detailTransaksi) {
        Transaksi dataRes = this.transaksiService.addTransaksi(transaksi, detailTransaksi);
        return ResponseHandler.success(dataRes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        transaksiService.deleteTransaksi(id);
        return ResponseHandler.success("Delete id:" + id + " success");
    }
}
