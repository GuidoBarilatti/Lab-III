package com.company.Punto5;

public class Hora {
    public int hours,minutes,seconds;

    public Hora(int hours, int minutes, int seconds) {
        this.hours = (hours>=0 && hours <24) ? hours: 0;
        this.minutes = (minutes>=0 && minutes <60) ? minutes: 0;
        this.seconds = (seconds>=0 && seconds < 60) ? seconds: 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(byte hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(byte seconds) {
        this.seconds = seconds;
    }
    public Hora sumarSeg(){
        if(seconds==59){
            this.seconds=0;
            sumarMinut();
        }
        else {
            this.seconds++;
        }
        return this;
    }
    public void sumarMinut(){
        if(minutes==59){
            this.minutes=0;
            sumarHour();
        }
        else {
            this.minutes++;
        }
    }
    public void sumarHour(){
        if(hours==23){
            this.hours=0;
        }
        else {
            this.hours++;
        }
    }
    public void restarHour(){
        if(hours==0){
            this.hours=23;
        }
        else {
            this.hours--;
        }
    }
    public void restarMinut(){
        if(minutes==0){
            this.minutes=59;
            restarHour();
        }
        else {
            this.minutes--;
        }
    }
    public Hora restarSecond(){
        if(seconds==0){
            this.seconds=59;
            restarMinut();
        }
        else {
            this.seconds--;
        }
        return this;
    }

    @Override
    public String toString(){
        String hh= String.format("%02d",hours);
        String mm= String.format("%02d",minutes);
        String ss= String.format("%02d",seconds);
        return hh+ ":" + mm + ":" + ":" + ss;
    }


}
