package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAll(){
        List<Employee> employees = employeeMapper.selectAll();
        return employees;
    }
    public void insertOne(Employee employee){
        employeeMapper.insertOne(employee);
    }
}
