package com.demo.service.impl;

import com.demo.dao.VehicleGpsMapper;
import com.demo.dao.entity.VehicleGps;
import com.demo.service.VehicleGpsService;
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

    public List<List<Map<String, List<BigDecimal>>>> listVehicleGpsByCODE(String code) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code", code);
        List<VehicleGps> list = vehicleGpsMapper.selectByCODE(params);
        List<List<Map<String,List<BigDecimal>>>> res = new ArrayList<List<Map<String, List<BigDecimal>>>>();
        List<Map<String,List<BigDecimal>>> mid = new ArrayList<Map<String, List<BigDecimal>>>();
        BigDecimal oldlng = new BigDecimal(0),oldlat = new BigDecimal(0);
        for(int i=0;i<list.size();i++){
            List<BigDecimal> xyz = new ArrayList<BigDecimal>();
            BigDecimal lng = list.get(i).getLng();
            BigDecimal lat = list.get(i).getLat();
            if(i>0) {
                if(Math.abs(lng.doubleValue()-oldlng.doubleValue()) > 0.5 || Math.abs(lat.doubleValue()-oldlat.doubleValue()) > 0.5)
                    continue;
            }
            oldlng = lng;
            oldlat = lat;
            xyz.add(lng);
            xyz.add(lat);
            Map<String,List<BigDecimal>> map = new HashMap<String, List<BigDecimal>>();
            map.put("coord",xyz);
            if(mid.contains(map))
                continue;
            else
                mid.add(map);
        }
        res.add(mid);
        return res;

    public List<VehicleGps> listVehicleGps(Integer speedLimit) {
        Map<String, Object> params = new HashMap<String, Object>();
        if (speedLimit != null) {
            params.put("veo", speedLimit);
        }
        return vehicleGpsMapper.selectByVeo(params);
    }
}
