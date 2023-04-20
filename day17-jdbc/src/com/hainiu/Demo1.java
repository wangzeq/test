package com.hainiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://11.87.38.47:3306/hainiu_02?characterEncoding=UTF-8";
        String user = "root";
        String password = "hainiu";

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            String sql = "insert into category(cid, cname) values (7, '图书')";
            stmt = conn.createStatement();
            int executeUpdate = stmt.executeUpdate(sql);
            if(executeUpdate > 0){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
