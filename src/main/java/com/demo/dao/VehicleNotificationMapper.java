package com.demo.dao;

import com.demo.dao.entity.VehicleNotification;
import com.demo.dao.entity.VehicleNotificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

public interface VehicleNotificationMapper {
    int countByExample(VehicleNotificationExample example);

    int deleteByExample(VehicleNotificationExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(VehicleNotification record);

    int insertSelective(VehicleNotification record);

    List<VehicleNotification> selectByExampleWithBLOBs(VehicleNotificationExample example);

    List<VehicleNotification> selectByExample(VehicleNotificationExample example);

    VehicleNotification selectByPrimaryKey(Integer nid);

    int selectMaxId();
    List<VehicleNotification> selectAll();

    int updateByExampleSelective(@Param("record") VehicleNotification record, @Param("example") VehicleNotificationExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleNotification record, @Param("example") VehicleNotificationExample example);

    int updateByExample(@Param("record") VehicleNotification record, @Param("example") VehicleNotificationExample example);

    int updateByPrimaryKeySelective(VehicleNotification record);

    int updateByPrimaryKeyWithBLOBs(VehicleNotification record);

    int updateByPrimaryKey(VehicleNotification record);
}