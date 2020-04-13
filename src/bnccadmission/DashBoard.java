/**
 *
 * @author Mehedi Hasan Hemel
 */
package bnccadmission;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author mehed
 */
public class DashBoard extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        showDate();
        showTime();
    }

    void showDate() {
        java.util.Date a = new java.util.Date();
        SimpleDateFormat s1 = new SimpleDateFormat("EEE,dd-MMM-YY");
        dateLab.setText(s1.format(a));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                java.util.Date a = new java.util.Date();
                SimpleDateFormat s1 = new SimpleDateFormat("HH:mm:ss");
                clockLab.setText(s1.format(a));
            }

        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        BtnDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnNewAdmission = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtnPrimarySelection = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnExam = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnResult = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Minimize = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        clockLab = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        Registered = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        Selected = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Developer = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Year = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGround.setBackground(new java.awt.Color(204, 255, 204));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(0, 102, 51));

        BtnDetails.setBackground(new java.awt.Color(0, 204, 51));
        BtnDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDetailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDetailsMouseEntered(evt);
            }
        });
        BtnDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dash Board");
        BtnDetails.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 100, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/Details30.png"))); // NOI18N
        BtnDetails.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        BtnNewAdmission.setBackground(new java.awt.Color(0, 153, 51));
        BtnNewAdmission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNewAdmissionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNewAdmissionMouseEntered(evt);
            }
        });
        BtnNewAdmission.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Admission");
        BtnNewAdmission.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/admission30.png"))); // NOI18N
        BtnNewAdmission.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        BtnPrimarySelection.setBackground(new java.awt.Color(0, 153, 51));
        BtnPrimarySelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPrimarySelectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrimarySelectionMouseEntered(evt);
            }
        });
        BtnPrimarySelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Primary Selection");
        BtnPrimarySelection.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 130, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/PrimarySelected30.png"))); // NOI18N
        BtnPrimarySelection.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        BtnExam.setBackground(new java.awt.Color(0, 153, 51));
        BtnExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnExamMouseEntered(evt);
            }
        });
        BtnExam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Examination");
        BtnExam.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/Exam30.png"))); // NOI18N
        BtnExam.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        BtnResult.setBackground(new java.awt.Color(0, 153, 51));
        BtnResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnResultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnResultMouseEntered(evt);
            }
        });
        BtnResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin Options");
        BtnResult.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 130, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/Result30.png"))); // NOI18N
        BtnResult.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        BtnBack.setBackground(new java.awt.Color(0, 153, 51));
        BtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBackMouseEntered(evt);
            }
        });
        BtnBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Log Out");
        BtnBack.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/back30.png"))); // NOI18N
        BtnBack.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/MainLogo.png"))); // NOI18N

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnNewAdmission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnPrimarySelection, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addComponent(BtnExam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(SidePanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnNewAdmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPrimarySelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        BackGround.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Dash Board");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 10, 150, 32);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Information at a glaince");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(30, 50, 200, 19);

        BackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 850, 80));

        Minimize.setBackground(new java.awt.Color(255, 255, 255));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("-");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout MinimizeLayout = new javax.swing.GroupLayout(Minimize);
        Minimize.setLayout(MinimizeLayout);
        MinimizeLayout.setHorizontalGroup(
            MinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinimizeLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MinimizeLayout.setVerticalGroup(
            MinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10)
        );

        BackGround.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, -1));

        clockLab.setBackground(new java.awt.Color(255, 255, 255));
        clockLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clockLab.setForeground(new java.awt.Color(0, 0, 0));
        clockLab.setText("clock");
        BackGround.add(clockLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 60, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Time :");
        BackGround.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 30));

        dateLab.setBackground(new java.awt.Color(255, 255, 255));
        dateLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateLab.setForeground(new java.awt.Color(0, 0, 0));
        dateLab.setText("date");
        BackGround.add(dateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 110, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Date :");
        BackGround.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 30));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Registered");

        Registered.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        Registered.setText("0000");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Total  = ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(Registered)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registered, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(38, 38, 38))))
        );

        BackGround.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 660, 130));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Seleted");

        Selected.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        Selected.setText("0000");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Total  = ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(554, 554, 554))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Selected)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 577, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Selected, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        BackGround.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        Developer.setForeground(new java.awt.Color(0, 153, 51));
        Developer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeveloperMouseEntered(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("About Developer");

        javax.swing.GroupLayout DeveloperLayout = new javax.swing.GroupLayout(Developer);
        Developer.setLayout(DeveloperLayout);
        DeveloperLayout.setHorizontalGroup(
            DeveloperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeveloperLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel27)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        DeveloperLayout.setVerticalGroup(
            DeveloperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeveloperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackGround.add(Developer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 660, 40));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        BackGround.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Year :");
        BackGround.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 50, 30));

        Year.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Year.setForeground(new java.awt.Color(0, 0, 0));
        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        BackGround.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 130, 30));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Gender :");
        BackGround.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 30));

        Gender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(0, 0, 0));
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Male", "Female" }));
        BackGround.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDetailsMouseClicked

    private void BtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBackMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);           // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackMouseClicked

    private void BtnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBackMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        setColor(BtnBack);
        resetColor(Developer);
        Minimize.setBackground(new Color(222, 222, 222));          // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackMouseEntered

    private void BtnDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetailsMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        Minimize.setBackground(new Color(222, 222, 222)); // TODO add your handling code here:
    }//GEN-LAST:event_BtnDetailsMouseEntered

    private void BtnNewAdmissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNewAdmissionMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        setColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_BtnNewAdmissionMouseEntered

    private void BtnPrimarySelectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrimarySelectionMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        setColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrimarySelectionMouseEntered

    private void BtnExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExamMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        setColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        Minimize.setBackground(new Color(222, 222, 222));          // TODO add your handling code here:
    }//GEN-LAST:event_BtnExamMouseEntered

    private void BtnResultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResultMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        setColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        Minimize.setBackground(new Color(222, 222, 222));          // TODO add your handling code here:
    }//GEN-LAST:event_BtnResultMouseEntered

    private void BtnNewAdmissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNewAdmissionMouseClicked
        new Admission().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNewAdmissionMouseClicked

    private void BtnPrimarySelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrimarySelectionMouseClicked
        new PrimarySelection().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrimarySelectionMouseClicked

    private void BtnExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExamMouseClicked
        new Examination().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnExamMouseClicked

    private void BtnResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResultMouseClicked
        new AdminOptions().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnResultMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        setColor(Minimize);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        resetColor(Developer);
        setColor(Minimize);        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseEntered

    private void DeveloperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeveloperMouseEntered
        BtnDetails.setBackground(new Color(0, 204, 51));
        setColor(Developer);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(BtnResult);
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_DeveloperMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (Gender.getSelectedItem().equals("All")) {
                if (Year.getSelectedItem().equals("All")) {
                    String sql = ("select count(RegistrationID) from registration");
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        Registered.setText(rs.getString("count(RegistrationID)"));
                    }
                } else {
                    String sql = ("select count(RegistrationID) from registration where year = ?");
                    pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt((String) Year.getSelectedItem()));
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        Registered.setText(rs.getString("count(RegistrationID)"));
                    }
                }
            } else {
                if (Year.getSelectedItem().equals("All")) {
                    String sql = ("select count(RegistrationID) from registration where Gender = ?");
                    pst = con.prepareStatement(sql);
                    pst.setString(1, String.valueOf(Gender.getSelectedItem()));
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        Registered.setText(rs.getString("count(RegistrationID)"));
                    }
                } else {

                    String sql = ("select count(RegistrationID) from registration where Gender = ? and year = ?");
                    pst = con.prepareStatement(sql);
                    pst.setString(1, String.valueOf(Gender.getSelectedItem()));
                    pst.setInt(2, Integer.parseInt((String) Year.getSelectedItem()));
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        Registered.setText(rs.getString("count(RegistrationID)"));

                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    void setColor(JPanel panel) {
        panel.setBackground(new Color(204, 0, 0));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(0, 153, 51));
    }

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel BtnBack;
    private javax.swing.JPanel BtnDetails;
    private javax.swing.JPanel BtnExam;
    private javax.swing.JPanel BtnNewAdmission;
    private javax.swing.JPanel BtnPrimarySelection;
    private javax.swing.JPanel BtnResult;
    private javax.swing.JPanel Developer;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JPanel Minimize;
    private javax.swing.JLabel Registered;
    private javax.swing.JLabel Selected;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JLabel clockLab;
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
