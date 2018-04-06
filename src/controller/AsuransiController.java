/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AsuransiDao;
import entities.Asuransi;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS A455L
 */
public class AsuransiController {
    
    //public AsuransiDao asdao = new AsuransiDao();
    
    private final AsuransiDao as;
    
    public AsuransiController() {
        this.as = new AsuransiDao();
    }
    
    public void bindingall(JTable table, String[] header){
        bindingTabels(table, header, as.getAll());
    }
    
    private void bindingTabels(JTable table, String[] header, List<Object> datas){
        DefaultTableModel model = new DefaultTableModel(header, 0);
        Asuransi as;
        for (Object data : datas){
            as = (Asuransi) data;
            Object[] data1 = {
                as.getIdAsuransi(),
                as.getNmAsuransi()
            };
            model.addRow(data1);
        }
        table.setModel(model);
    }
    
    public boolean insert(String idAsuransi, String nmAsuransi) {
        Asuransi asuransi = new Asuransi();
        asuransi.setIdAsuransi(idAsuransi);
        asuransi.setNmAsuransi(nmAsuransi);
        
        return as.insert(asuransi);
    }

    public boolean update(String idAsuransi, String nmAsuransi) {
        Asuransi asuransi = new Asuransi();
        asuransi.setIdAsuransi(idAsuransi);
        asuransi.setNmAsuransi(nmAsuransi);
        
        return as.update(asuransi);
    }

    public boolean delete(String idAsuransi) {
        return as.delete(idAsuransi);
    }

     public  void bindingsearch(JTable table, String[] header,
        String category, String search){
        bindingTabels(table, header, as.search(category, search));
    }

    public Object getById(String id) {
        return as.getById(id);
    }
    
}
