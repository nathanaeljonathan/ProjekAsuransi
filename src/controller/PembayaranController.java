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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
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

    public List<String> bindingAll(JTable table, String[] header){
        bindingTable(table, header,pd.getAll());
        return bindingTable(table, header, pd.getAll());
    }
    
    private List<String> bindingTable(JTable table, String[] header, List<Object> datas) {
        List<String> dataAsuransi = new ArrayList<>();
        DefaultTableModel model = new DefaultTableModel(header, 0);
        int i = 1;
        for (Object data : datas) {
            Pembayaran pm = (Pembayaran) data;
            dataAsuransi.add(" - ;" + pm.getIdAsuransi().getIdAsuransi()
                        + " - " + pm.getIdAsuransi().getNmAsuransi());
            Object[] data1 = {
                i++,
                pm.getNoPembayaran(),
                pm.getTglPembayaran(),
                pm.getJumlahBayar(),
                pm.getNoPolis(),
                pm.getIdAsuransi().getNmAsuransi()
            };
            model.addRow(data1);
        }
        table.setModel(model);
        return dataAsuransi;
    }

    public boolean insert(String noPembayaran, String noPolis, String tglPembayaran, String jumlahBayar, String idAsuransi) {
       Pembayaran p = new Pembayaran();
       p.setNoPembayaran(noPembayaran);
       p.setNoPolis(new Nasabah(noPolis));
       p.setTglPembayaran(new java.sql.Date(new Long(tglPembayaran)));
       p.setJumlahBayar(jumlahBayar);
       String[] Aid = idAsuransi.split(" ");
       p.setIdAsuransi((Asuransi) ad.getById(Aid[0]));
       return pd.insert(p);
    }

    public boolean update(String noPembayaran, String noPolis, String tglPembayaran, String jumlahBayar, String idAsuransi) {
       Pembayaran p = new Pembayaran();
       p.setNoPembayaran(noPembayaran);
       p.setNoPolis(new Nasabah(noPolis));
       p.setTglPembayaran(new java.sql.Date(new Long(tglPembayaran)));
       p.setJumlahBayar(jumlahBayar);
       String[] Aid = idAsuransi.split(" ");
       p.setIdAsuransi((Asuransi) ad.getById(Aid[0]));
        return pd.update(p);
    }

    public boolean delete(Object object) {
        return pd.delete(object);
    }

    public List<Object> getAll() {
        return pd.getAll();
    }

    public List<String> bindingSearch(JTable table, String[] header, String category, String cari) {
       String search = cari;
        if (category.equalsIgnoreCase("noPolis")) {
            Nasabah nas = (Nasabah) nd.search("nmNasabah", cari).get(0);
            search = nas.getNoPolis();
        } else if (category.equalsIgnoreCase("idAsuransi")) {
            List<Object> asuransi = ad.search("nmAsuransi", cari);
            Asuransi as = (Asuransi) asuransi.get(0);
            
            search = as.getIdAsuransi();
        }
        return bindingTable(table, header, pd.search(category, search));

    }
    public void bindingSearchReport(JTable table, String[] header, String category, String cari) {
       String search = cari;
        if (category.equalsIgnoreCase("noPolis")) {
            Nasabah nas = (Nasabah) nd.search("nmNasabah", cari).get(0);
            search = nas.getNoPolis();
        } else if (category.equalsIgnoreCase("idAsuransi")) {
            List<Object> asuransi = ad.search("nmAsuransi", cari);
            Asuransi as = (Asuransi) asuransi.get(0);
            
            search = as.getIdAsuransi();
        }
        bindingTableReport(table, header, pd.search(category, search));

    }

    public Object getById(String id) {
        return pd.getById(id);
    }
    
    private void bindingTableReport(JTable table, String[] header, List<Object> datas) {
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
                pm.getNoPolis(),
                pm.getNoPolis().getNmNasabah(),
                pm.getJumlahBayar(),
                pm.getIdAsuransi().getNmAsuransi(),
                pm.getTglPembayaran()
            };
            model.addRow(data1);
        }
        table.setModel(model);
    }
    
    public void bindingAllR(JTable table, String[] header){
        bindingTableReport(table, header,pd.getAll());
    }
    
    public void loadAsuransi(JComboBox jComboBox) {
        jComboBox.addItem(" - ");
        ad.getAll().stream().map((object) -> (Asuransi) object).forEachOrdered((asuransi) -> {
            jComboBox.addItem(asuransi.getIdAsuransi()+ " - "
                    + asuransi.getNmAsuransi());
        });
    }
}
