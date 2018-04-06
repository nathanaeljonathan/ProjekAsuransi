/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PolisDao;
import java.util.List;

/**
 *
 * @author ASUS A455L
 */
public class PolisController {
    private final PolisDao pd;

    public PolisController(PolisDao pd) {
        this.pd = pd;
    }

    public boolean insert(Object object) {
        return pd.insert(object);
    }

    public boolean update(Object object) {
        return pd.update(object);
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
