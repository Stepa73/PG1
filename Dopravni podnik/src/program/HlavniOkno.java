/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Arrays;
import javax.swing.JOptionPane;
import model.Autobus;
import model.Trolejbus;
import model.Vozidlo;

/**
 *
 * @author GAZi
 */
public class HlavniOkno extends javax.swing.JFrame {

    private int aktualni = -1;
    private final int CISLO_VYCHOZI = -1;
    
    private Vozidlo[] vozidla;
    
    /**
     * Creates new form HlavniOkno
     */
    public HlavniOkno() {
        initComponents();
        
        vozidla = new Vozidlo[0];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minusButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        vystupLabel = new javax.swing.JLabel();
        pridejAutobusButton = new javax.swing.JButton();
        pridejTrolejbus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dopravní Podinik");

        minusButton.setText("<<");
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });

        plusButton.setText(">>");
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusButtonMouseClicked(evt);
            }
        });

        vystupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vystupLabel.setText("-1");
        vystupLabel.setToolTipText("");

        pridejAutobusButton.setText("Přidat autobus");
        pridejAutobusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pridejAutobusButtonMouseClicked(evt);
            }
        });

        pridejTrolejbus.setText("Přidat trolejbus");
        pridejTrolejbus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pridejTrolejbusMouseClicked(evt);
            }
        });

        jButton1.setText("upravit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridejAutobusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pridejTrolejbus))
                    .addComponent(jButton1))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vystupLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plusButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minusButton)
                    .addComponent(plusButton)
                    .addComponent(pridejAutobusButton)
                    .addComponent(pridejTrolejbus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vystupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Stisknutí mínus
    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        // Snížení hodnoty
        if(--this.aktualni < this.CISLO_VYCHOZI) this.aktualni = this.vozidla.length - 1;
        
        // Číslo zpět do pole
        vystupLabel.setText(String.valueOf(this.aktualni));
    }//GEN-LAST:event_minusButtonMouseClicked

    // Stisknutí plus
    private void plusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseClicked
        // Snížení hodnoty
        if(++this.aktualni >= this.vozidla.length) this.aktualni = this.CISLO_VYCHOZI;
        
        // Číslo zpět do pole
        vystupLabel.setText(String.valueOf(this.aktualni));
    }//GEN-LAST:event_plusButtonMouseClicked

    private void pridejAutobusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pridejAutobusButtonMouseClicked
        AutobusDialog dialog = new AutobusDialog(this, true);
        dialog.setVisible(true);
        
        if(dialog.getAutobus() != null) {
            this.vozidla = Arrays.copyOf(vozidla, vozidla.length + 1);
            
            vozidla[vozidla.length - 1] = dialog.getAutobus();
        }
        
        dialog.dispose();
    }//GEN-LAST:event_pridejAutobusButtonMouseClicked

    private void pridejTrolejbusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pridejTrolejbusMouseClicked
        TrolejbusDialog dialog = new TrolejbusDialog(this, true);
        dialog.setVisible(true);
        
        if(dialog.getTrolejbus() != null) {
            this.vozidla = Arrays.copyOf(vozidla, vozidla.length + 1);
            
            vozidla[vozidla.length - 1] = dialog.getTrolejbus();
        }
        
        dialog.dispose();
    }//GEN-LAST:event_pridejTrolejbusMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     if (aktualni < 0) {
         JOptionPane.showMessageDialog(this, "Není vybráno žádné vozidlo");
     return;
     }
     if (vozidla[aktualni] instanceof Trolejbus) {
     TrolejbusDialog dialog = new TrolejbusDialog(this, true);
     dialog.setTrolejbus((Trolejbus) this.vozidla[this.aktualni]);
     dialog.setVisible(true);
     dialog.dispose();
     }
       if (vozidla [aktualni] instanceof Autobus) {
     AutobusDialog dialog = new AutobusDialog(this, true);
     dialog.setAutobus((Autobus ) this.vozidla[this.aktualni]);
     dialog.setVisible(true);
     dialog.dispose();
     }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavniOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pridejAutobusButton;
    private javax.swing.JButton pridejTrolejbus;
    private javax.swing.JLabel vystupLabel;
    // End of variables declaration//GEN-END:variables

}
