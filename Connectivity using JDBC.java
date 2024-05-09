import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleJDBCConnection {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Create a statement
            statement = connection.createStatement();

            // Execute the query
            resultSet = statement.executeQuery("SELECT * FROM users");

            // Process the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources in a finally block to ensure they're always closed
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
