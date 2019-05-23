/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakontroldarbs01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author nz
 */
public class Check {
    private final float pvn= (float) 0.21;
    private  ArrayList<Product> nopirktieProdukti = new ArrayList<Product>();

    public Check( ArrayList<Product> nopirktieProdukti) {
        
    }

    public ArrayList<Product> getNopirktieProdukti() {
        return nopirktieProdukti;
    }

    public void setNopirktieProdukti(ArrayList<Product> nopirktieProdukti) {
        this.nopirktieProdukti = nopirktieProdukti;
    }
    
    public float calcutaleTotalSum(){
        float totalsum = 0;
        for(int i = 0 ; i < nopirktieProdukti.size(); i ++){
            totalsum  = totalsum + nopirktieProdukti.get(i).getPrice();
        }
        totalsum *= pvn;
        
        return totalsum;
    }
    
    public void printCheck() throws IOException{
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            for(int i = 0 ; i < nopirktieProdukti.size(); i++){
            System.out.println(nopirktieProdukti.get(i));
            fw = new FileWriter("check.txt");
            bw = new BufferedWriter(fw);
            bw.write(nopirktieProdukti.get(i).toString());
            
            }
        }catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        finally {
            try {
                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }
        
        
    }

    @Override
    public String toString() {
        return "Check{" + "pvn=" + pvn + ", nopirktieProdukti=" + nopirktieProdukti + '}';
    }

    
    
    

    
    
}
