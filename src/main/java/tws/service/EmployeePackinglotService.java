package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.DTO.EmployeePackinglot;
import tws.entity.PackingLot;
import tws.repository.EmployeeMapper;
import tws.repository.PackingLotMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePackinglotService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private PackingLotMapper packingLotMapper;

    public List<EmployeePackinglot> getAll(){

        List<PackingLot> packingLots = packingLotMapper.queryAll();
        List<EmployeePackinglot> employeePackinglots = new ArrayList<EmployeePackinglot>();
        for(PackingLot pl:packingLots){
            EmployeePackinglot employeePackinglot = new EmployeePackinglot();
            employeePackinglot.setEmployeeID(pl.getEmployeeID());
            employeePackinglot.setPackingLot(pl);
            employeePackinglots.add(employeePackinglot);

        }
        return employeePackinglots;

    }

}
