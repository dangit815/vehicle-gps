package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.dao.entity.VehicleGps;
import com.demo.dto.input.TransportParam;
import com.demo.service.VehicleGpsService;
import com.demo.utils.BaiduMapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wwwwei on 18/1/8.
 */
@Controller
@RequestMapping(value = "/vehicle")
public class VehicleGpsController {
    @Autowired
    private VehicleGpsService vehicleGpsService;

    @RequestMapping(value = "/transport/list.do")
    @ResponseBody
    public Object listVehicleGpsByAddressAndDate(TransportParam transportParam) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        if (transportParam.getStartDate() != null && !transportParam.getStartDate().equals("")) {
            startDate = sdf.parse(transportParam.getStartDate());
        }
        if (transportParam.getEndDate() != null && !transportParam.getEndDate().equals("")) {
            endDate = sdf.parse(transportParam.getEndDate());
        }
        List<VehicleGps> vehicleGpses = vehicleGpsService.listVehicleGps(transportParam.getAddress(), startDate, endDate);
        return vehicleGpses;
    }
}
