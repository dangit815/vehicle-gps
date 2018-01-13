package com.demo.service;

import com.demo.dao.entity.VehicleNotification;
import java.util.List;

/**
 * Created by cjl on 18/1/12.
 */
public interface AlarmNotificationService {
	VehicleNotification getVehicleNotificationById(int vehicleNotificationId);
	int getMaxVehicleNotificationId();
	List<VehicleNotification> getAllVehicleNotification();
}
