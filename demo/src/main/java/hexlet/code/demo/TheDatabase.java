package hexlet.code.demo;
import java.sql.*;

public class TheDataBase {
    public  static void thedatabase(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/postgres?user=andrejsingaevskij&password=stalker12&ssl=true";
        Connection conn = DriverManager.getConnection(url);
        String sql = "SELECT * FROM users";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        System.out.println(result);
    }
}
