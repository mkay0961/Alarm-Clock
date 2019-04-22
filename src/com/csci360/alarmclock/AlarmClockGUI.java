
/*
 * Group Name: Team W.O.R.K
 * Matthew Kay, Ricky Ramos, Omer Omer, Colton Williams
 * 
 */
package com.csci360.alarmclock;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;  
import java.net.URL;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AlarmClockGUI extends Application 
{
    SystemController controller;
    Timer timer1 = new Timer();
    int startnum = 0;
    int num = 0;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws FileNotFoundException, IOException {
      
       controller = new SystemController();
       Group root = new Group();
       Scene scene = new Scene(root, 900, 550, Color.WHITE);
       URL resource = getClass().getResource("Beep.mp3");
       Media media = new Media(resource.toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media);
       mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
       
       
       Label Names = new Label();
       Names.setText("Matthew Kay, Ricky Ramos, Omer Omer, Colton Williams ");
       Names.relocate(540,525);
       root.getChildren().add(Names);
        
       //clock stuff
       Rectangle timerec = new Rectangle(15,35,380,140);
       timerec.relocate(timerec.getX()+230, timerec.getY()-15);
       timerec.setStroke(Color.BLACK);
       timerec.setFill(null);
       timerec.setStrokeWidth(10);
       timerec.setArcWidth(25);
       timerec.setArcHeight(25);
       root.getChildren().add(timerec);
       
       Text timetext = new Text(275, 55,"Clock");
       Font font2 = new Font("", 20);
       timetext.setFont(font2);
       timetext.setFill(Color.BLACK);
       root.getChildren().add(timetext);
       
       Text time1 = new Text(55, 100,"time");
       Font font = new Font("time1", 58);
       time1.setFont(font);
       time1.setFill(Color.BLACK);
       time1.relocate(time1.getX()+210, time1.getY()-35);
       root.getChildren().add(time1);
       
       Label clHH = new Label();
       clHH.setText("H:");
       clHH.relocate(310, 175);
       root.getChildren().add(clHH);
       
       TextField clH = new TextField();
       clH.setText("12");
       clH.relocate(330, 170);
       clH.setPrefWidth(35);      
       root.getChildren().add(clH);
         
       Label clMM = new Label();
       clMM.setText("M:");
       clMM.relocate(380, 175);
       root.getChildren().add(clMM);
       
       TextField clM = new TextField();
       clM.setText("00");
       clM.relocate(400, 170);
       clM.setPrefWidth(35);
       root.getChildren().add(clM);
      
       Label clSecSec = new Label();
       clSecSec.setText("S: ");
       clSecSec.relocate(450, 175);
       root.getChildren().add(clSecSec);
       
       TextField clSec = new TextField();
       clSec.setText("00");
       clSec.relocate(470, 170);
       clSec.setPrefWidth(40);
       root.getChildren().add(clSec);
       
       Label clSS = new Label();
       clSS.setText("Set: ");
       clSS.relocate(520, 175);
       root.getChildren().add(clSS);
       
       TextField clS = new TextField();
       clS.setText("PM");
       clS.relocate(550, 170);
       clS.setPrefWidth(40);
       root.getChildren().add(clS);
       
       Button set = new Button();
       set.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    boolean PM1 = true;
                    
                    if(clH.getText().replaceAll("[^0-9.]", "").isEmpty()|| clM.getText().replaceAll("[^0-9.]", "").isEmpty()||clS.getText().isEmpty() || clS.getText().length() >2 
                            || clH.getText().length() >2|| clM.getText().length() >2 || clSec.getText().length() > 2){
                        //do nothing
                    }
                    else{
   
                        int hour1 = Integer.parseInt(clH.getText().replaceAll("[^0-9.]", ""));
                        int min1 = Integer.parseInt(clM.getText().replaceAll("[^0-9.]", ""));
                        int sec1 = Integer.parseInt(clSec.getText().replaceAll("[^0-9.]", ""));
                    
                        if(hour1 >= 13 || min1 >= 60|| sec1 >= 60 || hour1 <=0){
                            //do nothing 
                        }
                        else{
                            if(clS.getText().toUpperCase().equals("PM")){
                                PM1 = true;
                        }
                            if(clS.getText().toUpperCase().equals("AM")){
                                PM1 = false;
                        }  
                        controller.changetime(hour1, min1, sec1, PM1);
                         }
                    }   
            }
        });
       
       set.setText("SET");
       set.relocate(250, 170);
       root.getChildren().add(set);
       //end of clock stuff

       //radio stuff
       Rectangle radiorec = new Rectangle(15,470,350,120);
       radiorec.setStroke(Color.BLACK);
       radiorec.relocate(radiorec.getX()+515, radiorec.getY()- 155);
       radiorec.setFill(Color.YELLOW);
       radiorec.setStrokeWidth(3);
       radiorec.setArcWidth(25);
       radiorec.setArcHeight(25);
       root.getChildren().add(radiorec);

       Text radio = new Text(555, 345,"Radio");
       Font radiofont = new Font("", 20);
       radio.setFont(radiofont);
       radio.setFill(Color.BLACK);
       root.getChildren().add(radio);

       Text radio1 = new Text(550, 400,"Radio");
       Font alarmfont = new Font("", 40);
       radio1.setFont(alarmfont);
       radio1.setFill(Color.BLACK);
       root.getChildren().add(radio1);
      
       Label radiolb = new Label();
       radiolb.setText("Station:");
       radiolb.relocate(645, 445);
       root.getChildren().add(radiolb);
       
       TextField radiotxt = new TextField();
       radiotxt.setText("");
       radiotxt.relocate(700, 440);
       radiotxt.setPrefWidth(50);
       root.getChildren().add(radiotxt);

       Button set3 = new Button();
       set3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    if(controller.getRadioSetting() == true && !radiotxt.getText().contains(".")){
                        int AM = Integer.parseInt(radiotxt.getText().replaceAll("[^0-9.]", ""));
                        controller.setAMradio(AM);
                    }
                    if(controller.getRadioSetting() == false && radiotxt.getText().contains(".")){ 
                        double d = Double.parseDouble(radiotxt.getText());
                        controller.setFMradio(d);
                    }
            }
        });
       
       set3.setText("SET");
       set3.relocate(590, 440);
       root.getChildren().add(set3);

       Button AM = new Button();
       AM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    controller.changeradiosetting("AM");             
            }
        });
       
       AM.setText("AM");
       AM.relocate(485, 335);
       root.getChildren().add(AM);
       
       Button FM = new Button();
       FM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    controller.changeradiosetting("FM");             
            }
        });
       
       FM.setText("FM");
       FM.relocate(485, 385);
       root.getChildren().add(FM);
        //end of radio stuff 

        //alarm1 stuff
       Rectangle alarm1rec = new Rectangle(420,35,310,65);
       alarm1rec.relocate(alarm1rec.getX() - 400, alarm1rec.getY()+280);
       alarm1rec.setStroke(Color.BLACK);
       alarm1rec.setFill(Color.RED);
       alarm1rec.setStrokeWidth(3);
       alarm1rec.setArcWidth(25);
       alarm1rec.setArcHeight(25);
       root.getChildren().add(alarm1rec);
        
       Text Alarm1 = new Text(430, 75,"Alarm 1: ");
       Font alarmFont = new Font("t", 25);
       Alarm1.setFont(alarmFont);
       Alarm1.relocate(Alarm1.getX() - 400, Alarm1.getY()+260);
       Alarm1.setFill(Color.BLACK);
       root.getChildren().add(Alarm1);
       
       ToggleButton alarm1onoff = new ToggleButton();
       alarm1onoff.setText("ON/OFF");
       alarm1onoff.relocate(337, 333);
       root.getChildren().add(alarm1onoff);
        
       Label al1HH = new Label();
       al1HH.setText("H:");
       al1HH.relocate(105, 285);
       root.getChildren().add(al1HH);
       
       TextField al1H = new TextField();
       al1H.setText("12");
       al1H.relocate(125, 280);
       al1H.setPrefWidth(35);
       root.getChildren().add(al1H);
         
       Label al1MM = new Label();
       al1MM.setText("M:");
       al1MM.relocate(170, 285);
       root.getChildren().add(al1MM);
       
       TextField al1M = new TextField();
       al1M.setText("00");
       al1M.relocate(190, 280);
       al1M.setPrefWidth(35); 
       root.getChildren().add(al1M);
       
       Label al1SS = new Label();
       al1SS.setText("Set: ");
       al1SS.relocate(235, 285);
       root.getChildren().add(al1SS);
       
       TextField al1S = new TextField();
       al1S.setText("PM");
       al1S.relocate(263, 280);
       al1S.setPrefWidth(40);
       root.getChildren().add(al1S);
       
       Button set1 = new Button();
       set1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    boolean PM1 = true;
                    
                    if(al1H.getText().replaceAll("[^0-9.]", "").isEmpty()|| al1M.getText().replaceAll("[^0-9.]", "").isEmpty()||al1S.getText().isEmpty() || al1S.getText().length() >2 
                            || al1H.getText().length() >2|| al1M.getText().length() >2 ){
                        //do nothing
                    }
                    else{
   
                        int hour1 = Integer.parseInt(al1H.getText().replaceAll("[^0-9.]", ""));
                        int min1 = Integer.parseInt(al1M.getText().replaceAll("[^0-9.]", ""));
                        
                        if(hour1 >= 13 || min1 >= 60 || hour1 <=0 ){
                            //do nothing 
                        }
                        else{
                            if(al1S.getText().toUpperCase().equals("PM")){
                                PM1 = true;
                        }
                            if(al1S.getText().toUpperCase().equals("AM")){
                                PM1 = false;
                        }
                            controller.setAlarm1(hour1, min1, PM1);
                        }
                    }  
            }
        });
       
       set1.setText("SET");
       set1.relocate(30, 280);
       root.getChildren().add(set1);
       // alarm 1 stuff ends

        // alarm 2 stuff
       Rectangle alarm2rec = new Rectangle(420,110,310,65);
       alarm2rec.relocate(alarm2rec.getX()- 400 , alarm2rec.getY()+280);
       alarm2rec.setStroke(Color.BLACK);
       alarm2rec.setFill(Color.RED);
       alarm2rec.setStrokeWidth(3);
       alarm2rec.setArcWidth(25);
       alarm2rec.setArcHeight(25);
       root.getChildren().add(alarm2rec);
       
       Text Alarm2 = new Text(430, 150,"Alarm 2: ");
       Alarm2.setFont(alarmFont);
       Alarm2.setFill(Color.BLACK);
       Alarm2.relocate(Alarm2.getX()- 400 , Alarm2.getY()+260);
       root.getChildren().add(Alarm2);
        
       ToggleButton alarm2onoff = new ToggleButton();
       alarm2onoff.setText("ON/OFF");
       alarm2onoff.relocate(337, 412);
       root.getChildren().add(alarm2onoff);
       
       Label al2HH = new Label();
       al2HH.setText("H:");
       al2HH.relocate(105, 467);
       root.getChildren().add(al2HH);
       
       TextField al2H = new TextField();
       al2H.setText("12");
       al2H.relocate(125, 460);
       al2H.setPrefWidth(35);
       root.getChildren().add(al2H);
         
       Label al2MM = new Label();
       al2MM.setText("M:");
       al2MM.relocate(170, 467);
       root.getChildren().add(al2MM);
       
       TextField al2M = new TextField();
       al2M.setText("00");
       al2M.relocate(190, 460);
       al2M.setPrefWidth(35);
       root.getChildren().add(al2M);
       
       Label al2SS = new Label();
       al2SS.setText("Set: ");
       al2SS.relocate(235, 467);
       root.getChildren().add(al2SS);
       
       TextField al2S = new TextField();
       al2S.setText("PM");
       al2S.relocate(263, 460);
       al2S.setPrefWidth(40);
       root.getChildren().add(al2S);
       
       Button set2 = new Button();
       set2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    boolean PM2 = true;
                   
                    if(al2H.getText().replaceAll("[^0-9.]", "").isEmpty()|| al2M.getText().replaceAll("[^0-9.]", "").isEmpty()||al2S.getText().isEmpty() || al2S.getText().length() >2 
                            || al2H.getText().length() >2|| al2M.getText().length() >2){
                        //do nothing
                    }
                    else{
                        int hour2 = Integer.parseInt(al2H.getText().replaceAll("[^0-9.]", ""));
                        int min2 = Integer.parseInt(al2M.getText().replaceAll("[^0-9.]", ""));
                    
                        
                        if(hour2 >= 13 || min2 >= 60 || hour2 <=0 ){
                            //do nothing 
                        }
                        else{
                        if(al2S.getText().toUpperCase().equals("PM")){
                            PM2 = true;
                        }
                        if(al2S.getText().toUpperCase().equals("AM")){
                            PM2 = false;
                        }
                        controller.setAlarm2(hour2, min2, PM2);
                        }
                    }         
            }
        });
       
       set2.setText("SET");
       set2.relocate(30, 460);
       root.getChildren().add(set2);
       //alarm 2 stuff ends here

       Button Snooze = new Button();
       Snooze.setText("SNOOZE");
       Snooze.setScaleX(3.5);
       Snooze.setScaleY(1.5);
       Snooze.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { 
                controller.snooze();
             
            }
        });
       Snooze.relocate(400, 230);
       root.getChildren().add(Snooze);

       controller.runSystem();
        timer1.schedule(new TimerTask() {
        @Override
        public void run() {
            if((controller.alarm1GoingOff()||controller.alarm2GoingOff())&& num<= 1){
                scene.setFill(Color.YELLOW);
                mediaPlayer.play(); 
                num++;
            }
            if((controller.alarm1GoingOff()||controller.alarm2GoingOff()) && num> 1){
                scene.setFill(Color.WHITE);
                mediaPlayer.play();
                num++;
            }
            if(num == 3){
                num =0;
            }
 
            if(controller.alarm1GoingOff()== false && controller.alarm2GoingOff()== false ){
                scene.setFill(Color.WHITE);
                mediaPlayer.stop();   
            }
           
            controller.checkAlarm1();
            controller.checkAlarm2();

            if(alarm1onoff.selectedProperty().getValue()==true){
                controller.setalarm1ONOFF(true);
                
            }
            if(alarm1onoff.selectedProperty().getValue()==false){
                controller.setalarm1ONOFF(false);
                controller.deactivatealarm1();
                
            }
            if(alarm2onoff.selectedProperty().getValue()==true){
                controller.setalarm2ONOFF(true);  
            }
            if(alarm2onoff.selectedProperty().getValue()==false){
                
                controller.setalarm2ONOFF(false);
                controller.deactivatealarm2();
            }
                    
            Alarm1.setText("Alarm 1:    " + controller.getAlarm1Time());
            Alarm2.setText("Alarm 2:    " + controller.getAlarm2Time());
            
            if(controller.isalarm1on()){
                alarm1rec.setFill(Color.GREEN);
            }
            else{
                alarm1rec.setFill(Color.RED);
            }
            if(controller.isalarm2on()){
                alarm2rec.setFill(Color.GREEN);
            }
            else{
                alarm2rec.setFill(Color.RED);
            }
            
            radio1.setText(controller.getRadioToString());
            time1.setText(controller.getTime());
        }
    }, 0, 100);

       stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
           public void handle(WindowEvent we){
               controller.stopSystem();
               stage.close();
               System.exit(0);
               
           }
       });
       
       stage.setTitle("Alarm Clock");
       stage.setScene(scene);
       stage.setResizable(false);
       stage.centerOnScreen();
       stage.show();

    }
     
}
