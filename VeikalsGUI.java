/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakontroldarbs01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author nz
 */
public class VeikalsGUI  {
    static public ArrayList<Product> AllProducts = new ArrayList<Product>();
    
    public static void main(String args[]){
      Phone phone1 = new Phone((short) 16, PhoneManufacturer.Samsung, (short) 12);
      Phone phone2 = new Phone((short) 8, PhoneManufacturer.SonyEricson, (short) 10);
      Calendar calendar  = Calendar.getInstance();
      calendar.add(Calendar.DATE, 2);
      Date now = calendar.getTime();
      
      Bread b1 = new Bread((float) 0.5, now , BreadType.BlackBread, , title, 0);
    }
    
    public static void lunch(){
       JFrame frame = new JFrame("Veikals");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       JButton button = new JButton("Press");
       
       frame.setVisible(true);
    }
    
    public static void start(){
        
    }
    
    public static void GenerateProductsInStore(){
        Random r = new Random();
        PhoneManufacturer shopPhone;
        int phone = r.nextInt() % 2;
        
        switch(phone){
            case 0:
                shopPhone = PhoneManufacturer.Samsung;
                break;
            case 1:
                shopPhone = PhoneManufacturer.SonyEricson;
                break;
        }
        
        int bread = r.nextInt() % 3;
        BreadType shopBread;
        
        switch(bread){
            case 0:
                shopBread = BreadType.BlackBread;
                break;
            case 1:
                shopBread = BreadType.FullGrain;
                break;
            case 2:
                shopBread = BreadType.whiteBread;
                break;
        }
        
        
        
        
    }
    
    
  
    
    
    
}
