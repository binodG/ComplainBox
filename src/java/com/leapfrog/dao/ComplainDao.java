/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dao;

import com.leapfrog.entity.Complain;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author santosh
 */
public interface ComplainDao {
    int insert(Complain complain) throws ClassNotFoundException,SQLException;
    int update(Complain complain) throws ClassNotFoundException,SQLException;
    int delete(int id) throws ClassNotFoundException,SQLException;
    Complain getById(int id)throws ClassNotFoundException,SQLException;
    List<Complain> getAll()throws ClassNotFoundException,SQLException;;
}
