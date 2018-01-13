package com.demo.controller;


import com.demo.service.AlarmNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cjl on 18/1/12.
 */
@Controller
@RequestMapping(value = "/notification")
public class VehicleNotificationController {

	@Autowired
	private AlarmNotificationService alarmNotificationService;

	@RequestMapping(value = "/getone.do")
	@ResponseBody
	public Object QueryAlarmNotification(HttpServletRequest request){
		int vehicleNotificationId = Integer.parseInt(request.getParameter("vehicleNotificationId"));
		return alarmNotificationService.getVehicleNotificationById(vehicleNotificationId);
	}

	@RequestMapping(value = "/getmax.do")
	@ResponseBody
	public Object QueryMaxNotificationId(){
		return alarmNotificationService.getMaxVehicleNotificationId();
	}

	@RequestMapping(value = "/getall.do")
	@ResponseBody
	public Object QueryAllAlarmNotification(){
		return alarmNotificationService.getAllVehicleNotification();
	}

	@RequestMapping(value = "/checknotify.do")
	@ResponseBody
	public Object CheckAlarmNotification(HttpServletRequest request){
		Map<String, Object> message = new HashMap<String, Object>();
		int NowMaxId = Integer.parseInt(request.getParameter("NowMaxId"));
		int DBMaxId = alarmNotificationService.getMaxVehicleNotificationId();
		if(NowMaxId != DBMaxId){
			message.put("msg","success");
			message.put("data",alarmNotificationService.getVehicleNotificationById(DBMaxId));
			return message;
		}else{
			message.put("msg","error");
			return message;
		}
	}
}
