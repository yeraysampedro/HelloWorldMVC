package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Yeray
 */
public abstract class BDConnection {

    protected Connection con;
    protected PreparedStatement stmt;
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;

    protected void connect() throws Exception {
        try {
            configFile = ResourceBundle.getBundle("resources.bdconfig");
            url = configFile.getString("URL");
            user = configFile.getString("USER");
            pass = configFile.getString("PASSWORD");
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }

    protected void disconnect() throws Exception {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }

    protected void closeRs(ResultSet rs) throws SQLException, Exception {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new Exception("Error con la búsqueda en la BBDD");
            }
        }
    }

}
