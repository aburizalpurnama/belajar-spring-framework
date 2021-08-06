package com.rizalpurnama.belajar.spring.belajarspring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component("nasabahDao")
public class NasabahDao {
    private static final String SQL_INSERT = "INSERT INTO nasabah (nama,email) VALUES (?,?)";

    @Autowired
    private DataSource dataSource;

    public void insert(Nasabah n){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(SQL_INSERT)) {

            ps.setString(1, n.getName());
            ps.setString(2, n.getEmail());

            ps.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
