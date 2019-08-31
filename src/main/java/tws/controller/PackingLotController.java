package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.entity.PackingLot;
import tws.repository.EmployeeMapper;
import tws.repository.PackingLotMapper;
import tws.service.PackinglotService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/packinglots")
public class PackingLotController {

    @Autowired
    private PackinglotService packinglotService;

    @GetMapping
    public ResponseEntity<List<PackingLot>> getAll() {

        return ResponseEntity.ok(packinglotService.getAll());
    }

    @PostMapping
    public ResponseEntity<PackingLot> insertOne(@RequestBody PackingLot packingLot) {
        packinglotService.insertOne(packingLot);
        return ResponseEntity.created(URI.create("/packinglots/" + packingLot.getParkinglotID())).body(packingLot);
    }
    
}
