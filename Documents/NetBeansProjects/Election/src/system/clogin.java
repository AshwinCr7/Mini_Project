package system;


import com.mysql.jdbc.StringUtils;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jashw
 */
public class clogin extends javax.swing.JFrame {
    Connection con;
    PreparedStatement p1;
    PreparedStatement ps1;

    /**
     * Creates new form clogin
     */
    public clogin() {
        initComponents();
         try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/voterdb","root","jay1968$"); 
        Statement s=(Statement) con.createStatement();  

}catch( ClassNotFoundException | SQLException e){ System.out.println(e);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caadhar = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        HOME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CANDIDATE LOGIN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("AADHAR NO");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        caadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caadharKeyPressed(evt);
            }
        });

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("NEW USER..??");

        signup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        HOME.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HOME.setText("HOME");
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(caadhar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup)))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
this.dispose();
csignup cs = new csignup();
cs.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            PreparedStatement ps = con.prepareStatement("select * from candidate where caadhar = ? && password = ?");
            if(StringUtils.isNullOrEmpty(caadhar.getText()) || StringUtils.isNullOrEmpty(password.getText()))
                JOptionPane.showMessageDialog(this,"No Data..!!");
            else
            {
            ps.setInt(1,Integer.parseInt(caadhar.getText()));
            ps.setString(2,password.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this,"Invalid Candidate..!!");
                caadhar.setText("");
                password.setText("");
            }
            else
            {
                ps1 = con.prepareStatement("select cstatus as s from candidate where caadhar = ?");
                ps1.setInt(1, Integer.parseInt(caadhar.getText()));
                ResultSet r1 = ps1.executeQuery();
                r1.next();
                int x = r1.getInt("s");
                if(x==0)
                {
                Global.cano = Integer.parseInt(caadhar.getText());
                Global.vano = 0;
                p1 = con.prepareStatement("select vcno as c from candidate where caadhar = ?");
                p1.setInt(1,Integer.parseInt(caadhar.getText()));
                ResultSet r = p1.executeQuery();
                r.beforeFirst();
                r.next();
                Global.ccon = r.getInt("c");
                Global.vcon = 0;
                
                this.dispose();
                vote v = new vote();
                v.setVisible(true);
                }
                
                else
                        {
                            JOptionPane.showMessageDialog(this,"Vote Registered Aldready...!!!");
                            this.dispose();
                            home h = new home();
                            h.setVisible(true);
                        }
            }
            }
            
// TODO add your handling code heRere:
        } catch (SQLException ex) {
            Logger.getLogger(clogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
this.dispose();
home h = new home();
h.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_HOMEActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
                    try {
            PreparedStatement ps = con.prepareStatement("select * from candidate where caadhar = ? && password = ?");
            if(StringUtils.isNullOrEmpty(caadhar.getText()) || StringUtils.isNullOrEmpty(password.getText()))
                JOptionPane.showMessageDialog(this,"No Data..!!");
            else
            {
            ps.setInt(1,Integer.parseInt(caadhar.getText()));
            ps.setString(2,password.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this,"Invalid Candidate..!!");
                caadhar.setText("");
                password.setText("");
            }
            else
            {
                ps1 = con.prepareStatement("select cstatus as s from candidate where caadhar = ?");
                ps1.setInt(1, Integer.parseInt(caadhar.getText()));
                ResultSet r1 = ps1.executeQuery();
                r1.next();
                int x = r1.getInt("s");
                if(x==0)
                {
                Global.cano = Integer.parseInt(caadhar.getText());
                Global.vano = 0;
                p1 = con.prepareStatement("select vcno as c from candidate where caadhar = ?");
                p1.setInt(1,Integer.parseInt(caadhar.getText()));
                ResultSet r = p1.executeQuery();
                r.beforeFirst();
                r.next();
                Global.ccon = r.getInt("c");
                Global.vcon = 0;
                
                this.dispose();
                vote v = new vote();
                v.setVisible(true);
                }
                
                else
                        {
                            JOptionPane.showMessageDialog(this,"Vote Registered Aldready...!!!");
                            this.dispose();
                            home h = new home();
                            h.setVisible(true);
                        }
            }
            }
            
// TODO add your handling code heRere:
        } catch (SQLException ex) {
            Logger.getLogger(clogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    }//GEN-LAST:event_passwordKeyPressed

    private void caadharKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caadharKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             password.requestFocus();
         }
    }//GEN-LAST:event_caadharKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HOME;
    private javax.swing.JTextField caadhar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables

    private static class con {

        private static Statement createStatement() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static PreparedStatement prepareStatement(String select__from_voter_where_cid____cpassword) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public con() {
        }
    }
}
