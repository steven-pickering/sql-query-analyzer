import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        CommunicationDB.getDBConnection();
        CommunicationDB.retrieve();
        CommunicationDB.insert();
        CommunicationDB.update();


    }
}
