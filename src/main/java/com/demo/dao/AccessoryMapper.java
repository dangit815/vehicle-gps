package com.demo.dao;

import com.demo.dao.entity.Accessory;
import com.demo.dao.entity.AccessoryExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessoryMapper {
    int countByExample(AccessoryExample example);

    int deleteByExample(AccessoryExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Accessory record);

    int insertSelective(Accessory record);

    List<Accessory> selectByExample(AccessoryExample example);

    Accessory selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Accessory record, @Param("example") AccessoryExample example);

    int updateByExample(@Param("record") Accessory record, @Param("example") AccessoryExample example);

    int updateByPrimaryKeySelective(Accessory record);

    int updateByPrimaryKey(Accessory record);
}