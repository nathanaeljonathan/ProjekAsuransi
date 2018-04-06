/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Locale;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ASUS A455L
 */
public class AdminDao implements InterfaceDao {

    public Session session;
    public SessionFactory factory;
    public Transaction transaction;
    public FunctionDao fdao;
    
    public AdminDao() {
    }

    @Override
    public boolean insert(Object object) {
        return fdao.insert(object);
    }

    @Override
    public boolean update(Object object) {
        return fdao.insert(object);
    }

    @Override
    public boolean delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Object> getAll() {
        return fdao.getAll("FROM admin");
    }

    @Override
    public List<Object> search(String category, String cari) {
        return fdao.getAll("FROM admin WHERE "+category+ " LIKE '%" + cari + "%'");
    }

    @Override
    public Object getById(String id) {
        return fdao.getById("from admin where id_admin ='" + id + "'");
    }

    
}
