package org.lessons.java.shop;

public class Main {

    public static void main(String[] arg){

        Prodotto product1 = new Prodotto("Scarpe", "Scarpe da ginnastica", 49.99, 22);

        System.out.println(product1.getCode());

        System.out.println(product1.getName());

        System.out.println(product1.getDescription());

        System.out.println(product1.getPrice());

        System.out.println(product1.getPriceIva());

        System.out.println(product1.getCompleteName());

        Prodotto product2 =new Prodotto("T-shirt", "T-shirt da uomo", 12.60, 22);

        System.out.println(product2.getCode());

        System.out.println(product2.getName());

        System.out.println(product2.getDescription());

        System.out.println(product2.getPrice());

        System.out.println(product2.getPriceIva());

        System.out.println(product2.getCompleteName());
    }

}
