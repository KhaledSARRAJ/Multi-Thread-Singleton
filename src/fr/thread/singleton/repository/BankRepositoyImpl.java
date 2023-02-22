package fr.thread.singleton.repository;

import fr.thread.singleton.dao.BankTransaction;

import java.util.HashMap;
import java.util.Map;

public class BankRepositoyImpl implements BankRepository {

    private static BankRepositoyImpl bankRepositoy;
    Map<String, BankTransaction> map = new HashMap<>();
    int count;
    private BankRepositoyImpl() {
    }

    public static BankRepositoyImpl getInstance() {
        //INSTANTIATION SINGELTON
        if (bankRepositoy == null) {
            System.out.println("INSTANTIATION SINGELTON");
            bankRepositoy = new BankRepositoyImpl();
        }
        return bankRepositoy;
    }

    @Override
    public void add(BankTransaction bankTransaction) {
        count++;
        map.put("Banque numéro" + count, bankTransaction);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Size: "+ map.values().size());
    }

    @Override
    public void remove(BankTransaction bankTransaction) {

        map.remove(bankTransaction);
    }

    @Override
    public synchronized
    void getAll() {
        count++;
        map.forEach((a, b) -> System.out.println("Compteur : "+count+"  Bonjour le key: ******** " + a + "  Bonjour la Bank:****************" + b));


    }
}
