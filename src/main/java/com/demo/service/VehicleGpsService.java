package com.demo.service;

import com.demo.dao.entity.VehicleGps;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wwwwei on 18/1/8.
 */
public interface VehicleGpsService {
    List<VehicleGps> listVehicleGps(String address, Date startDate, Date endDate);

    List<List<Map<String, List<BigDecimal>>>> listVehicleGpsByCODE(String code);
    List<VehicleGps> listVehicleGps(Integer speedLimit);

    List<VehicleGps> listVehicleGps(String gpstime);
}
