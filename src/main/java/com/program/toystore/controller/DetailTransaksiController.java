package com.program.toystore.controller;

import com.program.toystore.helpers.ResponseHandler;
import com.program.toystore.model.DetailTransaksi;
import com.program.toystore.service.DetailTransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/detail-transaksi")
public class DetailTransaksiController {
    private final DetailTransaksiService detailTransaksiService;

    @Autowired
    public DetailTransaksiController(DetailTransaksiService detailTransaksiService) {
        this.detailTransaksiService = detailTransaksiService;
    }

    @GetMapping
    public ResponseEntity<?> getAllDetailTransaksi() {
        List<DetailTransaksi> dataRes = this.detailTransaksiService.getAllDetailTransaksi();
        return ResponseHandler.success(dataRes);
    }

    @PostMapping
    public ResponseEntity<?> addDetailTransaksi(@RequestBody DetailTransaksi detailTransaksi) {
        DetailTransaksi dataRes = this.detailTransaksiService.addDetailTransaksi(detailTransaksi);
        return ResponseHandler.success(dataRes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDetailTransaksi(@PathVariable Long id) {
        detailTransaksiService.deleteDetailTransaksi(id);
        return ResponseHandler.success("Delete id:" + id + " success");
    }
}
