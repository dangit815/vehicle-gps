package com.demo.dto.input;

/**
 * Created by wwwwei on 18/1/12.
 */
public class SpeedParam {
    private Long startTime;
    private Long endTime;
    private Integer speedLimit;

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }
}
