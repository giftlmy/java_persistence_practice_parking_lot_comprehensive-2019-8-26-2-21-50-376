package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.PackingLot;
import tws.repository.PackingLotMapper;

import java.util.List;

@Service
public class PackinglotService {
    @Autowired
    private PackingLotMapper packingLotMapper;

    public List<PackingLot> getAll(){
        List<PackingLot> packingLots = packingLotMapper.queryAll();
        return packingLots;
    }
    public void insertOne(PackingLot packingLot){
        packingLotMapper.insertOne(packingLot);
    }
}
