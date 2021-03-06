/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.NasabahController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Medina
 */
public class ViewNasabah extends javax.swing.JInternalFrame {
    private String header[] = {"No","KTP", "No Polis","Nama Nasabah","Tgl Lahir","Status",
        "Pekerjaan","Penghasilan","Alamat","Admin"};
    private String headerTable[] = {"ktp","noPolis","nmNasabah","tglLahir","status",
        "pekerjaan","penghasilan","alamat","idAdmin"};
    public NasabahController nn;
//    private boolean hasil;
    private List<String> datas; 

    /**
     * Creates new form ViewNasabah
     */
    public ViewNasabah() {
        initComponents();
        datas = new ArrayList<>();
        nn = new NasabahController();
        datas = nn.bindingAll(tblNasabah, header);
        nn.loadAdmin(cmbIdAdmin);
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNasabah = new javax.swing.JPanel();
        lblKTP = new java.awt.Label();
        lblIdAdmin = new java.awt.Label();
        lblNamaNasabah = new java.awt.Label();
        lblTglLahir = new java.awt.Label();
        lblStatus = new java.awt.Label();
        lblPekerjaan = new java.awt.Label();
        lblPenghasilan = new java.awt.Label();
        lblAlamat = new java.awt.Label();
        txtKTP = new javax.swing.JTextField();
        txtNamaNasabah = new javax.swing.JTextField();
        txtPekerjaan = new javax.swing.JTextField();
        txtPenghasilan = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        lblNoPolis = new java.awt.Label();
        txtNoPolis = new javax.swing.JTextField();
        cmbIdAdmin = new javax.swing.JComboBox<>();
        txtTglLahir = new com.toedter.calendar.JDateChooser();
        cmbStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNasabah = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Data Nasabah");

        pnlNasabah.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Nasabah"));
        pnlNasabah.setToolTipText("Detail Nasabah");
        pnlNasabah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblKTP.setText("KTP");

        lblIdAdmin.setText("ID Admin");

        lblNamaNasabah.setText("Nama Nasabah");

        lblTglLahir.setText("Tanggal Lahir");

        lblStatus.setText("Status");

        lblPekerjaan.setText("Pekerjaan");

        lblPenghasilan.setText("Penghasilan");

        lblAlamat.setText("Alamat");

        txtKTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKTPKeyPressed(evt);
            }
        });

        txtNamaNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaNasabahActionPerformed(evt);
            }
        });

        txtPekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPekerjaanActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        lblNoPolis.setText("No Polis");

        cmbIdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdAdminActionPerformed(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAJANG", "MENIKAH" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNasabahLayout = new javax.swing.GroupLayout(pnlNasabah);
        pnlNasabah.setLayout(pnlNasabahLayout);
        pnlNasabahLayout.setHorizontalGroup(
            pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNasabahLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNasabahLayout.createSequentialGroup()
                                .addComponent(lblNamaNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtNamaNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNasabahLayout.createSequentialGroup()
                                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtKTP, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNasabahLayout.createSequentialGroup()
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlNasabahLayout.createSequentialGroup()
                                .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNasabahLayout.createSequentialGroup()
                                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSimpan)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(pnlNasabahLayout.createSequentialGroup()
                                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        pnlNasabahLayout.setVerticalGroup(
            pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNasabahLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addComponent(lblKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addComponent(txtKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamaNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addGap(64, 64, 64))
                    .addGroup(pnlNasabahLayout.createSequentialGroup()
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNasabahLayout.createSequentialGroup()
                                .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNasabahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );

        tblNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNasabah.setToolTipText("Data Nasabah");
        tblNasabah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNasabahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNasabah);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KTP", "No Polis", "Admin" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("------DATA NASABAH------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(pnlNasabah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlNasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaNasabahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaNasabahActionPerformed

    private void txtPekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPekerjaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPekerjaanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        boolean hasil = false;
        if (!txtKTP.isEnabled()) {
            hasil = nn.update(
                txtKTP.getText(),
                txtNoPolis.getText(),
                txtNamaNasabah.getText(),
                txtTglLahir.getDate().getTime()+"",
                cmbStatus.getSelectedItem().toString(),
                txtPekerjaan.getText(),
                txtPenghasilan.getText(),
                txtAlamat.getText(),
                cmbIdAdmin.getSelectedItem().toString());
            datas = nn.bindingAll(tblNasabah, header);
        }
        else {
            hasil = nn.insert(
                txtKTP.getText(),
                txtNoPolis.getText(),
                txtNamaNasabah.getText(),
                txtTglLahir.getDate().getTime()+"",
                cmbStatus.getSelectedItem().toString(),
                txtPekerjaan.getText(),
                txtPenghasilan.getText(),
                txtAlamat.getText(),
                cmbIdAdmin.getSelectedItem().toString());
            datas = nn.bindingAll(tblNasabah, header);            
        }
        if (txtKTP.isEnabled()) {
            ViewPembayaran as = new ViewPembayaran();
             this.getParent().add(as);
            as.setVisible(true);
        }
        txtKTP.setEnabled(true);
        btnSimpan.setEnabled(true);
        String pesan = "gagal menginputkan data";
        if (hasil) {
            pesan = "berhasil menginputkan data";
        }
        JOptionPane.showMessageDialog(this, pesan);
        nn.bindingAll(tblNasabah, header);
        reset();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Apakah anda yakin akan menghapus data ini?");
        if (i==0) {
            String pesan = "Gagal Hapus";
            boolean hasil = nn.delete(txtNoPolis.getText());
            if (hasil){
                pesan = "Berhasil Hapus";
            }
            JOptionPane.showMessageDialog(this, pesan);
            nn.bindingAll(tblNasabah, header);
        }
        reset();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblNasabahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNasabahMouseClicked
       int row = tblNasabah.getSelectedRow();
        txtKTP.setText(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 1)+"");
       txtNoPolis.setText(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 2)+"");
       txtNamaNasabah.setText(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 3)+"");
       txtTglLahir.setDate((Date) tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 4));
       cmbStatus.setSelectedItem(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 5)+"");
       txtPekerjaan.setText(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 6)+"");
       txtPenghasilan.setText(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 7)+"");
       txtAlamat.setText(tblNasabah.getValueAt(tblNasabah.getSelectedRow(), 8)+"");
       cmbIdAdmin.setSelectedItem(getCombo(true).get(row));
       txtKTP.setEnabled(false);
       btnSimpan.setEnabled(true);
       btnHapus.setEnabled(true);
    }//GEN-LAST:event_tblNasabahMouseClicked

    private void cmbIdAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdAdminActionPerformed

    }//GEN-LAST:event_cmbIdAdminActionPerformed

    private void txtKTPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKTPKeyPressed
        // TODO add your handling code here:
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_txtKTPKeyPressed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        datas = new ArrayList<>(); 
        datas = nn.bindingSearch(tblNasabah, header, 
                headerTable[cmbKategori.getSelectedIndex()], 
                txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbIdAdmin;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lblAlamat;
    private java.awt.Label lblIdAdmin;
    private java.awt.Label lblKTP;
    private java.awt.Label lblNamaNasabah;
    private java.awt.Label lblNoPolis;
    private java.awt.Label lblPekerjaan;
    private java.awt.Label lblPenghasilan;
    private java.awt.Label lblStatus;
    private java.awt.Label lblTglLahir;
    private javax.swing.JPanel pnlNasabah;
    private javax.swing.JTable tblNasabah;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKTP;
    private javax.swing.JTextField txtNamaNasabah;
    private javax.swing.JTextField txtNoPolis;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JTextField txtPenghasilan;
    private com.toedter.calendar.JDateChooser txtTglLahir;
    // End of variables declaration//GEN-END:variables

private void reset(){
        txtKTP.setText("");
        txtNamaNasabah.setText("");
        txtNoPolis.setText("");
        txtAlamat.setText("");
        txtPekerjaan.setText("");
        txtPenghasilan.setText("");
        txtTglLahir.setDate(new Date());
        cmbIdAdmin.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
        txtCari.setText("");
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false); 
        txtKTP.setEnabled(true);
    }


    private List<String> getCombo(boolean isAdmin){
        List<String> isi = new ArrayList<>();
        String[] daftar = new String[datas.size()];
        for (String data : datas) {
            daftar = data.split(";");
            if (isAdmin) isi.add(daftar[1]);
            else isi.add(daftar[0]);
        }
        return isi;
    }
}
