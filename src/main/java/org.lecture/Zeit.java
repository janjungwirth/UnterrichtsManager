package org.lecture;


public class Zeit {
    private final Integer hour;
    private final Integer minute;

    public Zeit(Integer hour, Integer minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Zeit(String time) {
        String[] split = time.split(":");
        this.hour = Integer.valueOf(split[0]);
        this.minute = Integer.valueOf(split[1]);
    }

    @Override
    public String toString() {
        return this.hour + ":" + (this.minute.equals(0)?"00":this.minute);
    }
}
