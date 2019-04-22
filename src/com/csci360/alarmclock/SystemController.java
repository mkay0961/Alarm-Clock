/*
 * Group Name: Team W.O.R.K
 * Matthew Kay, Ricky Ramos, Omer Omer, Colton Williams
 * 
 */
package com.csci360.alarmclock;

import java.util.Timer;
import java.util.TimerTask;

public class SystemController {
    
    private Clock clock1;
    private Timer timer;
    private Radio radio = new Radio();
    private boolean running = false;
    private double volume;
    
    /**
     * Constructor
     */
    public SystemController(){
        clock1 = new Clock();
        clock1.setHours(12);
        clock1.setMinutes(00);
        clock1.setSeconds(00);
        clock1.setIsPM(true);
        this.timer = new Timer();
        volume= 0;
        clock1.setAlarm1(12,1, true);
        clock1.setAlarm2(12,0, true);
        

    }
    public void runSystem(){
        if(!running){
            timer.schedule(new TimerTask(){
                @Override
                public void run(){ 
                    clock1.incrementClock();               
                    running = true;
                }
            }, 0,1000);
        }
    }
    
    public String getTime(){
        return clock1.toString();
    }  
    
    public double getVolume(){
        return volume;
    }
    
    public void setVolume(double x){
        this.volume = x;
    }
    
    public String getAlarm1Time(){
        return clock1.alarm1.toString();
    }
    
    public String getAlarm2Time(){
        return clock1.alarm2.toString();
    } 

    public void stopSystem(){
        timer.cancel();
    }
    
    public void checkAlarm1(){
        if(clock1.checkAlarm1(clock1.getHours(), clock1.getMinutes(),clock1.getSeconds(), clock1.isIsPM()) && clock1.alarm1.getIsAlarmON()==true){
               clock1.activateAlarm1();
            }
    }
    
    public void checkAlarm2(){
        if(clock1.checkAlarm2(clock1.getHours(), clock1.getMinutes(),clock1.getSeconds(), clock1.isIsPM()) && clock1.alarm2.getIsAlarmON()==true){
               clock1.activateAlarm2();
         }
    }
    
    public boolean alarm1GoingOff(){
       return clock1.alarm1.isIsGoingOff();
    }
    
    public boolean alarm2GoingOff(){
       return clock1.alarm2.isIsGoingOff();
    }
    
    public boolean isalarm1on(){
        return clock1.alarm1.getIsAlarmON();
    }
    
    public boolean isalarm2on(){
        return clock1.alarm2.getIsAlarmON();
    }
    
    public void snooze(){
        if(clock1.alarm1.isIsGoingOff()){
            clock1.snoozealarm1();
        }
        if(clock1.alarm2.isIsGoingOff()){
            clock1.snoozealarm2();
        }
    }

    public void setAlarm1(int hours1, int minutes1, boolean isPM1){
        clock1.setAlarm1(hours1, minutes1, isPM1);
    }
    
    public void setAlarm2(int hours1, int minutes1, boolean isPM1){
        clock1.setAlarm2(hours1, minutes1, isPM1); 
    }
    
    public String getRadioToString(){
        return radio.toString();
    }
    
    public void changetime(int hours, int min, int sec, boolean pm){
        clock1.setHours(hours);
        clock1.setIsPM(pm);
        clock1.setMinutes(min);
        clock1.setSeconds(sec); 
    }

   public void setalarm1ONOFF(boolean on) {  
        clock1.setAlarm1ON(on);
   }
   
   public void setalarm2ONOFF(boolean on) { 
        clock1.setAlarm2ON(on);
   }
   
   public void deactivatealarm1(){
       clock1.deactivateAlarm1();
   }
   
   public void deactivatealarm2(){
       clock1.deactivateAlarm2();
   }

   public void changeradiosetting(String am) {
       if(am =="AM"){
           radio.setradioSetting(true);
       }
       else{
           radio.setradioSetting(false);
       }
    }
   
   public boolean getRadioSetting(){
      return radio.getRadioSetting();
   }
   
   public void setAMradio(int num){
       radio.setStationNumAM(num);
   }
   
   public void setFMradio(double num1){
       radio.setStationNumFM(num1);
   }
}
