package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import tws.entity.PackingLot;

import java.util.List;
@Mapper
public interface PackingLotMapper {
    List<PackingLot> queryAll();


}
