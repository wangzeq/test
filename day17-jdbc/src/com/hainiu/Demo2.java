package com.hainiu;

import java.sql.*;
import java.util.ArrayList;



public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://11.87.38.47:3306/hainiu_02?/useSSL=false/characterEncoding=UTF-8";
        String user = "root";
        String password = "hainiu";

//        Connection conn = null;
//        Statement stmt = null;

        Connection connection = (Connection) DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "select cid,cname from category";
        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Category> list = new ArrayList<>();

        while(resultSet.next()){
            int cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");
            Category category = new Category(cid, cname);
            list.add(category);
        }
        for(Category category :list){
            System.out.println(category);
        }





//        try {
//            Class.forName(driver);
//            conn = (Connection) DriverManager.getConnection(url, user, password);
//            String sql = "insert into category(cid, cname) values (7, '图书')";
//            stmt = conn.createStatement();
//            int executeUpdate = stmt.executeUpdate(sql);
//            if(executeUpdate > 0){
//                System.out.println("插入成功");
//            }else{
//                System.out.println("插入失败");
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                stmt.close();
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//        }

    }
}
