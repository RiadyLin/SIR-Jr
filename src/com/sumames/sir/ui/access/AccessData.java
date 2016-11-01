/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumames.sir.ui.access;

import com.sumames.sir.Main;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.entity.LoginAccessDetail;
import com.sumames.sir.helper.AppUtil;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My pc
 */
public class AccessData extends javax.swing.JPanel {

    private final static String[] MENU = {"Customer", "Employer", "Garage", "Rent", "Purchase Request", "Purchase Order", "Purchase Payment", "Report"};

    /**
     * Creates new form EmployerInput
     */
    public AccessData() {
        initComponents();
        LoadingData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSave = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAccess = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextArea();

        setFont(new java.awt.Font("Noto Serif", 0, 14)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(844, 417));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/buttons/6-01.png"))); // NOI18N
        btSave.setBorderPainted(false);
        btSave.setContentAreaFilled(false);
        btSave.setPreferredSize(new java.awt.Dimension(65, 23));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        tfName.setFont(getFont());
        tfName.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setFont(getFont());
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name :");

        jLabel4.setFont(getFont());
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description :");

        tbAccess.setFont(getFont());
        tbAccess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "View", "Add", "Edit", "Delete", "Print", "Export"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccess.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JTextField()));
        tbAccess.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tbAccess.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tbAccess.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tbAccess.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tbAccess.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        tbAccess.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(new JCheckBox()));
        jScrollPane2.setViewportView(tbAccess);

        tfDescription.setColumns(20);
        tfDescription.setRows(5);
        jScrollPane1.setViewportView(tfDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        SavingData();

    }//GEN-LAST:event_btSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbAccess;
    private javax.swing.JTextArea tfDescription;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
    public void LoadingData() {
        DefaultTableModel dtm = (DefaultTableModel) tbAccess.getModel();
        for (String MENU1 : MENU) {
            dtm.addRow(new Object[]{MENU1, true, true, true, true, true, true});
        }
    }

    public void SavingData() {
        int LoadingValue = 0;
        LoginAccess la = new LoginAccess();
        la.setName(tfName.getText());
        la.setNote(tfDescription.getText());
        Main.getFrame().getLoadingBar().setValue(LoadingValue + 10);
        AppUtil.getService().save(la);
        
        for (int i = 0; i < tbAccess.getRowCount(); i++) {

            LoginAccessDetail laDetail = new LoginAccessDetail();
            laDetail.setAccessRecordId(la.getRecordId());
            laDetail.setNameMenu(tbAccess.getValueAt(i, 0).toString());
            laDetail.setViewData((Boolean) tbAccess.getValueAt(i, 1));
            laDetail.setAddData((Boolean) tbAccess.getValueAt(i, 2));
            laDetail.setEditData((Boolean) tbAccess.getValueAt(i, 3));
            laDetail.setDeleteData((Boolean) tbAccess.getValueAt(i, 4));
            laDetail.setPrint((Boolean) tbAccess.getValueAt(i, 5));
            laDetail.setExport((Boolean) tbAccess.getValueAt(i, 6));
//            laDetail.setViewData(Boolean.TRUE);
//            laDetail.setAddData(Boolean.TRUE);
//            laDetail.setEditData(Boolean.TRUE);
//            laDetail.setDeleteData(Boolean.TRUE);
//            laDetail.setPrint(Boolean.TRUE);
//            laDetail.setExport(Boolean.TRUE);
            AppUtil.getService().save(laDetail);
            Main.getFrame().getLoadingBar().setValue(LoadingValue + 10);

        }
        Main.getFrame().getLoadingBar().setValue(LoadingValue + 10);
        JOptionPane.showMessageDialog(null, " records, Done!");
        Main.getFrame().getLoadingBar().setValue(LoadingValue = 0);
    }

}