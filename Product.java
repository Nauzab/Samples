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
public class Product {
    private float price;
    private String title;
    private int amount;

    public Product(float price, String title, int amount) {
        setPrice(price);
        this.title = title;
        setAmount(amount);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
       this.price = (price > 0 )? price:0; //check if amount is bigger then 0 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = (amount > 0)? amount:0; //check if amount is bigger then 0 
        
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", title=" + title + ", amount=" + amount + '}';
    }
    

    
    
    
}
