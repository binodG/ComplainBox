/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daoimpl;

import com.leapfrog.dao.ComplainDao;
import com.leapfrog.dbutil.DBConnection;
import com.leapfrog.entity.Complain;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santosh
 */
public class ComplainDaoimpl implements ComplainDao {
    DBConnection db=new DBConnection();

    @Override
    public int insert(Complain complain) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO complain_tbl(title,description,client_id) values(?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, complain.getTitle());
        stmt.setString(2,complain.getDescription());
        stmt.setInt(3,complain.getClientId());
        

        int result = db.executeUpdate(stmt);
        db.close();
        return result;
    }

    @Override
    public int update(Complain complain) throws ClassNotFoundException, SQLException {
           return 0;
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
      return 0;
    }

    @Override
    public Complain getById(int id) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public List<Complain> getAll() throws ClassNotFoundException, SQLException {

      List<Complain> complainList = new ArrayList<>();
        String sql = "SELECT *FROM complain_tbl";
        db.open();
        PreparedStatement stmt=db.initStatement(sql);
        ResultSet rs = db.executeQuery(stmt);
        while (rs.next()) {
            Complain complain= new Complain();
            complain.setId(rs.getInt("client_id"));
            complain.setTitle(rs.getString("title"));
            complain.setDescription(rs.getString("description"));
            
            complainList.add(complain);
            
        }
        db.close();
        
        return complainList; 
    }

}
