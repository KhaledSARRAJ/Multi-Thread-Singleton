package fr.thread.singleton.repository;

import fr.thread.singleton.dao.BankTransaction;

public interface BankRepository {
    public void add(BankTransaction bankTransaction);
    public void remove(BankTransaction bankTransaction);
    public void getAll();

}
