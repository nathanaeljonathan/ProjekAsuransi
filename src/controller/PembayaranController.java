/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PembayaranDao;
import java.util.List;

/**
 *
 * @author ASUS A455L
 */
public class PembayaranController {
    private final PembayaranDao pembayaranDao;

    public PembayaranController(PembayaranDao pembayaranDao) {
        this.pembayaranDao = pembayaranDao;
    }

    public boolean insert(Object object) {
        return pembayaranDao.insert(object);
    }

    public boolean update(Object object) {
        return pembayaranDao.update(object);
    }

    public boolean delete(Object object) {
        return pembayaranDao.delete(object);
    }

    public List<Object> getAll() {
        return pembayaranDao.getAll();
    }

    public List<Object> search(String category, String search) {
        return pembayaranDao.search(category, search);
    }

    public Object getById(String id) {
        return pembayaranDao.getById(id);
    }
    
    
}
