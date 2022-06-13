import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Study {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static void main(String[] args){
        chosenGay chosen = new chosenGay(21, 67);
        System.out.println(chosen.probability());


        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("123");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("1234");
        }
    }
}
