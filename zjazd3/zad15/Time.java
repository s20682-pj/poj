/*Time
Zuzanna Ciborowska*/

package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        if (this.second >=0 && this.second < 10 && this.minute >=0 && this.minute < 10 && this.hour >=0 && this.hour < 10){
            return "0" + this.hour + ":0" + this.minute + ":0" + this.second;
        }
        else if (this.second >=0 && this.second < 10 && this.minute >=0 && this.minute < 10){
            return this.hour + ":0" + this.minute + ":0" + this.second;
        }
        else if (this.second >= 0 && this.second <10 && this.hour >=0 && this.hour <10){
            return "0" + this.hour + ":" + this.minute + ":0" + this.second;
        }
        else if (this.second >=0 && this.second < 10){
            return this.hour + ":" + this.minute + ":0" + this.second;
        }
        else if (this.minute >=0 && this.minute < 10 && this.hour >=0 && this.hour < 10){
            return "0" + this.hour + ":0" + this.minute + ":" + this.second;
        }
        else if (this.minute >=0 && this.minute < 10){
            return this.hour + ":0" + this.minute + ":" + this.second;
        }
        else if (this.hour >=0 && this.hour < 10){
            return "0" + this.hour + ":" + this.minute + ":" + this.second;
        }
        else {
            return this.hour + ":" + this.minute + ":" + this.second;
        }
    }

    public Time nextSecond(){
        if (this.second == 59 && this.minute == 59){
           Time time2 = new Time(this.hour+1,0,0);
           return time2;
        }
        else if (this.second == 59){
            Time time2 = new Time(this.hour,this.minute+1,0);
            return time2;
        }
        else{
            Time time2 = new Time(this.hour,this.minute,this.second+1);
            return time2;
        }
    }

    public Time previousSecond(){
        if (this.second == 0 && this.minute == 0){
            Time time3 = new Time(this.hour - 1,59,59);
            return time3;
        }
        else if (this.second == 0){
            Time time3 = new Time(this.hour,this.minute - 1,59);
            return time3;
        }
        else{
            Time time3 = new Time(this.hour,this.minute,this.second - 1);
            return time3;
        }
    }
}
