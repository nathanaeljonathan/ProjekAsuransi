/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NasabahDao;
import java.util.List;

/**
 *
 * @author ASUS A455L
 */
public class NasabahController {
    private final NasabahDao nd;

    public NasabahController(NasabahDao nd) {
        this.nd = nd;
    }

    public boolean insert(Object object) {
        return nd.insert(object);
    }

    public boolean update(Object object) {
        return nd.update(object);
    }

    public boolean delete(Object object) {
        return nd.delete(object);
    }

    public List<Object> getAll() {
        return nd.getAll();
    }

    public List<Object> search(String category, String search) {
        return nd.search(category, search);
    }

    public Object getById(String id) {
        return nd.getById(id);
    }
    
}
