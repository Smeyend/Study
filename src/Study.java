import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Study {

    public static void main(String[] args){
        chosenGay chosen = new chosenGay(21, 67);
        System.out.println(chosen.probability());
        DBWorker worker = new DBWorker();
        String query = "select * from users";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet =statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
