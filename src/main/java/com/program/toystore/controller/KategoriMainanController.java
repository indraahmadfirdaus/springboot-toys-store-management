package com.program.toystore.controller;

import com.program.toystore.helpers.ResponseHandler;
import com.program.toystore.model.KategoriMainan;
import com.program.toystore.service.KategoriMainanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kategori-mainan")
public class KategoriMainanController {
    private final KategoriMainanService kategoriMainanService;

    @Autowired
    public KategoriMainanController(KategoriMainanService kategoriMainanService) {
        this.kategoriMainanService = kategoriMainanService;
    }

    @GetMapping
    public ResponseEntity<?> getAllKategoriMainan() {
        List<KategoriMainan> dataRes = this.kategoriMainanService.getAllKategoriMainan();
        return ResponseHandler.success(dataRes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getKategoriMainanById(@PathVariable Long id) {
        Optional<KategoriMainan> dataRes = this.kategoriMainanService.getKategoriMainanById(id);
        return ResponseHandler.success(dataRes);
    }

    @PostMapping
    public ResponseEntity<?> addKategoriMainan(@RequestBody KategoriMainan kategoriMainan) {
        KategoriMainan dataRes = this.kategoriMainanService.addKategoriMainan(kategoriMainan);
        return ResponseHandler.success(dataRes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteKategoriMainan(@PathVariable Long id) {
        kategoriMainanService.deleteKategoriMainan(id);
        return ResponseHandler.success("Delete id:" + id + " success");
    }
}
