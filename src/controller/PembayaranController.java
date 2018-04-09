/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AsuransiDao;
import dao.NasabahDao;
import dao.PembayaranDao;
import entities.Asuransi;
import entities.Nasabah;
import entities.Pembayaran;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS A455L
 */
public class PembayaranController {
    private final PembayaranDao pd;
    private final NasabahDao nd;
    private final AsuransiDao ad;
    
    public PembayaranController(){
        this.pd = new PembayaranDao();
        this.nd = new NasabahDao();
        this.ad = new AsuransiDao();
    }

    public void bindingAll(JTable table, String[] header){
        bindingTable(table, header,pd.getAll());
    }
    
    private void bindingTable(JTable table, String[] header, List<Object> datas) {
        DefaultTableModel model = new DefaultTableModel(header, 0);
        int i = 1;
        for (Object data : datas) {
            Pembayaran pm = (Pembayaran) data;
            String nasabah = "";
            if (pm.getNoPolis() != null) {
                nasabah = pm.getNoPolis().toString();
            }
            Object[] data1 = {
                i++,
                pm.getNoPembayaran(),
                pm.getTglPembayaran(),
                pm.getJumlahBayar(),
                pm.getNoPolis(),
                pm.getIdAsuransi()
            };
            model.addRow(data1);
        }
        table.setModel(model);
    }

    public boolean insert(String noPembayaran, String noPolis, String tglPembayaran, String jumlahBayar, String idAsuransi) {
       Pembayaran p = new Pembayaran();
       p.setNoPembayaran(noPembayaran);
       p.setNoPolis(new Nasabah(noPolis));
       p.setTglPembayaran(new java.sql.Date(new Long(tglPembayaran)));
       p.setJumlahBayar(jumlahBayar);
       p.setIdAsuransi(new Asuransi(idAsuransi));
       return pd.insert(p);
    }

    public boolean update(String noPembayaran, String noPolis, String tglPembayaran, String jumlahBayar, String idAsuransi) {
       Pembayaran p = new Pembayaran();
       p.setNoPembayaran(noPembayaran);
       p.setNoPolis(new Nasabah(noPolis));
       p.setTglPembayaran(new java.sql.Date(new Long(tglPembayaran)));
       p.setJumlahBayar(jumlahBayar);
       p.setIdAsuransi(new Asuransi(idAsuransi));
        return pd.update(p);
    }

    public boolean delete(Object object) {
        return pd.delete(object);
    }

    public List<Object> getAll() {
        return pd.getAll();
    }

    public List<Object> search(String category, String search) {
        return pd.search(category, search);
    }

    public Object getById(String id) {
        return pd.getById(id);
    }
    
    
}
