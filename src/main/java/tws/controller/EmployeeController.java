package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.DTO.EmployeePackinglot;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;
import tws.service.EmployeePackinglotService;
import tws.service.EmployeeService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeePackinglotService employeePackinglotService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {

        return ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping
    public ResponseEntity<Employee> insert(@Valid @RequestBody Employee employee) {
        employeeService.insertOne(employee);
        return ResponseEntity.created(URI.create("/employees/" + employee.getEmployeeID())).body(employee);
    }
    @GetMapping("/packinglot")
    public ResponseEntity<List<EmployeePackinglot>> getAllPackinglotByEmployeeID() {

        return ResponseEntity.ok(employeePackinglotService.getAll());

    }
}
