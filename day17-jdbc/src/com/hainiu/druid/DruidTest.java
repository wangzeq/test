package com.hainiu.druid;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidTest {
    public static void main(String[] args) {

        // 获取连接
        Connection conn = JDBCUtil.getConnection();

        String sql = "insert into account(id, name, money) values (?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
            // 设置参数
            statement.setInt(1, 0);
            statement.setString(2, "测试x");
            statement.setDouble(3, 7777);

            // 执行操作
            int num = statement.executeUpdate();
            System.out.println(num);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtil.close((Statement) statement, conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
