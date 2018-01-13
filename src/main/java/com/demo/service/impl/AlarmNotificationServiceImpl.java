package com.demo.service.impl;

import com.demo.dao.VehicleNotificationMapper;
import com.demo.dao.entity.VehicleNotification;
import com.demo.service.AlarmNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmNotificationServiceImpl implements AlarmNotificationService{

	@Autowired
	private VehicleNotificationMapper vehicleNotificationMapper;

	public VehicleNotification getVehicleNotificationById(int vehicleNotificationId){
		return this.vehicleNotificationMapper.selectByPrimaryKey(vehicleNotificationId);
	}

	public int getMaxVehicleNotificationId(){
		return this.vehicleNotificationMapper.selectMaxId();
	}

	public List<VehicleNotification> getAllVehicleNotification(){
		return this.vehicleNotificationMapper.selectAll();
	}

}
