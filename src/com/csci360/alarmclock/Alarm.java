/*
 * Group Name: Team W.O.R.K
 * Matthew Kay, Ricky Ramos, Omer Omer, Colton Williams
 * 
 */
package com.csci360.alarmclock;


public class Alarm {
    	private int alarmNum;
        private int hours;
        private int minutes;
        private int seconds;
        private boolean isPM;
        private boolean isAlarmON;
        private boolean isGoingOff;

/**
 * Constructor for Alarm
 * @param alarmNum
 * @param hours
 * @param minutes
 * @param isPm
 * @param isAlarmON 
 */        
public Alarm(int alarmNum, int hours, int minutes, boolean isPm, boolean isAlarmON) {
    this.alarmNum = alarmNum;
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = 0;
    this.isPM = isPm;
    this.isAlarmON  = isAlarmON;
    }

/**
 * Getter for isPM
 * @return boolean
 */         	
public boolean getIsPM() {
    return isPM;
 }          

/**
 * Getter for alarmNum
 * @return int
 */
public int getAlarmNum(){
    return alarmNum;
 }

/**
 * Getter for isAlarmON
 * @return boolean
 */
public boolean getIsAlarmON() {
    return isAlarmON;
}

/**
 * Getter for hours
 * @return int
 */
public int getHours(){
    return hours;
 }

/**
 * Getter for minutes
 * @return int
 */
public int getMinutes(){
    return  minutes;
}

/**
 * Setter for isAlarmON
 * @param AlarmON
 * @throws NullPointerException 
 */
public void setIsAlarmON(boolean AlarmON) throws NullPointerException{
    this.isAlarmON = AlarmON;
}

/**
 * Setter for hours
 * @param hours 
 */
public void setHours(int hours){
    this.hours = hours;
}
/**
 * Setter for minutes
 * @param minutes 
 */
public void setMinutes(int minutes){
    this.minutes = minutes;
}
/**
 * Setter for isPM
 * @param isPM 
 */
public void setIsPM(boolean isPM) {
    this.isPM = isPM;
}

/**
 * Getter for isGoingOff
 * @return boolean
 */
public boolean isIsGoingOff() {
        return isGoingOff;
    }

/**
 * Setter for isGoingOff
 * @param isGoingOff 
 */
public void setIsGoingOff(boolean isGoingOff) {
        this.isGoingOff = isGoingOff;
    }
/**
 * Getter for seconds
 * @return int
 */
public int getSeconds() {
        return seconds;
    }
/**
 * Setter for seconds 
 * @param seconds 
 */
public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
/**
 * 
 * @return String
 * Override toString()
 */
public String toString(){
    String rtn = "";
    rtn += this.hours + " : " ;
    
   
    if(this.minutes < 10){
        rtn +="0" + this.minutes;
        }
        else{
            rtn +=this.minutes;
        }
    if(isPM){
            rtn+= " PM";
        }
        else{
            rtn+= " AM";
        }
    return rtn;
    
}
}


