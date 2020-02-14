/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06royalpavyon;

/**
 *
 * @author armagan
 */
public class Slot extends Games {

    private double bet;

    public Slot(double bet, String username, String password, double bankAccount) {
        super(username, password, bankAccount);
        this.bet = bet;
    }

    @Override
    public String toString() {
        return "Slot{" + "bet=" + bet + '}';
    }
    
}
