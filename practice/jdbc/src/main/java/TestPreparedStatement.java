import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author mgeorgopoulos
 */
public class TestPreparedStatement {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost");
        String query = "insert into users values (?, ?)";
        try(PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, "Manolis");
            ps.setObject(2, "Georgopoulos");
            ps.executeUpdate();
        } finally {
            conn.close();
        }
    }

}
