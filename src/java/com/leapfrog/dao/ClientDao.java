/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dao;

import com.leapfrog.entity.Client;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author santosh
 */
public interface ClientDao {
      int insert(Client client) throws ClassNotFoundException,SQLException;
    int update(Client client) throws ClassNotFoundException,SQLException;
    int delete(int id) throws ClassNotFoundException,SQLException;
    Client getById(int id)throws ClassNotFoundException,SQLException;
    List<Client> getAll()throws ClassNotFoundException,SQLException;;
    
}
