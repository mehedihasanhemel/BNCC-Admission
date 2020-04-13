package bnccadmission;

/**
 *
 * @author Mehedi Hasan Hemel
 */
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class UserReg extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public UserReg() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PWD = new rojerusan.RSMetroTextPlaceHolder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Name = new rojerusan.RSMetroTextPlaceHolder();
        CPWD = new rojerusan.RSMetroTextPlaceHolder();
        Email = new rojerusan.RSMetroTextPlaceHolder();
        BNCCID = new rojerusan.RSMetroTextPlaceHolder();
        PPP = new rojerusan.RSMetroTextPlaceHolder();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(327670, 327670));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("For 'Sign Up' you need to  fill up this fields and wait for Admin Aproval");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 140, 440, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact with admin for Aproval.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(460, 170, 200, 19);

        PWD.setForeground(new java.awt.Color(0, 0, 0));
        PWD.setBorderColor(new java.awt.Color(255, 255, 255));
        PWD.setBotonColor(new java.awt.Color(0, 0, 0));
        PWD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PWD.setPhColor(new java.awt.Color(0, 0, 0));
        PWD.setPlaceholder("Enter Password");
        PWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWDActionPerformed(evt);
            }
        });
        jPanel1.add(PWD);
        PWD.setBounds(460, 400, 240, 42);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rank        :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 250, 70, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type        :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 200, 80, 40);

        btnOK.setBackground(new java.awt.Color(0, 0, 0));
        btnOK.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("Sign UP");
        btnOK.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel1.add(btnOK);
        btnOK.setBounds(600, 610, 100, 30);

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Sign IN");
        btnCancel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(380, 610, 100, 30);

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Select >", "Cadet Under Officer", "Cadet Sargent", "Cadet Corporal", "Cadet Lance corporal", "Cadet" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(460, 250, 240, 40);

        jComboBox2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Select >", "Recruitment", "Written Exam", "Physical Exam" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(460, 200, 240, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name       :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 300, 80, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email        :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 550, 70, 40);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BNCC ID   :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 350, 71, 40);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Re-Enter :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 450, 70, 40);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone No :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 500, 70, 40);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(380, 400, 70, 40);

        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.setBorderColor(new java.awt.Color(255, 255, 255));
        Name.setBotonColor(new java.awt.Color(0, 0, 0));
        Name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Name.setPhColor(new java.awt.Color(0, 0, 0));
        Name.setPlaceholder("Enter Full Name");
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name);
        Name.setBounds(460, 300, 240, 42);

        CPWD.setForeground(new java.awt.Color(0, 0, 0));
        CPWD.setBorderColor(new java.awt.Color(255, 255, 255));
        CPWD.setBotonColor(new java.awt.Color(0, 0, 0));
        CPWD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CPWD.setPhColor(new java.awt.Color(0, 0, 0));
        CPWD.setPlaceholder("Re-Enter Password");
        CPWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPWDActionPerformed(evt);
            }
        });
        jPanel1.add(CPWD);
        CPWD.setBounds(460, 450, 240, 42);

        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setBorderColor(new java.awt.Color(255, 255, 255));
        Email.setBotonColor(new java.awt.Color(0, 0, 0));
        Email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Email.setPhColor(new java.awt.Color(0, 0, 0));
        Email.setPlaceholder("Enter Your Email Address");
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email);
        Email.setBounds(460, 550, 240, 42);

        BNCCID.setForeground(new java.awt.Color(0, 0, 0));
        BNCCID.setBorderColor(new java.awt.Color(255, 255, 255));
        BNCCID.setBotonColor(new java.awt.Color(0, 0, 0));
        BNCCID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BNCCID.setPhColor(new java.awt.Color(0, 0, 0));
        BNCCID.setPlaceholder("Enter BNCC ID");
        BNCCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCCIDActionPerformed(evt);
            }
        });
        jPanel1.add(BNCCID);
        BNCCID.setBounds(460, 350, 240, 42);

        PPP.setForeground(new java.awt.Color(0, 0, 0));
        PPP.setBorderColor(new java.awt.Color(255, 255, 255));
        PPP.setBotonColor(new java.awt.Color(0, 0, 0));
        PPP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PPP.setPhColor(new java.awt.Color(0, 0, 0));
        PPP.setPlaceholder("Enter Phone No");
        PPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPPActionPerformed(evt);
            }
        });
        jPanel1.add(PPP);
        PPP.setBounds(460, 500, 240, 42);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/LogInREG.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1120, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void PWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWDActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

    }//GEN-LAST:event_btnOKActionPerformed

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKMouseClicked

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void CPWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPWDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPWDActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void BNCCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCCIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNCCIDActionPerformed

    private void PPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPPActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserReg().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMetroTextPlaceHolder BNCCID;
    private rojerusan.RSMetroTextPlaceHolder CPWD;
    private rojerusan.RSMetroTextPlaceHolder Email;
    private rojerusan.RSMetroTextPlaceHolder Name;
    private rojerusan.RSMetroTextPlaceHolder PPP;
    private rojerusan.RSMetroTextPlaceHolder PWD;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
