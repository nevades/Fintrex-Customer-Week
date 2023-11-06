/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customerweek;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Neva
 */
public class Db {

    private static BasicDataSource ds = new BasicDataSource();

    static {
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://intdb.fintrex.test:3306/customer_week?useUnicode=true&characterEncoding=UTF-8");
        ds.setUsername("root");
        ds.setPassword("Test@-123");
        ds.setMinIdle(100);
        ds.setMaxIdle(1000);
        ds.setMaxOpenPreparedStatements(200);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
