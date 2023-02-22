package fr.thread.singleton;

import fr.thread.singleton.dao.BankTransaction;
import fr.thread.singleton.repository.BankRepositoyImpl;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Début de projet");
        // Generation DATA

        System.out.println("Génération DATA");
        //SINGELTON
        BankRepositoyImpl bankRepositoy = BankRepositoyImpl.getInstance();
        //BankRepositoyImpl bankRepositoy1 = BankRepositoyImpl.getInstance();
        //  BankRepositoyImpl bankRepositoy2 = BankRepositoyImpl.getInstance();

        for (int i = 0; i < 10; i++) {
            BankTransaction bankTransaction = new BankTransaction();
            bankTransaction.setId((long) i);
            bankTransaction.setNom("Banque" + Math.random() + "FR");
            bankTransaction.setChiffreAffaire(Math.random() > 0.5 ? Math.random() * 3.2 : Math.random());
            bankTransaction.setStrDateCreation("11/10/2018-14:4" + i);
            bankRepositoy.add(bankTransaction);
            // bankRepositoy1.add(bankTransaction);
            // bankRepositoy2.add(bankTransaction);
        }
        System.out.println("==========================================================================================");

        //bankRepositoy.getAll();
        System.out.println("==========================================================================================");
        //bankRepositoy1.getAll();
        System.out.println("==========================================================================================");
        //bankRepositoy2.getAll();


        //First Thread
       /* new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });*/
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                bankRepositoy.getAll();
                System.out.println("******* Thread ");
            }).start();

        }
        System.out.println("TAPER UN CHIFFRE");
        System.in.read();

        System.out.println("Fin de projet");

    }
}
