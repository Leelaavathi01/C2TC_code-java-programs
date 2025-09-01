package jdbc;
import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://localhost:5432/employee"; 
        String user = "postgres"; 
        String password = "Leelaa@01"; 

        // JDBC variables
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn = DriverManager.getConnection(url, user, password);

            // Create Statement
            stmt = conn.createStatement();

            // Execute Query
            String query = "SELECT * FROM emp";
            rs = stmt.executeQuery(query);
            // Process the result set
            System.out.println("Employee Details:");
            System.out.println("---------------------------------");
            while (rs.next()) {
                int id = rs.getInt("eid");
                String name = rs.getString("ename");
                String city = rs.getString("city");

                System.out.println(id + " | " + name + " | " + city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}