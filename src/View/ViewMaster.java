/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Medina
 */
public class ViewMaster extends javax.swing.JFrame {

    /**
     * Creates new form Asuransi
     */
    public ViewMaster() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        PaneAsuransi = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuNasabah = new javax.swing.JMenuItem();
        MenuAdmin = new javax.swing.JMenuItem();
        MenuPolis = new javax.swing.JMenuItem();
        MenuAsuransi = new javax.swing.JMenuItem();
        MenuPembayaran = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout PaneAsuransiLayout = new javax.swing.GroupLayout(PaneAsuransi);
        PaneAsuransi.setLayout(PaneAsuransiLayout);
        PaneAsuransiLayout.setHorizontalGroup(
            PaneAsuransiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        PaneAsuransiLayout.setVerticalGroup(
            PaneAsuransiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        getContentPane().add(PaneAsuransi, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("Master");

        MenuNasabah.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        MenuNasabah.setText("Nasabah");
        MenuNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNasabahActionPerformed(evt);
            }
        });
        jMenu1.add(MenuNasabah);

        MenuAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuAdmin.setText("Admin");
        MenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAdmin);

        MenuPolis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        MenuPolis.setText("Polis");
        MenuPolis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPolisActionPerformed(evt);
            }
        });
        jMenu1.add(MenuPolis);

        MenuAsuransi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        MenuAsuransi.setText("Asuransi");
        MenuAsuransi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAsuransiActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAsuransi);

        jMenuBar1.add(jMenu1);

        MenuPembayaran.setText("Pembayaran");
        MenuPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPembayaranActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuPembayaran);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNasabahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuNasabahActionPerformed

    private void MenuPolisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPolisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuPolisActionPerformed

    private void MenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminActionPerformed
        ViewAdmin as = new ViewAdmin();
        as.show();
        PaneAsuransi.add(as);
        as.setVisible(true);
    }//GEN-LAST:event_MenuAdminActionPerformed

    private void MenuAsuransiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAsuransiActionPerformed
        ViewAsuransi as = new ViewAsuransi();
        as.show();
        PaneAsuransi.add(as);
        as.setVisible(true);
    }//GEN-LAST:event_MenuAsuransiActionPerformed

    private void MenuPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuPembayaranActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAdmin;
    private javax.swing.JMenuItem MenuAsuransi;
    private javax.swing.JMenuItem MenuNasabah;
    private javax.swing.JMenu MenuPembayaran;
    private javax.swing.JMenuItem MenuPolis;
    private javax.swing.JDesktopPane PaneAsuransi;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}