/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnccadmission;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author mehed
 */
public class AdminOptions extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public AdminOptions() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Minimize = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Duty = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Result = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        clockLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGround.setBackground(new java.awt.Color(204, 255, 204));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(0, 102, 51));

        BtnDetails.setBackground(new java.awt.Color(0, 153, 51));
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

        BtnResult.setBackground(new java.awt.Color(0, 204, 51));
        BtnResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnResultMouseEntered(evt);
            }
        });
        BtnResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin Options");
        BtnResult.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 50));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Admin Options");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 200, 32);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Confidential ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 50, 170, 19);

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

        Duty.setBackground(new java.awt.Color(0, 153, 51));
        Duty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DutyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DutyMouseEntered(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Assign Duties For Examination");

        javax.swing.GroupLayout DutyLayout = new javax.swing.GroupLayout(Duty);
        Duty.setLayout(DutyLayout);
        DutyLayout.setHorizontalGroup(
            DutyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DutyLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(150, 150, 150))
        );
        DutyLayout.setVerticalGroup(
            DutyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DutyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackGround.add(Duty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 550, 50));

        Result.setBackground(new java.awt.Color(0, 153, 51));
        Result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResultMouseEntered(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Result");

        javax.swing.GroupLayout ResultLayout = new javax.swing.GroupLayout(Result);
        Result.setLayout(ResultLayout);
        ResultLayout.setHorizontalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel19)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        ResultLayout.setVerticalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackGround.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Please Select an option ");
        BackGround.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 280, 40));
        BackGround.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 260, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Date :");
        BackGround.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 30));

        dateLab.setBackground(new java.awt.Color(255, 255, 255));
        dateLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateLab.setForeground(new java.awt.Color(0, 0, 0));
        dateLab.setText("date");
        BackGround.add(dateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 110, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Time :");
        BackGround.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 40, 30));

        clockLab.setBackground(new java.awt.Color(255, 255, 255));
        clockLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clockLab.setForeground(new java.awt.Color(0, 0, 0));
        clockLab.setText("clock");
        BackGround.add(clockLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetailsMouseClicked
        new DashBoard().setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_BtnDetailsMouseClicked

    private void BtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBackMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);              // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackMouseClicked

    private void BtnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBackMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        setColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));          // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackMouseEntered

    private void BtnDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetailsMouseEntered
        setColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        resetColor(Result);
        resetColor(Duty);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222)); // TODO add your handling code here:
    }//GEN-LAST:event_BtnDetailsMouseEntered

    private void BtnNewAdmissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNewAdmissionMouseEntered
        resetColor(BtnDetails);
        resetColor(Result);
        resetColor(Duty);
        setColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_BtnNewAdmissionMouseEntered

    private void BtnPrimarySelectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrimarySelectionMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(Result);
        resetColor(Duty);
        setColor(BtnPrimarySelection);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrimarySelectionMouseEntered

    private void BtnExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExamMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(Result);
        resetColor(Duty);
        setColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));          // TODO add your handling code here:
    }//GEN-LAST:event_BtnExamMouseEntered

    private void BtnResultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResultMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(Result);
        resetColor(Duty);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));          // TODO add your handling code here:
    }//GEN-LAST:event_BtnResultMouseEntered

    private void BtnNewAdmissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNewAdmissionMouseClicked
        new Admission().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNewAdmissionMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(Result);
        resetColor(Duty);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        setColor(Minimize);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(Result);
        resetColor(Duty);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        setColor(Minimize);        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseEntered

    private void BtnPrimarySelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrimarySelectionMouseClicked
        new PrimarySelection().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrimarySelectionMouseClicked

    private void BtnExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExamMouseClicked
        new Examination().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnExamMouseClicked

    private void DutyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DutyMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        resetColor(Result);
        setColor(Duty);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_DutyMouseEntered

    private void ResultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultMouseEntered
        resetColor(BtnDetails);
        resetColor(BtnNewAdmission);
        resetColor(BtnPrimarySelection);
        setColor(Result);
        resetColor(Duty);
        resetColor(BtnExam);
        BtnResult.setBackground(new Color(0, 204, 51));
        resetColor(BtnBack);
        Minimize.setBackground(new Color(222, 222, 222));         // TODO add your handling code here:
    }//GEN-LAST:event_ResultMouseEntered

    private void ResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultMouseClicked
        new Result().setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_ResultMouseClicked

    private void DutyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DutyMouseClicked
        new AssignDutiesForExamination().setVisible(true);
        this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_DutyMouseClicked
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
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptions().setVisible(true);
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
    private javax.swing.JPanel Duty;
    private javax.swing.JPanel Minimize;
    private javax.swing.JPanel Result;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel clockLab;
    private javax.swing.JLabel dateLab;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
