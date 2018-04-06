/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDao;
import java.util.List;

/**
 *
 * @author ASUS A455L
 */
public class AdminController {
    private final AdminDao ad;

    public AdminController() {
        this.ad = new AdminDao();
    }

    public boolean insert(Object object) {
        return ad.insert(object);
    }

    public boolean update(Object object) {
        return ad.update(object);
    }

    public boolean delete(Object object) {
        return ad.delete(object);
    }

    public List<Object> getAll() {
        return ad.getAll();
    }

    public List<Object> search(String category, String search) {
        return ad.search(category, search);
    }

    public Object getById(String id) {
        return ad.getById(id);
    }
    
    
}
