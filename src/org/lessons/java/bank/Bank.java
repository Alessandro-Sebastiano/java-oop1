package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.println("Per creare un conto inserisci il tuo nome: ");

        String nameAccount = input.nextLine();

        Conto newAccount = new Conto(nameAccount);

        System.out.println("Creazione conto avvenuta con successo.");
        System.out.println("Dettagli conto: " + newAccount.getAccountDetails());

        boolean exit = true;

        while (exit) {

            System.out.println("Scegli un opzione per continuare: ");
            System.out.println("1 Deposita");
            System.out.println("2 Preleva");
            System.out.println("3 Esci");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {

                case 1:
                    System.out.println("Quanto si vuole depositare?");
                    int deposit = Integer.parseInt(input.nextLine());
                    if (newAccount.deposit(deposit)) {
                        System.out.println("Deosito effettuato correttamente");
                        System.out.println(newAccount.getAccountDetails());
                    } else {
                        System.out.println("Errore");
                    }
                    break;


                case 2:
                    System.out.println("Quanto si vuole prelevare?");
                    int withdrawl = Integer.parseInt(input.nextLine());
                    if (newAccount.withdrawl(withdrawl)) {
                        System.out.println("Prelievo effettuato correttamente");
                        System.out.println(newAccount.getAccountDetails());
                    } else {
                        System.out.println("Saldo non disponibile");
                        System.out.println(newAccount.getAccountDetails());
                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    exit = false;

                    break;

            }
        }

        input.close();
    }
}


