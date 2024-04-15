/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AM;

import AM.Connection;
import AM.SeePost;
import com.mysql.cj.xdevapi.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author karan
 */
public class Rentals extends javax.swing.JFrame {
    int rank = 1;
    int user_id = global.user_id;
    int max_rank = 0;
    public void doasloads() throws SQLException
    {
        rank = 1;
        try {
            Statement st = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            java.sql.Connection con = null;
            
            System.out.print("connecting");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //java.sql.Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelalong", "root", "iwontellthat1");
            } catch (SQLException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            pst = con.prepareStatement("with cte1 as (Select * from user natural join preferences natural join posts natural join post where User_id = ?),\n" +
"cte2 as (select *,row_number() over (order by Stars DESC) as ranking  from rental where Address_city = (Select destination from cte1))\n" +
"select COUNT(*) as maxrank from cte2 ;");
            pst.setInt(1,this.user_id);
            rs = pst.executeQuery();
            if(rs.next()){
            max_rank = rs.getInt("maxrank");}
             pst = con.prepareStatement("with cte1 as (Select * from user natural join preferences natural join posts natural join post where User_id = ?),\n" +
"cte2 as (select *,row_number() over (order by Stars DESC) as ranking  from rental where Address_city = (Select destination from cte1))\n" +
"select * from cte2 where ranking = 1");
            pst.setInt(1,this.user_id);
            rs = pst.executeQuery();
            if(rs.next())
            {
                Integer contacts = rs.getInt("Contact");
                String tostring = contacts.toString();
                Integer star = rs.getInt("Stars");
                String tostring1 = star.toString();
                name.setText(rs.getString(("Contact")));
                address1.setText(rs.getString(("Address_general_text")));
                address2.setText(rs.getString(("Address_city")));
                
                contact.setText(tostring); 
                stars.setText(tostring1);
                
            }
            else 
            {JOptionPane.showMessageDialog(this, "Sorry, no recommendations found");
            }    
            
            
            
        
    }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public void doasloadsmod(int i) throws SQLException{
        rank = i;
        
        try {
            Statement st = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            java.sql.Connection con = null;
            
            System.out.print("connecting");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //java.sql.Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelalong", "root", "iwontellthat1");
            } catch (SQLException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
      
            pst = con.prepareStatement("with cte1 as (Select * from user natural join preferences natural join posts natural join post where User_id = ?),\n" +
"cte2 as (select *,row_number() over (order by Stars DESC) as ranking  from rental where Address_city = (Select destination from cte1))\n" +
"select * from cte2 where ranking = ?");
            
            pst.setInt(1,this.user_id);
            pst.setInt(2,rank);
            
            
            rs = pst.executeQuery();
             
            if(rs.next()){
             
                 Integer contacts = rs.getInt("Contact");
                String tostring = contacts.toString();
                Integer star = rs.getInt("Stars");
                String tostring1 = star.toString();
                name.setText(rs.getString(("Contact")));
                address1.setText(rs.getString(("Address_general_text")));
                address2.setText(rs.getString(("Address_city")));
                
                contact.setText(tostring); 
                stars.setText(tostring1);
                
            }   

// }

        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    /**
     * Creates new form Rentals
     */
    public Rentals() {
        initComponents();
        try {
            doasloads();
        } catch (SQLException ex) {
            Logger.getLogger(Rentals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        stars = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        address2 = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        stars.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        stars.setText("jLabel10");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("Stars:");

        contact.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        contact.setText("jLabel9");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Contact:");

        address2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        address2.setText("jLabel4");

        address1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        address1.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Name:");

        name.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        name.setText("jLabel4");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("Rentals");

        image.setText("jLabel2");

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(image)
                        .addGap(281, 281, 281)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addComponent(address1)
                                    .addComponent(address2)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contact)
                                    .addComponent(stars)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(361, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jLabel1))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(name))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(address1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contact))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
rank --;
        if(rank <= 0){
            JOptionPane.showMessageDialog(this,"Can't Go back more");
            rank = 1;
        }
        else{
            try {
            doasloadsmod(rank);
        } catch (SQLException ex) {
            Logger.getLogger(SeePost.class.getName()).log(Level.SEVERE, null, ex);
        }
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rank++;
        if(rank>max_rank){
           JOptionPane.showMessageDialog(this,"That's all for the recommendations. ");
           rank--;
        }
        else{
        try {
            doasloadsmod(rank);
        } catch (SQLException ex) {
            Logger.getLogger(SeePost.class.getName()).log(Level.SEVERE, null, ex);
        }
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address1;
    private javax.swing.JLabel address2;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel name;
    private javax.swing.JLabel stars;
    // End of variables declaration//GEN-END:variables
}
