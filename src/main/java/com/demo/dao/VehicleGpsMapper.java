package com.demo.dao;

import com.demo.dao.entity.VehicleGps;
import com.demo.dao.entity.VehicleGpsExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface VehicleGpsMapper {
    int countByExample(VehicleGpsExample example);

    int deleteByExample(VehicleGpsExample example);

    int insert(VehicleGps record);

    int insertSelective(VehicleGps record);

    List<VehicleGps> selectByExample(VehicleGpsExample example);

    List<VehicleGps> selectByDateAndDiming(Map<String, Object> params);

    int updateByExampleSelective(@Param("record") VehicleGps record, @Param("example") VehicleGpsExample example);

    int updateByExample(@Param("record") VehicleGps record, @Param("example") VehicleGpsExample example);
}