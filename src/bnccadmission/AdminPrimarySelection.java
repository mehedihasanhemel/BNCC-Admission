/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnccadmission;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author mehed
 */
public class AdminPrimarySelection extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;

    /**
     * Creates new form DashBoard
     */
    public AdminPrimarySelection() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Minimize = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Year = new javax.swing.JTextField();
        btnSearch = new rojeru_san.RSButton();
        jLabel3 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnClear1 = new rojeru_san.RSButton();
        btnClear = new rojeru_san.RSButton();
        btnBack = new rojeru_san.RSButton();
        btnBack1 = new rojeru_san.RSButton();
        jLabel20 = new javax.swing.JLabel();
        clockLab = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGround.setBackground(new java.awt.Color(204, 255, 204));
        BackGround.setMinimumSize(new java.awt.Dimension(1100, 700));
        BackGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackGroundMouseEntered(evt);
            }
        });
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Confidential ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResIMG/Logo100.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 110));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Admission");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, -1));

        BackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1100, 110));

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

        RTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PSID", "Form No", "Name", "University ID", "Gender", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(RTable);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Year and Gender Select The Rejected Name");

        Year.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setColorHover(new java.awt.Color(255, 0, 0));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Year       :");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Male", "Female" }));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender  :");

        btnClear1.setBackground(new java.awt.Color(0, 0, 0));
        btnClear1.setText("Reject");
        btnClear1.setColorHover(new java.awt.Color(255, 0, 0));
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Exell");
        btnClear.setColorHover(new java.awt.Color(255, 0, 0));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.setColorHover(new java.awt.Color(255, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBack1.setBackground(new java.awt.Color(0, 0, 0));
        btnBack1.setText("Forword");
        btnBack1.setColorHover(new java.awt.Color(255, 0, 0));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBack1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnClear1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        BackGround.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1100, 550));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Date :");
        BackGround.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 30));

        clockLab.setBackground(new java.awt.Color(255, 255, 255));
        clockLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clockLab.setForeground(new java.awt.Color(0, 0, 0));
        clockLab.setText("clock");
        BackGround.add(clockLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 60, 30));

        dateLab.setBackground(new java.awt.Color(255, 255, 255));
        dateLab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateLab.setForeground(new java.awt.Color(0, 0, 0));
        dateLab.setText("date");
        BackGround.add(dateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 110, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Time :");
        BackGround.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 30));

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        setColor(Minimize);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        setColor(Minimize);        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseEntered

    private void BackGroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundMouseEntered
        resetColor(Minimize); // TODO add your handling code here:
    }//GEN-LAST:event_BackGroundMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        resetColor(Minimize);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            con = Connect.ConnectDB();
            if (Year.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Year", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (Gender.getSelectedItem().equals("All")) {
                String sql = "select * from registration where Year = ?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(Year.getText()));

            } else {
                String sql = "select * from registration where Year = ? and Gender = ?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(Year.getText()));
                pst.setString(2, String.valueOf(Gender.getSelectedItem()));
            }
            ResultSet rs = pst.executeQuery();

            DefaultTableModel tm = (DefaultTableModel) RTable.getModel();
            tm.setRowCount(0);
            //String sql = "insert into registration(FormNo,Name,UID,Department,Gender,PhoneNoPersonal,PhoneNoParents,EmailAddress,Year,Photo,IDCardCopy,RegistrationFee)values('" + FormNo.getText() + "','" + Name.getText() + "','" + UID.getText() + "','" + Dept.getSelectedItem() + "','" +Gen+ "','" +PPP.getText()+ "','" +PPG.getText()+ "','" +Email.getText()+ "','" +Year.getText()+ "','" +Photo+ "','" +UIDOK+ "','" +Fee+ "')";
            while (rs.next()) {
                Object o[] = {rs.getInt("RegistrationID"), rs.getInt("FormNo"), rs.getString("Name"), rs.getString("UID"), rs.getString("Department"), rs.getString("Gender"), rs.getString("PhoneNoPersonal"), rs.getString("PhoneNoParents"), rs.getString("EmailAddress"), rs.getString("Year"), rs.getString("Photo"), rs.getString("IDCardCopy"), rs.getString("RegistrationFee")};
                tm.addRow(o);
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }        // TODO add your handling code here:

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        con = Connect.ConnectDB();
        DefaultTableModel TB = (DefaultTableModel) RTable.getModel();
        if (RTable.getSelectedRowCount() == 1) {
            int row = RTable.getSelectedRow();
            int eve = (int) RTable.getModel().getValueAt(row, 0);

            try {
                //Insert one table to another table
                String sql = "insert into primaryrejection( PSID, RegistrationID, FormNo, Name, UID, Department, Gender, PhoneNoPersonal, PhoneNoParents, Email, Year)select PSID, RegistrationID, FormNo, Name, UID, Department, Gender, PhoneNoPersonal, PhoneNoParents, Email, Year from primaryselection where PSID = ?";
                pst1 = con.prepareStatement(sql);
                pst1.setInt(1, eve);
                pst1.execute();
                //Insert
                /*String sql1 = "insert into primaryrejection( PSID, RegistrationID, FormNo, Name, UID, Department, Gender, PhoneNoPersonal, PhoneNoParents, Email, Year)select PSID, RegistrationID, FormNo, Name, UID, Department, Gender, PhoneNoPersonal, PhoneNoParents, Email, Year form primaryselection where PSID = ?";
                pst = con.prepareStatement(sql1);
                pst.execute();*/

                // for Delete
                String delRow = "delete from primaryselection where PSID=" + eve;
                pst = con.prepareStatement(delRow);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Congratulation !!");
                TB.removeRow(RTable.getSelectedRow());
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            if (RTable.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty");
            } else {
                JOptionPane.showMessageDialog(this, "Select Single row for delete");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PrimarySelection().setVisible(true);
        this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //set Default Path
        String CurrentDirectoryFilePath = "C:\\Users\\Authentic\\Desktop";
        JFileChooser excelExportChooser = new JFileChooser(CurrentDirectoryFilePath);
        int excelChosser = excelExportChooser.showSaveDialog(null);
        if (excelChosser == JFileChooser.APPROVE_OPTION) {
            //add excel libery to class path
            XSSFWorkbook excelXSSfWorkbookExporter = new XSSFWorkbook();
            XSSFSheet excelSheet = excelXSSfWorkbookExporter.createSheet("JTable Data");

            // loop through jtable column and rows
            for (int i = 0; i < RTable.getRowCount(); i++) {
                XSSFRow excelRow = excelSheet.createRow(i);
                for (int j = 0; j < RTable.getColumnCount(); j++) {
                    XSSFCell excelCell = excelRow.createCell(j);

                    excelCell.setCellValue(RTable.getValueAt(i, j).toString());
                }

            }

            // create unique name
            FileOutputStream excelFIS;
            BufferedOutputStream excelBOU;

            try {
                excelFIS = new FileOutputStream(excelExportChooser.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFIS);
                excelXSSfWorkbookExporter.write(excelBOU);
                excelBOU.close();
                excelXSSfWorkbookExporter.close();
            } catch (IOException iOException) {

            }

        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try {
            con = Connect.ConnectDB();
            if (Year.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Year of Registration", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (Gender.getSelectedItem().equals("All")) {
                String sql = "select * from primaryselection where Year = ?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(Year.getText()));

            } else {
                String sql = "select * from primaryselection where Year = ? and Gender = ?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(Year.getText()));
                pst.setString(2, String.valueOf(Gender.getSelectedItem()));
            }
            ResultSet rs = pst.executeQuery();

            DefaultTableModel tm = (DefaultTableModel) RTable.getModel();
            tm.setRowCount(0);
            //String sql = "insert into registration(FormNo,Name,UID,Department,Gender,PhoneNoPersonal,PhoneNoParents,EmailAddress,Year,Photo,IDCardCopy,RegistrationFee)values('" + FormNo.getText() + "','" + Name.getText() + "','" + UID.getText() + "','" + Dept.getSelectedItem() + "','" +Gen+ "','" +PPP.getText()+ "','" +PPG.getText()+ "','" +Email.getText()+ "','" +Year.getText()+ "','" +Photo+ "','" +UIDOK+ "','" +Fee+ "')";
            while (rs.next()) {
                Object o[] = {rs.getInt("PSID"), rs.getInt("FormNo"), rs.getString("Name"), rs.getString("UID"), rs.getString("Gender"), rs.getString("Year")};
                tm.addRow(o);
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        try {
            //primary selection to Exam Forword
            String sql = "insert into exam(PSID, Name, UID, Department, Gender, PhoneNo, Year) select PSID,Name,UID,Department,Gender,PhoneNoPersonal,Year from primaryselection where year = ?";
            pst1 = con.prepareStatement(sql);
            pst1.setInt(1, Integer.parseInt(Year.getText()));
            pst1.execute();
            /*search Again    
            if (Gender.getSelectedItem().equals("All")) {
                String sql1 = "select * from primaryselection where Year = ?";
                pst2 = con.prepareStatement(sql1);
                pst2.setInt(1, Integer.parseInt(Year.getText()));

            } else {
                String sql1 = "select * from primaryselection where Year = ? and Gender = ?";
                pst2 = con.prepareStatement(sql1);
                pst2.setInt(1, Integer.parseInt(Year.getText()));
                pst2.setString(2, String.valueOf(Gender.getSelectedItem()));
            }
            ResultSet rs = pst2.executeQuery();

            DefaultTableModel tm = (DefaultTableModel) RTable.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getInt("RegistrationID"), rs.getInt("FormNo"), rs.getString("Name"), rs.getString("UID"),  rs.getString("Gender"), rs.getString("Year")};
                tm.addRow(o);
            } */

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "You have Already forwarded Recruit Batch","Warning !!!,", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBack1ActionPerformed
    void setColor(JPanel panel) {
        panel.setBackground(new Color(204, 0, 0));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(255, 255, 255));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPrimarySelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JPanel Minimize;
    private javax.swing.JTable RTable;
    private javax.swing.JTextField Year;
    private rojeru_san.RSButton btnBack;
    private rojeru_san.RSButton btnBack1;
    private rojeru_san.RSButton btnClear;
    private rojeru_san.RSButton btnClear1;
    private rojeru_san.RSButton btnSearch;
    private javax.swing.JLabel clockLab;
    private javax.swing.JLabel dateLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}