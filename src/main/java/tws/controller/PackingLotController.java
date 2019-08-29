package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.entity.PackingLot;
import tws.repository.EmployeeMapper;
import tws.repository.PackingLotMapper;

import java.util.List;

@RestController
@RequestMapping("/packinglots")
public class PackingLotController {

    @Autowired
    private PackingLotMapper packingLotMapper;

    @GetMapping
    public ResponseEntity<List<PackingLot>> getAll() {

        return ResponseEntity.ok(packingLotMapper.queryAll());
    }

//    @PostMapping("")
//    public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
//        employeeMapper.insert(employee);
//        return ResponseEntity.created(URI.create("/employees/" + employee.getId())).body(employee);
//    }
}
