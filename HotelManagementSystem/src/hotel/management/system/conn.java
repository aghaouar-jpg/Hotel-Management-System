package hotel.management.system;

import java.sql.*;

public class conn {

    //@ invariant c != null ==> s != null;

    Connection c;
    Statement s;

    /*@
      @ ensures c == null || s != null;
      @*/
    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hotelmanagementsystem",
                "root",
                ""
            );
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
    }
}
