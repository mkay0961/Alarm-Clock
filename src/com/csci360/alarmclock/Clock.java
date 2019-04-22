/*
 * Group Name: Team W.O.R.K
 * Matthew Kay, Ricky Ramos, Omer Omer, Colton Williams
 * 
 */
package com.csci360.alarmclock;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isPM;
    protected Alarm alarm1 = new Alarm(1,12,0, true, false);
    protected Alarm alarm2 = new Alarm(2,12,0, true, false);
    
    private final int SNOOZETIME = 9;

    public void Clock(){
        hours = 12;
        minutes = 00;
        seconds = 00;
        isPM = true;

    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setIsPM(boolean isPM) {
        this.isPM = isPM;
    }
    
    public void setAlarm1(int hours1, int minutes1, boolean isPM1){
       
        
        
        
        alarm1 = new Alarm(1, hours1, minutes1, isPM1,false);
        
    }
    
    public void setAlarm2(int hours1, int minutes1, boolean isPM1){
        alarm2 = new Alarm(2, hours1, minutes1, isPM1,false);
        
    }
    
    public void setAlarm1ON(boolean isON1) {
        
        alarm1.setIsAlarmON(isON1);
        
    }
    
    public void setAlarm2ON(boolean isON2){
        alarm2.setIsAlarmON(isON2);
        
    }
   
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isIsPM() {
        return isPM;
    }
    
    public String toString(){
        
        String rtnVal = hours + ":";
        if(this.minutes < 10){
        rtnVal +="0" + this.minutes;
        }
        else{
            rtnVal +=this.minutes;
        }
        
        
        rtnVal +=":";
        
          
        if(this.seconds < 10){
        rtnVal +="0" + this.seconds;
        }
        else{
            rtnVal +=this.seconds;
        }
        
        if(isPM){
            rtnVal+= " PM";
        }
        else{
            rtnVal+= " AM";
        }
     return rtnVal;
    
    }
    
    public void incrementClock(){
       seconds++;
       if(seconds == 60){
           seconds = 0;
           minutes++;
       }
       if(minutes == 60){
           minutes = 0;
           hours++;
           
       }
       
     
       
       if(hours == 12 && minutes ==0 && seconds == 00 && isPM == true){
           this.setIsPM(false);  
       }
       else if(hours == 12 && minutes ==0 && seconds == 00 && isPM == false){
           this.setIsPM(true);
       }
      
 
       if(hours == 13){
           hours = 1;
           
       }
       
         
           
       
       
       
              
         
    }
    
    public boolean checkAlarm1(int hours,int minutes,int seconds,boolean isPM){
        if(this.alarm1.getHours() == hours && this.alarm1.getMinutes() == minutes && this.alarm1.getIsPM()== isPM && this.alarm1.getSeconds() == seconds){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkAlarm2(int hours,int minutes,int seconds,boolean isPM){
        if(this.alarm2.getHours() == hours && this.alarm2.getMinutes() == minutes && this.alarm2.getIsPM()== isPM && this.alarm2.getSeconds() == seconds ){
            return true;
        }
        else{
            return false;
        }
    }
      
    public void activateAlarm1(){
          this.alarm1.setIsGoingOff(true);
      }
    
    public void activateAlarm2(){
          this.alarm2.setIsGoingOff(true);
      }
    
    public void deactivateAlarm1(){
          this.alarm1.setIsGoingOff(false);
      }
    
    public void deactivateAlarm2(){
          this.alarm2.setIsGoingOff(false);
      }
     
    /**
     * Snoozes alarm 1
     */
    public void snoozealarm1(){
        this.alarm1.setMinutes(minutes + SNOOZETIME);
        if(this.alarm1.getMinutes()>=60){
            this.alarm1.setMinutes(this.alarm1.getMinutes()%60);
            this.alarm1.setHours(this.alarm1.getHours()+1);
        }
        if(this.alarm1.getHours()>=13){
            this.alarm1.setHours(1);
        }
        if(this.alarm1.getHours()== 12 && this.alarm1.getIsPM()){
            this.alarm1.setIsPM(false);
        }
        else if(this.alarm1.getHours()== 12 && this.alarm1.getIsPM()==false){
            this.alarm1.setIsPM(true);
        }
        
            
        this.alarm1.setSeconds(seconds);
        this.alarm1.setIsGoingOff(false);
        
    }
    
    /**
     * Snoozes alarm 2
     */
    
    public void snoozealarm2(){
        this.alarm2.setMinutes(minutes + SNOOZETIME);
        if(this.alarm2.getMinutes()>=60){
            this.alarm2.setMinutes(this.alarm2.getMinutes()%60);
            this.alarm2.setHours(this.alarm2.getHours()+1);
        }
        if(this.alarm2.getHours()>=13){
            this.alarm2.setHours(1);
        }
        if(this.alarm2.getHours()== 12 && this.alarm2.getIsPM()){
            this.alarm2.setIsPM(false);
        }
        else if(this.alarm2.getHours()== 12 && this.alarm2.getIsPM()==false){
            this.alarm2.setIsPM(true);
        }
        this.alarm2.setSeconds(seconds);
        this.alarm2.setIsGoingOff(false);        
    }
}
    
   

