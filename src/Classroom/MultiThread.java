/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classroom;

import UserInterface.Payroll;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author dhara
 */
public class MultiThread extends Thread{
    private Thread t ;
    private int Hr, Min;
    boolean dismissed;
    
    public MultiThread(String hr, String min){
        Hr = Integer.parseInt(hr);
        Min = Integer.parseInt(min);
        dismissed=false;
    }
    @Override
    public void run(){
        System.out.println("thread is working");
        Timer timer = new Timer(100,new Listener());
        timer.setInitialDelay(3900);
        timer.start();        
        System.out.println("out of the thread");
        
    }
        
    
    
    class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            Calendar rightnow = Calendar.getInstance();
            int hour = rightnow.get(Calendar.HOUR_OF_DAY);
            int min = rightnow.get(Calendar.MINUTE);
            int sec = rightnow.get(Calendar.SECOND);
            if (Min == min && Hr == hour && !dismissed  ) {
                Component Jframe = null;
                JOptionPane.showMessageDialog(Jframe, "Wake UP", "Alarm Ringing", JOptionPane.WARNING_MESSAGE);
                dismissed=true;
                //System.out.println("reaching here");
            }
        }
    }
}
