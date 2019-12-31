package level2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web01", "root", "admin");
            //定义SQL语句
            String sql = "create table t_students(id int(11),name varchar(16),sex varchar(4),primary key(id))";
            //获取执行SQL的对象statement
            statement = connection.createStatement();
            //执行SQL
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
