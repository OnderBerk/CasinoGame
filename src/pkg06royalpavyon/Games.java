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
public class Games extends Casino implements Comparable<Games>{

    private String username;
    private String password;
    private double bankAccount;

    public Games(String username, String password, double bankAccount) {
        this.username = username;
        this.password = password;
        this.bankAccount = bankAccount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "username=" + username + "\nbankAccount=" + bankAccount;
    }

    @Override
    public void wonBudget() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Games o) {
        return (int) (bankAccount-o.bankAccount);
    }

}
