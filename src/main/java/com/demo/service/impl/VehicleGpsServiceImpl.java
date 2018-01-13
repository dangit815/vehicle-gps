package com.demo.service.impl;

import com.demo.dao.VehicleGpsMapper;
import com.demo.dao.entity.VehicleGps;
import com.demo.dao.entity.VehicleGpsExample;
import com.demo.service.VehicleGpsService;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by wwwwei on 18/1/8.
 */
@Service
public class VehicleGpsServiceImpl implements VehicleGpsService {
    @Autowired
    private VehicleGpsMapper vehicleGpsMapper;

    public List<VehicleGps> listVehicleGps(String address, Date startDate, Date endDate) {
        Map<String, Object> params = new HashMap<String, Object>();
        if (address != null && !address.equals("")) {
            params.put("diming", "%" + address + "%");
        }
        if (startDate != null) {
            params.put("startDate", startDate);
        }
        if (startDate != null) {
            params.put("endDate", endDate);
        }
        return vehicleGpsMapper.selectByDateAndDiming(params);
    }

    public List<VehicleGps> listVehicleGps(Integer speedLimit) {
        Map<String, Object> params = new HashMap<String, Object>();
        if (speedLimit != null) {
            params.put("veo", speedLimit);
        }
        return vehicleGpsMapper.selectByVeo(params);
    }

    public List<VehicleGps> listVehicleGps(String gpstime) {
        Map<String, Object> params = new HashMap<String, Object>();
        if (gpstime != null) {
            params.put("gpstime", gpstime);
        }
        return vehicleGpsMapper.selectByGpstime(params);
    }
}
