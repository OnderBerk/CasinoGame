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
public class BlackJack extends Games {

    private double bet;
    private boolean choice;

    public BlackJack(String username, String password, double bankAccount, double bet, boolean choice) {
        super(username, password, bankAccount);
        this.bet = bet;
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "BlackJack{" + "bet=" + bet + ", choice=" + choice + '}';
    }
    
}
