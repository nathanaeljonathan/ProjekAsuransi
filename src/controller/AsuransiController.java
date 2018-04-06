/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AsuransiDao;
import java.util.List;

/**
 *
 * @author ASUS A455L
 */
public class AsuransiController {
    private final AsuransiDao dao;

    public AsuransiController(AsuransiDao dao) {
        this.dao = dao;
    }

    public boolean insert(Object object) {
        return dao.insert(object);
    }

    public boolean update(Object object) {
        return dao.update(object);
    }

    public boolean delete(Object object) {
        return dao.delete(object);
    }

    public List<Object> getAll() {
        return dao.getAll();
    }

    public List<Object> search(String category, String search) {
        return dao.search(category, search);
    }

    public Object getById(String id) {
        return dao.getById(id);
    }
    
}
