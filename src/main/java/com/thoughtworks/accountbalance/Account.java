package com.thoughtworks.accountbalance;

/**
 * Created by evazamudio on 2014-04-20.
 */
public class Account {
    public Integer balance = 0;


    public void deposit(int i) {
        balance = balance + i;
    }

    public void withdraw(int i) {
        balance = balance - i;
    }
}
