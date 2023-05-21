package com.program.toystore.controller;

import com.program.toystore.helpers.ResponseHandler;
import com.program.toystore.model.Mainan;
import com.program.toystore.service.MainanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/mainan")
public class MainanController {
    private final MainanService mainanService;

    @Autowired
    public MainanController(MainanService mainanService) {
        this.mainanService = mainanService;
    }

    @GetMapping
    public ResponseEntity<?> getAllMainan() {
        List<Mainan> dataRes = mainanService.getAllMainan();
        return ResponseHandler.success(dataRes);
    }

    @PostMapping
    public ResponseEntity<?>  addMainan(@RequestBody Mainan mainan) {
        Mainan dataRes = mainanService.addMainan(mainan);
        return ResponseHandler.success(dataRes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMainan(@PathVariable Long id) {
        mainanService.deleteMainan(id);
        return ResponseHandler.success("Delete id: " + id + "Success");
    }
}
