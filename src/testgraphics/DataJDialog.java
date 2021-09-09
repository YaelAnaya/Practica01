/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgraphics;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author yaelanaya
 */
public class DataJDialog extends javax.swing.JDialog {

    /**
     * Creates new form dataJDialog
     */
    public DataJDialog(java.awt.Frame parent, boolean modal, boolean isSpiralSelected) {
        super(parent, modal);
        initComponents();
        isSpiral(isSpiralSelected);
    }

    private DataJDialog(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIncrementTextField() {
        if (!incrementTextField.getText().isBlank()
            && incrementTextField.getText().chars().allMatch(Character::isDigit)) {
            return Integer.parseInt(incrementTextField.getText());
        }

        return 0;
    }

    public int getRadiumTextField() {
        if (!radiumTextField.getText().isBlank()
            && radiumTextField.getText().chars().allMatch(Character::isDigit)) {
            return Integer.parseInt(radiumTextField.getText());
        }

        return 0;
    }

    public int getSizeTextField() {
        if (!sizeTextField.getText().isBlank()
             && sizeTextField.getText().chars().allMatch(Character::isDigit)) {
            return Integer.parseInt(sizeTextField.getText());
        }
        return 0;
    }

    public int getxPositionTextField() {
        if (!xPositionTextField.getText().isBlank()
            && xPositionTextField.getText().chars().allMatch(Character::isDigit)) {
            return Integer.parseInt(xPositionTextField.getText());
        }
        return 0;
    }

    public int getyPositionTextField() {
        if (!yPositionTextField.getText().isBlank()
            && yPositionTextField.getText().chars().allMatch(Character::isDigit)) {
            return Integer.parseInt(yPositionTextField.getText());
        }
        return 0;
    }

    private void isSpiral(boolean isSpiralSelected) {
        if (!isSpiralSelected) {
            setBounds(new Rectangle(800, 300, 250, 190));
        }

        incrementLabel.setVisible(isSpiralSelected);
        incrementTextField.setVisible(isSpiralSelected);
        radiumLabel.setVisible(isSpiralSelected);
        radiumTextField.setVisible(isSpiralSelected);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xPositionLabel = new javax.swing.JLabel();
        xPositionTextField = new javax.swing.JTextField();
        yPositionLabel = new javax.swing.JLabel();
        yPositionTextField = new javax.swing.JTextField();
        sizeLabel = new javax.swing.JLabel();
        sizeTextField = new javax.swing.JTextField();
        radiumLabel = new javax.swing.JLabel();
        radiumTextField = new javax.swing.JTextField();
        incrementLabel = new javax.swing.JLabel();
        incrementTextField = new javax.swing.JTextField();
        agreeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new Rectangle(800, 300, 250, 260));
        setLocation(new java.awt.Point(800, 300));
        setMinimumSize(new java.awt.Dimension(250, 120));
        setName("Datos de la Figura"); // NOI18N
        setPreferredSize(new java.awt.Dimension(240, 260));
        setSize(new java.awt.Dimension(250, 260));

        xPositionLabel.setText("Posición en [X]:");
        xPositionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        xPositionTextField.setMinimumSize(new java.awt.Dimension(86, 21));
        xPositionTextField.setPreferredSize(new java.awt.Dimension(86, 26));
        xPositionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xPositionTextFieldActionPerformed(evt);
            }
        });

        yPositionLabel.setText("Posición en [Y]:");
        yPositionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        yPositionTextField.setMinimumSize(new java.awt.Dimension(86, 21));
        yPositionTextField.setPreferredSize(new java.awt.Dimension(86, 26));

        sizeLabel.setText("Tamaño:");
        sizeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        sizeTextField.setMinimumSize(new java.awt.Dimension(86, 21));
        sizeTextField.setPreferredSize(new java.awt.Dimension(86, 26));
        sizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeTextFieldActionPerformed(evt);
            }
        });

        radiumLabel.setText("Radio inical:");
        radiumLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        radiumTextField.setMinimumSize(new java.awt.Dimension(86, 26));
        radiumTextField.setPreferredSize(new java.awt.Dimension(86, 26));

        incrementLabel.setText("Incremento:");
        incrementLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        incrementTextField.setMinimumSize(new java.awt.Dimension(86, 21));
        incrementTextField.setPreferredSize(new java.awt.Dimension(86, 26));

        agreeButton.setText("Aceptar");
        agreeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(radiumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(sizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(incrementLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(incrementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yPositionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(xPositionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(xPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(agreeButton)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xPositionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yPositionLabel)
                    .addComponent(yPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeLabel)
                    .addComponent(sizeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiumLabel)
                    .addComponent(radiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incrementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incrementLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agreeButton)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agreeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreeButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_agreeButtonMouseClicked

    private void xPositionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xPositionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xPositionTextFieldActionPerformed

    private void sizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DataJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DataJDialog dialog;
                dialog = new DataJDialog(new javax.swing.JFrame(), false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agreeButton;
    private javax.swing.JLabel incrementLabel;
    private javax.swing.JTextField incrementTextField;
    private javax.swing.JLabel radiumLabel;
    private javax.swing.JTextField radiumTextField;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JLabel xPositionLabel;
    private javax.swing.JTextField xPositionTextField;
    private javax.swing.JLabel yPositionLabel;
    private javax.swing.JTextField yPositionTextField;
    // End of variables declaration//GEN-END:variables
}