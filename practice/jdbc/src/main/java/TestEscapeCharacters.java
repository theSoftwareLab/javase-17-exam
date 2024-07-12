import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Emmanouil Georgopoulos
 */
class TestEscapeCharacters {

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost");
    String username = "mgeorgopoulos";
    String name = "Emmanouil Georgopoulos";
    Statement stmt = conn.createStatement();
    String query =
        "insert into users values (" + stmt.enquoteLiteral(username) + ", " + stmt.enquoteLiteral(
            name) + ")";
    stmt.executeUpdate(query);
  }

}
