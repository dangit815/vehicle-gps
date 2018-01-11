package com.demo.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwwwei on 18/1/11.
 */
public class BaiduMapUtil {
    private final static String AK = "l4KykUkwUEgvE0SGENdk31qvCYba76Dl";
    private final static String BAIDU_API_URL = "http://api.map.baidu.com/geocoder/v2/";

    public static Map<String, Object> transformAddressToGeocoder(String address) {
        BufferedReader in = null;
        try {
            String url = BAIDU_API_URL + "?" + "address=" + address + "&output=json&ak=" + AK;
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            // 建立实际的连接
            connection.connect();
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            JSONObject param = JSON.parseObject(sb.toString());
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("lat", param.getJSONObject("result").getJSONObject("location").getDoubleValue("lat"));
            map.put("lng", param.getJSONObject("result").getJSONObject("location").getDoubleValue("lng"));
            return map;
        } catch (Exception e) {
            System.out.println(e);
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
