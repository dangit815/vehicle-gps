package com.demo.controller;

import com.demo.dao.entity.VehicleGps;
import com.demo.dto.input.HistoryParam;
import com.demo.dto.input.SpeedParam;
import com.demo.dto.input.TransportParam;
import com.demo.dto.output.OverspeedDto;
import com.demo.service.VehicleGpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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


    @RequestMapping(value = "/linesbmap/list.do")
    @ResponseBody
    public Object listVehicleGpsByCODE(String code) throws Exception {
        List<List<Map<String, List<BigDecimal>>>> vehicleGpses = vehicleGpsService.listVehicleGpsByCODE(code);
        return vehicleGpses;
    }

    @RequestMapping(value = "/speed/list.do")
    @ResponseBody
    public Object listVehicleGpsByAddressAndSpeed(SpeedParam speedParam) throws ParseException {
        Date startDate = null;
        Date endDate = null;
        if (speedParam.getStartTime() != null) {
            startDate = new Date(speedParam.getStartTime());
        }
        if (speedParam.getEndTime() != null) {
            endDate = new Date(speedParam.getEndTime());
        }
        List<VehicleGps> vehicleGpses = vehicleGpsService.listVehicleGps(null, startDate, endDate);
        return vehicleGpses;
    }

    @RequestMapping(value = "/overspeed/list.do")
    @ResponseBody
    public Object listOverSpeed(SpeedParam speedParam) throws ParseException {
        List<VehicleGps> vehicleGpses = vehicleGpsService.listVehicleGps(speedParam.getSpeedLimit());
        List<OverspeedDto> overspeedDtos = new ArrayList<OverspeedDto>();
        for (VehicleGps vehicleGps : vehicleGpses) {
            OverspeedDto overspeedDto = new OverspeedDto();
            BigDecimal[] gps = new BigDecimal[2];
            gps[0] = vehicleGps.getLng();
            gps[1] = vehicleGps.getLat();
            overspeedDto.setCoord(gps);
            overspeedDto.setElevation(vehicleGps.getVeo().subtract(new BigDecimal(speedParam.getSpeedLimit())).intValue());
            overspeedDtos.add(overspeedDto);
        }
        return overspeedDtos;
    }

    @RequestMapping(value = "/history/list.do")
    @ResponseBody
    public Object listHistoryOverSpeed(HistoryParam historyParam) throws ParseException {
        List<VehicleGps> vehicleGpses = null;
        int overSpeedNum = 0;
        List<Integer> overSpeed = new ArrayList<Integer>();
        List<Integer> unOverSpeed = new ArrayList<Integer>();
        List<String> time = new ArrayList<String>();
        switch (historyParam.getType()) {
            case 1:
                vehicleGpses = vehicleGpsService.listVehicleGps("2016%");
                overSpeedNum = 0;
                for (VehicleGps vehicleGps : vehicleGpses) {
                    if (vehicleGps.getVeo().compareTo(new BigDecimal(historyParam.getSpeedLimit())) == 1) {
                        overSpeedNum++;
                    }
                }
                overSpeed.add(overSpeedNum);
                unOverSpeed.add(vehicleGpses.size() - overSpeedNum);
                time.add("2016");
                break;
            case 2:
                for (int i = 1; i <= 4; i++) {
                    overSpeedNum = 0;
                    int sumNum = 0;
                    for (int j = 3 * i - 2; j <= i * 3; j++) {
                        vehicleGpses = vehicleGpsService.listVehicleGps("2016-%" + j + '%');
                        for (VehicleGps vehicleGps : vehicleGpses) {
                            if (vehicleGps.getVeo().compareTo(new BigDecimal(historyParam.getSpeedLimit())) == 1) {
                                overSpeedNum++;
                            }
                        }
                        sumNum += vehicleGpses.size();
                    }
                    overSpeed.add(overSpeedNum);
                    unOverSpeed.add(sumNum - overSpeedNum);
                    time.add("第" + i + "季度");
                }
                break;
            case 3:
                for (int i = 1; i <= 12; i++) {
                    vehicleGpses = vehicleGpsService.listVehicleGps("2016-%" + i + '%');
                    overSpeedNum = 0;
                    for (VehicleGps vehicleGps : vehicleGpses) {
                        if (vehicleGps.getVeo().compareTo(new BigDecimal(historyParam.getSpeedLimit())) == 1) {
                            overSpeedNum++;
                        }
                    }
                    overSpeed.add(overSpeedNum);
                    unOverSpeed.add(vehicleGpses.size() - overSpeedNum);
                    time.add("第" + i + "月");
                }
                break;
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("over", overSpeed);
        result.put("unover", unOverSpeed);
        result.put("time", time);
        return result;
    }
}
