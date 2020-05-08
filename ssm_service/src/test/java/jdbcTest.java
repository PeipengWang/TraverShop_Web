import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","1234");
            PreparedStatement pst = conn.prepareStatement("select * from product");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("id"));
            }
            rs.close();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("注册数据库驱动失败");
            e.printStackTrace();
        }

    }
}
