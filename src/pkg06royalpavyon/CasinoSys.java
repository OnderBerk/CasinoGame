/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06royalpavyon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author armagan
 */
public class CasinoSys {

    public static ArrayList<Games> casinoList = new ArrayList<Games>();
    public static Set<Games> setArr = new LinkedHashSet<Games>();

    public static void users() {
        try {
            File file = new File("users.txt");
            Scanner sc = null;
            sc = new Scanner(file);

            while (sc.hasNext()) {
                String[] users = sc.nextLine().split("\\*");
                String username = users[0];
                String password = users[1];
                double bankAccount = Double.parseDouble(users[2]);

                Games g = new Games(username, password, bankAccount);
                casinoList.add(g);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CasinoSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String sortaccount(){
        TreeSet<Games> ts = new TreeSet<Games>();
        ts.addAll(casinoList);
        String res = "";
        for (Games s : ts) {
            res += s.toString() + "\n";
        }
        return res;
    }
    public static Games searchAgency(String name)
    {
        for (int i = 0; i < casinoList.size(); i++) {
            Games get = casinoList.get(i);
            if(name == get.getUsername())
            {
                return get;
            }
        }
        return null;
    }

    public static void addUser(String username, String password) {
        Games g = new Games(username, password, 1000);
        casinoList.add(g);
    }

    public static String removeUser(String username, String password) {
        for (int i = 0; i < casinoList.size(); i++) {
            if (username.equalsIgnoreCase(casinoList.get(i).getUsername())) {
                if (password.equalsIgnoreCase(casinoList.get(i).getPassword())) {
                    casinoList.remove(i);
                    return "User removed succesfully.";
                } else {
                    return "Wrong password.";

                }
            }
        }
        return "Couldnt find.";
    }

    public static int giveCard(int total) {
        int card = (int) (Math.random() * 11);
        if (card == 11) {
            if (total <= 10) {
                card = 11;
            } else if (total > 10) {
                card = 1;
            }
        }
        if (card == 0 || card == 1 || card == 10) {
            card = 10;
        }

        return card;
    }

    public static boolean getChoice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDo you want a card?(YES=true / NO=false):");
        boolean choice = sc.nextBoolean();

        return choice;
    }

    public static int startKasa() {
        int kasa = 0;

        int kasaC1 = giveCard(kasa);
        kasa += kasaC1;

        return kasa;
    }

    public static int startKasa2(int kasa) {
        int kasaC2 = giveCard(kasa);
        kasa += kasaC2;

        return kasa;
    }

    public static int startUser() {
        int user = 0;

        int userC1 = giveCard(user);
        user += userC1;
        int userC2 = giveCard(user);
        user += userC2;

        return user;
    }

    public static int kasaKartCek(int kasa) {
        int kasaCx = 0;
        while (kasa < 17) {
            kasaCx = giveCard(kasa);
            kasa += kasaCx;
        }
        return kasa;
    }

    public static String sonuc(int user, int kasa, int bet) {
        if (user < 21) {
            System.out.println("Kasa: " + kasa);
            System.out.println("You: " + user);

            if (user > kasa) {
                return "YOU WON";
            } else if (kasa > 21) {
                return "YOU WON";
            } else if (user == kasa) {
                return "Push.";
            } else if (user < kasa) {
                return "You Lost.";
            }
        }
        return null;

    }

    public static int shootDice() {
        int dice = (int) (Math.random() * 5);
        if (dice == 0) {
            dice = 6;
        }

        return dice;
    }

    public static ArrayList playDice() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int kasa1 = shootDice();
        int kasa2 = shootDice();
        int user1 = shootDice();
        int user2 = shootDice();
        int kasaTotal = kasa1 + kasa2;
        int userTotal = user1 + user2;

        arr.add(kasa1);
        arr.add(kasa2);
        arr.add(kasaTotal);
        arr.add(user1);
        arr.add(user2);
        arr.add(userTotal);

        return arr;

    }

    public static int slot() {
        int slot = (int) (Math.random() * 3);
        return slot;
    }

    public static ArrayList koluCek() {
        int slot1 = slot();
        int slot2 = slot();
        int slot3 = slot();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(slot1);
        arr.add(slot2);
        arr.add(slot3);

        return arr;
    }

    public static String display() {
        String res = "";
        for (int i = 0; i < casinoList.size(); i++) {
            res += casinoList.get(i).toString() + "\n";
        }
        return res;
    }

    public static void writeToFile(String username, String password, double bankAcc) {
        File f = new File("users.txt");
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter(f, true);
            pw = new PrintWriter(fw);
            String strWriteToFile = "\n" + username + "*" + password + "*" + bankAcc;

            pw.println(strWriteToFile.substring(0, strWriteToFile.length() - 1));
        } catch (IOException ex) {
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
