import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "root1634";
        String conactionURL = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection= DriverManager.getConnection(conactionURL, userName, password);
            Statement statement = connection.createStatement()) {
            statement.executeUpdate("INSERT INTO Book (name) value ('Sherlock Holmes')");
            statement.executeUpdate("INSERT INTO Book (name) value ('Vinay Pooh')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Book");
            while (resultSet.next()){
                System.out.print(resultSet.getInt(1));
                System.out.print("      ");
                System.out.print(resultSet.getString(2));
                System.out.println("     ");
                System.out.println("_______________________________");
            }
        }
    }
}
