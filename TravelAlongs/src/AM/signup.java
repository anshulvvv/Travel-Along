/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AM;
import java.sql.*;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
/**
 *
 * @author Nimish
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
                 Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtmobilenumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        getpasswordsignup = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 400));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel6.setText("Mobile Number");

        txtfirstname.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N

        txtlastname.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N

        txtemail.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N

        txtage.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N

        txtmobilenumber.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel7.setText("Password");

        jButton1.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jButton2.setText("Back to login page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        getpasswordsignup.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        getpasswordsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getpasswordsignupActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jCheckBox1.setText("show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(getpasswordsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtmobilenumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlastname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfirstname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(82, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(getpasswordsignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(97, 97, 97))
        );

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 36)); // NOI18N
        jLabel1.setText("Signup Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        
        if(jCheckBox1.isSelected())
           {
         getpasswordsignup.setEchoChar((char)0);
           }
       else
          {
        getpasswordsignup.setEchoChar('*');
          }        // TOD         // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void getpasswordsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getpasswordsignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getpasswordsignupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sub=0;
        if(txtfirstname.getText().equals("")){
        JOptionPane.showMessageDialog(this,"All Fields except last name are required");
        txtfirstname.requestFocus();
        }      

else if(txtemail.getText().equals("")){
         JOptionPane.showMessageDialog(this,"All Fields except last name are required");
         txtemail.requestFocus();
    }
    else if(getpasswordsignup.getText().equals("")){
        JOptionPane.showMessageDialog(this,"All Fields except last name are required");
        getpasswordsignup.requestFocus();
        }
    else if(txtmobilenumber.getText().equals("")){
        JOptionPane.showMessageDialog(this,"All Fields except last name are required");
        txtmobilenumber.requestFocus();
        }
   
    else{    
        
     
    PreparedStatement pst=null;
    Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelalong","root","iwontellthat1");
           // st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select * from user where email=?");
            pst.setString(1, txtemail.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"Use Another Email ID");
                txtemail.requestFocus();
            }
             pst=con.prepareStatement("select * from user where `Mob. Number`=?");
            pst.setString(1, txtmobilenumber.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"Use Another mobile number");
               txtmobilenumber.requestFocus();
            }
            else{
           //      try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Sudhir@123");
            String temp = txtmobilenumber.getText();
       
            int toin = Integer.parseInt(temp);
             String temp1 = txtage.getText();
            int toin1 = Integer.parseInt(temp1);
            int toin2=3;
           // int toin3=1;
           // INSERT INTO `travelalong`.`user` (`F_Name`, `L_Name`, `Email`, `Age`, `Mob. Number`, `Password`, `Rating`, `Subscription_ID`) VALUES ('bsj', 'ksi', 'bsj@gmail.com', '76', '7892', 'fui', '4', '1');
            pst=con.prepareStatement("INSERT INTO `travelalong`.`user` (`F_Name`, `L_Name`, `Email`, `Age`, `Mob. Number`, `Password`, `Rating`, `Subscription_ID`) VALUES (?, ?, ?, ?, ?,?,?,?);");
            pst.setString(1, txtfirstname.getText());
            pst.setString(2, txtlastname.getText());
            pst.setString(3, txtemail.getText());
            pst.setInt(4, toin1);
            pst.setInt(5, toin);
            pst.setString(6, getpasswordsignup.getText());
            pst.setInt(7,toin2);
            pst.setInt(8,1);
            //pst.setString(4, jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
           // pst.setString(5, txtans.getText());
           
           
            
            pst.executeUpdate();
         
 
        // Catch block to handle exception
            //pst = con.prepareStatement("")
            
           
            JOptionPane.showMessageDialog(this, "Registered Successfully\nLogin Now");
            
          new login().setVisible(true);  
        this.dispose();
       // } catch (SQLException ex) {
            //Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
       // }
                
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new login().setVisible(true);  
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField getpasswordsignup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmobilenumber;
    // End of variables declaration//GEN-END:variables
}
