package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.PackingLot;

import java.util.List;
@Mapper
public interface PackingLotMapper {
    List<PackingLot> queryAll();
    void insertOne(@Param("packinglot") PackingLot packingLot);

}
