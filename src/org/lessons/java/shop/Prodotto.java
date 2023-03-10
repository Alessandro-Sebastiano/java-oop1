package org.lessons.java.shop;

import javax.management.Descriptor;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;
    private static int lastCode = 0;

    Prodotto(String name, String description, double price, int iva){

        this.code = codeGenerate();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }


    private int codeGenerate(){

        lastCode++;
        return lastCode;

    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription (String description){
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva (int iva){
        this.iva = iva;
    }


    public String getPriceIva(){
        DecimalFormat format = new DecimalFormat("##.##");
        return format.format(price + (price * iva) / 100);
    }

    public String getCompleteName(){

        return code + "-" + name;

    }

}
