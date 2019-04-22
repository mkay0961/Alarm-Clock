/*
 * Group Name: Team W.O.R.K
 * Matthew Kay, Ricky Ramos, Omer Omer, Colton Williams
 * 
 */
package com.csci360.alarmclock;

public class Radio {

    private double stationNumFM;
    private int stationNumAM;
    private boolean isAM;
    private boolean isON;
    
    
    public Radio() {
        
        stationNumFM = 99.5;
        stationNumAM = 730;
        isAM = false;
        isON = false;  
    }
    
    public void setStationNumFM(double x){
        if(x>= 88.1 && x<= 107.3 ){
            stationNumFM = x;
        }
        
    }
    
    public void setStationNumAM(int x){
        if(x>= 550 && x<=1480){
        stationNumAM = x;
        }
    }
    
    public void setradioSetting(boolean x){
        isAM = x;
    }
    
    public double getStationNumFM(){
       return stationNumFM;
    }
    
    public int getStationNumAM(){
       return stationNumAM;
    }
    
    public boolean getRadioSetting(){
       return isAM;
    }

    public boolean isIsON() {
        return isON;
    }

    public void setIsON(boolean isON) {
        this.isON = isON;
    }

    public String toString(){
        String rtn = "";
        if(isAM == true){
            rtn += "AM: ";
            rtn += stationNumAM;
        }
        else{
            rtn += "FM: ";
            rtn += stationNumFM;
        }
        return rtn;

    }
   
}
