/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06royalpavyon;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author armagan
 */
public class gamesFrame extends javax.swing.JFrame {

    /**
     * Creates new form gamesFrame
     */
    girisFrame giris;
    bjFrame bj = new bjFrame(this);
    diceFrame dj=new diceFrame(this);
    slotFrame sl=new slotFrame(this);
    removeFrame rf=new removeFrame(this);
    searchFrame sc=new searchFrame(this);
     DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();

    public gamesFrame(girisFrame gir) {
        giris = gir;
        initComponents();
        gizliPassL.setVisible(false);
    }

    public JLabel getGizliPassL() {
        return gizliPassL;
    }

    public void setGizliPassL(JLabel gizliPassL) {
        this.gizliPassL = gizliPassL;
    }

    public JLabel getBankLabel() {
        return bankLabel;
    }

    public void setBankLabel(JLabel bankLabel) {
        this.bankLabel = bankLabel;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        bankLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        gizliPassL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnDisplay = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        blackrd = new javax.swing.JRadioButton();
        dicerd = new javax.swing.JRadioButton();
        slotrd = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        btnDisplay1 = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        sortbtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        usernameLabel.setText("jLabel1");
        jPanel1.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        bankLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bankLabel.setText("jLabel1");
        jPanel1.add(bankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Bank:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("TL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        gizliPassL.setText("jLabel4");
        jPanel1.add(gizliPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 31, -1, -1));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 246, 231));

        btnDisplay.setText("DISPLAY USERS");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 448, -1, -1));

        buttonGroup1.add(blackrd);
        blackrd.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        blackrd.setText("BlackJack");
        blackrd.setBorderPainted(true);
        jPanel1.add(blackrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        buttonGroup1.add(dicerd);
        dicerd.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        dicerd.setText("DiceGame");
        dicerd.setBorderPainted(true);
        jPanel1.add(dicerd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        buttonGroup1.add(slotrd);
        slotrd.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        slotrd.setText("SlotGame");
        slotrd.setBorderPainted(true);
        jPanel1.add(slotrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jButton4.setText("SELECT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        btnDisplay1.setText("DISPLAY USERS");
        btnDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        searchbtn.setText("SEARCH USER");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 140, -1));

        sortbtn.setText("SORT WITH ACCOUNT");
        sortbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sortbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        removebtn.setText("REMOVE USER");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });
        jPanel1.add(removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 140, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg06royalpavyon/enson.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 690, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
 this.setVisible(false);
         txtArea.setText("");
        giris.setVisible(true);
        String username = usernameLabel.getText();
        String password = gizliPassL.getText();
        double bankAccount = Double.parseDouble(bankLabel.getText());
        
        File file = new File("users.txt");
        file.delete();
        for(int i=0;i<CasinoSys.casinoList.size();i++){
        File f = new File("users.txt");
        
        PrintWriter pw = null;
        try {
            double newacc=(int) CasinoSys.casinoList.get(i).getBankAccount();
            FileWriter fw = new FileWriter(f, true);
            pw = new PrintWriter(fw);
            String strWriteToFile = CasinoSys.casinoList.get(i).getUsername()+"*"+CasinoSys.casinoList.get(i).getPassword()+"*"+newacc;

            pw.println(strWriteToFile.substring(0, strWriteToFile.length() - 1));
        } catch (IOException ex) {
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
        }

        for (int i = 0; i < CasinoSys.casinoList.size(); i++) {
            if (username.equalsIgnoreCase(CasinoSys.casinoList.get(i).getUsername())) {
                CasinoSys.casinoList.get(i).setBankAccount(bankAccount);
            }
        }

       /* for (int i = 0; i < CasinoSys.casinoList.size(); i++) {
            CasinoSys.writeToFile(username, password, bankAccount);
        }
        */
        txtArea.setText("");
        CasinoSys.casinoList.clear();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        String username=usernameLabel.getText();
        txtArea.setText(CasinoSys.display());
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       txtArea.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(blackrd.isSelected()){
        bj.getSolUserLabel().setText(getUsernameLabel().getText());
        bj.getSolBankLabel().setText(getBankLabel().getText());
        bj.getGizliPass().setText(getGizliPassL().getText());
        bj.setVisible(true);
        txtArea.setText("");
        this.setVisible(false);
        }
        else if(dicerd.isSelected()){
        dj.getSolUserLabel().setText(getUsernameLabel().getText());
        dj.getSolBankLabel().setText(getBankLabel().getText());
        dj.getGizliPass().setText(getGizliPassL().getText());
        dj.setVisible(true);
        txtArea.setText("");
        this.setVisible(false);
        }
        else
        {
        sl.getSolUserLabel().setText(getUsernameLabel().getText());
        sl.getSolBankLabel().setText(getBankLabel().getText());
        sl.getGizliPass().setText(getGizliPassL().getText());
        sl.setVisible(true);
        txtArea.setText("");
        this.setVisible(false);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisplay1ActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        // TODO add your handling code here:
        rf.setVisible(true);
    }//GEN-LAST:event_removebtnActionPerformed

    private void sortbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortbtnActionPerformed
        txtArea.setText(CasinoSys.sortaccount());
    }//GEN-LAST:event_sortbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        sc.getCmbbox().removeAllItems();
        for (int i = 0; i < CasinoSys.casinoList.size(); i++) {
           Games a = CasinoSys.casinoList.get(i);
           dcm.addElement(a.getUsername());
        }
        sc.getCmbbox().setModel(dcm);
        sc.setVisible(true);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankLabel;
    private javax.swing.JRadioButton blackrd;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDisplay1;
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dicerd;
    private javax.swing.JLabel gizliPassL;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removebtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JRadioButton slotrd;
    private javax.swing.JButton sortbtn;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
