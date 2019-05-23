/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakontroldarbs01;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nz
 */
public class Bread extends Product {
    
   private float weigth;
   private Date expirationDate;
   private BreadType breadType;

    public Bread(float weigth, Date expirationDate, BreadType breadType, float price, String title, int amount) {
        super(price, title, amount);
        this.weigth = weigth;
        setExpirationDate(expirationDate);
        this.breadType = breadType;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = (weigth > 0)?weigth:0;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        this.expirationDate = (expirationDate.after(now))?expirationDate:now;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = (breadType == BreadType.BlackBread || breadType == BreadType.FullGrain || breadType == BreadType.whiteBread)? breadType:BreadType.Unset;
    }

    @Override
    public String toString() {
        return "Bread{" + "weigth=" + weigth + ", expirationDate=" + expirationDate + ", breadType=" + breadType + '}';
    }
   
   
    
}
