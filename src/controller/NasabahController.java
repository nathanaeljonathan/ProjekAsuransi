/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDao;
import dao.NasabahDao;
import entities.Admin;
import entities.Nasabah;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS A455L
 */
public class NasabahController {
    private final NasabahDao nd;
    private final AdminDao ad;

    public NasabahController(){
        this.nd = new NasabahDao();
        this.ad = new AdminDao();
    }
    
    private void bindingTabels(JTable table, String[] header, List<Object> datas){
        DefaultTableModel model = new DefaultTableModel(header, 0);
        int i = 1;
//        Nasabah na;
        for (Object data : datas){
            Nasabah na = (Nasabah) data;
            String admin = "";
            if (na.getIdAdmin() != null) {
                admin = na.getIdAdmin().getNamaAdmin();
            }
            Object[] data1 = {
                i++,
                na.getKtp(),
                na.getNoPolis(),
                na.getNmNasabah(),
                na.getTglLahir(),
                na.getStatus(),
                na.getPekerjaan(),
                na.getPenghasilan(),
                na.getAlamat(),
                na.getIdAdmin()
            };
            model.addRow(data1);
        }
        table.setModel(model);
    }
    private void bindingTabelsReport(JTable table, String[] header, List<Object> datas){
        DefaultTableModel model = new DefaultTableModel(header, 0);
        int i = 1;
//        Nasabah na;
        for (Object data : datas){
            Nasabah na = (Nasabah) data;
            String admin = "";
            if (na.getIdAdmin() != null) {
                admin = na.getIdAdmin().getNamaAdmin();
            }
            Object[] data1 = {
                i++,
                na.getKtp(),
                na.getNoPolis(),
                na.getNmNasabah(),
                na.getPekerjaan(),
                na.getAlamat(),
                na.getIdAdmin().getNamaAdmin()
            };
            model.addRow(data1);
        }
        table.setModel(model);
    }
    
    public void bindingAll(JTable table, String[] header) {
        bindingTabels(table, header, nd.getAll());
    }
    public void bindingAllReport(JTable table, String[] header) {
        bindingTabelsReport(table, header, nd.getAll());
    }
    
    public boolean insert(String ktp, String noPolis, String nmNasabah, String tglLahir, String status, String pekerjaan, String penghasilan, String alamat, String idAdmin) {
          Nasabah n = new Nasabah();
          n.setKtp(ktp);
          n.setNoPolis(noPolis);
          n.setNmNasabah(nmNasabah);
          n.setTglLahir(new java.sql.Date(new Long(tglLahir)));
          n.setStatus(status);
          n.setPekerjaan(pekerjaan);
          n.setPenghasilan(penghasilan);
          n.setAlamat(alamat);
          n.setIdAdmin(new Admin(idAdmin));
          return nd.insert(n);    
    }

    public boolean update(String ktp, String noPolis, String nmNasabah, String tglLahir, String status, String pekerjaan, String penghasilan, String alamat, String idAdmin) {
          Nasabah n = new Nasabah();
          n.setKtp(ktp);
          n.setNoPolis(noPolis);
          n.setNmNasabah(nmNasabah);
          n.setTglLahir(new java.sql.Date(new Long(tglLahir)));
          n.setStatus(status);
          n.setPekerjaan(pekerjaan);
          n.setPenghasilan(penghasilan);
          n.setAlamat(alamat);
          n.setIdAdmin(new Admin(idAdmin));
          return nd.update(n);
    }

    public boolean delete(String noPolis) {
        return nd.delete(noPolis);
    }

    public List<Object> getAll() {
        return nd.getAll();
    }

    public void bindingSearch(JTable table, String[] header, String category, String cari) {
        String search = cari;
        if (category.equalsIgnoreCase("idAdmin")) {
            Admin a = (Admin) ad.search("namaAdmin", cari).get(0);
            search = a.getIdAdmin().toString();
        }        bindingTabels(table, header, nd.search(category, search));

        bindingTabels(table, header, nd.search(category, search));
    }
    public void bindingSearchReport(JTable table, String[] header, String category, String cari) {
        String search = cari;
        if (category.equalsIgnoreCase("idAdmin")) {
            Admin a = (Admin) ad.search("namaAdmin", cari).get(0);
            search = a.getIdAdmin().toString();
        }        bindingTabelsReport(table, header, nd.search(category, search));

        bindingTabelsReport(table, header, nd.search(category, search));
    }

    public Object getById(String id) {
        return nd.getById(id);
    }
    
    public void loadAdmin(JComboBox jComboBox) {
        jComboBox.addItem(" - ");
        ad.getAll().stream().map((object) -> (Admin) object).forEachOrdered((admin) -> {
            jComboBox.addItem(admin.getIdAdmin());
        });
    }
}
