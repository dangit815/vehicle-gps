package com.demo.dto.output;

import java.math.BigDecimal;

/**
 * Created by wwwwei on 18/1/13.
 */
public class OverspeedDto {
    private BigDecimal[] coord;
    private Integer elevation;

    public BigDecimal[] getCoord() {
        return coord;
    }

    public void setCoord(BigDecimal[] coord) {
        this.coord = coord;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }
}
