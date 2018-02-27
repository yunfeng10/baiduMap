package com.zyf.rt.testByte;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddByte {

    private static final String url = "jdbc:mysql://localhost:3306/platformdb";       //数据库地址
    private static final String username = "root";      //数据库用户名
    private static final String password = "root";        //数据库密码
    private static final String driver = "com.mysql.jdbc.Driver";       //mysql驱动

    public static void main(String args[]) throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);

        String sql = "INSERT INTO tb_error_log (log_id,create_time,error_id,error_code,error_content) VALUES(?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        String s = "中文内容测试 中文内容测试 中文内容测试 中文内容测试 中文内容测试 中文内容测试 中文内容测试 ";
        ByteArrayInputStream tInputStringStream = new ByteArrayInputStream(s.getBytes());
        /**
         * 调用实体StuInfo类,获取需要插入的各个字段的值
         * 注意参数占位的位置
         * 通过set方法设置参数的位置
         * 通过get方法取参数的值
         */
        ps.setInt(1, 5);
        ps.setInt(2, 123);
        ps.setString(3, "234");
        ps.setString(4, "error_code");
        ps.setBlob(5, tInputStringStream);

        ps.executeUpdate();         //执行sql语句

        System.out.println("插入成功(*￣︶￣)");
        if(conn != null) {
            try {
                conn.close();  //关闭数据库链接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
