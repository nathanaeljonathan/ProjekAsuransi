/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDao;
import entities.Admin;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS A455L
 */
public class AdminController {

    private final AdminDao ad;

    public AdminController() {
        this.ad = new AdminDao();
    }

    public boolean update(String IdAdmin, String adminName, String alamatAdm, String TelpAdm, String emailAdm) {
        Admin adm = new Admin();
        adm.setIdAdmin(IdAdmin);
        adm.setNamaAdmin(adminName);
        adm.setAlamat(alamatAdm);
        adm.setNoTelp(TelpAdm);
        adm.setEmail(emailAdm);
        return ad.update(adm);
    }

     public boolean insert(String IdAdmin, String adminName, String alamatAdm, String TelpAdm, String emailAdm) {
        Admin adm = new Admin();
        adm.setIdAdmin(IdAdmin);
        adm.setNamaAdmin(adminName);
        adm.setAlamat(alamatAdm);
        adm.setNoTelp(TelpAdm);
        adm.setEmail(emailAdm);
        return ad.insert(adm);
    }

    public boolean delete(String id) {
        return ad.delete(id);
    }

    public void bindingTable(JTable table, String[] header, List<Object> datas) {
        DefaultTableModel model = new DefaultTableModel(header, 0);
        Admin admin;
        for (Object data : datas) {
            admin = (Admin) data;
            Object[] data1 = {
                admin.getIdAdmin(),
                admin.getNamaAdmin(),
                admin.getAlamat(),
                admin.getNoTelp(),
                admin.getEmail(),};
            model.addRow(data1);
        }
        table.setModel(model);

    }

    public void bindingSearch(JTable table, String[] header, String category, String cari) {
        String search = cari;
            if (category.equalsIgnoreCase("idAdmin")) {
                Admin a = (Admin) ad.search("namaAdmin", cari).get(0);                
                search = a.getIdAdmin();
            }
            bindingTable(table, header, ad.search(category, cari));
        }
    

    public void bindingAll(JTable table, String[] header) {
        bindingTable(table, header, ad.getAll());
    }
}
