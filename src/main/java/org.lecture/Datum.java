package org.lecture;

import lombok.Data;

@Data
public class Datum {
    private Integer day;
    private Integer month;
    private Integer year;

    public Datum(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Datum(String datum) {
        String[] split = datum.split("\\.");
        this.day = Integer.valueOf(split[0]);
        this.month = Integer.valueOf(split[1]);
        this.year = Integer.valueOf(split[2]);
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}
