/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakontroldarbs01;

/**
 *
 * @author nz
 */
public class Phone {
    
    private short processroCount; 
    private  PhoneManufacturer manufacturer;
    private short displaySize;

    public Phone(short processroCount, PhoneManufacturer manufacturer, short displaySize) {
        this.processroCount = processroCount;
        this.manufacturer = manufacturer;
        this.displaySize = displaySize;
    }

    public short getProcessroCount() {
        return processroCount;
    }

    public void setProcessroCount(short processroCount) {
        this.processroCount = (processroCount > 0)?processroCount:0;
    }

    public PhoneManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(PhoneManufacturer manufacturer) {
        this.manufacturer = (manufacturer == PhoneManufacturer.Samsung || manufacturer == PhoneManufacturer.SonyEricson)?manufacturer:PhoneManufacturer.Unset;
    }

    public short getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(short displaySize) {
        this.displaySize = (displaySize > 0 )? displaySize:0;
    }

    @Override
    public String toString() {
        return "Phone{" + "processroCount=" + processroCount + ", manufacturer=" + manufacturer + ", displaySize=" + displaySize + '}';
    }

    
    
}
