package com.sumames.sir.ui.people;

import com.sumames.sir.Main;
import com.sumames.sir.ui.MainFrame;
import com.sumames.sir.helper.Support;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sutandi
 */
public class PeopleMenu extends javax.swing.JPanel {

    /**
     * Creates new form PeopleMenu
     */
    public PeopleMenu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEmployer = new javax.swing.JButton();
        btCustomer = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));

        btEmployer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/people/CustomerButton.png"))); // NOI18N
        btEmployer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btEmployer.setContentAreaFilled(false);
        btEmployer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEmployerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEmployerMouseExited(evt);
            }
        });
        btEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmployerActionPerformed(evt);
            }
        });
        add(btEmployer);

        btCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sumames/sir/resources/image/people/EmployerButton.png"))); // NOI18N
        btCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btCustomer.setContentAreaFilled(false);
        btCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCustomerMouseExited(evt);
            }
        });
        btCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustomerActionPerformed(evt);
            }
        });
        add(btCustomer);
    }// </editor-fold>//GEN-END:initComponents

    private void btEmployerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmployerMouseEntered
        btEmployer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 90, 43), 4));
    }//GEN-LAST:event_btEmployerMouseEntered

    private void btEmployerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmployerMouseExited
        btEmployer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
    }//GEN-LAST:event_btEmployerMouseExited

    private void btCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCustomerMouseEntered
        btCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 90, 43), 4));
    }//GEN-LAST:event_btCustomerMouseEntered

    private void btCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCustomerMouseExited
        btCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
    }//GEN-LAST:event_btCustomerMouseExited

    private void btEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmployerActionPerformed
        new Support().NewTab(Main.getFrame().getTab(), new CustomerList(), "Customer List");
    }//GEN-LAST:event_btEmployerActionPerformed

    private void btCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustomerActionPerformed
        new Support().NewTab(Main.getFrame().getTab(), new EmployerList(), "Employer List");
    }//GEN-LAST:event_btCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCustomer;
    private javax.swing.JButton btEmployer;
    // End of variables declaration//GEN-END:variables
}
